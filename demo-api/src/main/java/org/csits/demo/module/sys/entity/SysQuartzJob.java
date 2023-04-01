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
@TableName("sys_quartz_job")
@Schema(name = "SysQuartzJob", description = "")
public class SysQuartzJob implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "创建人")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "删除状态")
    @TableField("del_flag")
    private Integer delFlag;

    @Schema(description = "修改人")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "修改时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Schema(description = "任务类名")
    @TableField("job_class_name")
    private String jobClassName;

    @Schema(description = "cron表达式")
    @TableField("cron_expression")
    private String cronExpression;

    @Schema(description = "参数")
    @TableField("parameter")
    private String parameter;

    @Schema(description = "描述")
    @TableField("description")
    private String description;

    @Schema(description = "状态 0正常 -1停止")
    @TableField("status")
    private Integer status;
}
