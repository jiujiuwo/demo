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
@TableName("sys_permission_data_rule")
@Schema(name = "SysPermissionDataRule", description = "")
public class SysPermissionDataRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "ID")
    @TableId("id")
    private String id;

    @Schema(description = "菜单ID")
    @TableField("permission_id")
    private String permissionId;

    @Schema(description = "规则名称")
    @TableField("rule_name")
    private String ruleName;

    @Schema(description = "字段")
    @TableField("rule_column")
    private String ruleColumn;

    @Schema(description = "条件")
    @TableField("rule_conditions")
    private String ruleConditions;

    @Schema(description = "规则值")
    @TableField("rule_value")
    private String ruleValue;

    @Schema(description = "权限有效状态1有0否")
    @TableField("status")
    private String status;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("create_by")
    private String createBy;

    @Schema(description = "修改时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Schema(description = "修改人")
    @TableField("update_by")
    private String updateBy;
}
