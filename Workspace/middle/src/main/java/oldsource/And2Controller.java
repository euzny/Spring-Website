package oldsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
public class And2Controller {

	@Autowired
	@Qualifier("hanul")
	private SqlSession sql; // ★ Qualifier

	/*
	 * Gson gson = new Gson();
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/and2", produces = "application/json;charset=UTF-8")
	 * public String test(HttpServletRequest req) {
	 * System.out.println(req.getParameter("param")); return "스프링에서 보내준 값"; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/and3", produces = "application/json;charset=UTF-8")
	 * public String test2(HttpServletRequest req) {
	 * 
	 * return (req.getParameter("id").equals("admin") &&
	 * req.getParameter("pw").equals("0000"))? "OK" : "NG";
	 * 
	 * //Gson gson = new Gson(); //json으로 만들기 toJson, json을 object(class)로 변경
	 * fromJson //현재 Android에서 TestDTO라는 클래스 타입을 json으로 만들어서 보내줌 //json을 다시
	 * TestDTO라는 클래스타입으로 만드려면 해당하는 클래스타입을 사용할 수 있어야한다. (해당하는 타입의 DTO가 있어야함) String
	 * data = req.getParameter("dto"); TestDTO dto = gson.fromJson(data,
	 * TestDTO.class); System.out.println(dto.getId());
	 * System.out.println(dto.getPw());
	 * 
	 * TestDTO rtnDTO = new TestDTO("스프링ID", "스프링PW"); return gson.toJson(rtnDTO); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/testlist", produces =
	 * "application/json;charset=UTF-8") public String test3(HttpServletRequest req)
	 * {
	 * 
	 * System.out.println(req.getParameter("data")); //리스트타입으로 받을때
	 * ArrayList<TestDTO> list = gson.fromJson(req.getParameter("data"), new
	 * TypeToken<List<TestDTO>>() {}.getType()); for(TestDTO testDTO : list) {
	 * System.out.println(testDTO.getId()); testDTO.setId(testDTO.getId()+"SPR"); }
	 * return gson.toJson(list); } //로그인
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/and4", produces = "application/json;charset=UTF-8")
	 * public String test4(HttpServletRequest req) { //UserDTO 타입의 클래스가 필요 // 안드
	 * UserDTO Spring => UserDTO가 있어야함 System.out.println(req.getParameter("dto"));
	 * UserDTO userDTO = gson.fromJson(req.getParameter("dto"), UserDTO.class);
	 * //왼쪽부터 비교 시작 && 하나라도 false가 나오면 그 다음 조건을 비교 안하고 false if(userDTO != null &&
	 * userDTO.getId().equals("admin") && userDTO.getPw().equals("1234")) { return
	 * gson.toJson(userDTO); } return null; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/and6",produces = "application/json;charset=UTF-8")
	 * public String test6() {
	 * 
	 * return gson.toJson("abcd2578"); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/test0411",produces =
	 * "application/json;charset=UTF-8") public String test7(HttpServletRequest req)
	 * { System.out.println(req.getParameter("testKey")); return "abcd"; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/and5", produces = "application/json;charset=UTF-8")
	 * public String test5(HttpServletRequest req) {
	 * 
	 * // String data = sql.selectOne("mem.mapper.check"); //
	 * System.out.println(data); // int data1 = sql.selectOne("mem.mapper.test1");
	 * // System.out.println(data1); // String data2 =
	 * sql.selectOne("mem.mapper.test2","data"); // System.out.println(data2); //
	 * HashMap<String, String> param = new HashMap<String, String>(); //
	 * param.put("param1", "data1"); // param.put("param2", "data2"); // String
	 * data3 = sql.selectOne("mem.mapper.test3",param); //
	 * System.out.println(data3); // UserDTO dto =
	 * sql.selectOne("mem.mapper.test4","park"); // System.out.println(dto.getId());
	 * // HashMap<String, String> login = new HashMap<String, String>(); //
	 * login.put("id", "park"); // login.put("pw", "1234"); // dto =
	 * sql.selectOne("mem.mapper.test5",login); // System.out.println(dto.getId());
	 * // return null;
	 * 
	 * WMemberDTO wmdto = gson.fromJson(req.getParameter("dto"), WMemberDTO.class);
	 * HashMap<String, String> login = new HashMap<String, String>();
	 * login.put("id",wmdto.getId()); login.put("pw", wmdto.getPw()); wmdto =
	 * sql.selectOne("mem.mapper.list",login); //System.out.println(dto.getName());
	 * System.out.println(gson.toJson(wmdto)); return wmdto != null ?
	 * gson.toJson(wmdto): null;
	 * 
	 * }
	 */

}
