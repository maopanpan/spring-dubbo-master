package cn.edu.platform.common.zk;

import org.apache.curator.framework.CuratorFramework;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】14:59
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.common
 */
@Component
public class ZKConfig {

    @Bean
    public ZKRepository zookeeperRepository(CuratorFramework curatorFramework) {
        return new ZKRepository(curatorFramework);
    }
}
