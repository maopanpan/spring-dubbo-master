package cn.edu.platform.example;

import cn.edu.platform.BaseTest;
import cn.edu.platform.model.sys.SysUser;
import cn.edu.platform.service.example.SysUserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】11:14
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.example
 */
public class Test_SysUserService extends BaseTest {

    @Autowired
    public SysUserService sysUserService;

    @Test
    public void test() {
        SysUser sysUser = sysUserService.querySysUserById("1");
        Assert.assertNotNull(sysUser);
    }


}
