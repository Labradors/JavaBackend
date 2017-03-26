package tech.jiangtao.springmvc.unused;
/**
 * 
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import tech.jiangtao.springmvc.model.Items;

/**    
 *  @moduleName：  SpringMVC   
 *  @className： ItemsController   
 *  @description：    
 *  @author： kevin   
 *  @createTime： 2017年3月26日 下午2:44:22   
 *  @version:      
 **/
public class ItemsController implements Controller {

	/* (non-Javadoc)
	 * 获取商品信息列表
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
