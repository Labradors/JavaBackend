package tech.jiangtao.mybatis.pojo;

import java.util.List;

public class UserCustom extends User {

	public int age;
	public List<Integer> ids;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
}
