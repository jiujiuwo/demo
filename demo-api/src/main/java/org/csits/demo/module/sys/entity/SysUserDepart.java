package org.csits.demo.module.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("sys_user_depart")
@Schema(name = "SysUserDepart", description = "")
public class SysUserDepart implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId("ID")
    private String id;

    @Schema(description = "用户id")
    @TableField("user_id")
    private String userId;

    @Schema(description = "部门id")
    @TableField("dep_id")
    private String depId;
}
