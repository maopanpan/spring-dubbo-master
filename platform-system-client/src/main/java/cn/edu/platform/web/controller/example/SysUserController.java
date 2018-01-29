package cn.edu.platform.web.controller.example;

import cn.edu.platform.service.example.SysUserService;
import cn.edu.platform.web.common.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/23
 * @author 【时间】16:42
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.controller
 */
@Controller
@RequestMapping("/sys")
public class SysUserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/querySysUserById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object querySysUserById(@RequestParam(value = "id") String id) {

        return sysUserService.querySysUserById(id);
    }

    @RequestMapping(value = "/querySysUserByLoginName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object querySysUserByLoginName(@RequestParam(value = "loginName", required = false) String loginName) {
        return sysUserService.querySysUserByUserName(loginName);
    }
}
