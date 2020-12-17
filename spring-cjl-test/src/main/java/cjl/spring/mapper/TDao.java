package cjl.spring.mapper;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface TDao {
	@Select("select * from ttx_table")
	 List<Map<String, Object>> list();
}
