package com.hanul.clcd;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import member.MAPVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired @Qualifier ("hanul") SqlSession sql;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpSession session) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );

		session.removeAttribute("category");
		return "home";
	}
	
	// error 처리 요청
	@RequestMapping("/error")
	public String error(HttpServletRequest request, Model model) {
		
		Throwable error = (Throwable) request.getAttribute("javax.servlet.error.exception");
		StringBuffer msg = new StringBuffer();
		while (error != null) {
			msg.append("<p>").append(error.getMessage()).append("</p>");
			error = error.getCause(); //exception이 발생한 근본적인 원인을 리턴한다.
		}
		model.addAttribute("msg",msg.toString());
		int code = (int) request.getAttribute("javax.servlet.error.status_code");
		
		//error 코드가 404이면 404.jsp로.. 아니면 common.jsp 페이지로 리턴
		
		return "error/"+(code == 404 ? 404 : "common");
	}
	
	
	@RequestMapping("/list.da")
	public String map(String data) {
		System.out.println(data);
		return "map";
	}
	
	@ResponseBody
	@RequestMapping("/list.map")
	public String mapdetail(String phone,String x,String cate, String y, Model model) {
		System.out.println(phone);
		System.out.println(x);
		System.out.println(y);
		System.out.println(cate);
		/*
		 * MAPVO vo = sql.selectOne("member.mapper.map",phone);
		 * 
		 * model.addAttribute("vo",vo);
		 */
		return "";
	}
}
