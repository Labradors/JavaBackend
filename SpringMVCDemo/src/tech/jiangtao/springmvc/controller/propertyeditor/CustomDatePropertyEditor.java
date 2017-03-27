package tech.jiangtao.springmvc.controller.propertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @class: CustomDatePropertyEditor </br>
 * @description:  自定义属性编辑器，在处理器映射器中添加,早期版本</br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/27 下午6:32</br>
 * @version: 0.0.1 </br>
 **/
public class CustomDatePropertyEditor implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        propertyEditorRegistry.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"), true));
    }
}
