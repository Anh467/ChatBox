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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Chatbot</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("        <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\r\n");
      out.write("            integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\r\n");
      out.write("            crossorigin=\"anonymous\"\r\n");
      out.write("            referrerpolicy=\"no-referrer\"\r\n");
      out.write("            />\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/axios/1.2.3/axios.min.js\"></script>\r\n");
      out.write("\r\n");
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
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("            a {\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("            footer {\r\n");
      out.write("                background: #140b5c;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                bottom: 0;\r\n");
      out.write("                left: 0;\r\n");
      out.write("            }\r\n");
      out.write("            footer::before {\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0;\r\n");
      out.write("                top: 100px;\r\n");
      out.write("                height: 1px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                background: #afafb6;\r\n");
      out.write("            }\r\n");
      out.write("            footer .content {\r\n");
      out.write("                max-width: 1250px;\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                padding: 30px 40px 40px 40px;\r\n");
      out.write("            }\r\n");
      out.write("            footer .content .top {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("                margin-bottom: 50px;\r\n");
      out.write("            }\r\n");
      out.write("            .content .top .logo-details {\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("            }\r\n");
      out.write("            .content .top .media-icons {\r\n");
      out.write("                display: flex;\r\n");
      out.write("            }\r\n");
      out.write("            .content .top .media-icons a {\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                width: 40px;\r\n");
      out.write("                margin: 0 8px;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                line-height: 40px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-size: 17px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                transition: all 0.4s ease;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(1) {\r\n");
      out.write("                background: #4267b2;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(1):hover {\r\n");
      out.write("                color: #4267b2;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(2) {\r\n");
      out.write("                background: #1da1f2;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(2):hover {\r\n");
      out.write("                color: #1da1f2;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(3) {\r\n");
      out.write("                background: #e1306c;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(3):hover {\r\n");
      out.write("                color: #e1306c;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(4) {\r\n");
      out.write("                background: #0077b5;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(4):hover {\r\n");
      out.write("                color: #0077b5;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(5) {\r\n");
      out.write("                background: #ff0000;\r\n");
      out.write("            }\r\n");
      out.write("            .top .media-icons a:nth-child(5):hover {\r\n");
      out.write("                color: #ff0000;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            footer .content .link-boxes {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("            }\r\n");
      out.write("            footer .content .link-boxes .box {\r\n");
      out.write("                width: calc(100% / 5 - 10px);\r\n");
      out.write("            }\r\n");
      out.write("            .content .link-boxes .box .link_name {\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                position: relative;\r\n");
      out.write("            }\r\n");
      out.write("            .link-boxes .box .link_name::before {\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0;\r\n");
      out.write("                bottom: -2px;\r\n");
      out.write("                height: 2px;\r\n");
      out.write("                width: 35px;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .content .link-boxes .box li {\r\n");
      out.write("                margin: 6px 0;\r\n");
      out.write("                list-style: none;\r\n");
      out.write("            }\r\n");
      out.write("            .content .link-boxes .box li a {\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                opacity: 0.8;\r\n");
      out.write("                transition: all 0.4s ease;\r\n");
      out.write("            }\r\n");
      out.write("            .content .link-boxes .box li a:hover {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("            }\r\n");
      out.write("            .content .link-boxes .input-box {\r\n");
      out.write("                margin-right: 55px;\r\n");
      out.write("            }\r\n");
      out.write("            .link-boxes .input-box input {\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                width: calc(100% + 55px);\r\n");
      out.write("                outline: none;\r\n");
      out.write("                border: 2px solid #afafb6;\r\n");
      out.write("                background: #140b5c;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                padding: 0 15px;\r\n");
      out.write("                font-size: 15px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                margin-top: 5px;\r\n");
      out.write("            }\r\n");
      out.write("            .link-boxes .input-box input::placeholder {\r\n");
      out.write("                color: #afafb6;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("            }\r\n");
      out.write("            .link-boxes .input-box input[type=\"button\"] {\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                color: #140b5c;\r\n");
      out.write("                border: none;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-weight: 500;\r\n");
      out.write("                margin: 4px 0;\r\n");
      out.write("                opacity: 0.8;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                transition: all 0.4s ease;\r\n");
      out.write("            }\r\n");
      out.write("            .input-box input[type=\"button\"]:hover {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("            }\r\n");
      out.write("            footer .bottom-details {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                background: #0f0844;\r\n");
      out.write("            }\r\n");
      out.write("            footer .bottom-details .bottom_text {\r\n");
      out.write("                max-width: 1250px;\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                padding: 20px 40px;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("            }\r\n");
      out.write("            .bottom-details .bottom_text span,\r\n");
      out.write("            .bottom-details .bottom_text a {\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                opacity: 0.8;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("            .bottom-details .bottom_text a:hover {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("            }\r\n");
      out.write("            .bottom-details .bottom_text a {\r\n");
      out.write("                margin-right: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            @media (max-width: 900px) {\r\n");
      out.write("                footer .content .link-boxes {\r\n");
      out.write("                    flex-wrap: wrap;\r\n");
      out.write("                }\r\n");
      out.write("                footer .content .link-boxes .input-box {\r\n");
      out.write("                    width: 40%;\r\n");
      out.write("                    margin-top: 10px;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            @media (max-width: 700px) {\r\n");
      out.write("                footer {\r\n");
      out.write("                    position: relative;\r\n");
      out.write("                }\r\n");
      out.write("                .content .top .logo-details {\r\n");
      out.write("                    font-size: 26px;\r\n");
      out.write("                }\r\n");
      out.write("                .content .top .media-icons a {\r\n");
      out.write("                    height: 35px;\r\n");
      out.write("                    width: 35px;\r\n");
      out.write("                    font-size: 14px;\r\n");
      out.write("                    line-height: 35px;\r\n");
      out.write("                }\r\n");
      out.write("                footer .content .link-boxes .box {\r\n");
      out.write("                    width: calc(100% / 3 - 10px);\r\n");
      out.write("                }\r\n");
      out.write("                footer .content .link-boxes .input-box {\r\n");
      out.write("                    width: 60%;\r\n");
      out.write("                }\r\n");
      out.write("                .bottom-details .bottom_text span,\r\n");
      out.write("                .bottom-details .bottom_text a {\r\n");
      out.write("                    font-size: 12px;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            @media (max-width: 520px) {\r\n");
      out.write("                footer::before {\r\n");
      out.write("                    top: 145px;\r\n");
      out.write("                }\r\n");
      out.write("                footer .content .top {\r\n");
      out.write("                    flex-direction: column;\r\n");
      out.write("                }\r\n");
      out.write("                .content .top .media-icons {\r\n");
      out.write("                    margin-top: 16px;\r\n");
      out.write("                }\r\n");
      out.write("                footer .content .link-boxes .box {\r\n");
      out.write("                    width: calc(100% / 2 - 10px);\r\n");
      out.write("                }\r\n");
      out.write("                footer .content .link-boxes .input-box {\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
        
      out.write("\r\n");
      out.write("        <span id=\"uid\" vaule=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("        <div class=\"container header\">\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"../index.jsp\"><span>IRCN  V</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"../index.jsp\"><span>Home</span></a>\r\n");
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
      out.write("                    <a href=\"../login.jsp\" class=\"login\"><span>Log in</span></a>\r\n");
      out.write("                    <a href=\"../signup.jsp\" class=\"btn\">Register</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"buttons\" style=\"display: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <i class=\"fa-solid fa-user fa-3x\"></i>\r\n");
      out.write("                    <form style=\"margin-left: 10px\" action=\"../CheckLogin\" method=\"post\">\r\n");
      out.write("                        <input class=\"btn\" type=\"submit\" value=\"Log out\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"scriptdropdown.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styledropdown.css\"/>\r\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("            \r\n");
      out.write("        ");
      model.API api = null;
      synchronized (_jspx_page_context) {
        api = (model.API) _jspx_page_context.getAttribute("api", PageContext.PAGE_SCOPE);
        if (api == null){
          api = new model.API();
          _jspx_page_context.setAttribute("api", api, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("            <div id=\"chat-window\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"main-title\">CHAT BOT IRCN V WITH CHAT-GPT</div>\r\n");
      out.write("                <div id=\"chat-messages\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <form id=\"chat-form\">\r\n");
      out.write("                <input\r\n");
      out.write("                    type=\"text\"\r\n");
      out.write("                    id=\"chat-input\"\r\n");
      out.write("                    autocomplete=\"off\"\r\n");
      out.write("                    placeholder=\"Type your message here\"\r\n");
      out.write("                    required\r\n");
      out.write("                    />\r\n");
      out.write("                <button type=\"submit\">Send</button>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <button id=\"clear\">Clear Boxchat</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            const clearboxchat = document.getElementById(\"clear\");\r\n");
      out.write("            const message = document.getElementById(\"chat-messages\");\r\n");
      out.write("            clearboxchat.addEventListener(\"click\", function () {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: '/ResconnectChatBot/Clear',\r\n");
      out.write("                    type: 'get',\r\n");
      out.write("                    data: {id: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\r\n");
      out.write("                    },\r\n");
      out.write("                    success: function (result) {\r\n");
      out.write("                        message.innerHTML = \"\";\r\n");
      out.write("                    },\r\n");
      out.write("                    error: function (xhr) {\r\n");
      out.write("                        alert(\"st wrong\");\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("            function openNewWindow(st, para)\r\n");
      out.write("            {\r\n");
      out.write("                //   window.open(\"https://www.w3schools.com\");\r\n");
      out.write("                window.open(st + para, \"\", \"width=600px; height=400;\");\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"app.js\"></script>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"top\">\r\n");
      out.write("                    <div class=\"logo-details\">\r\n");
      out.write("                        <i class=\"fab fa-slack\"></i>\r\n");
      out.write("                        <span class=\"logo_name\" style=\"color:white;\">IRCN V</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"media-icons\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"link-boxes\">\r\n");
      out.write("                    <ul class=\"box\">\r\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact us</a></li>\r\n");
      out.write("                        <li><a href=\"#\">About us</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Get started</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"box\">\r\n");
      out.write("                        <li class=\"link_name\">Services</li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"box\">\r\n");
      out.write("                        <li class=\"link_name\">Account</li>\r\n");
      out.write("                        <li><a href=\"#\">Profile</a></li>\r\n");
      out.write("                        <li><a href=\"#\">My account</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Prefrences</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"box\">\r\n");
      out.write("                        <li class=\"link_name\">CHAT BOT</li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                        <li><a href=\"#\">App design 1</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"box input-box\">\r\n");
      out.write("                        <li class=\"link_name\">Subscribe</li>\r\n");
      out.write("                        <li><input type=\"text\" placeholder=\"Enter your email\" /></li>\r\n");
      out.write("                        <li><input type=\"button\" value=\"Subscribe\" /></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bottom-details\">\r\n");
      out.write("                <div class=\"bottom_text\">\r\n");
      out.write("                    <span class=\"copyright_text\">Copyright Â© 2023 <a href=\"#\">IRCN V.</a>All rights reserved</span>\r\n");
      out.write("                    <span class=\"policy_terms\">\r\n");
      out.write("                        <a href=\"#\">Privacy policy</a>\r\n");
      out.write("                        <a href=\"#\">Terms & condition</a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
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
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
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
          out.write("\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <div class=\"message user-message\">\r\n");
          out.write("                                <img src=\"icons/user.png\" alt=\"user icon\">\r\n");
          out.write("                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ele.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"message bot-message\" style=\"position: relative;\">\r\n");
          out.write("                                <img src=\"icons/chatbot.png\" alt=\"bot icon\">\r\n");
          out.write("                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ele.getChat()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                <div class=\"iconPost\" onclick=\"toggleMenu(this)\">\r\n");
          out.write("                                    <div class=\"sub-menu-wrap\">\r\n");
          out.write("                                        <div class=\"sub-menu\">\r\n");
          out.write("                                            <form action=\"../PostTo\" method=\"POST\">\r\n");
          out.write("                                                <input type=\"text\" name=\"userChat\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ele.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly style=\"display: none;\">\r\n");
          out.write("                                                <input type=\"text\" name=\"botChat\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ele.getChat()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly style=\"display: none;\">\r\n");
          out.write("                                                <button class=\"sub-menu-link\" style=\"background: none; border: none\" type=\"submit\">\r\n");
          out.write("                                                    <p>POST</p>\r\n");
          out.write("                                                </button>\r\n");
          out.write("                                            </form>\r\n");
          out.write("\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>   \r\n");
          out.write("\r\n");
          out.write("                        </div>\r\n");
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
