package tech.jiangtao.springmvc.service.impl;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.jiangtao.springmvc.mapper.ItemsCustomMapper;
import tech.jiangtao.springmvc.mapper.ItemsMapper;
import tech.jiangtao.springmvc.model.Items;
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

    @Autowired
    private ItemsMapper itemsMapper;

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


    @Override
    public ItemsCustom findItemsById(Integer id) throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(id);
        ItemsCustom custom = new ItemsCustom();
        BeanUtils.copyProperties(items,custom);
        return custom;
    }

    /**
     *
     * @param items_id 商品id
     * @param items 商品具体信息
     * @return
     * @throws Exception
     */
    @Override
    public ItemsCustom updateItems(@NotNull Integer items_id, ItemsCustom items) throws Exception {
        // 关键的业务数据的非空校验
        if (items_id!=null){
            itemsMapper.updateByPrimaryKeySelective(items);
            return items;
        }
        return null;
    }
}
