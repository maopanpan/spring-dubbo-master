package cn.edu.platform.dao.sys;

import cn.edu.platform.model.sys.SysUser;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserMapper extends Mapper<SysUser> {

    public SysUser querySysUserById(String id);

    SysUser getByLoginName(String loginName);
}