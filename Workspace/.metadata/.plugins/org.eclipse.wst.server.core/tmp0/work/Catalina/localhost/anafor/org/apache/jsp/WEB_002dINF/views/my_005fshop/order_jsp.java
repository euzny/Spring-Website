/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-15 08:07:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.my_005fshop;

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
      out.write("<title>My ????????????</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".product {\n");
      out.write("   width: 1451px; \n");
      out.write("   height: 1080px;  \n");
      out.write("   background: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product_textarea {\n");
      out.write("   position: absolute;\n");
      out.write("   width: 1240px;\n");
      out.write("   height: 40%;\n");
      out.write("   top: 70px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product #product_text::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1.5px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#product_text {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 141px; \n");
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
      out.write("   height: 1.5px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#box_text {\n");
      out.write("   position: absolute;\n");
      out.write("   width: 593px; \n");
      out.write("   height: 50px; \n");
      out.write("   left: 359px; \n");
      out.write("   top: 120px; \n");
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
      out.write("   left: 439px; \n");
      out.write("   top: 150px; \n");
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
      out.write("   left: 416px; \n");
      out.write("   top: 180px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 16px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".order_detail {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 1239px; \n");
      out.write("   height: 350px;  \n");
      out.write("   top: 350px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#detail {\n");
      out.write("   position: absolute; \n");
      out.write("   text-align: left;\n");
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
      out.write("   left: 250px; \n");
      out.write("   top: 410px; \n");
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
      out.write("#delivery_request_text {\n");
      out.write("   position: absolute; \n");
      out.write("   top: 170px; \n");
      out.write("   left: 30px; \n");
      out.write("   font-size: 14px; \n");
      out.write("   font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#textarea {\n");
      out.write("   position: absolute; \n");
      out.write("   background: white; \n");
      out.write("   border: none; \n");
      out.write("   top: 182px; \n");
      out.write("   left: 150px; \n");
      out.write("   width: 400px; \n");
      out.write("   height: 25px; \n");
      out.write("   resize: none; \n");
      out.write("   font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#payment_text {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 85px; \n");
      out.write("   height: 46px; \n");
      out.write("   top: 240px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 20px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em; \n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#payment_text::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1.5px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bank_text {\n");
      out.write("   position: absolute; \n");
      out.write("   height: 46px; \n");
      out.write("   top: 290px; \n");
      out.write("   font-size: 13px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em; \n");
      out.write("   font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bank_text::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1.5px;\n");
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
      out.write("   height: 1.5px;\n");
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
      out.write("   top: 1020px; \n");
      out.write("   background: #696aad; \n");
      out.write("   border-radius: 10px; \n");
      out.write("   border: none; \n");
      out.write("   font-size: 17px; \n");
      out.write("   color: white;\"\n");
      out.write("}\n");
      out.write("\n");
      out.write("#order_situation_text {\n");
      out.write("   position: absolute; \n");
      out.write("   width: 123px; \n");
      out.write("   height: 46px; \n");
      out.write("   top: 475px; \n");
      out.write("   font-weight: bold; \n");
      out.write("   font-size: 20px; \n");
      out.write("   line-height: 50px; \n");
      out.write("   letter-spacing: -0.05em; \n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#order_situation_text::after {\n");
      out.write("   content:'';\n");
      out.write("   display:block;\n");
      out.write("   height: 1.5px;\n");
      out.write("   width: 1000px;\n");
      out.write("   background: #888888;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"order_result.pr\" method=\"post\">\n");
      out.write("<div class=\"product\">\n");
      out.write("\n");
      out.write("	<div style=\"position: absolute; width: 100%; height: 59px; background: #929292;\">\n");
      out.write("		<p style=\"position: absolute; width: 106px; left: 20px; top: 20px; font-weight: bold; font-size: 21px; letter-spacing: 0.5px; color: white;\">?????? ??????</p>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<div style=\"position: absolute; width: 1000px; height: 45px; left: 246px; top: 90px; background: #E5E5E5;\">\n");
      out.write("		<p style=\"position: absolute; width: 60px; height: 25px; left: 70px; top: 10px; font-weight: bold; font-size: 17px; line-height: 27px; color: #84A296;\">?????????</p>\n");
      out.write("		<p style=\"position: absolute; width: 66px; height: 25px; left: 450px; top: 10px; font-weight: bold; font-size: 17px; line-height: 27px;\">????????????</p>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<div style=\"position: absolute; width: 267px; height: 0px; left: 900px; top: 267px; border: 1px solid #ccc; transform: rotate(90deg); \"></div>\n");
      out.write("	<button type=\"button\" style=\"position: absolute; width: 170px; height: 40px; left: 1065px; top: 180px; background: #E5E5E5; border-radius: 5px; border: none; font-weight: bold; cursor: pointer;\">????????????</button>\n");
      out.write("	<button type=\"button\" style=\"position: absolute; width: 170px; height: 40px; left: 1065px; top: 240px; background: #E5E5E5; border-radius: 5px; border: none; font-weight: bold; cursor: pointer;\">????????????</button>\n");
      out.write("	<button type=\"button\" style=\"position: absolute; width: 170px; height: 40px; left: 1065px; top: 300px; background: #E5E5E5; border-radius: 5px; border: none; font-weight: bold; cursor: pointer;\">????????????</button>\n");
      out.write("\n");
      out.write("   <div class=\"product_textarea\">\n");
      out.write("      <img src=\"imgs/shopbox.png\" style=\"position: absolute; width: 200px; height: 190px; left: 246px; top: 80px; border-radius: 11px;\">\n");
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
      out.write("      <p id=\"detail\">????????? ??????</p>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <div class=\"order_detail_category\">\n");
      out.write("      <p id=\"person_receive_text\">????????????</p>\n");
      out.write("      <input type=\"text\"  readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"name\" id=\"person_receive\" style=\"position: absolute; background: white; width: 200px; height: 25px; left: 150px; top: 10px; border: none; border-radius: 5px; font-size: 12px\"/>\n");
      out.write("         \n");
      out.write("      <p id=\"phone_text\">?????????</p>\n");
      out.write("      <input id=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.tel }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly type=\"text\" name=\"tel\" style=\"position: absolute; background: white; border: none; width: 105px; height: 25px; left: 150px; top: 60px; border-radius: 5px;\"/>\n");
      out.write("      \n");
      out.write("      <p class=\"addr_receive_text\">????????????</p>\n");
      out.write("      <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.addr }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"default\" name=\"addr\" readonly style=\"background: white; border: none; position: absolute; left: 150px; top: 110px; height: 25px; width: 400px; \"/><br/>\n");
      out.write("   \n");
      out.write("      <p id=\"delivery_request_text\">??????????????????</p>\n");
      out.write("      <input id=\"textarea\" name=\"coment\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.coment }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("      \n");
      out.write("      <p id=\"payment_text\">?????? ??????</p>\n");
      out.write("      <p id=\"bank_text\">????????????(???????????????)</p>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 400px; height: 93px; left: 600px; top: 292px; background: #C4C4C4;\">\n");
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
      out.write("            <p id=\"delivery_detail\">??????</p>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 400px; height: 93px; left: 600px; top: 385px; background: #C4C4C4;\">\n");
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
      out.write("      \n");
      out.write("      <p id=\"order_situation_text\">?????? ?????? ??????</p>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 120px; height: 120px; top: 540px; left: 30px; background: #E0E0E0; border-radius: 50%;\">\n");
      out.write("      	<img src=\"imgs/fluent_payment-20-regular.png\" style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 10px;\">\n");
      out.write("      	<p style=\"position: absolute; width: 70px; left: 25px; top: 60px; font-weight: bold; line-height: 50px; letter-spacing: -0.05em; color: #929292; font-size: 16px;\">????????????</p>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 120px; height: 120px; top: 540px; left: 230px; background: #E0E0E0; border-radius: 50%;\">\n");
      out.write("      	<img src=\"imgs/fa6-solid_box-open.png\" style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 10px;\">\n");
      out.write("      	<p style=\"position: absolute; width: 76px; left: 23px; top: 60px; font-weight: bold; line-height: 50px; letter-spacing: -0.05em; color: #929292; font-size: 16px;\">???????????????</p>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 120px; height: 120px; top: 540px; left: 430px; background: #E0E0E0; border-radius: 50%;\">\n");
      out.write("      	<img src=\"imgs/fluent_box-16-regular.png\" style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 10px;\">\n");
      out.write("      	<p style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 60px; font-weight: bold; line-height: 50px; letter-spacing: -0.05em; color: #929292; font-size: 16px;\">????????????</p>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 120px; height: 120px; top: 540px; left: 630px; background: #E0E0E0; border-radius: 50%; background: #696aad;\">\n");
      out.write("      	<img src=\"imgs/mdi_truck-fast-outline.png\" style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 10px;\">\n");
      out.write("      	<p style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 60px; font-weight: bold; line-height: 50px; letter-spacing: -0.05em; color: white; font-size: 16px;\">?????????</p>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div style=\"position: absolute; width: 120px; height: 120px; top: 540px; left: 830px; background: #E0E0E0; border-radius: 50%;\">\n");
      out.write("      	<img src=\"imgs/fluent_box-16-regular.png\" style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 10px;\">\n");
      out.write("      	<p style=\"position: absolute; width: 70px; height: 70px; left: 25px; top: 60px; font-weight: bold; line-height: 50px; letter-spacing: -0.05em; color: #929292; font-size: 16px;\">????????????</p>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.13.1/jquery-ui.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
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
      // /WEB-INF/views/my_shop/order.jsp(317,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.price }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/my_shop/order.jsp(317,20) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      // /WEB-INF/views/my_shop/order.jsp(318,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.cnt }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/my_shop/order.jsp(318,18) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      // /WEB-INF/views/my_shop/order.jsp(348,39) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.price }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/my_shop/order.jsp(348,39) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      // /WEB-INF/views/my_shop/order.jsp(361,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatNumber_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.price }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/my_shop/order.jsp(361,40) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
