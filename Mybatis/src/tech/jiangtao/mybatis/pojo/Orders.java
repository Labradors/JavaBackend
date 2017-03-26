package tech.jiangtao.mybatis.pojo;

import java.util.Date;
import java.util.List;

/**
  *  @moduleName： Mybatis   
  *  @className： Orders   
  *  @description：    
  *  @author： kevin   
  *  @createTime： 2017年3月26日 上午4:05:33   
  *  @version:  
  *
 */
public class Orders {
	private int id;
	private int user_id;
	private String number;
	private Date createtime;
	private String note;
	
	// 使用ResultMap来映射一对一的查询
	private User user;
	
	// 使用ResultMap来映射一对一查询
	private List<Orderdetail> orderdetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}
}
