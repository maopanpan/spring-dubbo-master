package cn.edu.platform.dao.sys;

import cn.edu.platform.model.sys.SysRole;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SysRoleMapper extends Mapper<SysRole> {

    List<SysRole> findListByUserId(String userId);
}