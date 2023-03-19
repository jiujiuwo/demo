package org.csits.demo.api.qo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.csits.demo.domain.SysUser;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@Validated
@Schema(name = "查询用户信息的入参")
public class SysUserQo implements Serializable {

    @Schema(name = "查询条件")
    private SysUser condition;

    @Schema(name = "查询结果和分页信息")
    private Page<SysUser> page;

}
