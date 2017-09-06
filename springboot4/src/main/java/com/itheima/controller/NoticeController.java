package com.itheima.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.itheima.pojo.Notice;
import com.itheima.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService ns;
	
	@GetMapping("/notice")
	@ResponseBody
	public List<Notice> findAll(Model model) {
		
		
		List<Notice> list = ns.findAll();
		
		return list;	
	}
	
	/** 跳转分页查询公告页面 */
	@GetMapping("/show")
	public String show(){
		return "/html/notice.html";
	}
	
	@RequestMapping("/findByPage")
	@ResponseBody
	public Map<String,Object> findByPage(Integer page,Integer rows){
		
		return ns.findByPage(page, rows);
	}
}
