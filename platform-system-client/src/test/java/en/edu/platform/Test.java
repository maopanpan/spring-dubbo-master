package en.edu.platform;

import org.apache.commons.lang3.StringEscapeUtils;

import java.beans.PropertyEditorSupport;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/25
 * @author 【时间】15:15
 * @author 【说明】
 * @author 【工程】spring-dubbo-master
 * @author 【目录】en.edu.platform
 */
public class Test {

    public static void main(String[] args) {

        PropertyEditorSupport p = new PropertyEditorSupport();
        p.setAsText("1".toString());
        System.out.println(p.getAsText());
        String ab = "1";
        if(ab instanceof String) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
