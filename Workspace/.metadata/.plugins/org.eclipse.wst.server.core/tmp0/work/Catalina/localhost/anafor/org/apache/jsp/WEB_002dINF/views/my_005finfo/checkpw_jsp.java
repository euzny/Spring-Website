/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-22 01:41:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.my_005finfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkpw_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("	#header {\r\n");
      out.write("	   width:100%;\r\n");
      out.write("	   height:60px;\r\n");
      out.write("	   padding: 20px;\r\n");
      out.write("	   background-color:#929292;\r\n");
      out.write("	   border-bottom: 1px solid white; \r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#header h3{\r\n");
      out.write("	   font-size: 25px;\r\n");
      out.write("	   font-weight: bold;\r\n");
      out.write("	   text-align: left;\r\n");
      out.write("	   color: white;\r\n");
      out.write("	}\r\n");
      out.write("	#spanid,#id{ color:#696AAD; font-weight:800;}\r\n");
      out.write("	#spanid { margin-left:60px; }\r\n");
      out.write("	#msg_user{width:80%; height:40px; margin-top:40px; text-align:left; margin-left:100px; }\r\n");
      out.write("	table{\r\n");
      out.write("		width:80%;\r\n");
      out.write("	}\r\n");
      out.write("	td{\r\n");
      out.write("		text-align:left;\r\n");
      out.write("		padding-left:10px;\r\n");
      out.write("	}\r\n");
      out.write("	input[type=\"password\"]{\r\n");
      out.write("		border:1px solid #ccc;\r\n");
      out.write("		width:250px;\r\n");
      out.write("		height:25px;\r\n");
      out.write("	}\r\n");
      out.write("	input[type=\"button\"]{\r\n");
      out.write("		width:150px;\r\n");
      out.write("		height:40px;\r\n");
      out.write("		margin-right:10px;\r\n");
      out.write("		margin-top:30px;\r\n");
      out.write("		border-radius:5px;\r\n");
      out.write("		font-size:15px;\r\n");
      out.write("		color:#FFFFFF;\r\n");
      out.write("		cursor:pointer;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=\"button\"]:nth-child(1){\r\n");
      out.write("		background:#696AAD;\r\n");
      out.write("	}\r\n");
      out.write("	input[type=\"button\"]:nth-child(2){\r\n");
      out.write("		color:#000000;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"header\">\r\n");
      out.write("  		<h3>회원정보 확인</h3>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id = \"msg_user\">\r\n");
      out.write("		<span id=\"spanid\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.user_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("		<span>&nbsp;님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 한번 확인 합니다.(* 소셜로그인의 경우 비밀번호란에 아이디를 그대로 입력하시면 됩니다.)</span>\r\n");
      out.write("		<input type=\"hidden\" name=\"userid\" id=\"userid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.user_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("	</div>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>아이디</th>\r\n");
      out.write("				<td id=\"id\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginInfo.user_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>		\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>비밀번호</th>\r\n");
      out.write("				<td><input type=\"password\" name=\"userpw\" id=\"userpw\" onkeypress=\"if (event.keyCode == 13) checkpw()\" /></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"2\" style=\"text-align:center; border:0px\"><input type=\"button\" value=\"확인\" onclick=\"checkpw()\"/><input type=\"button\"  value=\"취소\"/></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function checkpw(){\r\n");
      out.write("	$.ajax({					//ajax 통신\r\n");
      out.write("	\r\n");
      out.write("		url: 'userLoginChk' ,\r\n");
      out.write("		data : {user_id:$(\"#userid\").val(), user_pw:$(\"#userpw\").val()},\r\n");
      out.write("		success : function(response){\r\n");
      out.write("			if(response){\r\n");
      out.write("				alert(\"회원정보페이지로 이동합니다.\");\r\n");
      out.write("				location = \"userinfo.ur\";\r\n");
      out.write("			}else{\r\n");
      out.write("				alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("				$(\"#userpw\").focus();\r\n");
      out.write("			}\r\n");
      out.write("		}, error : function(req,text){\r\n");
      out.write("			alert(text+' : '+req.status);\r\n");
      out.write("		}\r\n");
      out.write("	});//ajax\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</script>		\r\n");
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