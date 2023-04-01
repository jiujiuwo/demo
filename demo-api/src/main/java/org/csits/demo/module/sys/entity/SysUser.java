package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_user")
@Accessors
@Schema(name = "SysUser", description = "用户表")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键id")
    @TableId("id")
    private String id;

    @Length(min = 6, max = 20)
    @Schema(description = "登录账号")
    @TableField("username")
    @NotEmpty
    private String username;

    @Schema(description = "真实姓名")
    @TableField("realname")
    private String realname;

    @Length(min = 8, max = 20)
    @Schema(description = "密码")
    @TableField("password")
    private String password;

    @Schema(description = "md5密码盐")
    @TableField("salt")
    private String salt;

    @Schema(description = "头像")
    @TableField("avatar")
    private String avatar;

    @Schema(description = "生日")
    @TableField("birthday")
    private LocalDateTime birthday;

    @Schema(description = "性别(0-默认未知,1-男,2-女)")
    @TableField("sex")
    private Byte sex;

    @Schema(description = "电子邮件")
    @TableField("email")
    private String email;

    @Schema(description = "电话")
    @TableField("phone")
    private String phone;

    @Schema(description = "登录会话的机构编码")
    @TableField("org_code")
    private String orgCode;

    @Schema(description = "性别(1-正常,2-冻结)")
    @TableField("status")
    private Byte status;

    @Schema(description = "删除状态(0-正常,1-已删除)")
    @TableField("del_flag")
    private Byte delFlag;

    @Schema(description = "第三方登录的唯一标识")
    @TableField("third_id")
    private String thirdId;

    @Schema(description = "第三方类型")
    @TableField("third_type")
    private String thirdType;

    @Schema(description = "同步工作流引擎(1-同步,0-不同步)")
    @TableField("activiti_sync")
    private Byte activitiSync;

    @Schema(description = "工号，唯一键")
    @TableField("work_no")
    private String workNo;

    @Schema(description = "职务，关联职务表")
    @TableField("post")
    private String post;

    @Schema(description = "座机号")
    @TableField("telephone")
    private String telephone;

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

    @Schema(description = "身份（1普通成员 2上级）")
    @TableField("user_identity")
    private Byte userIdentity;

    @Schema(description = "负责部门")
    @TableField("depart_ids")
    private String departIds;

    @Schema(description = "多租户标识")
    @TableField("rel_tenant_ids")
    private String relTenantIds;

    @Schema(description = "设备ID")
    @TableField("client_id")
    private String clientId;
}
