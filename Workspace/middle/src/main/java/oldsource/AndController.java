package oldsource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AndController {
	// res <= encoding produces
	
	//RequsetMapping 을 치게되고 return String하면
	//org....InternalResourceViewResolver
	//default로 해당하는jsp파일을 view/에서 찾음
	// RequestMapping을 받는 메소드의 규칙
	//req.getParameter("name") <= name을 바로 파라메터부의 변수 이름으로 지정을하면
	// 알아서 request가 변수에 담아준다.
	@ResponseBody // 해당하는 jsp 파일을 찾지 않고 메소드 바디에서 응답하겠다. 
	@RequestMapping( value= "/and", produces = "application/json;charset=UTF-8")
	
	public String test(HttpServletRequest req, String param1, String param2) {
		//System.out.println("안드에서 보내준 값p1 : " +req.getParameter("param1"));
		//System.out.println("안드에서 보내준 값p2 : " +req.getParameter("param2"));
		return "한글 데이터";
	}
	
	@ResponseBody
	@RequestMapping(value="/toFromAnd",produces = "application/json;charset=UTF-8")
	public String test2(HttpServletRequest req, String num1, String num2) {
		for(int i = Integer.parseInt(num1); i <= Integer.parseInt(num2); i++) {
			System.out.println("param"+i+": "+req.getParameter("param"+i));
		}
		return "";
	}

}
