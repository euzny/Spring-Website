/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-09 01:28:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1648006669317L));
    _jspx_dependants.put("jar:file:/D:/Study_Spring/Workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/anafor/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("<title>?????? ?????? ??????</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".product {\n");
      out.write("   width: 1451px; \n");
      out.write("   height: 1080px;  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".product_textarea {\n");
      out.write("   position: absolute;\n");
      out.write("   width: 1240px;\n");
      out.write("   height: 40%;\n");
      out.write("   left: 200px;\n");
      out.write("   top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product #product_text::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#product_text {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 137px; \n");
      out.write("   height: 50px; \n");
      out.write("   left: 248px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 20px; \n");
      out.write("   line-height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product #detail::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#box_text {\n");
      out.write("   position: absolute;\n");
      out.write("   width: 593px; \n");
      out.write("   height: 50px; \n");
      out.write("   left: 389px; \n");
      out.write("   top: 130px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 17px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#price {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 147px; \n");
      out.write("   height: 50px; \n");
      out.write("   left: 465px; \n");
      out.write("   top: 160px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 17px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em; \n");
      out.write("   color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#cnt {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 147px; \n");
      out.write("   height: 50px; \n");
      out.write("   left: 446px; \n");
      out.write("   top: 190px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 16px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".order_detail {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 1239px; \n");
      out.write("   height: 350px; \n");
      out.write("   left: 200px; \n");
      out.write("   top: 330px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#detail {\n");
      out.write("   position: absolute; \n");
      out.write("   float: left; \n");
      out.write("   width: 150px; \n");
      out.write("   height: 50px; \n");
      out.write("   left: 248px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 20px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".order_detail_category {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 127px; \n");
      out.write("   height: 237px; \n");
      out.write("   left: 450px; \n");
      out.write("   top: 390px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#person_receive_text {\n");
      out.write("   font-size: 14px; \n");
      out.write("   font-weight: bold;\n");
      out.write("   letter-spacing: 0.5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#phone_text {\n");
      out.write("   font-size: 14px; \n");
      out.write("   font-weight: bold;\n");
      out.write("   letter-spacing: 0.5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".addr_receive_text {\n");
      out.write("   font-size: 14px; \n");
      out.write("   font-weight: bold;\n");
      out.write("   letter-spacing: 0.5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#post_code {\n");
      out.write("   position: absolute; \n");
      out.write("   background: #696aad; \n");
      out.write("   color: white; \n");
      out.write("   width: 80px; \n");
      out.write("   height: 25px; \n");
      out.write("   left: 150px; \n");
      out.write("   top: 110px; \n");
      out.write("   cursor: pointer; \n");
      out.write("   border: none; \n");
      out.write("   letter-spacing: 0.7px; \n");
      out.write("   font-size: 13px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#default_addr_text {\n");
      out.write("   position: absolute; \n");
      out.write("   left: 545px; \n");
      out.write("   font-size: 11px; \n");
      out.write("   color: #808080; \n");
      out.write("   width: 60px; \n");
      out.write("   top: 127px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#detail_addr_text {\n");
      out.write("   position: absolute; \n");
      out.write("   left: 550px; \n");
      out.write("   font-size: 11px; \n");
      out.write("   color: #808080; \n");
      out.write("   width: 60px; \n");
      out.write("   top: 158px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#delivery_request_text {\n");
      out.write("   position: absolute; \n");
      out.write("   top: 200px; \n");
      out.write("   left: 30px; \n");
      out.write("   font-size: 14px; \n");
      out.write("   font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#textarea {\n");
      out.write("   position: absolute; \n");
      out.write("   border: 1px solid #d5d5d5; \n");
      out.write("   top: 214px; \n");
      out.write("   left: 150px; \n");
      out.write("   width: 400px; \n");
      out.write("   height: 50px; \n");
      out.write("   resize: none; \n");
      out.write("   font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#payment_text {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 85px; \n");
      out.write("   height: 46px; \n");
      out.write("   top: 300px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 20px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em; \n");
      out.write("   text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#payment_text::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bank_text {\n");
      out.write("   position: absolute; \n");
      out.write("   height: 46px; \n");
      out.write("   top: 350px; \n");
      out.write("   font-size: 13px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em; \n");
      out.write("   font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bank_text::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#total_result_text {\n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#delivery_text {\n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 14px; \n");
      out.write("   margin-right: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#total_detail_price {\n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 14px; \n");
      out.write("   color: red; \n");
      out.write("   letter-spacing: 0.2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#delivery_detail {\n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bank_number_text {\n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 14px; \n");
      out.write("   margin-left: 10px; \n");
      out.write("   text-align: left; \n");
      out.write("   margin-top: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#total_detail_result_text {\n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 14px; \n");
      out.write("   margin-left: 10px; \n");
      out.write("   text-align: left; \n");
      out.write("   margin-top: -5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bank_number {\n");
      out.write("   font-size: 14px; \n");
      out.write("   margin-left: 10px; \n");
      out.write("   letter-spacing: 0.5px; \n");
      out.write("   color: black; \n");
      out.write("   font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#total_detail_result {\n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 14px; \n");
      out.write("   margin-left: 35px; \n");
      out.write("   letter-spacing: 0.5px; \n");
      out.write("   color: red; \n");
      out.write("   margin-top: -5px; \n");
      out.write("   font-size: 16px; \n");
      out.write("}\n");
      out.write("\n");
      out.write("#total_detail_result::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1px;\n");
      out.write("   margin-left: -864px;\n");
      out.write("   margin-top: -9px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".order_result {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 350px; \n");
      out.write("   height: 60px; \n");
      out.write("   left: 760px; \n");
      out.write("   top: 970px; \n");
      out.write("   background: #696aad; \n");
      out.write("   border-radius: 10px; \n");
      out.write("   border: none; \n");
      out.write("   font-size: 17px; \n");
      out.write("   color: white;\"\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- <form action=\"order.pr\" method=\"post\"> -->\n");
      out.write("<div class=\"product\" >\n");
      out.write("   <div class=\"product_textarea\">\n");
      out.write("      <p id=\"product_text\" >?????? ?????? ??????</p>\n");
      out.write("      <img src=\"imgs/shopbox.png\" style=\"position: absolute; width: 221px; height: 210px; left: 246px; top: 80px; border-radius: 11px;\">\n");
      out.write("      <p id=\"box_text\">????????? ????????? ?????? AnaFor Smart IoT ??????/?????????</p>\n");
      out.write("      <p id=\"price\">");
      if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("      <p id=\"cnt\">");
      if (_jspx_meth_fmt_005fformatNumber_005f1(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <div class=\"order_detail\">\n");
      out.write("      <p id=\"detail\">????????? ?????? ??????</p>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <div class=\"order_detail_category\">\n");
      out.write("      <p id=\"person_receive_text\">*????????????</p>\n");
      out.write("      <input type=\"text\" id=\"person_receive\" style=\"position: absolute; width: 200px; height: 25px; left: 150px; top: 10px; border: 1px solid #d5d5d5; border-radius: 5px; font-size: 12px\">\n");
      out.write("         \n");
      out.write("      <p id=\"phone_text\">*?????????</p>\n");
      out.write("      <input id=\"phone\" type=\"text\" name=\"tel\" maxlength=\"3\" style=\"position: absolute; width: 50px; height: 25px; left: 150px; top: 58px; border: 1px solid #d5d5d5; border-radius: 5px;\"/>\n");
      out.write("      <p style=\"position: absolute; left: 205px; top: 46px;\">-</p>\n");
      out.write("      <input type=\"text\" name=\"tel\" maxlength=\"4\" style=\"position: absolute; width: 60px; height: 25px; left: 215px; top: 58px; border: 1px solid #d5d5d5; border-radius: 5px;\"/>\n");
      out.write("      <p style=\"position: absolute; left: 281px; top: 46px;\">-</p>\n");
      out.write("      <input type=\"text\" name=\"tel\" maxlength=\"4\" style=\"position: absolute; width: 60px; height: 25px; left: 290px; top: 58px; border: 1px solid #d5d5d5; border-radius: 5px;\"/>\n");
      out.write("      \n");
      out.write("      <p class=\"addr_receive_text\">*????????????</p>\n");
      out.write("      <button id=\"post_code\" onclick=\"daum_post()\">????????????</button>\n");
      out.write("         <input type=\"text\" name=\"post\" readonly style=\"border: 1px solid #d5d5d5; position: absolute; left: 240px; top: 110px; height: 25px; width: 60px;\" /><br />\n");
      out.write("         <p id=\"default_addr_text\">????????????</p>\n");
      out.write("         <input type=\"text\" id=\"default\" name=\"addr\" readonly style=\"border: 1px solid #d5d5d5; position: absolute; left: 150px; top: 140px; height: 25px; width: 400px;\"/><br/>\n");
      out.write("         <p id=\"detail_addr_text\">???????????????</p>\n");
      out.write("         <input type=\"text\" name=\"addr\" style=\"border: 1px solid #d5d5d5; position: absolute; left: 150px; top: 170px; height: 25px; width: 400px; font-size: 12px;\"/><br/>\n");
      out.write("      <p id=\"delivery_request_text\">??????????????????</p>\n");
      out.write("      <textarea id=\"textarea\"></textarea>\n");
      out.write("      \n");
      out.write("      <p id=\"payment_text\">?????? ??????</p>\n");
      out.write("      <p id=\"bank_text\">????????????(???????????????)</p>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 400px; height: 93px; left: 600px; top: 351px; background: #C4C4C4;\">\n");
      out.write("         <div style=\"width: 93px; height: 93px; left: 987px; top: 866px;\">\n");
      out.write("            <p id=\"total_result_text\">??? ????????????</p>\n");
      out.write("            <p id=\"delivery_text\">?????????</p>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <div style=\"position: absolute; width: 86px; height: 93px; left: 300px; top: -1px; letter-spacing: 0.2px; \">\n");
      out.write("            <p id=\"total_detail_price\">");
      if (_jspx_meth_fmt_005fformatNumber_005f2(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("            <p id=\"delivery_detail\">0???</p>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 400px; height: 93px; left: 600px; top: 444px; background: #C4C4C4;\">\n");
      out.write("         <div style=\"height: 93px; left: 987px; top: 866px;\">\n");
      out.write("            <p id=\"bank_number_text\">????????????(???????????????)</p>\n");
      out.write("            <p id=\"total_detail_result_text\">??? ????????????</p>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <div style=\"position: absolute; width: 187px; height: 86px; left: 228px; top: 6px;\">\n");
      out.write("            <p id=\"bank_number\">356-0769-1562-03</p>\n");
      out.write("            <p id=\"total_detail_result\">");
      if (_jspx_meth_fmt_005fformatNumber_005f3(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <button class=\"order_result\" style=\"cursor: pointer;\" onclick=\"orderChk()\">????????????</button>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- </form> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function daum_post() {\n");
      out.write("   \n");
      out.write("   new daum.Postcode({\n");
      out.write("      oncomplete: function(res) {\n");
      out.write("         $(\"[name=post]\").val(res.zonecode);\n");
      out.write("         // ??????, ????????? ??????\n");
      out.write("         var addr = res.userSelectedType == \"J\" ? res.jibunAddress : res.roadAddress;   // ?????? ??? ?????? J ?????? (Jibun ??????)\n");
      out.write("           // name ??? addr ??? ????????? 0 ????????? addr ?????? ??????\n");
      out.write("           \n");
      out.write("           // ???????????? ?????? ?????? ?????? ????????? ????????? ?????? ??????\n");
      out.write("           if(res.buildingName != \"\") addr += '(' + res.buildingName + ')';\n");
      out.write("           \n");
      out.write("           $(\"[name=addr]\").eq(0).val(addr);\n");
      out.write("      }\n");
      out.write("   }).open();\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function orderChk() {\n");
      out.write("	\n");
      out.write("	if($(\"#person_receive\").val() == \"\"){	//???????????? ???????????? ????????? ???\n");
      out.write("		$(\"#person_receive\").focus();\n");
      out.write("		alert(\"?????? ????????? ??????????????????.\");\n");
      out.write("	\n");
      out.write("		return false;\n");
      out.write("	\n");
      out.write("	} \n");
      out.write("	else if ($(\"#phone\").val() == \"\"){	//???????????? ???????????? ????????? ???\n");
      out.write("		$(\"#phone\").focus();\n");
      out.write("		alert(\"???????????? ??????????????????.\");\n");
      out.write("	\n");
      out.write("		return false;\n");
      out.write("	\n");
      out.write("	} \n");
      out.write("	else if ($(\"#default\").val() == \"\"){	//???????????? ???????????? ????????? ???\n");
      out.write("		$(\"#default\").focus();\n");
      out.write("		alert(\"????????? ??????????????????.\");\n");
      out.write("	\n");
      out.write("		return false;\n");
      out.write("	}\n");
      out.write("	else {\n");
      out.write("		alert(\"????????? ??????????????? ?????????????????????.\");\n");
      out.write("	    location.href=\"/ordercomp.pr\"\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f0.setParent(null);
      // /WEB-INF/views/shop/order.jsp(315,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderInfo.bk_price }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/shop/order.jsp(315,20) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setPattern("#,##0???");
      int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      _jspx_th_fmt_005fformatNumber_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f1_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f1.setParent(null);
      // /WEB-INF/views/shop/order.jsp(316,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderInfo.bk_cnt }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/shop/order.jsp(316,18) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f1.setPattern("#,##0???");
      int _jspx_eval_fmt_005fformatNumber_005f1 = _jspx_th_fmt_005fformatNumber_005f1.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f1);
      _jspx_th_fmt_005fformatNumber_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f2_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f2.setParent(null);
      // /WEB-INF/views/shop/order.jsp(354,39) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderInfo.bk_price }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/shop/order.jsp(354,39) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f2.setPattern("#,##0???");
      int _jspx_eval_fmt_005fformatNumber_005f2 = _jspx_th_fmt_005fformatNumber_005f2.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f2);
      _jspx_th_fmt_005fformatNumber_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f2, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    boolean _jspx_th_fmt_005fformatNumber_005f3_reused = false;
    try {
      _jspx_th_fmt_005fformatNumber_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatNumber_005f3.setParent(null);
      // /WEB-INF/views/shop/order.jsp(367,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderInfo.bk_price }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/shop/order.jsp(367,40) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f3.setPattern("#,##0???");
      int _jspx_eval_fmt_005fformatNumber_005f3 = _jspx_th_fmt_005fformatNumber_005f3.doStartTag();
      if (_jspx_th_fmt_005fformatNumber_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f3);
      _jspx_th_fmt_005fformatNumber_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f3, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f3_reused);
    }
    return false;
  }
}
