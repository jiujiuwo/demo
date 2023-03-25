package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author lhf
 * @since 2023-03-25
 */
@Getter
@Setter
@TableName("sys_user_role")
@Schema(name = "SysUserRole", description = "用户角色表")
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键id")
    @TableId("id")
    private String id;

    @Schema(description = "用户id")
    @TableField("user_id")
    private String userId;

    @Schema(description = "角色id")
    @TableField("role_id")
    private String roleId;
}
