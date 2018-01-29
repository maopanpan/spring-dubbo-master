package cn.edu.platform.service.example.impl;

import cn.edu.platform.dao.sys.SysMenuMapper;
import cn.edu.platform.dao.sys.SysRoleMapper;
import cn.edu.platform.dao.sys.SysUserMapper;
import cn.edu.platform.model.sys.SysMenu;
import cn.edu.platform.model.sys.SysUser;
import cn.edu.platform.service.example.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/23
 * @author 【时间】15:55
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.service.example.impl
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public SysUser querySysUserById(String id) {
        return sysUserMapper.querySysUserById(id);
    }

    @Override
    public SysUser querySysUserByUserName(String loginName) {
        SysUser user = sysUserMapper.getByLoginName(loginName);
        if (user == null) {
            return null;
        }

        String userId = user.getId();
        user.setRoles(sysRoleMapper.findListByUserId(userId));

        List<SysMenu> menuList;
        //超级管理员
        if ("1".equals(userId)) {
            menuList = sysMenuMapper.selectAll();
        } else {
            menuList = sysMenuMapper.findListByUserId(userId);
        }

        user.setMenus(menuList);
        return user;
    }


}
