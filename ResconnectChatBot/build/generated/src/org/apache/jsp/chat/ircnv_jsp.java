package org.apache.jsp.chat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.BoxChatInfor;

public final class ircnv_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Chatbot</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/axios/1.2.3/axios.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function clearboxchat() {\n");
      out.write("                \n");
      out.write("                $.ajax({\n");
      out.write("                    url: '/ResconnectChatBot/Clear',\n");
      out.write("                    type: 'get',\n");
      out.write("                    data: {\n");
      out.write("                        id: uid\n");
      out.write("                    },\n");
      out.write("                    success: function (result) {\n");
      out.write("                        messages.innerHTML = \"\";\n");
      out.write("                    },\n");
      out.write("                    error: function (xhr) {\n");
      out.write("                        alert(\"st wrong\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            @import url(\"https://fonts.googleapis.com/css2?family=Karla:wght@300;400;500;600;700&display=swap\");\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: \"Karla\", sans-serif;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 20vh;\n");
      out.write("                background-image: url(back.jpg);\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                padding-top: 35px;\n");
      out.write("                padding-left: 8%;\n");
      out.write("                padding-right: 8%;\n");
      out.write("            }\n");
      out.write("            nav {\n");
      out.write("                padding: 10px 0;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            .logo a {\n");
      out.write("                font-size: 40px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            span {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            nav ul li {\n");
      out.write("                display: inline-block;\n");
      out.write("                list-style: none;\n");
      out.write("                margin: 10px 15px;\n");
      out.write("            }\n");
      out.write("            nav ul li a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                transition: 0.5s;\n");
      out.write("            }\n");
      out.write("            nav ul li a:hover {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .login {\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-right: 15px;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .btn {\n");
      out.write("                background: #000;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                padding: 9px 25px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                font-size: 18px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            footer {\n");
      out.write("                background: #140b5c;\n");
      out.write("                width: 100%;\n");
      out.write("                bottom: 0;\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("            footer::before {\n");
      out.write("                content: \"\";\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                top: 100px;\n");
      out.write("                height: 1px;\n");
      out.write("                width: 100%;\n");
      out.write("                background: #afafb6;\n");
      out.write("            }\n");
      out.write("            footer .content {\n");
      out.write("                max-width: 1250px;\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 30px 40px 40px 40px;\n");
      out.write("            }\n");
      out.write("            footer .content .top {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("            }\n");
      out.write("            .content .top .logo-details {\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .content .top .media-icons {\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("            .content .top .media-icons a {\n");
      out.write("                height: 40px;\n");
      out.write("                width: 40px;\n");
      out.write("                margin: 0 8px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                text-align: center;\n");
      out.write("                line-height: 40px;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 17px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                transition: all 0.4s ease;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(1) {\n");
      out.write("                background: #4267b2;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(1):hover {\n");
      out.write("                color: #4267b2;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(2) {\n");
      out.write("                background: #1da1f2;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(2):hover {\n");
      out.write("                color: #1da1f2;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(3) {\n");
      out.write("                background: #e1306c;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(3):hover {\n");
      out.write("                color: #e1306c;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(4) {\n");
      out.write("                background: #0077b5;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(4):hover {\n");
      out.write("                color: #0077b5;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(5) {\n");
      out.write("                background: #ff0000;\n");
      out.write("            }\n");
      out.write("            .top .media-icons a:nth-child(5):hover {\n");
      out.write("                color: #ff0000;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            footer .content .link-boxes {\n");
      out.write("                width: 100%;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            footer .content .link-boxes .box {\n");
      out.write("                width: calc(100% / 5 - 10px);\n");
      out.write("            }\n");
      out.write("            .content .link-boxes .box .link_name {\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: 400;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .link-boxes .box .link_name::before {\n");
      out.write("                content: \"\";\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: -2px;\n");
      out.write("                height: 2px;\n");
      out.write("                width: 35px;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .content .link-boxes .box li {\n");
      out.write("                margin: 6px 0;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .content .link-boxes .box li a {\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 400;\n");
      out.write("                text-decoration: none;\n");
      out.write("                opacity: 0.8;\n");
      out.write("                transition: all 0.4s ease;\n");
      out.write("            }\n");
      out.write("            .content .link-boxes .box li a:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .content .link-boxes .input-box {\n");
      out.write("                margin-right: 55px;\n");
      out.write("            }\n");
      out.write("            .link-boxes .input-box input {\n");
      out.write("                height: 40px;\n");
      out.write("                width: calc(100% + 55px);\n");
      out.write("                outline: none;\n");
      out.write("                border: 2px solid #afafb6;\n");
      out.write("                background: #140b5c;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                padding: 0 15px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: #fff;\n");
      out.write("                margin-top: 5px;\n");
      out.write("            }\n");
      out.write("            .link-boxes .input-box input::placeholder {\n");
      out.write("                color: #afafb6;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            .link-boxes .input-box input[type=\"button\"] {\n");
      out.write("                background: #fff;\n");
      out.write("                color: #140b5c;\n");
      out.write("                border: none;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                margin: 4px 0;\n");
      out.write("                opacity: 0.8;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: all 0.4s ease;\n");
      out.write("            }\n");
      out.write("            .input-box input[type=\"button\"]:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            footer .bottom-details {\n");
      out.write("                width: 100%;\n");
      out.write("                background: #0f0844;\n");
      out.write("            }\n");
      out.write("            footer .bottom-details .bottom_text {\n");
      out.write("                max-width: 1250px;\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 20px 40px;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            .bottom-details .bottom_text span,\n");
      out.write("            .bottom-details .bottom_text a {\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                color: #fff;\n");
      out.write("                opacity: 0.8;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .bottom-details .bottom_text a:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .bottom-details .bottom_text a {\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            @media (max-width: 900px) {\n");
      out.write("                footer .content .link-boxes {\n");
      out.write("                    flex-wrap: wrap;\n");
      out.write("                }\n");
      out.write("                footer .content .link-boxes .input-box {\n");
      out.write("                    width: 40%;\n");
      out.write("                    margin-top: 10px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 700px) {\n");
      out.write("                footer {\n");
      out.write("                    position: relative;\n");
      out.write("                }\n");
      out.write("                .content .top .logo-details {\n");
      out.write("                    font-size: 26px;\n");
      out.write("                }\n");
      out.write("                .content .top .media-icons a {\n");
      out.write("                    height: 35px;\n");
      out.write("                    width: 35px;\n");
      out.write("                    font-size: 14px;\n");
      out.write("                    line-height: 35px;\n");
      out.write("                }\n");
      out.write("                footer .content .link-boxes .box {\n");
      out.write("                    width: calc(100% / 3 - 10px);\n");
      out.write("                }\n");
      out.write("                footer .content .link-boxes .input-box {\n");
      out.write("                    width: 60%;\n");
      out.write("                }\n");
      out.write("                .bottom-details .bottom_text span,\n");
      out.write("                .bottom-details .bottom_text a {\n");
      out.write("                    font-size: 12px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 520px) {\n");
      out.write("                footer::before {\n");
      out.write("                    top: 145px;\n");
      out.write("                }\n");
      out.write("                footer .content .top {\n");
      out.write("                    flex-direction: column;\n");
      out.write("                }\n");
      out.write("                .content .top .media-icons {\n");
      out.write("                    margin-top: 16px;\n");
      out.write("                }\n");
      out.write("                footer .content .link-boxes .box {\n");
      out.write("                    width: calc(100% / 2 - 10px);\n");
      out.write("                }\n");
      out.write("                footer .content .link-boxes .input-box {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String uid = (String) session.getAttribute("id");
            if ((uid == null) || (uid.equals(""))) {
                request.setAttribute("notlogin", "block");
                request.setAttribute("login", "none");
            } else {
                request.setAttribute("notlogin", "none");
                request.setAttribute("login", "flex");
            }
            request.setAttribute("uid", uid);
        
      out.write("\n");
      out.write("        <span style=\"display: none\" id=\"uid\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("        <div class=\"container header\">\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"../index.jsp\"><span>IRCN  V</a>\n");
      out.write("                </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../index.jsp\"><span>Home</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><span>About</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><span>Services</span></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"buttons\" style=\"display: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notlogin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <a href=\"login.jsp\" class=\"login\"><span>Log in</span></a>\n");
      out.write("                    <a href=\"#\" class=\"btn\">Register</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"buttons\" style=\"display: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <i class=\"fa-solid fa-user fa-3x\"></i>\n");
      out.write("                    <form style=\"margin-left: 10px\" action=\"../CheckLogin\" method=\"post\">\n");
      out.write("                        <input class=\"btn\" type=\"submit\" value=\"Log out\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("            \n");
      out.write("        ");
      model.API api = null;
      synchronized (_jspx_page_context) {
        api = (model.API) _jspx_page_context.getAttribute("api", PageContext.PAGE_SCOPE);
        if (api == null){
          api = new model.API();
          _jspx_page_context.setAttribute("api", api, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("            <div id=\"chat-window\">\n");
      out.write("\n");
      out.write("                <div class=\"main-title\">CHAT BOT IRCN V WITH CHAT-GPT</div>\n");
      out.write("                <div id=\"chat-messages\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <form id=\"chat-form\">\n");
      out.write("                <input\n");
      out.write("                    type=\"text\"\n");
      out.write("                    id=\"chat-input\"\n");
      out.write("                    autocomplete=\"off\"\n");
      out.write("                    placeholder=\"Type your message here\"\n");
      out.write("                    required\n");
      out.write("                    />\n");
      out.write("                <button type=\"submit\">Send</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <button onclick=\"clearboxchat()\">Clear Boxchat</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"app.js\"></script>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"top\">\n");
      out.write("                    <div class=\"logo-details\">\n");
      out.write("                        <i class=\"fab fa-slack\"></i>\n");
      out.write("                        <span class=\"logo_name\" style=\"color=white;\">IRCN V</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-icons\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"link-boxes\">\n");
      out.write("                    <ul class=\"box\">\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"#\">About us</a></li>\n");
      out.write("                        <li><a href=\"#\">Get started</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"box\">\n");
      out.write("                        <li class=\"link_name\">Services</li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"box\">\n");
      out.write("                        <li class=\"link_name\">Account</li>\n");
      out.write("                        <li><a href=\"#\">Profile</a></li>\n");
      out.write("                        <li><a href=\"#\">My account</a></li>\n");
      out.write("                        <li><a href=\"#\">Prefrences</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"box\">\n");
      out.write("                        <li class=\"link_name\">CHAT BOT</li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"box input-box\">\n");
      out.write("                        <li class=\"link_name\">Subscribe</li>\n");
      out.write("                        <li><input type=\"text\" placeholder=\"Enter your email\" /></li>\n");
      out.write("                        <li><input type=\"button\" value=\"Subscribe\" /></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bottom-details\">\n");
      out.write("                <div class=\"bottom_text\">\n");
      out.write("                    <span class=\"copyright_text\">Copyright Â© 2023 <a href=\"#\">IRCN V.</a>All rights reserved</span>\n");
      out.write("                    <span class=\"policy_terms\">\n");
      out.write("                        <a href=\"#\">Privacy policy</a>\n");
      out.write("                        <a href=\"#\">Terms & condition</a>\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("id_user");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("ele");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${api.getChatText(uid)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div>\n");
          out.write("                            <div class=\"message user-message\">\n");
          out.write("                                <img src=\"icons/user.png\" alt=\"user icon\">\n");
          out.write("                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ele.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"message bot-message\">\n");
          out.write("                                <img src=\"icons/chatbot.png\" alt=\"bot icon\">\n");
          out.write("                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ele.getChat()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
