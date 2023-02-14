package org.csits.demo.api.qo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.csits.demo.domain.SysUser;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@Validated
public class SysUserQo implements Serializable {

    private SysUser condition;
    private Page<SysUser> page;

}
