/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-23 02:54:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.my_005finfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notAccept_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write(" 	#header {\r\n");
      out.write("	   width:100%;\r\n");
      out.write("	   height:60px;\r\n");
      out.write("	   padding: 20px;\r\n");
      out.write("	   background-color:#929292;\r\n");
      out.write("	   border-bottom: 1px solid white; \r\n");
      out.write("	}	\r\n");
      out.write("	#header h3{\r\n");
      out.write("	   font-size: 25px;\r\n");
      out.write("	   font-weight: bold;\r\n");
      out.write("	   text-align: left;\r\n");
      out.write("	   color: white;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#notice{\r\n");
      out.write("		position: absolute; left: 50%; top: 40%;\r\n");
      out.write("		transform:translate(-50%, -50%);\r\n");
      out.write("	}\r\n");
      out.write("	#notice h3{\r\n");
      out.write("	   font-size: 20px;\r\n");
      out.write("	   font-weight:600;\r\n");
      out.write("	   margin-bottom:10px;\r\n");
      out.write("	   text-align:left;\r\n");
      out.write("	}\r\n");
      out.write("	#notice pre{\r\n");
      out.write("		margin-bottom:8px;\r\n");
      out.write("		 text-align:left;\r\n");
      out.write("	}\r\n");
      out.write("	#nocircle {\r\n");
      out.write("		font-size:40px;\r\n");
      out.write("		margin-bottom:20px;\r\n");
      out.write("		color:#696AAD;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("   	</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  	<h3>약통위치경로</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"notice\">\r\n");
      out.write("	<i class=\"fa-solid fa-circle-exclamation\" id=\"nocircle\"></i>\r\n");
      out.write("	<h3>죄송합니다. 약통위치경로 페이지를 확인하실 수 없습니다.</h3>\r\n");
      out.write("		<pre>현재 회원님의 정보에 아나포 스마트 약통 기기번호가 등록되어있지 않습니다.</pre>\r\n");
      out.write("		<pre><strong>Anafor</strong> 모바일 앱에서 기기번호를 등록하신 후 이용해주시기 바랍니다.</pre>\r\n");
      out.write("		<br>\r\n");
      out.write("		<pre>관련 문의사항은 <strong>AnaFor 고객센터</strong>에 알려주시면 친절하게 안내해 드리겠습니다.</pre>\r\n");
      out.write("</div>		\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
