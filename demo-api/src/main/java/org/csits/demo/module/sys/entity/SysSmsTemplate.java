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
 * 
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_sms_template")
@Schema(name = "SysSmsTemplate", description = "")
public class SysSmsTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    @TableId("id")
    private String id;

    @Schema(description = "模板标题")
    @TableField("template_name")
    private String templateName;

    @Schema(description = "模板CODE")
    @TableField("template_code")
    private String templateCode;

    @Schema(description = "模板类型：1短信 2邮件 3微信")
    @TableField("template_type")
    private String templateType;

    @Schema(description = "模板内容")
    @TableField("template_content")
    private String templateContent;

    @Schema(description = "模板测试json")
    @TableField("template_test_json")
    private String templateTestJson;

    @Schema(description = "创建日期")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "创建人登录名称")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "更新日期")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Schema(description = "更新人登录名称")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "是否使用中 1是0否")
    @TableField("use_status")
    private String useStatus;
}
