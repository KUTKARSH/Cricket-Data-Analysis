package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class hive_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<center>\n");
      out.write("    <h1>\n");
      out.write("        Employee list\n");
      out.write("    </h1>\n");
      out.write("</center>\n");
      out.write("<table border =\"1\" width=\"80%\">\n");
      out.write("    <tr>\n");
      out.write("        <th>empid</th>\n");
      out.write("        <th>name</th>\n");
      out.write("    </tr>\n");
      out.write("    ");

        String hql = "select eid,ename from emp";
         ResultSet rs = hadoop.getData(hql); 
while(rs.next())
{
    String id = rs.getString(1);
    String name = rs.getString(2);


      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(id);
      out.write(" </td>\n");
      out.write("       <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                }\n");
      out.write("</table>\n");
      out.write("    </center>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
