package tech.jiangtao.springmvc.mapper;

import tech.jiangtao.springmvc.model.ItemsCustom;
import tech.jiangtao.springmvc.model.ItemsQuery;

import java.util.List;

/**
 * @class: ItemsCustomMapper </br>
 * @description:  自定义mapper</br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/26 下午11:30</br>
 * @version: 0.0.1 </br>
 **/
public interface ItemsCustomMapper {

    List<ItemsCustom> findItemsList(ItemsQuery query) throws Exception;
}
