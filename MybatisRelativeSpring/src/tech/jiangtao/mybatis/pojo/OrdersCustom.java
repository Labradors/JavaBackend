package tech.jiangtao.mybatis.pojo;

/**
 * 订单拓展对象
 * @author kevin
 *
 */
public class OrdersCustom extends Orders {

	private String username;
	private String sex;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "OrdersCustom [username=" + username + ", sex=" + sex + ", getId()=" + getId() + ", getUser_id()="
				+ getUser_id() + ", getNumber()=" + getNumber() + ", getCreatetime()=" + getCreatetime()
				+ ", getNote()=" + getNote() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
