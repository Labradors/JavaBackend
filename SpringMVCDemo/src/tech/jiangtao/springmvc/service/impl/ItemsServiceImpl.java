package tech.jiangtao.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.jiangtao.springmvc.mapper.ItemsCustomMapper;
import tech.jiangtao.springmvc.model.ItemsCustom;
import tech.jiangtao.springmvc.model.ItemsQuery;
import tech.jiangtao.springmvc.service.ItemsService;

import java.util.List;

/**
 * @class: ItemsServiceImpl </br>
 * @description: ItemsService实现类 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/26 下午11:54</br>
 * @version: 0.0.1 </br>
 **/

public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsCustomMapper itemsCustomMapper;

    /**
     * 商品的查询列表
     * @param query
     * @return
     * @throws Exception
     */
    @Override
    public List<ItemsCustom> findItemsList(ItemsQuery query) throws Exception {
        return itemsCustomMapper.findItemsList(query);
    }
}
