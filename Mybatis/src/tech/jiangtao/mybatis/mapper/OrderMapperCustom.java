package tech.jiangtao.mybatis.mapper;

import java.util.List;
import tech.jiangtao.mybatis.pojo.Orders;
import tech.jiangtao.mybatis.pojo.OrdersCustom;
import tech.jiangtao.mybatis.pojo.User;


/**
 * 
 *  @moduleName： Mybatis   
 *  @className： OrderMapperCustom   
 *  @description：    
 *  @author： kevin   
 *  @createTime： 2017年3月26日 上午4:12:38   
 *  @version:      
 *
 */
public interface OrderMapperCustom {

	public List<OrdersCustom> findOrdersUserList() throws Exception;
	
	public List<Orders> findOrdersUserListResultMap() throws Exception;
	
	public List<Orders> findOrderAndOrdersDetailListResultMap() throws Exception;
	
	public List<User> findUserOrderAndOrdersDetailAndItemsListResultMap() throws Exception;
	
	public List<Orders> findOrdersUserListLazyLoading() throws Exception;
	
	public List<User> insertUser(User user);
}
