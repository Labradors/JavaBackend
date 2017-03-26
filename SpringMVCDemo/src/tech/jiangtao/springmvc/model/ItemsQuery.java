package tech.jiangtao.springmvc.model;

/**
 * @class: ItemsQuery </br>
 * @description: 自定义商品输出拓展的{@link items} </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/26 下午11:35</br>
 * @version: 0.0.1 </br>
 **/
public class ItemsQuery {

    private ItemsCustom itemsCustom;

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
