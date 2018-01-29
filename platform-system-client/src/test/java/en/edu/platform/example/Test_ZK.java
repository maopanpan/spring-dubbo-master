//package en.edu.platform.example;
//
//import cn.edu.platform.common.zk.ZKRepository;
//import en.edu.platform.BaseTest;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author 【name】毛攀攀
// * @author 【date】2018/01/24
// * @author 【时间】15:07
// * @author 【说明】
// * @author 【工程】spring-dubbo-master
// * @author 【目录】en.edu.platform.example
// */
//public class Test_ZK extends BaseTest {
//
//    @Autowired
//    private ZKRepository zkRepository;
//
//    @Test
//    public void test() {
//        boolean isExists = zkRepository.checkExists("/cn/edu/platform");
//        if (!isExists) {
//            zkRepository.createNode("/cn/edu/platform", "");
//        }
//    }
//}
