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
@TableName("sys_gateway_route")
@Schema(name = "SysGatewayRoute", description = "")
public class SysGatewayRoute implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @Schema(description = "路由ID")
    @TableField("router_id")
    private String routerId;

    @Schema(description = "服务名")
    @TableField("name")
    private String name;

    @Schema(description = "服务地址")
    @TableField("uri")
    private String uri;

    @Schema(description = "断言")
    @TableField("predicates")
    private String predicates;

    @Schema(description = "过滤器")
    @TableField("filters")
    private String filters;

    @Schema(description = "是否重试:0-否 1-是")
    @TableField("retryable")
    private Integer retryable;

    @Schema(description = "是否忽略前缀0-否 1-是")
    @TableField("strip_prefix")
    private Integer stripPrefix;

    @Schema(description = "是否为保留数据:0-否 1-是")
    @TableField("persistable")
    private Integer persistable;

    @Schema(description = "是否在接口文档中展示:0-否 1-是")
    @TableField("show_api")
    private Integer showApi;

    @Schema(description = "状态:0-无效 1-有效")
    @TableField("status")
    private Integer status;

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
