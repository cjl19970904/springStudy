package cjl.spring.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface TDao1 {
	@Select("select * from ttx_table")
	 List<Map<String, Object>> list();
}
