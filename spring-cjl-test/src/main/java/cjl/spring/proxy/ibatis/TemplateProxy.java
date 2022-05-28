package cjl.spring.proxy.ibatis;

import cjl.spring.proxy.service.UserDao;

public class TemplateProxy implements UserDao {
	@Override
	public void query() {
		System.out.println("查询");
	}
}
