package cn.edu.platform.common.annotation;

import javax.annotation.Resource;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】16:46
 * @author 【说明】用于限制方法流量
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.common.annotation
 */
public @interface limited {

    /**
     * 方法名称
     *
     * @return
     */
    String name() default "";

    /**
     * 时间（秒）
     *
     * @return
     */
    long keepAliveTime() default 1;

    /**
     * 单位时间的流量
     *
     * @return
     */
    int limit() default 100;
}
