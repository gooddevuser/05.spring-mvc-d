package com.example.springmvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import com.example.springmvc.view.ExcelView;
import com.example.springmvc.view.MyViewOne;
import com.example.springmvc.view.MyViewTwo;

@Controller
@RequestMapping(path = { "/" })
public class DemoController {
	
	@GetMapping(path = "/custom-view-a.action")
	public View customViewA() {
		
		View v = new MyViewOne();
		return v;
		
	}
	
	@GetMapping(path = "/custom-view-b.action")
	public View customViewB() {
		
		View v = new MyViewTwo();
		return v;
		
	}
	
	@GetMapping(path = "/custom-view-c.action", 
				produces = "text/html;charset=utf-8")
	@ResponseBody //이 메서드가 반환하는 내용은 뷰 이름이 아니고 응답 컨텐츠입니다.
	public String customViewC() {
		
		return "<h1>" + new Date() + "</h1>";
		
	}
	
	@GetMapping(path = "/custom-view-d.action")
	public View customViewD() {
		
		return new ExcelView();
		
	}

}




