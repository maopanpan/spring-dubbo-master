package cn.edu.platform.dao.sys;

import cn.edu.platform.model.sys.SysMenu;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SysMenuMapper extends Mapper<SysMenu> {

    List<SysMenu> findListByUserId(String userId);

}