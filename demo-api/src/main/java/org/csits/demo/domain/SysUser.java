package org.csits.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @TableName sys_user
 */
@TableName(value ="sys_user")
@Data
public class SysUser implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 登录账号
     */
    @TableField(value = "username")
    private String username;

    /**
     * 真实姓名
     */
    @TableField(value = "realname")
    private String realname;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * md5密码盐
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private Date birthday;

    /**
     * 性别(0-默认未知,1-男,2-女)
     */
    @TableField(value = "sex")
    private Integer sex;

    /**
     * 电子邮件
     */
    @TableField(value = "email")
    private String email;

    /**
     * 电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 登录会话的机构编码
     */
    @TableField(value = "org_code")
    private String org_code;

    /**
     * 性别(1-正常,2-冻结)
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 删除状态(0-正常,1-已删除)
     */
    @TableField(value = "del_flag")
    private Integer del_flag;

    /**
     * 第三方登录的唯一标识
     */
    @TableField(value = "third_id")
    private String third_id;

    /**
     * 第三方类型
     */
    @TableField(value = "third_type")
    private String third_type;

    /**
     * 同步工作流引擎(1-同步,0-不同步)
     */
    @TableField(value = "activiti_sync")
    private Integer activiti_sync;

    /**
     * 工号，唯一键
     */
    @TableField(value = "work_no")
    private String work_no;

    /**
     * 职务，关联职务表
     */
    @TableField(value = "post")
    private String post;

    /**
     * 座机号
     */
    @TableField(value = "telephone")
    private String telephone;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private String create_by;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    private String update_by;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 身份（1普通成员 2上级）
     */
    @TableField(value = "user_identity")
    private Integer user_identity;

    /**
     * 负责部门
     */
    @TableField(value = "depart_ids")
    private String depart_ids;

    /**
     * 多租户标识
     */
    @TableField(value = "rel_tenant_ids")
    private String rel_tenant_ids;

    /**
     * 设备ID
     */
    @TableField(value = "client_id")
    private String client_id;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getOrg_code() == null ? other.getOrg_code() == null : this.getOrg_code().equals(other.getOrg_code()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDel_flag() == null ? other.getDel_flag() == null : this.getDel_flag().equals(other.getDel_flag()))
            && (this.getThird_id() == null ? other.getThird_id() == null : this.getThird_id().equals(other.getThird_id()))
            && (this.getThird_type() == null ? other.getThird_type() == null : this.getThird_type().equals(other.getThird_type()))
            && (this.getActiviti_sync() == null ? other.getActiviti_sync() == null : this.getActiviti_sync().equals(other.getActiviti_sync()))
            && (this.getWork_no() == null ? other.getWork_no() == null : this.getWork_no().equals(other.getWork_no()))
            && (this.getPost() == null ? other.getPost() == null : this.getPost().equals(other.getPost()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getUser_identity() == null ? other.getUser_identity() == null : this.getUser_identity().equals(other.getUser_identity()))
            && (this.getDepart_ids() == null ? other.getDepart_ids() == null : this.getDepart_ids().equals(other.getDepart_ids()))
            && (this.getRel_tenant_ids() == null ? other.getRel_tenant_ids() == null : this.getRel_tenant_ids().equals(other.getRel_tenant_ids()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getOrg_code() == null) ? 0 : getOrg_code().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDel_flag() == null) ? 0 : getDel_flag().hashCode());
        result = prime * result + ((getThird_id() == null) ? 0 : getThird_id().hashCode());
        result = prime * result + ((getThird_type() == null) ? 0 : getThird_type().hashCode());
        result = prime * result + ((getActiviti_sync() == null) ? 0 : getActiviti_sync().hashCode());
        result = prime * result + ((getWork_no() == null) ? 0 : getWork_no().hashCode());
        result = prime * result + ((getPost() == null) ? 0 : getPost().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getUser_identity() == null) ? 0 : getUser_identity().hashCode());
        result = prime * result + ((getDepart_ids() == null) ? 0 : getDepart_ids().hashCode());
        result = prime * result + ((getRel_tenant_ids() == null) ? 0 : getRel_tenant_ids().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", realname=").append(realname);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", avatar=").append(avatar);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", org_code=").append(org_code);
        sb.append(", status=").append(status);
        sb.append(", del_flag=").append(del_flag);
        sb.append(", third_id=").append(third_id);
        sb.append(", third_type=").append(third_type);
        sb.append(", activiti_sync=").append(activiti_sync);
        sb.append(", work_no=").append(work_no);
        sb.append(", post=").append(post);
        sb.append(", telephone=").append(telephone);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", user_identity=").append(user_identity);
        sb.append(", depart_ids=").append(depart_ids);
        sb.append(", rel_tenant_ids=").append(rel_tenant_ids);
        sb.append(", client_id=").append(client_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}