/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-23 05:50:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick-theme.css\">\n");
      out.write("	\n");
      out.write("   \n");
      out.write("    <meta content=\"text/html; charset=UTF-8\" http-equiv=\"Content-Type\" />\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <title>아나포</title>   \n");
      out.write("   \n");
      out.write("    \n");
      out.write("   \n");
      out.write("   <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("  <!--  <script type=\"text/javascript\" src=\"js/home.js\"></script>\n");
      out.write("  \n");
      out.write(" -->\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("   <!-- header -->\n");
      out.write("   <style>\n");
      out.write("html, body{min-height: 100%; height: 100%;}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   #wrap{width:100%;height:auto}\n");
      out.write("   \n");
      out.write("   #header{width:100%;height:493px;background: url(\"imgs/header_bg.png\") 95% bottom #696aad no-repeat;position:relative}\n");
      out.write("   #header .text_box{position:absolute;left:60px;top:160px}\n");
      out.write("   #header .text_box h3{font-size:56px;font-weight:200;color:#fff;line-height:64px;margin-bottom:10px;position: relative;}\n");
      out.write("   #header .text_box h3::after{content:'';display:block;height:1px;width:200px;background:#fff;position: absolute;top:32px;right:-240px}\n");
      out.write("   #header .text_box p{font-size:20px;color:#fff;line-height:24px;font-weight:200}\n");
      out.write("   #header .btn_app{position: absolute;left:60px;bottom:90px}\n");
      out.write("   #header .btn_app a{width:200px;height:55px;display:block;border-radius:55px;overflow:hidden;}\n");
      out.write("   #header .btn_app a img{width:100%}\n");
      out.write("   \n");
      out.write("   /* top */\n");
      out.write("   #top{width:100%;height:800px;margin:50px 0;position:relative}\n");
      out.write("   #top::before{content: '';display:block;position:absolute;height:100%;width:100%;background:#696aad;left:calc(50% - 400px);transform: translate(-50%, 0);margin-left:-50%}\n");
      out.write("   #top .view_box{height:755px;width:1257px;margin:0 auto;position:relative;padding-top:30px}\n");
      out.write("   #top .view_box .phone_box{width:375px;height:755px;box-sizing:border-box;padding:80px 15px 90px 10px; background: url(\"imgs/phoneview.png\") no-repeat; background-size: 370px; position:relative}\n");
      out.write("   #top .view_box .phone_box ul{display:block;width:100%;height:590px;background:red;overflow:hidden}\n");
      out.write("   #top .view_box .phone_box section{display:block;width:100%;height:590px;background:red;overflow:hidden}\n");
      out.write("   #top .view_box .phone_box li{display:inline-block}\n");
      out.write("   #top .view_box .phone_box li img{width:100%}\n");
      out.write("   #top .view_box .text_box{position:absolute;top:150px;right:60px}\n");
      out.write("   #top .view_box .text_box p:nth-of-type(1){font-size:30px;line-height:75px;padding-bottom:20px}\n");
      out.write("   #top .view_box .text_box p:nth-of-type(2){font-size:56px;line-height:58px;font-weight:700}\n");
      out.write("   #top .view_box .text_box .page_text{position: absolute; top: 300px; left: 0px;}\n");
      out.write("   #top .view_box .btn{width:200px;height:100px;position:absolute;bottom:118px;right:350px}\n");
      out.write("   #top .view_box .btn li{display:inline-block;float:left;position:relative}\n");
      out.write("   #top .view_box .btn li:last-child{margin-left:-1px}\n");
      out.write("   #top .view_box .btn a{display:block;width:100px;height:100px;border:1px solid #776f67;background: url(\"imgs/arrow.png\") center 50% #fff no-repeat;background-size:35px}\n");
      out.write("   #top .view_box .btn a.btn_prev{transform: rotate(180deg);}\n");
      out.write("   #top .view_box .btn a span{display:none}\n");
      out.write("\n");
      out.write("   #wrapj{width:100%;height:auto}\n");
      out.write("   \n");
      out.write("   /* jungle */\n");
      out.write("   #jungle{width:100%;height:730px;background: url(\"imgs/jungle_bg.png\") 100% 40px #e0e0e0 no-repeat;position:relative}\n");
      out.write("   #jungle .text_jungle{position: absolute;left: 87px; top: 130px; text-align: left;}\n");
      out.write("   #jungle .text_jungle h3{font-size: 34px;font-weight: 600;line-height: 44px;position: relative;}\n");
      out.write("   #jungle .text_jungle b{color: #696aad;}\n");
      out.write("   #jungle .text_jungle p{font-size: 24px;line-height: 24px;}\n");
      out.write("   #jungle .img_jungle{position: absolute;left: 60px;bottom: 30px;}\n");
      out.write("   \n");
      out.write("   /* mid */\n");
      out.write("   #mid{width:100%;height: 900px; background: url(\"imgs/mid_img.png\") center no-repeat;position: relative;display: block;margin: 0px auto; box-sizing: border-box; margin-top: 30px;margin-bottom: 100px;}\n");
      out.write("   \n");
      out.write("   /* bottom */\n");
      out.write("   #wrapb{width:100%;height:auto}\n");
      out.write("   \n");
      out.write("   #bottom{width:100%;height:260px;background: #f5f5f5;position:relative;box-sizing: border-box;}\n");
      out.write("   #bottom .text_bot{position:absolute;left:60px;top:50px;text-align: left;}\n");
      out.write("   #bottom .text_bot h3{font-size:28px;font-weight:900;color:#696aad;line-height: 60px;}\n");
      out.write("   #bottom .text_bot p{font-size:24px;color:#000; line-height: 30px; font-weight:200;margin: 0px auto;}\n");
      out.write("   #bottom .btn_appbot{position: absolute;right:120px;bottom:90px;}\n");
      out.write("   #bottom .btn_appbot a{width:200px;height:55px;display:block;border-radius:55px;overflow:hidden;border: 2px solid #696aad;}\n");
      out.write("   /* #bottom .btn_appbot a img{width:100%}\n");
      out.write("   #bottom .btn_appbot a img{background: center;  position:absolute; } */\n");
      out.write("   \n");
      out.write("   </style>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\n");
      out.write("   <!-- header -->\n");
      out.write("   <div id=\"header\">\n");
      out.write("      <div class=\"text_box\">\n");
      out.write("         <h3>나는 오늘 <b>아나포</b></h3>\n");
      out.write("         <p>병원/약국 찾기부터 모바일 상담/계획 관리까지</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"btn_app\">\n");
      out.write("         <a href=\"\"><img src=\"imgs/btn_app.png\"></a>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   <!-- // header  -->\n");
      out.write("   \n");
      out.write("   <!-- top -->\n");
      out.write("   <div id=\"top\">\n");
      out.write("      <div class=\"view_box\">\n");
      out.write("         <div class=\"phone_box\">\n");
      out.write("            <!-- <ul class=\"slides\">\n");
      out.write("               <li><img src=\"https://findin.co.kr/wp-content/uploads/2021/11/1-1.png\" alt=\"1\"></li>\n");
      out.write("               <li><img src=\"imgs/box.png\" alt=\"2\"></li>\n");
      out.write("               <li><img src=\"https://findin.co.kr/wp-content/uploads/2021/11/1-1.png\" alt=\"3\"></li>\n");
      out.write("            </ul> -->\n");
      out.write("            <section class=\"lazy1 slider\" data-sizes=\"50vw\">\n");
      out.write("			    <div><img  src=\"imgs/pagea.png\"/></div>\n");
      out.write("			    <div><img  src=\"imgs/pageb.png\"/></div>\n");
      out.write("			    <div><img  src=\"imgs/pagec.png\"/></div>\n");
      out.write("			    <div><img  src=\"imgs/paged.png\"/></div>\n");
      out.write("			    <div><img  src=\"imgs/pagee.png\"/></div>\n");
      out.write("			</section>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"text_box\">\n");
      out.write("            <div class=\"text1\" id=\"text1\">\n");
      out.write("               <p>나와 가까운 병원찾기부터 스마트하게 약 관리까지!</p>\n");
      out.write("               <p>건강이 편해지다.</p>\n");
      out.write("            </div>\n");
      out.write("			<div class=\"page_text\"><img src=\"imgs/pagetext.png\" alt=\"text\" /></div>            \n");
      out.write("         </div>\n");
      out.write("         <!-- <div class=\"btn\">\n");
      out.write("            <ul>\n");
      out.write("               <li><a class=\"btn_prev\"onclick=\"btn_prev()\"><span>이전</span></a></li>\n");
      out.write("               <li><a class=\"btn_next\"onclick=\"btn_next()\"><span>다음</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("         </div> -->\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   <!-- // top -->\n");
      out.write("\n");
      out.write("<div id=\"wrapj\">   \n");
      out.write("   <!-- jungle -->\n");
      out.write("   <div id=\"jungle\">\n");
      out.write("      <div class=\"text_jungle\">\n");
      out.write("         <h3><b>AnaFor</b> 앱으로 스마트하게 건강관리하세요</h3>\n");
      out.write("         <p>나의 일상생활에 딱맞게 울리는 복약알림, AnaFor 띵동!</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"img_jungle\">\n");
      out.write("         <img src=\"imgs/jungle_con.png\">\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   <!-- // jungle -->\n");
      out.write("</div>   \n");
      out.write("   <!-- mid -->\n");
      out.write("   <div id=\"mid\">\n");
      out.write("      <div>\n");
      out.write("         \n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   <!--// mid —> -->\n");
      out.write("\n");
      out.write("   <!-- bottom -->\n");
      out.write("   <div id=\"wrapb\">\n");
      out.write("      <div id=\"bottom\">\n");
      out.write("         <div class=\"text_bot\">\n");
      out.write("            <h3>AnaFor</h3>\n");
      out.write("            <p><b>아픈</b> 나를 위한</p>\n");
      out.write("            <p><b>아나포</b>를 지금<b>만나보세요!</b></p>\n");
      out.write("         </div>\n");
      out.write("       \n");
      out.write("         <div class=\"btn_appbot\">\n");
      out.write("            <a href=\"\"><img src=\"imgs/btn_app.png\"></a>\n");
      out.write("         </div>\n");
      out.write("      </div>   \n");
      out.write("   </div>\n");
      out.write("   <!--// bottom -->\n");
      out.write("   \n");
      out.write("\n");
      out.write("  \n");
      out.write("<script src=\"https://code.jquery.com/jquery-2.2.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/slick.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("	 $(\".lazy1\").slick({\n");
      out.write("	        lazyLoad: 'ondemand', // ondemand progressive anticipated\n");
      out.write("	        infinite: true,\n");
      out.write("	        autoplay: true,\n");
      out.write("	          autoplaySpeed: 3000\n");
      out.write("	       \n");
      out.write("	      });\n");
      out.write("	 /*   prevArrow : $('.prevArrow'), \n");
      out.write("     nextArrow : $('.nextArrow') */\n");
      out.write("\n");
      out.write("	\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var result = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("if (result === 'OK') {\n");
      out.write("	alert(\"주문이 정상적으로 처리되었습니다.\");\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
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
}