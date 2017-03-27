package tech.jiangtao.springmvc.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @class: CustomDateConverter </br>
 * @description:  自定义String去除空格converter</br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/27 下午6:39</br>
 * @version: 0.0.1 </br>
 **/
public class CustomStringTrimConverter implements Converter<String,String> {
    @Override
    public String convert(String source) {
        if (source!=null){
            if (source.trim().equals("")){
                return null;
            }
        }
        return source;
    }
}
