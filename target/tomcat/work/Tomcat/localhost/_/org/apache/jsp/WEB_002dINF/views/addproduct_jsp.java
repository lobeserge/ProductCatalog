/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-09 18:46:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1568017184420L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add Product</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary rounded\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\" style=\"color:white;\">ProductCatalog</a>\r\n");
      out.write("    <div class=\"container\" >\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("    <ul class=\"nav navbar-nav mr-auto\" style=\"padding-right:12px;\">\r\n");
      out.write("            <li class=\"nav-item active text-success\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/RetrieveCatalogServlet\" style=\"color:white;font-size:15px;\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/RetrieveProductServlet\"  style=\"color:white;font-size:15px;\">Products</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/RetrieveCategory\" style=\"color:white;font-size:15px;\">Category</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-3 col-md-offset-2\">\r\n");
      out.write("          <ul  class=\"nav navbar-nav mr-auto\" style=\"float:right; clear:both;padding-right:0px;\">\r\n");
      out.write("             <li class=\"nav-item\"  >\r\n");
      out.write("                <a class=\"nav-link\" href=\"/SignUpServlet\" style=\"color:white;font-size:15px;\">SignUp</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\" >\r\n");
      out.write("                <a class=\"nav-link\" href=\"/LogoutServlet\" style=\"color:white;font-size:15px;\">Logout</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\" >\r\n");
      out.write("             <a class=\"nav-link\" href=\"#\" style=\"color:white;font-size:15px; padding-left:40px;text-align:center;\"><span class=\"glyphicon glyphicon-user\" style=\"color:white;\"><span style=\"padding-left:7px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("       </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"/webjars/jquery/1.9.1/jquery.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<h2>Add a new Product Today</h2>\r\n");
      out.write("<div class=\"container-fluid \" style=\"margin-top:5%;\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-4 col-md-offset-4\" class=\"form-group \">\r\n");
      out.write("<form action=\"/AddProductServlet\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("  <input type=\"text\" name=\"id\"  class=\"form-control mt-20\" placeholder=\"Product id\"><br><br>\r\n");
      out.write("  <input type=\"text\" name=\"name\"  class=\"form-control mt-20\" placeholder=\"Product Name\"><br><br>\r\n");
      out.write("  <input type=\"text\" name=\"price\"  class=\"form-control mt-20\" placeholder=\"Product Price\"><br><br>\r\n");
      out.write("  <input type=\"text\" name=\"pcat\"  class=\"form-control mt-20\" placeholder=\"Product Category\"><br><br>\r\n");
      out.write("  <input type=\"file\" name=\"image\"  class=\"form-control mt-20\" placeholder=\"Select File\"><br><br>\r\n");
      out.write("  <input type=\"submit\" value=\"Submit Product\" class=\"btn btn-success btn-lg form-control\" ><br><br>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
