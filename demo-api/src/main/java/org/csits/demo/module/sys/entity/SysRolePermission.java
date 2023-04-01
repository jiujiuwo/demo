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
 * 角色权限表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_role_permission")
@Schema(name = "SysRolePermission", description = "角色权限表")
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "角色id")
    @TableField("role_id")
    private String roleId;

    @Schema(description = "权限id")
    @TableField("permission_id")
    private String permissionId;

    @Schema(description = "数据权限ids")
    @TableField("data_rule_ids")
    private String dataRuleIds;

    @Schema(description = "操作时间")
    @TableField("operate_date")
    private LocalDateTime operateDate;

    @Schema(description = "操作ip")
    @TableField("operate_ip")
    private String operateIp;
}
