package cn.edu.platform.service.example;

import cn.edu.platform.model.sys.SysUser;

import java.util.Map;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/23
 * @author 【时间】15:53
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.service.example
 */
public interface SysUserService {

    /**
     * 根据用户ID，获取用户信息
     *
     * @param id
     * @return
     */
    public SysUser querySysUserById(String id);

    /**
     * 根据用户名，获取用户信息
     *
     * @param loginName
     * @return
     */
    public SysUser querySysUserByUserName(String loginName);
}
