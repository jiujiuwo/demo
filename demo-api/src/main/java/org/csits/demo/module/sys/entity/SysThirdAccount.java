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
@TableName("sys_third_account")
@Schema(name = "SysThirdAccount", description = "")
public class SysThirdAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "编号")
    @TableId("id")
    private String id;

    @Schema(description = "第三方登录id")
    @TableField("sys_user_id")
    private String sysUserId;

    @Schema(description = "头像")
    @TableField("avatar")
    private String avatar;

    @Schema(description = "状态(1-正常,2-冻结)")
    @TableField("status")
    private Byte status;

    @Schema(description = "删除状态(0-正常,1-已删除)")
    @TableField("del_flag")
    private Byte delFlag;

    @Schema(description = "真实姓名")
    @TableField("realname")
    private String realname;

    @Schema(description = "第三方账号")
    @TableField("third_user_uuid")
    private String thirdUserUuid;

    @Schema(description = "第三方app用户账号")
    @TableField("third_user_id")
    private String thirdUserId;

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

    @Schema(description = "登录来源")
    @TableField("third_type")
    private String thirdType;
}
