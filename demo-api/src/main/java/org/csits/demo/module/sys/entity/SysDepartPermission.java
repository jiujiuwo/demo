package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * <p>
 * 部门权限表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_depart_permission")
@Schema(name = "SysDepartPermission", description = "部门权限表")
public class SysDepartPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "部门id")
    @TableField("depart_id")
    private String departId;

    @Schema(description = "权限id")
    @TableField("permission_id")
    private String permissionId;

    @Schema(description = "数据规则id")
    @TableField("data_rule_ids")
    private String dataRuleIds;
}
