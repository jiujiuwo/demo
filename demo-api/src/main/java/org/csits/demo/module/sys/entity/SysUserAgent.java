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
 * 用户代理人设置
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Getter
@Setter
@TableName("sys_user_agent")
@Schema(name = "SysUserAgent", description = "用户代理人设置")
public class SysUserAgent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "序号")
    @TableId("id")
    private String id;

    @Schema(description = "用户名")
    @TableField("user_name")
    private String userName;

    @Schema(description = "代理人用户名")
    @TableField("agent_user_name")
    private String agentUserName;

    @Schema(description = "代理开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @Schema(description = "代理结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @Schema(description = "状态0无效1有效")
    @TableField("status")
    private String status;

    @Schema(description = "创建人名称")
    @TableField("create_name")
    private String createName;

    @Schema(description = "创建人登录名称")
    @TableField("create_by")
    private String createBy;

    @Schema(description = "创建日期")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新人名称")
    @TableField("update_name")
    private String updateName;

    @Schema(description = "更新人登录名称")
    @TableField("update_by")
    private String updateBy;

    @Schema(description = "更新日期")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @Schema(description = "所属部门")
    @TableField("sys_org_code")
    private String sysOrgCode;

    @Schema(description = "所属公司")
    @TableField("sys_company_code")
    private String sysCompanyCode;
}
