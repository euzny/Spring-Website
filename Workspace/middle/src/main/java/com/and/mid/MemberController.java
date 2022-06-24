package com.and.mid;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.google.gson.Gson;

import member.MemberDAO;
import member.MemberVO;

@Controller
public class MemberController {
	
	@Autowired MemberDAO dao;
	@Autowired Common common;
	
	
	Gson gson = new Gson();
	
	
	@ResponseBody
	@RequestMapping(value ="/login", produces = "application/json;charset=UTF-8")
	public String login(HttpServletRequest req ) {
		// F6 STEP OVER , F8 RESUME PROGRAM
							 // 내가 모르는 class로 디버깅포인트가이동이되어있다면
							 // F8로 넘기기.
		MemberVO vo = new MemberVO();
		vo.setId(req.getParameter("id"));
		vo.setPw(req.getParameter("pw"));
	 	vo =  dao.login(vo);
		return gson.toJson(vo); // 보내줄때 Object => String(json) toJson메소드
	}
	

	@ResponseBody
	@RequestMapping(value ="/file.f", produces = "application/json;charset=UTF-8")
	public String fileTest(HttpServletRequest req, HttpSession ss) {
			MemberVO vo = new MemberVO();
			 String server_path=null;
		  MultipartRequest mreq = (MultipartRequest)req; 
		  MultipartFile file = mreq.getFile("file"); 
		  if(file!=null) { System.out.print("파일이 들어왔습니다");
			  System.out.println(file.getOriginalFilename()); 
			  server_path =
			  "http://"+req.getLocalAddr() + ":" + req.getLocalPort() +
			  req.getContextPath() +"/resources/" + common.fileUpload("and",file,ss);
			 System.out.println(server_path);
		}
		vo.setImagepath(server_path);
		vo.setId(req.getParameter("id")); 
		vo.setPw(req.getParameter("pw"));
		vo.setName(req.getParameter("name"));
		dao.join(vo);
		System.out.println(vo.getId());
		return "";
	}
}
