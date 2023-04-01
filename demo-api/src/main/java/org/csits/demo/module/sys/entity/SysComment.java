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
 * 系统评论回复表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_comment")
@Schema(name = "SysComment", description = "系统评论回复表")
public class SysComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "表名")
    @TableField("table_name")
    private String tableName;

    @Schema(description = "数据id")
    @TableField("table_data_id")
    private String tableDataId;

    @Schema(description = "来源用户id")
    @TableField("from_user_id")
    private String fromUserId;

    @Schema(description = "发送给用户id(允许为空)")
    @TableField("to_user_id")
    private String toUserId;

    @Schema(description = "评论id(允许为空，不为空时，则为回复)")
    @TableField("comment_id")
    private String commentId;

    @Schema(description = "回复内容")
    @TableField("comment_content")
    private String commentContent;

    @Schema(description = "创建人")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建日期")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新人")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "更新日期")
    @TableField("update_time")
    private LocalDateTime updateTime;
}
