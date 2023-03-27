package org.csits.demo.common;

import lombok.extern.slf4j.Slf4j;
import org.csits.demo.comm.Result;
import org.csits.demo.utils.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.redis.connection.PoolException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.NoHandlerFoundException;


@RestController
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @Autowired
    private MessageService messageService;

    @ExceptionHandler(Exception.class)
    public Result<?> handlerException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(500, e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public Result<?> handlerRunTimeException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(404, e.getMessage());
    }


    @ExceptionHandler(NoHandlerFoundException.class)
    public Result<?> handlerNoFoundException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(404, "路径不存在，请检查路径是否正确");
    }

    @ExceptionHandler(DuplicateKeyException.class)
    public Result<?> handleDuplicateKeyException(DuplicateKeyException e) {
        log.error(e.getMessage(), e);
        return Result.error("数据库中已存在该记录");
    }


    /**
     * @param e
     * @return
     * @Author 政辉
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result<?> httpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        StringBuffer sb = new StringBuffer();
        sb.append("不支持");
        sb.append(e.getMethod());
        sb.append("请求方法，");
        sb.append("支持以下");
        String[] methods = e.getSupportedMethods();
        if (methods != null) {
            for (String str : methods) {
                sb.append(str);
                sb.append("、");
            }
        }
        log.error(sb.toString(), e);
        //return Result.error("没有权限，请联系管理员授权");
        return Result.error(405, sb.toString());
    }

    /**
     * spring默认上传大小100MB 超出大小捕获异常MaxUploadSizeExceededException
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public Result<?> handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
        log.error(e.getMessage(), e);
        return Result.error("文件大小超出10MB限制, 请压缩或降低文件质量! ");
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public Result<?> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        log.error(e.getMessage(), e);
        //【issues/3624】数据库执行异常handleDataIntegrityViolationException提示有误 #3624
        return Result.error("执行数据库异常,违反了完整性例如：违反惟一约束、违反非空限制、字段内容超出长度等");
    }

    @ExceptionHandler(PoolException.class)
    public Result<?> handlePoolException(PoolException e) {
        log.error(e.getMessage(), e);
        return Result.error("Redis 连接异常!");
    }

    /**
     * spring security的异常都在filter中处理了，我们捕获不到
     *
     * @param e
     * @return
     */
    @ExceptionHandler(AuthenticationException.class)
    public Result<?> handleAuthenticationException(PoolException e) {
        log.error(e.getMessage(), e);
        return Result.error(messageService.getMessage("500"));
    }


}
