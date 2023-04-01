package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * <p>
 * 系统日志表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_log")
@Schema(name = "SysLog", description = "系统日志表")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "日志类型（1登录日志，2操作日志）")
    @TableField("log_type")
    private Integer logType;

    @Schema(description = "日志内容")
    @TableField("log_content")
    private String logContent;

    @Schema(description = "操作类型")
    @TableField("operate_type")
    private Integer operateType;

    @Schema(description = "操作用户账号")
    @TableField("userid")
    private String userid;

    @Schema(description = "操作用户名称")
    @TableField("username")
    private String username;

    @Schema(description = "IP")
    @TableField("ip")
    private String ip;

    @Schema(description = "请求java方法")
    @TableField("method")
    private String method;

    @Schema(description = "请求路径")
    @TableField("request_url")
    private String requestUrl;

    @Schema(description = "请求参数")
    @TableField("request_param")
    private String requestParam;

    @Schema(description = "请求类型")
    @TableField("request_type")
    private String requestType;

    @Schema(description = "耗时")
    @TableField("cost_time")
    private Long costTime;

    @Schema(description = "创建人")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新人")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;
}
