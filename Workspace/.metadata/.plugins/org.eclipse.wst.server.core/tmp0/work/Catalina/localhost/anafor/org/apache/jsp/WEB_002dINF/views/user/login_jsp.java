/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-23 02:47:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>로그인</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("	body{\n");
      out.write("		text-align:left;	\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	.Anaforcenter{\n");
      out.write("		position: absolute; left: 50%; top: 50%;\n");
      out.write("		transform:translate(-50%, -50%);\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#AnaforLogo{\n");
      out.write("		margin-bottom:10px;\n");
      out.write("		text-align:center;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	#login{\n");
      out.write("		text-align:center;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	 #socialLogin{\n");
      out.write("		text-align:center;\n");
      out.write("	} \n");
      out.write("	\n");
      out.write("	img{\n");
      out.write("		width:200px;\n");
      out.write("		height:45px;\n");
      out.write("	}\n");
      out.write("	input[type=text], input[type=password]{\n");
      out.write("		width:400px;\n");
      out.write("		height:50px;\n");
      out.write("		margin:10px 0px 0px 0px;\n");
      out.write("		border-radius:10px;\n");
      out.write("		padding: 0px 45px;\n");
      out.write("		border:1px solid #ccc;\n");
      out.write("		line-height:50px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#alogo:hover{\n");
      out.write("		cursor:pointer;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	input[type=text]:focus, input[type=password]:focus{\n");
      out.write("		border:2px solid #696AAD;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#btn-login{\n");
      out.write("		width:400px;\n");
      out.write("		height:50px;\n");
      out.write("		background-color: #696AAD;\n");
      out.write("		border-radius:10px;\n");
      out.write("		text-align:center;\n");
      out.write("		font-size:20px;\n");
      out.write("		color:#FFFFFF;\n");
      out.write("		font-weight:400;\n");
      out.write("		padding:3px 7px;\n");
      out.write("		border:0px;\n");
      out.write("		margin:10px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#btn-login:hover{\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("\n");
      out.write(" 	#centerdiv{\n");
      out.write("		width:100%;\n");
      out.write("		margin:0px auto;\n");
      out.write("		height:30px;\n");
      out.write("	} \n");
      out.write("	\n");
      out.write("	.sepline{\n");
      out.write("		display:flex;\n");
      out.write("		flex-basis:100%;\n");
      out.write("		align-items:center;\n");
      out.write("		color:rgba(0,0,0,0.35);\n");
      out.write("		font-size:16px;\n");
      out.write("		margin:8px 0px;\n");
      out.write("	}\n");
      out.write("	.sepline::before, .sepline::after{\n");
      out.write("		content:\"\";\n");
      out.write("		flex-grow:1;\n");
      out.write("		background : rgba(0,0,0,0.35);\n");
      out.write("		height:1px;\n");
      out.write("		font-size:0px;\n");
      out.write("		line-height:0px;\n");
      out.write("		margin:0px 16px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#alogo{\n");
      out.write("		width:242px;\n");
      out.write("		height:78px;\n");
      out.write("		text-align:center;\n");
      out.write("		color:#696AAD;\n");
      out.write("		letter-spacing:-0.015em;\n");
      out.write("		font-weight:800;\n");
      out.write("		font-size:64px;\n");
      out.write("		font-style:normal;\n");
      out.write("		font-family: 'Montserrat';\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#alogotitle{\n");
      out.write("		width:197px;\n");
      out.write("		height:26px;\n");
      out.write("		text-align:center;\n");
      out.write("		color:#696AAD;\n");
      out.write("		letter-spacing:-0.015em;\n");
      out.write("		font-weight:600;\n");
      out.write("		font-size:16px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#usericon{\n");
      out.write("		position: absolute;\n");
      out.write("		top:94px;\n");
      out.write("		left:28px;\n");
      out.write("		font-size:20px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#pwicon{\n");
      out.write("		position: absolute;\n");
      out.write("		left:28px;\n");
      out.write("		top: 150px;\n");
      out.write("		font-size:20px;\n");
      out.write("	} \n");
      out.write("	\n");
      out.write("	#check{\n");
      out.write("		width:420px;\n");
      out.write("		height:60px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#checkmsg{\n");
      out.write("		display:block;\n");
      out.write("		line-height:60px;\n");
      out.write("		margin:10px 10px 0px 10px;\n");
      out.write("		color:#FF0000;\n");
      out.write("		visibility: hidden;\n");
      out.write("		font-size:12px;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	#find{\n");
      out.write("		width:93%;\n");
      out.write("		height:auto;	\n");
      out.write("		}\n");
      out.write("	#find ul{\n");
      out.write("		height:40px;\n");
      out.write("		margin-top:15px;\n");
      out.write("		text-align:center;\n");
      out.write("	}\n");
      out.write("	#find ul li{\n");
      out.write("		display:inline-block;\n");
      out.write("		color:#808080;\n");
      out.write("		font-size:12px;\n");
      out.write("	}\n");
      out.write("	#find ul li a span{\n");
      out.write("		font-size:12px;\n");
      out.write("		color:#808080;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	<div class=\"Anaforcenter\">\n");
      out.write("		<div id=\"AnaforLogo\">\n");
      out.write("			<span id=\"alogo\">AnaFor</span><br/>\n");
      out.write("			<span id=\"alogotitle\">아나플 나를 위해 아나포</span>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"login\">\n");
      out.write("			<input type=\"text\" id=\"userid\" placeholder=\"이메일을 입력하세요\" autofocus/>\n");
      out.write("			<i class=\"fa-solid fa-user\" id=\"usericon\"></i><br/>\n");
      out.write("			<input type=\"password\" id=\"userpw\" placeholder=\"비밀번호를 입력하세요\" onkeypress=\"if (event.keyCode == 13) loginChk()\" />\n");
      out.write("			<i class=\"fa-solid fa-lock\" id=\"pwicon\"></i><br/>\n");
      out.write("		</div>\n");
      out.write("			<div id=\"check\">\n");
      out.write("			<span id=\"checkmsg\"> 아이디 혹은 비밀번호가 일치하지 않습니다.</span>\n");
      out.write("			</div>\n");
      out.write("		<div id=\"login\">	\n");
      out.write("			<input type=\"button\" id=\"btn-login\" onclick=\"loginChk()\" value=\"로그인\"/>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"centerdiv\">\n");
      out.write("			<div class=\"sepline\">또는</div>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("		<div id=\"socialLogin\">\n");
      out.write("			<a href=\"naverLogin\"><img src=\"imgs/naver_login.png\" class=\"social\"/></a>\n");
      out.write("			<a href=\"kakaoLogin\"><img src=\"imgs/kakao_login.png\" class=\"social\"/></a>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"find\">\n");
      out.write("			<ul>\n");
      out.write("				<li><a id=\"findpw\" href=\"findpw\"><span>비밀번호 찾기</span></a></li>\n");
      out.write("				<li>|</li>\n");
      out.write("				<li><a id=\"join\" href=\"userJoin\"><span>회원가입</span></a></li>\n");
      out.write("			</ul>\n");
      out.write("   </div>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	//로그인 유효성 함수\n");
      out.write("	function loginChk(){\n");
      out.write("		\n");
      out.write("		if($(\"#userid\").val()==''){	//아이디를 입력하지 않았을 때\n");
      out.write("			$(\"#userid\").focus();\n");
      out.write("			$(\"#checkmsg\").text(\"아이디를 입력해주세요\").css('visibility','visible');\n");
      out.write("		\n");
      out.write("			return false;\n");
      out.write("		\n");
      out.write("		}else if($(\"#userpw\").val()==''){//비밀번호를 입력하지 않았을 때\n");
      out.write("			$(\"#userpw\").focus();\n");
      out.write("			$(\"#checkmsg\").text(\"비밀번호를 입력해주세요\").css('visibility','visible');\n");
      out.write("		\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		$.ajax({					//ajax 통신\n");
      out.write("			\n");
      out.write("			url: 'userLoginChk' ,\n");
      out.write("			data : {user_id:$(\"#userid\").val(), user_pw:$(\"#userpw\").val()},\n");
      out.write("			success : function(response){\n");
      out.write("				if(response){\n");
      out.write("					location = \"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\";\n");
      out.write("					//location.href = document.referrer;\n");
      out.write("				}else{\n");
      out.write("					$(\"#checkmsg\").text(\"아이디 혹은 비밀번호가 일치하지 않습니다.\").css('visibility','visible');\n");
      out.write("					\n");
      out.write("					$(\"#userpw\").val(\"\").focus();\n");
      out.write("				}\n");
      out.write("			}, error : function(req,text){\n");
      out.write("				alert(text+' : '+req.status);\n");
      out.write("			}\n");
      out.write("		});//ajax\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	$('#alogo').click(function() {\n");
      out.write("		\n");
      out.write("		location=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\";\n");
      out.write("	});\n");
      out.write("	\n");
      out.write("</script>	\n");
      out.write("</body>\n");
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
      // /WEB-INF/views/user/login.jsp(231,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/");
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

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/user/login.jsp(246,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
