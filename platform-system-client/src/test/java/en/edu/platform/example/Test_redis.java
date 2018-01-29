package en.edu.platform.example;

import cn.edu.platform.common.redis.RedisRepository;
import en.edu.platform.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】13:51
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】en.edu.platform.example
 */
public class Test_redis extends BaseTest {

    @Autowired
    private RedisRepository redisRepository;

    @Test
    public void test() {
        redisRepository.set("abc", "1");
    }


}
