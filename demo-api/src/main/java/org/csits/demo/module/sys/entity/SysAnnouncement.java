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
 * 系统通告表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_announcement")
@Schema(name = "SysAnnouncement", description = "系统通告表")
public class SysAnnouncement implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "标题")
    @TableField("titile")
    private String titile;

    @Schema(description = "内容")
    @TableField("msg_content")
    private String msgContent;

    @Schema(description = "开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @Schema(description = "结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @Schema(description = "发布人")
    @TableField("sender")
    private String sender;

    @Schema(description = "优先级（L低，M中，H高）")
    @TableField("priority")
    private String priority;

    @Schema(description = "消息类型1:通知公告2:系统消息")
    @TableField("msg_category")
    private String msgCategory;

    @Schema(description = "通告对象类型（USER:指定用户，ALL:全体用户）")
    @TableField("msg_type")
    private String msgType;

    @Schema(description = "发布状态（0未发布，1已发布，2已撤销）")
    @TableField("send_status")
    private String sendStatus;

    @Schema(description = "发布时间")
    @TableField("send_time")
    private LocalDateTime sendTime;

    @Schema(description = "撤销时间")
    @TableField("cancel_time")
    private LocalDateTime cancelTime;

    @Schema(description = "删除状态（0，正常，1已删除）")
    @TableField("del_flag")
    private String delFlag;

    @Schema(description = "业务类型(email:邮件 bpm:流程)")
    @TableField("bus_type")
    private String busType;

    @Schema(description = "业务id")
    @TableField("bus_id")
    private String busId;

    @Schema(description = "打开方式(组件：component 路由：url)")
    @TableField("open_type")
    private String openType;

    @Schema(description = "组件/路由 地址")
    @TableField("open_page")
    private String openPage;

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

    @Schema(description = "指定用户")
    @TableField("user_ids")
    private String userIds;

    @Schema(description = "摘要")
    @TableField("msg_abstract")
    private String msgAbstract;

    @Schema(description = "钉钉task_id，用于撤回消息")
    @TableField("dt_task_id")
    private String dtTaskId;
}
