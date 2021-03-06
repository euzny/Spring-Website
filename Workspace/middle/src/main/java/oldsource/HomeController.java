package oldsource;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired @Qualifier("hanul") private SqlSession sql;
	//Android는 Controller 까지만 필요함 view는 필요 없음
	//+DAO (service x serviceImpl x)
	// 응답을 줄 때 기본적으로 인코딩이 안 들어가있음
	// 요청 (Request) , 응답 (Response)
	//Android에서 파라미터를 입력받기 위해(Get x)
	// 파일, 리스트 등등 Multipart mimtype
	//Req <= 파일 처리 불가  + API (MultiPartRequest 파일까지 처리 가능하게 함)
	// jsp/servlet <= COS
	// Spring <= commons-fileupload <= MultiPartResolver
	
	
	@ResponseBody
	@RequestMapping(value = "/")
	public void home(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException {
		//System.out.println(sql.selectOne("mem.mapper.check"));
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html");
		req.setCharacterEncoding("UTF-8");
		System.out.println(req.getParameter("param"));
		try {
			PrintWriter writer = res.getWriter();
			writer.println("한글을 써보기");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
