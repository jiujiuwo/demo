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
 * 
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Getter
@Setter
@TableName("sys_position")
@Schema(name = "SysPosition", description = "")
public class SysPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "职务编码")
    @TableField("code")
    private String code;

    @Schema(description = "职务名称")
    @TableField("name")
    private String name;

    @Schema(description = "职级")
    @TableField("post_rank")
    private String postRank;

    @Schema(description = "公司id")
    @TableField("company_id")
    private String companyId;

    @Schema(description = "创建人")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "修改人")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "修改时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Schema(description = "组织机构编码")
    @TableField("sys_org_code")
    private String sysOrgCode;
}
