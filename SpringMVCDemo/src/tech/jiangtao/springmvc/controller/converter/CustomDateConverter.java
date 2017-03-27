package tech.jiangtao.springmvc.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @class: CustomDateConverter </br>
 * @description:  自定义converter</br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/27 下午6:39</br>
 * @version: 0.0.1 </br>
 * 暂时先不换配置，原理都没弄明白
 **/
public class CustomDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH-mm-ss");
        try {
            return format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
