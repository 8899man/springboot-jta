package cn.forever.demo.dao.test1;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDBDao {

	void saveTest(@Param("name")String name);
}
