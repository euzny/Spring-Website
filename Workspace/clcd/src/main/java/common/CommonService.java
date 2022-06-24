package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CommonService {
	
	//파일 다운로드 처리
	public void fileDownload(String filename, String filepath, HttpSession session, HttpServletResponse response) {
		
		//실제 파일의 위치와 파일을 찾음
		File file = new File(session.getServletContext().getRealPath("resources")+"/"+filepath);
		//filepath에  resources/ <== 슬래쉬부터의 경로가 저장되어있음
		//파일의 형태를 확인 (확장자를 통해 txt ,jpg ... )
		//mimeType을 알아야 각각의 파일 형태에 따라 다운로드 받는 방식을 결정할 수 있음
		String mime = session.getServletContext().getMimeType(filename);
		response.setContentType(mime);
		// ex) response.setContentType("text/html; charset=utf-8");
		try {
			filename = URLEncoder.encode(filename,"utf-8").replaceAll("\\+","%20" );
			
			//클라이언트에 파일을 첨부하여 쓰기 작업을 하는데 파일을 첨부하는 건 header에 첨부 파일 정보를 넘겨줘야함
			response.setHeader("content-disposition", "attachment; filename="+filename);

			ServletOutputStream out = response.getOutputStream();
			FileCopyUtils.copy(new FileInputStream(file), out);
			out.flush();		//스트림을 통해 수행한 IO 작업 버퍼를 비우는 것
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	// 파일 업로드 처리
	public String fileUpload(String category, MultipartFile file, HttpSession session) {
		//D:\Study_Spring\Workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\clcd\resources
		String resources = session.getServletContext().getRealPath("resources");
		//resources/upload/notice/2022/04/13
		String folder =  resources + "/upload/" + category + "/" + new SimpleDateFormat("yyyy/MM/dd").format(new Date());
		String uuid = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
		//File 클래스 : 입출력에 필요한 파일 및 디렉토리에 관한 정보를 다룰 수 있음.
		//File 클래스는 파일과 디렉토리의 접근 권한, 생성된 시간, 마지막 수정 일자, 크기, 경로 등의 정보를 얻을 수 있는 메소드를 가지고 있으며,
		//새로운 파일과 디렉토리 생성 및 삭제, 이름 변경 등의 조작 메소드를 가지고 있음.
		File dir = new File(folder);
		if(! dir.exists()) dir.mkdirs();
		// exists(): 지정한 경로에 디렉토리/파일 구분없이 존재하는지 확인
		try {
			file.transferTo(new File(folder,uuid));
			//transferTO() : 기존 FileInputStream 등을 사용하지 않아도 쉽게 파일을 저장할 수 있는 메소드임
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// upload/notice/2022/04/13/dfadf.txt
		
		
		return folder.substring(resources.length()+1) + "/"+ uuid;
		
	}
	
	// 접근 토근을 이용하여 프로필 API 호출하기 위해 (access_token과 token_type 값을 파라미터로 전달)
		public String requestAPI(StringBuffer url, String property) {
			String result = "";
			try {
				// URL url = new URL(apiURL);

				// 연결할 객체가 HTTP통신을 할 예정이므로 HTTP간의 연결 개체 1개를 만듬.
				HttpURLConnection con = (HttpURLConnection) new URL(url.toString()).openConnection();
				con.setRequestMethod("GET");
				con.setRequestProperty("Authorization", property);			
				int responseCode = con.getResponseCode();
				// 여러 가지 정보를 읽어 들이는데 버퍼를 통해 읽어 들이기 위해 BufferReader 를 사용
				BufferedReader br;
				System.out.print("responseCode=" + responseCode);
				if (responseCode == 200) { // 정상 호출
					br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
				} else { // 에러 발생
					br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
				}
				String inputLine;
				StringBuffer res = new StringBuffer();			// 실제 값이 담겨진 변수 res 값을 리턴하여 보내줌.
				while ((inputLine = br.readLine()) != null) {
					res.append(inputLine);
				}
				br.close();
				con.disconnect();
				result = res.toString();
			} catch (Exception e) {
				System.out.println(e);
			}
			
			return result;
		}
	
	
	
		// API 요청할 url 을 매개변수로 받음.
		public String requestAPI(StringBuffer url) {
			String result = "";
			try {
				// URL url = new URL(apiURL);

				// 연결할 객체가 HTTP통신을 할 예정이므로 HTTP간의 연결 개체 1개를 만듬.
				HttpURLConnection con = (HttpURLConnection) new URL(url.toString()).openConnection();
				con.setRequestMethod("GET");
				int responseCode = con.getResponseCode();
				// 여러 가지 정보를 읽어 들이는데 버퍼를 통해 읽어 들이기 위해 BufferReader 를 사용
				BufferedReader br;
				System.out.print("responseCode=" + responseCode);
				if (responseCode == 200) { // 정상 호출
					br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
				} else { // 에러 발생
					br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
				}
				String inputLine;
				StringBuffer res = new StringBuffer();			// 실제 값이 담겨진 변수 res 값을 리턴하여 보내줌.
				while ((inputLine = br.readLine()) != null) {
					res.append(inputLine);
				}
				br.close();
				con.disconnect();
				result = res.toString();
			} catch (Exception e) {
				System.out.println(e);
			}
			
			return result;
		}

		
}
