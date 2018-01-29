//package cn.edu.platform.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.time.LocalDateTime;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author 【name】毛攀攀
// * @author 【date】2018/01/23
// * @author 【时间】15:31
// * @author 【说明】
// * @author 【工程】spring-dubbo-master
// * @author 【目录】cn.edu.platform.controller
// */
//@Controller
//@RequestMapping("/sys")
//public class SysUserController {
//
//    @RequestMapping(value = "querySysUserById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
//    @ResponseBody
//    public Object querySysUserById(@RequestParam(value = "id", required = true) String id) {
//        Map<String, Object> resultMap = new HashMap<String, Object>();
//        resultMap.put("id", id);
//        resultMap.put("name", "张三");
//        resultMap.put("age", 22);
//        resultMap.put("time", LocalDateTime.now());
//        return resultMap;
//    }
//}
