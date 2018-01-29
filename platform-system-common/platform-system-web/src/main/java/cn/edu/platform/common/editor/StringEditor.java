package cn.edu.platform.common.editor;

import org.apache.commons.lang3.StringEscapeUtils;

import java.beans.PropertyEditorSupport;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/24
 * @author 【时间】15:52
 * @author 【说明】自定义属性编辑器（去除空隔）
 * @author 【工程】spring-dubbo-master
 * @author 【目录】cn.edu.platform.common.editor
 */
public class StringEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(text == null ? null : StringEscapeUtils.escapeHtml4(text.trim()));
    }

    @Override
    public String getAsText() {
        Object value = getValue();
        return value != null ? value.toString() : "";
    }
}
