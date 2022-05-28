package cjl.spring.proxy.service;

import org.apache.ibatis.annotations.Select;

public interface UserDao {
	@Select("select * from xxx")
	void query();
}
