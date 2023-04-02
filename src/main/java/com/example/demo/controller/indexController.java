package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.boardDao;

@Controller
public class indexController {
	
	@Autowired
	private boardDao boardDao;
	
	@RequestMapping("/")
	public String index() {
		return "test.index";
	}
	
	@RequestMapping("/view")
	public String view(Model model) {
		
		String testView = boardDao.getView(1);
		
		model.addAttribute("testView", testView);
		return "test.view";
	}
}
