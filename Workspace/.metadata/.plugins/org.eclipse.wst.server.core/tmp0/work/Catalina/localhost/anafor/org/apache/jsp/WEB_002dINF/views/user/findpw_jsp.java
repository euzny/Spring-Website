/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-22 01:43:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findpw_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Study_Spring/Workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/anafor/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1648006669317L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	#AnaforTempPW{\r\n");
      out.write("		margin:0px auto;\r\n");
      out.write("		width:60%;\r\n");
      out.write("		height:718px;\r\n");
      out.write("		pointer-events:auto;\r\n");
      out.write("		text-align:left;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	h2{\r\n");
      out.write("		font-size:30px;\r\n");
      out.write("		width:400px;\r\n");
      out.write("		margin:40px 0px 20px 0px;\r\n");
      out.write("		height:40px;\r\n");
      out.write("	}\r\n");
      out.write("	input[type=text], input[type=password]{\r\n");
      out.write("		width:500px;\r\n");
      out.write("		height:50px;\r\n");
      out.write("		margin:10px 0px 0px 0px;\r\n");
      out.write("		border-radius:10px;\r\n");
      out.write("		padding: 0px 20px;\r\n");
      out.write("		border:1px solid #ccc;\r\n");
      out.write("		line-height:50px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=button]{\r\n");
      out.write("		width:120px;\r\n");
      out.write("		height:50px;\r\n");
      out.write("		color:#696AAD;\r\n");
      out.write("		background: white;\r\n");
      out.write("		font-weight:600;\r\n");
      out.write("		border-radius:10px;\r\n");
      out.write("		border:1px solid #ccc;\r\n");
      out.write("		margin:10px 0px 0px 0px;\r\n");
      out.write("\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=button]:hover{\r\n");
      out.write("		cursor:pointer;\r\n");
      out.write("		border:1px solid #696AAD;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=text]:focus{\r\n");
      out.write("		border:2px solid #696AAD;\r\n");
      out.write("	}\r\n");
      out.write("	span{\r\n");
      out.write("		display:block;\r\n");
      out.write("		margin:5px 0px;\r\n");
      out.write("		font-size:13px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"AnaforTempPW\">\r\n");
      out.write("		<h2>임시비밀번호 발급</h2>\r\n");
      out.write("		<input type=\"text\" id=\"id\"  placeholder=\"가입한 이메일을 입력해주세요\"/>\r\n");
      out.write("		<input type=\"button\" value=\"임시비밀번호 발급\" onclick=\"sendPw()\"><br/>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("<script>\r\n");
      out.write("	function sendPw(){\r\n");
      out.write("		if($('#id').val()==''){\r\n");
      out.write("			alert(\"이메일을 먼저 입력해주세요\");\r\n");
      out.write("			$('#id').focus();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		$.ajax({					//ajax 통신\r\n");
      out.write("			url: 'sendTempPW',\r\n");
      out.write("			data : {id:$('#id').val()},\r\n");
      out.write("			success : function(response){\r\n");
      out.write("					if(response){\r\n");
      out.write("						alert(\"임시 비밀번호가 발급되었습니다.\\n해당 메일함을 확인해주세요.\\n로그인 페이지로 이동합니다.\");\r\n");
      out.write("						location = \"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("					}else{\r\n");
      out.write("						alert(\"해당 이메일은 가입되지 않은 이메일입니다. 이메일을 다시 입력해주세요\");\r\n");
      out.write("						$('#id').focus();\r\n");
      out.write("					}\r\n");
      out.write("			}, error : function(req,text){\r\n");
      out.write("				alert(text+' : '+req.status);\r\n");
      out.write("			}\r\n");
      out.write("		});//ajax\r\n");
      out.write("	}\r\n");
      out.write("</script>	\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/user/findpw.jsp(81,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("userLogin");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
