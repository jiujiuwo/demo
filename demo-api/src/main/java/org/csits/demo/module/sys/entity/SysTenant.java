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
 * 多租户信息表
 * </p>
 *
 * @author lhf
 * @since 2023-04-01
 */
@Data
@TableName("sys_tenant")
@Schema(name = "SysTenant", description = "多租户信息表")
public class SysTenant implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "租户编码")
    @TableId("id")
    private Integer id;

    @Schema(description = "租户名称")
    @TableField("name")
    private String name;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "创建人")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "开始时间")
    @TableField("begin_date")
    private LocalDateTime beginDate;

    @Schema(description = "结束时间")
    @TableField("end_date")
    private LocalDateTime endDate;

    @Schema(description = "状态 1正常 0冻结")
    @TableField("status")
    private Integer status;
}
