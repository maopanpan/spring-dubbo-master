package cn.edu.platform.common.editor;

import cn.edu.platform.common.utils.DateHelper;

import java.beans.PropertyEditorSupport;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】16:09
 * @author 【说明】日期转换
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.common.editor
 */
public class DateEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(DateHelper.parseDate(text));
    }
}
