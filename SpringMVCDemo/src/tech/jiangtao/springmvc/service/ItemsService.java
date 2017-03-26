package tech.jiangtao.springmvc.service;

import tech.jiangtao.springmvc.model.ItemsCustom;
import tech.jiangtao.springmvc.model.ItemsQuery;

import java.util.List;

/**
 * @class: ItemsService </br>
 * @description:  商品service层</br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/26 下午11:53</br>
 * @version: 0.0.1 </br>
 **/
public interface ItemsService {

    public List<ItemsCustom> findItemsList(ItemsQuery query) throws Exception;
}
