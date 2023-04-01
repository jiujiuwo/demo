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
@TableName("sys_dict_item")
@Schema(name = "SysDictItem", description = "")
public class SysDictItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "字典id")
    @TableField("dict_id")
    private String dictId;

    @Schema(description = "字典项文本")
    @TableField("item_text")
    private String itemText;

    @Schema(description = "字典项值")
    @TableField("item_value")
    private String itemValue;

    @Schema(description = "描述")
    @TableField("description")
    private String description;

    @Schema(description = "排序")
    @TableField("sort_order")
    private Integer sortOrder;

    @Schema(description = "状态（1启用 0不启用）")
    @TableField("status")
    private Integer status;

    @TableField("create_by")
    private String createBy;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_by")
    private String updateBy;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
