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
 * 角色首页表
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Getter
@Setter
@TableName("sys_role_index")
@Schema(name = "SysRoleIndex", description = "角色首页表")
public class SysRoleIndex implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "角色编码")
    @TableField("role_code")
    private String roleCode;

    @Schema(description = "路由地址")
    @TableField("url")
    private String url;

    @Schema(description = "组件")
    @TableField("component")
    private String component;

    @Schema(description = "是否路由菜单: 0:不是  1:是（默认值1）")
    @TableField("is_route")
    private Byte isRoute;

    @Schema(description = "优先级")
    @TableField("priority")
    private Integer priority;

    @Schema(description = "状态0:无效 1:有效")
    @TableField("status")
    private String status;

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

    @Schema(description = "所属部门")
    @TableField("sys_org_code")
    private String sysOrgCode;
}
