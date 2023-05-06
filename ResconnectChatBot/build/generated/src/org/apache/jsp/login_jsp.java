package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"vh-100 d-flex justify-content-center align-items-center\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("                    <div class=\"col-12 col-md-8 col-lg-6\">\r\n");
      out.write("                        <div class=\"card bg-white\">\r\n");
      out.write("                            <div class=\"card-body p-5\">\r\n");
      out.write("                                <form action=\"CheckLogin\" method=\"get\" class=\"mb-3 mt-md-4\">\r\n");
      out.write("                                    <h2 class=\"fw-bold mb-2 text-uppercase \">Login</h2>\r\n");
      out.write("                                    <p class=\" mb-5\">Please enter your login and password!</p>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"username\" class=\"form-label \">Username</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"username\" name=\"user\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label for=\"password\" class=\"form-label \">Password</label>\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"password\" name=\"pass\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <input type=\"checkbox\" value=\"1\" name=\"check\">\r\n");
      out.write("                                        <label>Remember me</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"d-grid\">\r\n");
      out.write("                                        <button class=\"btn btn-outline-dark\" type=\"submit\">Login</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                </form>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p class=\"mb-0  text-center\">Don't have an account? <a href=\"signup.jsp\" class=\"text-primary fw-bold\">Sign Up</a></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p style=\"color: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
