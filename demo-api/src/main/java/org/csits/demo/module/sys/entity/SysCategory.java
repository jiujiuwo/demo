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
@TableName("sys_category")
@Schema(name = "SysCategory", description = "")
public class SysCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "父级节点")
    @TableField("pid")
    private String pid;

    @Schema(description = "类型名称")
    @TableField("name")
    private String name;

    @Schema(description = "类型编码")
    @TableField("code")
    private String code;

    @Schema(description = "创建人")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建日期")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新人")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "更新日期")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Schema(description = "所属部门")
    @TableField("sys_org_code")
    private String sysOrgCode;

    @Schema(description = "是否有子节点")
    @TableField("has_child")
    private String hasChild;
}
