package com.and.mid;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import customer.CustomerDAO;
import customer.CustomerVO;

@Controller
public class CustomerController {
	@Autowired CustomerDAO dao;
	@Autowired @Qualifier("hanul") SqlSession sql;
	Gson gson = new Gson();
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/list.cu", produces =
	 * "application/json;charset=UTF-8") public String list1() {
	 * 
	 * List<CustomerVO> list = dao.search(); return gson.toJson(list); }
	 */
	
	@ResponseBody
	@RequestMapping(value="/list.cu", produces = "application/json;charset=UTF-8")
	public String list(HttpServletRequest req) {
		String data = req.getParameter("query");
		List<CustomerVO> list = dao.search(data);
		 return gson.toJson(list);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/update.cu", produces = "application/json;charset=UTF-8")
	public String update(HttpServletRequest req) {
		
		 System.out.println(req.getParameter("dto"));
		 CustomerVO vo = gson.fromJson(req.getParameter("dto"), CustomerVO.class);
		 sql.update("customer.mapper.update",vo);
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value="/delete.cu", produces = "application/json;charset=UTF-8")
	public String delete(HttpServletRequest req) {
		
		 System.out.println(req.getParameter("dto"));
		 CustomerVO vo = gson.fromJson(req.getParameter("dto"), CustomerVO.class);
		 sql.delete("customer.mapper.delete",vo);
		return "";
	}

	
	
	
	
}
