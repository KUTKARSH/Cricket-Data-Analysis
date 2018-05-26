package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<title>\n");
      out.write("    Interactive Cricket Analytics\n");
      out.write("    \n");
      out.write("</title>\n");
      out.write("<body style=\"background-color: limegreen\">\n");
      out.write("<h1 style=\"background-color: black;color:limegreen;font-size: 300%;text-align:center\">\n");
      out.write("    Interactive Cricket Analytics Report\n");
      out.write("    <br>\n");
      out.write("    (Project Based Queries)\n");
      out.write("</h1>\n");
      out.write("<img src=\"cricket.jpg\" width=\"550\" height=\"400\" style=\"float:right\">\n");
      out.write("<ul>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hive.jsp\" target=\"_blank\">\n");
      out.write("  Select team's name in which you wish to find top 3 scorers  \n");
      out.write("  <select name=\"n\">\n");
      out.write("  <option value=\"India\">India</option>\n");
      out.write("  <option value=\"Australia\">Australia</option>\n");
      out.write("  <option value=\"New Zealand\">New Zealand</option>\n");
      out.write("  <option value=\"South Africa\">South Africa</option>\n");
      out.write("  <option value=\"England\">England</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"submit\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hive2.jsp\" target=\"_blank\">\n");
      out.write("  Select team's name in which you wish to find top 3 wicket takers  \n");
      out.write("  <select name=\"n\">\n");
      out.write("  <option value=\"India\">India</option>\n");
      out.write("  <option value=\"Australia\">Australia</option>\n");
      out.write("  <option value=\"New Zealand\">New Zealand</option>\n");
      out.write("  <option value=\"South Africa\">South Africa</option>\n");
      out.write("  <option value=\"England\">England</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"submit\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("    <form action = \"hive3.jsp\" target=\"_blank\">\n");
      out.write("    select match name for which you wish to find half centuries\n");
      out.write("    <select name=\"n\">\n");
      out.write("  <option value=\"211028\">England vs Australia</option>\n");
      out.write("  <option value=\"1093\">India vs Australia</option>\n");
      out.write("  <option value=\"211048\">New Zealand vs Australia</option>\n");
      out.write("  <option value=\"1049\">South Africa vs India</option>\n");
      out.write("  <option value=\"222678\">South Africa vs New Zealand</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"submit\">\n");
      out.write("  </li>\n");
      out.write("</form>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hive4.jsp\" target=\"_blank\">\n");
      out.write("    select match name for which you wish to find centuries\n");
      out.write("    <select name=\"n\">\n");
      out.write("  <option value=\"211028\">England vs Australia</option>\n");
      out.write("  <option value=\"1093\">India vs Australia</option>\n");
      out.write("  <option value=\"211048\">New Zealand vs Australia</option>\n");
      out.write("  <option value=\"1049\">South Africa vs India</option>\n");
      out.write("  <option value=\"222678\">South Africa vs New Zealand</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"submit\">\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hive5.jsp\" target=\"_blank\">\n");
      out.write("    select match name for which you wish to find no. of fours\n");
      out.write("    <select name=\"n\">\n");
      out.write("  <option value=\"211028\">England vs Australia</option>\n");
      out.write("  <option value=\"1093\">India vs Australia</option>\n");
      out.write("  <option value=\"211048\">New Zealand vs Australia</option>\n");
      out.write("  <option value=\"1049\">South Africa vs India</option>\n");
      out.write("  <option value=\"222678\">South Africa vs New Zealand</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"submit\">\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hive6.jsp\" target=\"_blank\">\n");
      out.write("    select match name for which you wish to find no. of sixes\n");
      out.write("    <select name=\"n\">\n");
      out.write("  <option value=\"211028\">England vs Australia</option>\n");
      out.write("  <option value=\"1093\">India vs Australia</option>\n");
      out.write("  <option value=\"211048\">New Zealand vs Australia</option>\n");
      out.write("  <option value=\"1049\">South Africa vs India</option>\n");
      out.write("  <option value=\"222678\">South Africa vs New Zealand</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"submit\">\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hive7.jsp\" target=\"_blank\">\n");
      out.write("    \n");
      out.write("    <input type=\"submit\" value = \"Click to see team wise score\"/>\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <form action = \"hive8.jsp\" target=\"_blank\">\n");
      out.write("    \n");
      out.write("    <input type=\"submit\" value = \"Click to see team wise score card\"/>\n");
      out.write("</form>\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
