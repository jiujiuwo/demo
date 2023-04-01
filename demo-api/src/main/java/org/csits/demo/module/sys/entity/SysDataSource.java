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
@TableName("sys_data_source")
@Schema(name = "SysDataSource", description = "")
public class SysDataSource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "数据源编码")
    @TableField("code")
    private String code;

    @Schema(description = "数据源名称")
    @TableField("name")
    private String name;

    @Schema(description = "备注")
    @TableField("remark")
    private String remark;

    @Schema(description = "数据库类型")
    @TableField("db_type")
    private String dbType;

    @Schema(description = "驱动类")
    @TableField("db_driver")
    private String dbDriver;

    @Schema(description = "数据源地址")
    @TableField("db_url")
    private String dbUrl;

    @Schema(description = "数据库名称")
    @TableField("db_name")
    private String dbName;

    @Schema(description = "用户名")
    @TableField("db_username")
    private String dbUsername;

    @Schema(description = "密码")
    @TableField("db_password")
    private String dbPassword;

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
}
