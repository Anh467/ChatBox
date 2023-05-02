package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Signup</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"vh-100\">\n");
      out.write("            <div class=\"mask d-flex align-items-center h-100 gradient-custom-3\">\n");
      out.write("                <div class=\"container h-100\">\n");
      out.write("                    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                        <div class=\"col-12 col-md-9 col-lg-7 col-xl-6\">\n");
      out.write("                            <div class=\"card\" style=\"border-radius: 15px;\">\n");
      out.write("                                <div class=\"card-body p-5\">\n");
      out.write("                                    <h2 class=\"text-uppercase text-center mb-5\">Create an account</h2>\n");
      out.write("\n");
      out.write("                                    <form action=\"SignUp\" method=\"get\">\n");
      out.write("                                        <!--1- full name-->\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <label class=\"form-label\" for=\"username\">Full Name</label>\n");
      out.write("                                            <input type=\"text\" id=\"name\" name= \"name\" class=\"form-control form-control-lg\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--2- mail-->\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <label class=\"form-label\" for=\"email\">Your Email</label>\n");
      out.write("                                            <input type=\"email\" id=\"email\" name= \"mail\" class=\"form-control form-control-lg\" />\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--3- user-->\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <label class=\"form-label\" for=\"username\">Username</label>\n");
      out.write("                                            <input type=\"text\" id=\"user\" name= \"user\" class=\"form-control form-control-lg\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--4- pass-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <label class=\"form-label\" for=\"password\">Password</label>\n");
      out.write("                                            <input type=\"password\" id=\"pass\" name= \"pass\" class=\"form-control form-control-lg\" />\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <label class=\"form-label\" for=\"repeatpass\">Repeat your password</label>\n");
      out.write("                                            <input type=\"password\" id=\"repeatpass\" class=\"form-control form-control-lg\" />\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--5- date of birth-->    \n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <label class=\"form-label\" for=\"email\">Your date of birth</label>\n");
      out.write("                                            <input type=\"date\" id=\"dbo\" name= \"dbo\" class=\"form-control form-control-lg\" />\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-check d-flex justify-content-center mb-5\">\n");
      out.write("                                            <input class=\"form-check-input me-2\" type=\"checkbox\" value=\"\" id=\"form2Example3cg\" />\n");
      out.write("                                            <label class=\"form-check-label\" for=\"form2Example3g\">\n");
      out.write("                                                I agree all statements in <a href=\"#!\" class=\"text-body\"><u>Terms of service</u></a>\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"d-flex justify-content-center\">\n");
      out.write("                                            <input type=\"submit\"\n");
      out.write("                                                   class=\"btn btn-success btn-block     btn-lg gradient-custom-4 text-body\" value=\"Register\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"text-center text-muted mt-5 mb-0\">Have already an account? <a href=\"login.jsp\"\n");
      out.write("                                                                                                                class=\"fw-bold text-body\"><u>Login here</u>\n");
      out.write("                                            </a>\n");
      out.write("                                        </p>\n");
      out.write("                                        <span style=\"color: : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>                                                                     \n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
