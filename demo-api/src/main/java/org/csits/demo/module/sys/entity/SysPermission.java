package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 菜单权限表
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Getter
@Setter
@TableName("sys_permission")
@Schema(name = "SysPermission", description = "菜单权限表")
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键id")
    @TableId("id")
    private String id;

    @Schema(description = "父id")
    @TableField("parent_id")
    private String parentId;

    @Schema(description = "菜单标题")
    @TableField("name")
    private String name;

    @Schema(description = "路径")
    @TableField("url")
    private String url;

    @Schema(description = "组件")
    @TableField("component")
    private String component;

    @Schema(description = "是否路由菜单: 0:不是  1:是（默认值1）")
    @TableField("is_route")
    private Byte isRoute;

    @Schema(description = "组件名字")
    @TableField("component_name")
    private String componentName;

    @Schema(description = "一级菜单跳转地址")
    @TableField("redirect")
    private String redirect;

    @Schema(description = "菜单类型(0:一级菜单; 1:子菜单:2:按钮权限)")
    @TableField("menu_type")
    private Integer menuType;

    @Schema(description = "菜单权限编码")
    @TableField("perms")
    private String perms;

    @Schema(description = "权限策略1显示2禁用")
    @TableField("perms_type")
    private String permsType;

    @Schema(description = "菜单排序")
    @TableField("sort_no")
    private Object sortNo;

    @Schema(description = "聚合子路由: 1是0否")
    @TableField("always_show")
    private Byte alwaysShow;

    @Schema(description = "菜单图标")
    @TableField("icon")
    private String icon;

    @Schema(description = "是否叶子节点:    1是0否")
    @TableField("is_leaf")
    private Byte isLeaf;

    @Schema(description = "是否缓存该页面:    1:是   0:不是")
    @TableField("keep_alive")
    private Byte keepAlive;

    @Schema(description = "是否隐藏路由: 0否,1是")
    @TableField("hidden")
    private Integer hidden;

    @Schema(description = "是否隐藏tab: 0否,1是")
    @TableField("hide_tab")
    private Integer hideTab;

    @Schema(description = "描述")
    @TableField("description")
    private String description;

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

    @Schema(description = "删除状态 0正常 1已删除")
    @TableField("del_flag")
    private Integer delFlag;

    @Schema(description = "是否添加数据权限1是0否")
    @TableField("rule_flag")
    private Integer ruleFlag;

    @Schema(description = "按钮权限状态(0无效1有效)")
    @TableField("status")
    private String status;

    @Schema(description = "外链菜单打开方式 0/内部打开 1/外部打开")
    @TableField("internal_or_external")
    private Byte internalOrExternal;
}
