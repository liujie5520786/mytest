package com.itheima.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.itheima.pojo.Notice;

@Mapper
public interface NoticeMapper {
	
	//查询所有公告
	@Select("select * from notice")
	List<Notice> findAll();
	
	
	Long count();
	
	
	List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);

}
