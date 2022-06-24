package com.hanul.clcd;

import java.io.File;
import java.util.HashMap;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import common.CommonService;
import member.MemberServiceImpl;
import member.MemberVO;
import notice.NoticePage;
import notice.NoticeServiceImpl;
import notice.NoticeVO;



@Controller
public class NoticeController {
	
	@Autowired private CommonService common;
	@Autowired private NoticeServiceImpl service;
	//회원정보를 처리하기 위한 service 필요
	@Autowired private MemberServiceImpl mservice;
	

	
	
	
	//답글 저장 처리 요청
	@RequestMapping("/reply_insert.no")
	public String reply_insert(NoticeVO vo, MultipartFile file, HttpSession session) {
		
		//첨부 파일이 있을 경우
		if(! file.isEmpty()) {
			vo.setFilename(file.getOriginalFilename());
			vo.setFilepath(common.fileUpload("notice", file, session));
		}
		
		//로그인 된 사용자의 id를 가져와 글쓴이(writer)에 담기 위한 처리
		vo.setWriter(((MemberVO)session.getAttribute("loginInfo")).getId());
		service.notice_reply_insert(vo);
		
		return "redirect:list.no";
		
	}
	
	
	
	
	//공지글 답글 작성 화면 요청
	
	@RequestMapping("/reply.no")
	public String reply(int id,Model model) {
		
		//원글의 상세정보 db에서 조회해와 답글 화면에 출력
		model.addAttribute("vo",service.notice_detail(id));
		return "notice/reply";
	}
	
	
	
	//공지글 수정 저장 처리 요청
	@RequestMapping("/update.no")
	public String update(NoticeVO vo, MultipartFile file, String attach, HttpSession session) {
		
		//원래 공지글의 첨부파일 정보를 조회해 온다 (id를 통해)
		NoticeVO notice = service.notice_detail(vo.getId());
		String uuid = session.getServletContext().getRealPath("resources") + "/"+notice.getFilepath();
		
		// 원래 파일이 첨부된 경우 이전 파일을 삭제하고 변경한 파일을 저장
		//파일을 첨부한 경우
		if(!file.isEmpty()) {
			//원래 첨부된 파일이 없었는데 수정시 첨부한 경우
			vo.setFilename(file.getOriginalFilename());
			vo.setFilepath(common.fileUpload("notice",file,session));
		
			//원래 첨부된 파일이 있었다면 물리적인 디스크에서 해당 파일 삭제
			//원래 첨부 파일이 있었고 수정시 바꿔서 첨부한 경우 - 원래 파일을 물리적 영역에서 삭제
			if(notice.getFilename() != null ) { 		//파일명 또는 파일경로가 있는지 판단 
				File f = new File(uuid);	
				if(f.exists()) f.delete();				//uuid 내에 file이 존재한다면 삭제 처리
			}
		}else {
			//파일을 첨부하지 않은 경우
			//1. 원래부터 첨부하지 않았고 수정시에도 첨부하지 않은 경우
			// 원래 첨부된 파일이 있었는데 삭제한 경우 - 원래 파일을 물리적 영역에서 삭제
			if(attach.isEmpty()) {
				if(notice.getFilename() != null ) { 		//파일명 또는 파일경로가 있는지 판단 
					File f = new File(uuid);	
					if(f.exists()) f.delete();				//uuid 내에 file이 존재한다면 삭제 처리
				}
			}else {
				//2. 원래 첨부된 파일을 그대로 사용하는 경우
				vo.setFilename(notice.getName());
				vo.setFilepath(notice.getFilepath());
			}
		}
		
		//화면에서 변경 입력한 정보를 DB에 변경 저장한 후 상세 화면으로 연결		
		service.notice_update(vo);
		return "redirect:detail.no?id="+vo.getId();
	}
	
	//공지글 수정 화면 요청
	@RequestMapping("/modify.no")
	public String modify(int id, Model model) {
		// 해당 공지글 정보를 DB에서 조회해와 수정화면에 출력
		model.addAttribute("vo",service.notice_detail(id));
		return "notice/modify";
	}
	
	
	@RequestMapping("/delete.no")
	public String delete(int id,HttpSession session) {
		
		//첨부파일이 있는 글의 경우 디스크에서(물리적 위치) 첨부파일을 삭제
		//공지글에 대한 모든 정보 조회
		NoticeVO notice = service.notice_detail(id);
		String uuid = session.getServletContext().getRealPath("resources") + "/"+notice.getFilepath();
		
		if(notice.getFilename() != null ) { //파일명 또는 파일경로가 있는지 판단 
			File file = new File(uuid);
			if(file.exists()) file.delete();				//uuid 내에 file이 존재한다면 삭제 처리
		}
		
		
		//해당 공지글 정보를 DB에서 삭제한 후 목록화면으로 연결
		service.notice_delete(id);
		
		return "redirect:list.no";
	}
	
	
	
	//공지글의 첨부 파일 다운로드 요청
	@RequestMapping("/download.no")
	public void download(int id,HttpSession session, HttpServletResponse response) {
		//해당 공지글의 첨부파일 정보를 DB에서 조회해와 해당 파일을 서버로부터 다운로드한다.
		NoticeVO notice = service.notice_detail(id);
		common.fileDownload(notice.getFilename(),notice.getFilepath(),session,response);
	}
	
	
	//공지사항 상세화면 요청
	@RequestMapping("/detail.no")
	public String detail(int id,Model model) {
		//상세화면 요청 전... 조회수 증가
		service.notice_read(id);
		
		//선택한 공지사항 정보를 DB에서 조회해와 상세화면에 출력
		model.addAttribute("vo",service.notice_detail(id));
		model.addAttribute("crlf","\r\n");
		// \r이라는 탈출문자(Escape Character)는 Carriage Return(CR)이라는 의미를 가지며
		// \n은 Line Feed(LF)란 의미를 가지며 일반적으로 New Line 이라고도 읽는다.
		
		
		//페이징 처리한 결과값을 model에 담아 보냄
		model.addAttribute("page",page);
		return "notice/detail";
	}
	
	
	//신규 공지사항 입력화면 요청
	@RequestMapping("/new.no")
	public String notice() {
		return "notice/new";
	}
	
	//신규 공지사항 게시글 저장처리 요청
	@RequestMapping("/insert.no")
	public String insert(NoticeVO vo,MultipartFile file, HttpSession session) {
			//로그인된 사용자의 id를 가져와 글쓴이(writer)에 담기 위한 처리
		MemberVO member = (MemberVO) session.getAttribute("loginInfo");
		vo.setWriter(member.getId());
		//vo.setWriter(((MemberVO) session.getAttribute("loginInfo")).getId());
		
		//파일이 있는 경우
		if(! file.isEmpty()) {
			//파일 첨부 처리(filename, filepath)
			vo.setFilename(file.getOriginalFilename());		//전달받은 파일의 실제 이름
			vo.setFilepath(common.fileUpload("notice",file,session));
		}
		
		
		//화면에서 입력한 정보를 DB에 저장한 후 화면으로 연결
		service.notice_insert(vo);
		return "redirect:list.no";	
	}

	// 공지사항의 페이지 처리를 위해 개체로 선언한 NoticePage 클래스를 자동 주입하여 사용하게 함
	@Autowired private NoticePage page;
	
	@RequestMapping("/list.no")
	public String list(HttpSession session,@RequestParam(defaultValue = "1") int curPage, Model model, String search, String keyword ) {
		
		//공지글 처리 중 임의로 로그인해두기 (admin) - 나중에 삭제할것
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("id", "hanul");
//		map.put("pw", "hanul");
//	
//		session.setAttribute("loginInfo", mservice.member_login(map));
		session.setAttribute("category", "no");
		//DB에서 공지글 목록을 조회해와 목록화면에 출력
		//model.addAttribute("list",service.notice_list());
		
		//curPage를 입력받지 않았지만 @RequestParam 어노테이션을 통해 기본값 1을 부여
		
		page.setCurPage(curPage);// 현재 페이지에 대한 정보를 담기 위한 처리
		
		//검색조건, 검색어 정보를 담음
		page.setSearch(search);
		page.setKeyword(keyword);
		
		//DB에서 공지글 목록을 조회한 후 목록화면에 출력
		model.addAttribute("page",service.notice_list(page));
		
		return "notice/list";
	}
}
