package org.csits.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 菜单权限表
 * @TableName sys_permission
 */
@TableName(value ="sys_permission")
@Data
public class SysPermission implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id")
    private String id;

    /**
     * 父id
     */
    @TableField(value = "parent_id")
    private String parent_id;

    /**
     * 菜单标题
     */
    @TableField(value = "name")
    private String name;

    /**
     * 路径
     */
    @TableField(value = "url")
    private String url;

    /**
     * 组件
     */
    @TableField(value = "component")
    private String component;

    /**
     * 组件名字
     */
    @TableField(value = "component_name")
    private String component_name;

    /**
     * 一级菜单跳转地址
     */
    @TableField(value = "redirect")
    private String redirect;

    /**
     * 菜单类型(0:一级菜单; 1:子菜单:2:按钮权限)
     */
    @TableField(value = "menu_type")
    private Integer menu_type;

    /**
     * 菜单权限编码
     */
    @TableField(value = "perms")
    private String perms;

    /**
     * 权限策略1显示2禁用
     */
    @TableField(value = "perms_type")
    private String perms_type;

    /**
     * 菜单排序
     */
    @TableField(value = "sort_no")
    private Double sort_no;

    /**
     * 聚合子路由: 1是0否
     */
    @TableField(value = "always_show")
    private Integer always_show;

    /**
     * 菜单图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 是否路由菜单: 0:不是  1:是（默认值1）
     */
    @TableField(value = "is_route")
    private Integer is_route;

    /**
     * 是否叶子节点:    1:是   0:不是
     */
    @TableField(value = "is_leaf")
    private Integer is_leaf;

    /**
     * 是否缓存该页面:    1:是   0:不是
     */
    @TableField(value = "keep_alive")
    private Integer keep_alive;

    /**
     * 是否隐藏路由: 0否,1是
     */
    @TableField(value = "hidden")
    private Integer hidden;

    /**
     * 是否隐藏tab: 0否,1是
     */
    @TableField(value = "hide_tab")
    private Integer hide_tab;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    private String create_by;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    private String update_by;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    /**
     * 删除状态 0正常 1已删除
     */
    @TableField(value = "del_flag")
    private Integer del_flag;

    /**
     * 是否添加数据权限1是0否
     */
    @TableField(value = "rule_flag")
    private Integer rule_flag;

    /**
     * 按钮权限状态(0无效1有效)
     */
    @TableField(value = "status")
    private String status;

    /**
     * 外链菜单打开方式 0/内部打开 1/外部打开
     */
    @TableField(value = "internal_or_external")
    private Integer internal_or_external;

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
        SysPermission other = (SysPermission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getComponent() == null ? other.getComponent() == null : this.getComponent().equals(other.getComponent()))
            && (this.getComponent_name() == null ? other.getComponent_name() == null : this.getComponent_name().equals(other.getComponent_name()))
            && (this.getRedirect() == null ? other.getRedirect() == null : this.getRedirect().equals(other.getRedirect()))
            && (this.getMenu_type() == null ? other.getMenu_type() == null : this.getMenu_type().equals(other.getMenu_type()))
            && (this.getPerms() == null ? other.getPerms() == null : this.getPerms().equals(other.getPerms()))
            && (this.getPerms_type() == null ? other.getPerms_type() == null : this.getPerms_type().equals(other.getPerms_type()))
            && (this.getSort_no() == null ? other.getSort_no() == null : this.getSort_no().equals(other.getSort_no()))
            && (this.getAlways_show() == null ? other.getAlways_show() == null : this.getAlways_show().equals(other.getAlways_show()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getIs_route() == null ? other.getIs_route() == null : this.getIs_route().equals(other.getIs_route()))
            && (this.getIs_leaf() == null ? other.getIs_leaf() == null : this.getIs_leaf().equals(other.getIs_leaf()))
            && (this.getKeep_alive() == null ? other.getKeep_alive() == null : this.getKeep_alive().equals(other.getKeep_alive()))
            && (this.getHidden() == null ? other.getHidden() == null : this.getHidden().equals(other.getHidden()))
            && (this.getHide_tab() == null ? other.getHide_tab() == null : this.getHide_tab().equals(other.getHide_tab()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getDel_flag() == null ? other.getDel_flag() == null : this.getDel_flag().equals(other.getDel_flag()))
            && (this.getRule_flag() == null ? other.getRule_flag() == null : this.getRule_flag().equals(other.getRule_flag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getInternal_or_external() == null ? other.getInternal_or_external() == null : this.getInternal_or_external().equals(other.getInternal_or_external()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getComponent() == null) ? 0 : getComponent().hashCode());
        result = prime * result + ((getComponent_name() == null) ? 0 : getComponent_name().hashCode());
        result = prime * result + ((getRedirect() == null) ? 0 : getRedirect().hashCode());
        result = prime * result + ((getMenu_type() == null) ? 0 : getMenu_type().hashCode());
        result = prime * result + ((getPerms() == null) ? 0 : getPerms().hashCode());
        result = prime * result + ((getPerms_type() == null) ? 0 : getPerms_type().hashCode());
        result = prime * result + ((getSort_no() == null) ? 0 : getSort_no().hashCode());
        result = prime * result + ((getAlways_show() == null) ? 0 : getAlways_show().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getIs_route() == null) ? 0 : getIs_route().hashCode());
        result = prime * result + ((getIs_leaf() == null) ? 0 : getIs_leaf().hashCode());
        result = prime * result + ((getKeep_alive() == null) ? 0 : getKeep_alive().hashCode());
        result = prime * result + ((getHidden() == null) ? 0 : getHidden().hashCode());
        result = prime * result + ((getHide_tab() == null) ? 0 : getHide_tab().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getDel_flag() == null) ? 0 : getDel_flag().hashCode());
        result = prime * result + ((getRule_flag() == null) ? 0 : getRule_flag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInternal_or_external() == null) ? 0 : getInternal_or_external().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", component=").append(component);
        sb.append(", component_name=").append(component_name);
        sb.append(", redirect=").append(redirect);
        sb.append(", menu_type=").append(menu_type);
        sb.append(", perms=").append(perms);
        sb.append(", perms_type=").append(perms_type);
        sb.append(", sort_no=").append(sort_no);
        sb.append(", always_show=").append(always_show);
        sb.append(", icon=").append(icon);
        sb.append(", is_route=").append(is_route);
        sb.append(", is_leaf=").append(is_leaf);
        sb.append(", keep_alive=").append(keep_alive);
        sb.append(", hidden=").append(hidden);
        sb.append(", hide_tab=").append(hide_tab);
        sb.append(", description=").append(description);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", del_flag=").append(del_flag);
        sb.append(", rule_flag=").append(rule_flag);
        sb.append(", status=").append(status);
        sb.append(", internal_or_external=").append(internal_or_external);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}