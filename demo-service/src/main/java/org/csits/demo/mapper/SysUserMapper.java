package org.csits.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.csits.demo.domain.SysUser;

import java.util.List;

/**
* @author lhf
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2023-02-11 16:06:53
* @Entity org.csits.demo.domain.SysUser
*/
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectPageVo(IPage<SysUser> page);

}




