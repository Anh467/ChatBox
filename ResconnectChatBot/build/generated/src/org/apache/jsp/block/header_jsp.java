package org.apache.jsp.block;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Document</title>\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\r\n");
      out.write("            integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\r\n");
      out.write("            crossorigin=\"anonymous\"\r\n");
      out.write("            referrerpolicy=\"no-referrer\"\r\n");
      out.write("            />\r\n");
      out.write("        <style>\r\n");
      out.write("            @import url(\"https://fonts.googleapis.com/css2?family=Karla:wght@300;400;500;600;700&display=swap\");\r\n");
      out.write("            * {\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                font-family: \"Karla\", sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            body {\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("            .container {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 20vh;\r\n");
      out.write("                background-image: url(back.jpg);\r\n");
      out.write("                background-position: center;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                padding-top: 35px;\r\n");
      out.write("                padding-left: 8%;\r\n");
      out.write("                padding-right: 8%;\r\n");
      out.write("            }\r\n");
      out.write("            nav {\r\n");
      out.write("                padding: 10px 0;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("            }\r\n");
      out.write("            .logo a {\r\n");
      out.write("                font-size: 40px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("            span {\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("            nav ul li {\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                list-style: none;\r\n");
      out.write("                margin: 10px 15px;\r\n");
      out.write("            }\r\n");
      out.write("            nav ul li a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                transition: 0.5s;\r\n");
      out.write("            }\r\n");
      out.write("            nav ul li a:hover {\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("            .login {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                margin-right: 15px;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("            }\r\n");
      out.write("            .btn {\r\n");
      out.write("                background: #000;\r\n");
      out.write("                border-radius: 6px;\r\n");
      out.write("                padding: 9px 25px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                transition: 0.5s;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("            }\r\n");
      out.write("            a {\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            if ((session.getAttribute("id") == null) || (((String) session.getAttribute("id")).equals(""))) {
                request.setAttribute("notlogin", "block");
                request.setAttribute("login", "none");
            } else {
                request.setAttribute("notlogin", "none");
                request.setAttribute("login", "block");
            }
        
      out.write("\r\n");
      out.write("        <div class=\"container header\">\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"#\"><span>IRCN  V</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span>Home</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span>About</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><span>Services</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"buttons\" style=\"display: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notlogin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <a href=\"login.jsp\" class=\"login\"><span>Log in</span></a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn\">Register</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"buttons\" style=\"display: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <i class=\"fa-solid fa-user fa-3x\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
