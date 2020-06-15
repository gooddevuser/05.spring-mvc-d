package com.example.springmvc.view;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

//View 인터페이스를 구현한 클래스는 스프링이 View 객체로 사용할 수 있습니다.
public class MyViewOne implements View {

	@Override
	public void render(Map<String, ?> model, 
					   HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + new Date().toString() + "</h1>");
		
	}

	@Override
	public String getContentType() {
		return null;
	}

}











