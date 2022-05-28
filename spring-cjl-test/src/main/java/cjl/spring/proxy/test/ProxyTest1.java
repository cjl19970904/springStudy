package cjl.spring.proxy.test;

import cjl.spring.app.AppConfig;
import cjl.spring.proxy.ibatis.CjlFactory;
import cjl.spring.proxy.service.UserDao;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class ProxyTest1 {
	public static void main(String[] args) {
		//初始化容器
	/*	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(AppConfig.class));*/

		UserDao userDao = (UserDao) CjlFactory.getMapper(UserDao.class);
		userDao.query();

	}

}
