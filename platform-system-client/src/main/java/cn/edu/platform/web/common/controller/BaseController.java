package cn.edu.platform.web.common.controller;

import cn.edu.platform.common.editor.DateEditor;
import cn.edu.platform.common.editor.StringEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】16:22
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.controller
 */
public class BaseController {

    /**
     * 初始化数据绑定
     * 1. 将所有传递进来的String进行HTML编码，防止XSS攻击
     * 2. 将字段中Date类型转换为String类型
     *
     * @param webDataBinder the binder
     */
    @InitBinder
    protected void initBinder(WebDataBinder webDataBinder) {
        // String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击
        webDataBinder.registerCustomEditor(String.class, new StringEditor());
        // Date 类型转换
        webDataBinder.registerCustomEditor(Date.class, new DateEditor());
    }

}
