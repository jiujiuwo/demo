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
 * 组织机构表
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Getter
@Setter
@TableName("sys_depart")
@Schema(name = "SysDepart", description = "组织机构表")
public class SysDepart implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "ID")
    @TableId("id")
    private String id;

    @Schema(description = "父机构ID")
    @TableField("parent_id")
    private String parentId;

    @Schema(description = "机构/部门名称")
    @TableField("depart_name")
    private String departName;

    @Schema(description = "英文名")
    @TableField("depart_name_en")
    private String departNameEn;

    @Schema(description = "缩写")
    @TableField("depart_name_abbr")
    private String departNameAbbr;

    @Schema(description = "排序")
    @TableField("depart_order")
    private Integer departOrder;

    @Schema(description = "描述")
    @TableField("description")
    private String description;

    @Schema(description = "机构类别 1公司，2组织机构，2岗位")
    @TableField("org_category")
    private String orgCategory;

    @Schema(description = "机构类型 1一级部门 2子部门")
    @TableField("org_type")
    private String orgType;

    @Schema(description = "机构编码")
    @TableField("org_code")
    private String orgCode;

    @Schema(description = "手机号")
    @TableField("mobile")
    private String mobile;

    @Schema(description = "传真")
    @TableField("fax")
    private String fax;

    @Schema(description = "地址")
    @TableField("address")
    private String address;

    @Schema(description = "备注")
    @TableField("memo")
    private String memo;

    @Schema(description = "状态（1启用，0不启用）")
    @TableField("status")
    private String status;

    @Schema(description = "删除状态（0，正常，1已删除）")
    @TableField("del_flag")
    private String delFlag;

    @Schema(description = "对接企业微信的ID")
    @TableField("qywx_identifier")
    private String qywxIdentifier;

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
}
