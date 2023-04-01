package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * <p>
 * 用户通告阅读标记表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_announcement_send")
@Schema(name = "SysAnnouncementSend", description = "用户通告阅读标记表")
public class SysAnnouncementSend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("id")
    private String id;

    @Schema(description = "通告ID")
    @TableField("annt_id")
    private String anntId;

    @Schema(description = "用户id")
    @TableField("user_id")
    private String userId;

    @Schema(description = "阅读状态（0未读，1已读）")
    @TableField("read_flag")
    private String readFlag;

    @Schema(description = "阅读时间")
    @TableField("read_time")
    private LocalDateTime readTime;

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

    @Schema(description = "标星状态( 1为标星 空/0没有标星)")
    @TableField("star_flag")
    private String starFlag;
}
