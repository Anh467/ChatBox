package org.apache.jsp.communication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Vote;

public final class community_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 boolean voteCount;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Community</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylePost.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styledropdown.css\">\n");
      out.write("        <script src=\"scriptdropdown.js\"></script>\n");
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
      out.write("        <span id=\"uid\" vaule=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> ");
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
      out.write("                    <a href=\"../login.jsp\" class=\"login\"><span>Log in</span></a>\n");
      out.write("                    <a href=\"../signup.jsp\" class=\"btn\">Register</a>\n");
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
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- HTML code for displaying a post -->\n");
      out.write("        ");
      model.ListPost list = null;
      synchronized (_jspx_page_context) {
        list = (model.ListPost) _jspx_page_context.getAttribute("list", PageContext.PAGE_SCOPE);
        if (list == null){
          list = new model.ListPost();
          _jspx_page_context.setAttribute("list", list, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("post");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.post}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("            <div class=\"post ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getPostID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                <div class=\"iconPost\" onclick=\"toggleMenu(this)\">\n");
            out.write("                    <div class=\"sub-menu-wrap\">\n");
            out.write("                        <div class=\"sub-menu\">\n");
            out.write("                            <form action=\"../EditPost\" method=\"POST\">\n");
            out.write("                                <input type=\"text\" name=\"pid\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getPostID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" readonly style=\"display: none;\">\n");
            out.write("                                <button class=\"sub-menu-link edit-btn\" type=\"submit\" style=\"background: none; border: none\">\n");
            out.write("                                    <p class=\"pEdit\">EDIT</p>\n");
            out.write("                                </button>\n");
            out.write("                            </form>\n");
            out.write("                            <form action=\"../EditPost\" method=\"GET\">\n");
            out.write("                                <input type=\"text\" name=\"pid\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getPostID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" readonly style=\"display: none;\">\n");
            out.write("                                <button class=\"sub-menu-link\" style=\"background: none; border: none\" type=\"submit\">\n");
            out.write("                                    <p>DELETE</p>\n");
            out.write("                                </button>\n");
            out.write("                            </form>\n");
            out.write("                        </div>\n");
            out.write("                    </div>\n");
            out.write("                </div>\n");
            out.write("                <h2 class=\"post-title\">Problem ...</h2>\n");
            out.write("                <p class=\"post-author\">Posted by <span class=\"author-name\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getUname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</span></p>\n");
            out.write("                <p class=\"post-author\">Time <span class=\"author-name\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getPostDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</span></p>\n");
            out.write("                <!--<img src=\"post-image.jpg\" alt=\"Post Image\" class=\"post-image\">-->\n");
            out.write("                <p class=\"post-content\" style=\"display: block;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getPostContent()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\n");
            out.write("                <div class=\"post-actions\">\n");
            out.write("                    <button class=\"comment-btn\">Comment</button>\n");
            out.write("                </div>\n");
            out.write("                <div class=\"comment-input\" style=\"display: none;\">\n");
            out.write("                    <form action=\"../AddComment\" method=\"post\">\n");
            out.write("                        <input name=\"pid\" style=\"display: none;\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getPostID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                        <input name=\"comment\" type=\"text\" placeholder=\"Write your comment here...\">\n");
            out.write("                        <button class=\"submit-btn\" type=\"submit\">Submit</button>\n");
            out.write("                    </form>\n");
            out.write("                </div>\n");
            out.write("                <button class=\"view-comments-btn\">View Comments</button>\n");
            out.write("                <div class=\"comments\" style=\"display:none;\">\n");
            out.write("                    ");
            model.ListComment commentList = null;
            synchronized (_jspx_page_context) {
              commentList = (model.ListComment) _jspx_page_context.getAttribute("commentList", PageContext.PAGE_SCOPE);
              if (commentList == null){
                commentList = new model.ListComment();
                _jspx_page_context.setAttribute("commentList", commentList, PageContext.PAGE_SCOPE);
              }
            }
            out.write("\n");
            out.write("\n");
            out.write("                    ");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_c_forEach_1.setVar("comment");
            _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${commentList.getComment(post.getPostID())}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
              if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                        <div class=\"comment\">\n");
                  out.write("                            <div class=\"iconPost\" onclick=\"toggleMenu(this)\">\n");
                  out.write("                                <div class=\"sub-menu-wrap\">\n");
                  out.write("                                    <div class=\"sub-menu\">\n");
                  out.write("                                        <button class=\"sub-menu-link edit-btn\" style=\"background: none; border: none\" onclick=\"toggleEdit(this)\">\n");
                  out.write("                                            <p class=\"pEdit\">EDIT</p>\n");
                  out.write("                                        </button>\n");
                  out.write("                                        <form action=\"../EditComment\" method=\"POST\">\n");
                  out.write("                                            <button class=\"sub-menu-link save-btn\" style=\"background: none; border: none;\" hidden onclick=\"toggleSave(this)\">\n");
                  out.write("                                                <input style=\"display: none;\" name=\"comment-edit-cid\" value=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getCid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\n");
                  out.write("                                                <input style=\"display: none;\" class=\"comment-get\" name=\"comment-edit-contain\">\n");
                  out.write("                                                <p class=\"hiden pSave\">SAVE</p>\n");
                  out.write("                                            </button>\n");
                  out.write("                                        </form>\n");
                  out.write("                                        <form action=\"../EditComment\" method=\"GET\">\n");
                  out.write("                                            <input type=\"text\" name=\"cid\" value=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getCid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" readonly style=\"display: none;\">\n");
                  out.write("                                            <button class=\"sub-menu-link\" style=\"background: none; border: none\" type=\"submit\">\n");
                  out.write("                                                <p>DELETE</p>\n");
                  out.write("                                            </button>\n");
                  out.write("                                        </form>\n");
                  out.write("                                    </div>\n");
                  out.write("                                </div>\n");
                  out.write("                            </div>\n");
                  out.write("                            <p class=\"comment-content\" contenteditable=\"false\" onblur=\"updateInput(this)\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getcContent()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</p>\n");
                  out.write("                            <div class=\"comment-details\">\n");
                  out.write("                                <span class=\"comment-author\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getuName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</span>\n");
                  out.write("                                <span class=\"comment-time\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getcTime()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</span>\n");
                  out.write("\n");
                  out.write("                                ");
                  model.Comment cid = null;
                  synchronized (_jspx_page_context) {
                    cid = (model.Comment) _jspx_page_context.getAttribute("cid", PageContext.PAGE_SCOPE);
                    if (cid == null){
                      cid = new model.Comment();
                      _jspx_page_context.setAttribute("cid", cid, PageContext.PAGE_SCOPE);
                    }
                  }
                  out.write("\n");
                  out.write("                                ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("cid"), "cid", "${comment.getCid()}", _jspx_page_context, null);
                  out.write("\n");
                  out.write("                                ");
                  out.write("\n");
                  out.write("                                ");

                                    String uid2 = (String) session.getAttribute("id");
                                    String commentId = cid.getCid();
                                    voteCount = Vote.getVote(uid2, commentId);
                                    if (voteCount == true) {
                                
                  out.write("\n");
                  out.write("                                <button class=\"comment-ike-btnl like-btn\" data-comment-id=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getCid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" data-liked=\"");
                  out.print(voteCount);
                  out.write("\" >DisLike(<span class=\"vote-count\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getVoteCount()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</span>)</button>\n");
                  out.write("                                ");
} else {
                  out.write("\n");
                  out.write("                                <button class=\"comment-ike-btnl like-btn\" data-comment-id=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getCid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" data-liked=\"");
                  out.print(voteCount);
                  out.write("\" >Like(<span class=\"vote-count\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${comment.getVoteCount()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("</span>)</button>\n");
                  out.write("\n");
                  out.write("                                ");
}
                  out.write("\n");
                  out.write("\n");
                  out.write("                            </div>\n");
                  out.write("\n");
                  out.write("                        </div>\n");
                  out.write("                    ");
                  int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_forEach_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_forEach_1.doFinally();
              _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
            }
            out.write("\n");
            out.write("                </div>\n");
            out.write("            </div>\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("        <script src=\"scriptPost.js\"></script>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"top\">\n");
      out.write("                    <div class=\"logo-details\">\n");
      out.write("                        <i class=\"fab fa-slack\"></i>\n");
      out.write("                        <span class=\"logo_name\" style=\"color:white;\">IRCN V</span>\n");
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
}
