package tech.jiangtao.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
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
@Controller
public class QueryItemsController {

	/* (non-Javadoc)
	 * 获取商品信息列表
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@RequestMapping("/queryItems1")
	public ModelAndView queryItems() {
		List<Items> itemsList1 = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Items item1 = new Items();
			item1.setName("笔记本");
			item1.setPrice(10.02f);
			item1.setCreatetime(new Date());
			item1.setDetail("非常的好用");
			itemsList1.add(item1);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList1);
		modelAndView.setViewName("itemsList");
		return modelAndView;
	}

}
