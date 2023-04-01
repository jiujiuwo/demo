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
@TableName("sys_fill_rule")
@Schema(name = "SysFillRule", description = "")
public class SysFillRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键ID")
    @TableId("id")
    private String id;

    @Schema(description = "规则名称")
    @TableField("rule_name")
    private String ruleName;

    @Schema(description = "规则Code")
    @TableField("rule_code")
    private String ruleCode;

    @Schema(description = "规则实现类")
    @TableField("rule_class")
    private String ruleClass;

    @Schema(description = "规则参数")
    @TableField("rule_params")
    private String ruleParams;

    @Schema(description = "修改人")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "修改时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Schema(description = "创建人")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;
}
