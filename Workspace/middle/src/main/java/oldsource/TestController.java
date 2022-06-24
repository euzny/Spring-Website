package oldsource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	//Request <= : 
		//ex) 네이버 ? 네이버 프로그램 설치해서 index.jsp , index.html
		//ex) 어떠한 url을 주고나서 enter key <= 요청
		//Controller <= jsp/servlet <= servlet ( 편리하게 mapping을 이용해서 쓰게끔
		//설정을 해두고 나서 사용 )
		//어노테이션 이라는 기계가 알아보는 주석을 달아줘야지만 Spring Bean이 인식.
	
	@RequestMapping("/test") // was ,node..등등이 실행되고있는 pc의 ip + server path + /
	public String test() {
		return "home";
	}
	
	@RequestMapping("/test2") 
	public String test2() {
		return "home";
	}
	
	@ResponseBody
	@RequestMapping("/test3") 
	public String test3() {
		return "home";
	}
	//Android 에서 필요한 것 jsp -x, data 가 필요함, (Oracle 또는 다른 DataBase 가져온 데이터)
	// <==> ajax (Script boolean => jaxson databind, core )
	//외부 <=> Spring (데이터 String, xml, json) 
	@ResponseBody
	@RequestMapping("/test4") 
	public String test4(HttpServletRequest req ) {
		System.out.println(req.getParameter("param1"));
		System.out.println(req.getParameter("param2"));
		return "home";
	}
}
