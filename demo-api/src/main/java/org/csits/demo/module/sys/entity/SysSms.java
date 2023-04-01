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
@TableName("sys_sms")
@Schema(name = "SysSms", description = "")
public class SysSms implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "ID")
    @TableId("id")
    private String id;

    @Schema(description = "消息标题")
    @TableField("es_title")
    private String esTitle;

    @Schema(description = "发送方式：参考枚举MessageTypeEnum")
    @TableField("es_type")
    private String esType;

    @Schema(description = "接收人")
    @TableField("es_receiver")
    private String esReceiver;

    @Schema(description = "发送所需参数Json格式")
    @TableField("es_param")
    private String esParam;

    @Schema(description = "推送内容")
    @TableField("es_content")
    private String esContent;

    @Schema(description = "推送时间")
    @TableField("es_send_time")
    private LocalDateTime esSendTime;

    @Schema(description = "推送状态 0未推送 1推送成功 2推送失败 -1失败不再发送")
    @TableField("es_send_status")
    private String esSendStatus;

    @Schema(description = "发送次数 超过5次不再发送")
    @TableField("es_send_num")
    private Integer esSendNum;

    @Schema(description = "推送失败原因")
    @TableField("es_result")
    private String esResult;

    @Schema(description = "备注")
    @TableField("remark")
    private String remark;

    @Schema(description = "创建人登录名称")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建日期")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新人登录名称")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "更新日期")
    @TableField("update_time")
    private LocalDateTime updateTime;
}
