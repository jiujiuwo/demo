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
@TableName("sys_data_log")
@Schema(name = "SysDataLog", description = "")
public class SysDataLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId("id")
    private String id;

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

    @Schema(description = "表名")
    @TableField("data_table")
    private String dataTable;

    @Schema(description = "数据ID")
    @TableField("data_id")
    private String dataId;

    @Schema(description = "数据内容")
    @TableField("data_content")
    private String dataContent;

    @Schema(description = "版本号")
    @TableField("data_version")
    private Integer dataVersion;

    @Schema(description = "类型")
    @TableField("type")
    private String type;
}
