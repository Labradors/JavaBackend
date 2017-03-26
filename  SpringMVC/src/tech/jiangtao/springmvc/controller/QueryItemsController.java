/**
 * 
 */
package tech.jiangtao.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tech.jiangtao.springmvc.model.Items;

/**    
 *  @moduleName：  SpringMVC   
 *  @className： QueryItemsController   
 *  @description：    
 *  @author： kevin   
 *  @createTime： 2017年3月26日 下午2:44:22   
 *  @version:      
 **/
@org.springframework.stereotype.Controller
public class QueryItemsController {

	/* (non-Javadoc)
	 * 获取商品信息列表
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@RequestMapping("/queryItems1")
	public ModelAndView queryItems() {
		List<Items> itemsList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Items item = new Items();
			item.setName("笔记本");
			item.setPrice(10.02f);
			item.setCreatetime(new Date());
			item.setDetail("非常的好用");
			itemsList.add(item);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("itemsList");
		return modelAndView;
	}

}
