package cn.edu.platform.common.annotation;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】16:54
 * @author 【说明】日志处理接口
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.common.annotation
 */
public @interface LogRecord {

    /**
     * 方法名称
     *
     * @return
     */
    String name() default "";

    /**
     * 访问路径
     *
     * @return
     */
    String path() default "";

    /**
     * 方法说明
     *
     * @return
     */
    String desc() default "";
}
