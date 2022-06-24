package com.and.mid;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import employee.EmployeeVO;

@Controller
public class EmployeeController {
	
	@Autowired @Qualifier("hr") SqlSession sql;
		Gson gson = new Gson();
		
	@ResponseBody
	@RequestMapping(value="/list.em", produces = "application/json;charset=UTF-8")
	public String list() {
		
		List<EmployeeVO> list = sql.selectList("employee.mapper.list");
//		System.out.println(gson.toJson(list));
		return gson.toJson(list);
	}
}
