/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2024-02-15 16:17:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.my.dto.*;
import java.util.ArrayList;

public final class board_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("com.my.dto");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>Insert title here</title>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.6.3.min.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(function() {\r\n");
      out.write("			$(\"#btn_to_list\").click(function() {\r\n");
      out.write("				//history.back(-1);\r\n");
      out.write("				location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/list?page=1\";   // (단순화) 1페이지 목록보기로 이동.\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#btn_modify\").click(function() {\r\n");
      out.write("				location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/modify?bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#btn_delete\").click(function() {\r\n");
      out.write("				location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/delete/action?bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	<style>\r\n");
      out.write("    body {\r\n");
      out.write("        font-family: Arial, sans-serif;\r\n");
      out.write("        background-color: #f8f8f8;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        width: 800px;\r\n");
      out.write("    }\r\n");
      out.write("    h1 {\r\n");
      out.write("        color: #333;\r\n");
      out.write("        font-size: 24px;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    table {\r\n");
      out.write("        width: 800px;\r\n");
      out.write("        border-collapse: collapse;\r\n");
      out.write("        border: 1px solid #ccc;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    th, td {\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        border: 1px solid #ccc;\r\n");
      out.write("    }\r\n");
      out.write("    th {\r\n");
      out.write("        background-color: #f0f0f0;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("    #btn_to_list, #btn_modify, #btn_delete {\r\n");
      out.write("        background-color: #4CAF50;\r\n");
      out.write("        color: white;\r\n");
      out.write("        padding: 10px 20px;\r\n");
      out.write("        border: none;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("        margin-right: 10px;\r\n");
      out.write("    }\r\n");
      out.write("    #btn_to_list:hover, #btn_modify:hover, #btn_delete:hover {\r\n");
      out.write("        background-color: #45a049;\r\n");
      out.write("    }\r\n");
      out.write("    #buttons{\r\n");
      out.write("    	display: flex;\r\n");
      out.write("    	justify-content: flex-end;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>게시글 상세보기</h1>\r\n");
      out.write("	<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>글 번호</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>작성자</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>작성일시</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.writedate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>제목</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>내용</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>조회수</th>\r\n");
      out.write("			<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BoardDto.hitcount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>	\r\n");
      out.write("	<div id=\"buttons\">\r\n");
      out.write("		<button id=\"btn_to_list\">목록보기</button>\r\n");
      out.write("		<button id=\"btn_modify\">수정하기</button>\r\n");
      out.write("		<button id=\"btn_delete\">삭제하기</button>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
