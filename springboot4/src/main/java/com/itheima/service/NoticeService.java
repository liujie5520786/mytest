package com.itheima.service;

import java.util.List;
import java.util.Map;

import com.itheima.pojo.Notice;

public interface NoticeService {
	
	List<Notice> findAll();
	

	Map<String, Object> findByPage(Integer page, Integer rows);
	

}
