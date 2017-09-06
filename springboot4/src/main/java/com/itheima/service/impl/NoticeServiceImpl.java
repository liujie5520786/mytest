package com.itheima.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.mapper.NoticeMapper;
import com.itheima.pojo.Notice;
import com.itheima.service.NoticeService;

@Service
@Transactional(readOnly=true)
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper nm;
	
	@Override
	public List<Notice> findAll() {
		
		return nm.findAll();
	}

	
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Map<String, Object> map = new HashMap<String,Object>();
		
		//获取总记录数
		Long count = nm.count();
		map.put("total", count);
		
		//获取每页显示内容
		List<Notice> list = nm.findByPage(page-1, rows);
		map.put("rows", list);
		
		return map;
	}

	

	

}
