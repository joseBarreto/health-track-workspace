/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2020-11-22 02:08:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1605989911440L));
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1606010840769L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1605989796303L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Google Font -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"src/plugins/datatables/css/dataTables.bootstrap4.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"src/styles/core.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"src/styles/icon-font.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"src/styles/style.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Site favicon -->\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\"\thref=\"src/images/favicon-32x32.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\"\thref=\"src/images/favicon-16x16.png\">\r\n");
      out.write("\r\n");
      out.write("<!-- Mobile Specific Metas -->\r\n");
      out.write("<meta name=\"viewport\"\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- Basic Page Info -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Health Track - Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<div class=\"header-left\">\r\n");
      out.write("\t\t<div class=\"menu-icon dw dw-menu\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"header-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"user-info-dropdown\">\r\n");
      out.write("\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t<a class=\"dropdown-toggle\" href=\"#\" role=\"button\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"> <span class=\"user-icon\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"src/images/photo1.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t</span> <span class=\"user-name\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getNm_nome() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-menu dropdown-menu-right dropdown-menu-icon-list\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"><i class=\"dw dw-user1\"></i>\r\n");
      out.write("\t\t\t\t\t\tPerfil</a> <a class=\"dropdown-item\" href=\"#\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"dw dw-settings2\"></i> Configurações</a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\"><i class=\"dw dw-help\"></i>\r\n");
      out.write("\t\t\t\t\t\tAjuda</a> <a class=\"dropdown-item\" href=\"login\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"dw dw-logout\"></i> Sair</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"right-sidebar\">\r\n");
      out.write("\t<div class=\"sidebar-title\">\r\n");
      out.write("\t\t<h3 class=\"weight-600 font-16 text-blue\">\r\n");
      out.write("\t\t\tLayout Settings <span class=\"btn-block font-weight-400 font-12\">User\r\n");
      out.write("\t\t\t\tInterface Settings</span>\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t\t<div class=\"close-sidebar\" data-toggle=\"right-sidebar-close\">\r\n");
      out.write("\t\t\t<i class=\"icon-copy ion-close-round\"></i>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"right-sidebar-body customscroll\">\r\n");
      out.write("\t\t<div class=\"right-sidebar-body-content\">\r\n");
      out.write("\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Header Background</h4>\r\n");
      out.write("\t\t\t<div class=\"sidebar-btn-group pb-30 mb-10\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-outline-primary header-white active\">White</a> <a\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-outline-primary header-dark\">Dark</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Sidebar Background</h4>\r\n");
      out.write("\t\t\t<div class=\"sidebar-btn-group pb-30 mb-10\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-outline-primary sidebar-light \">White</a> <a\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0);\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-outline-primary sidebar-dark active\">Dark</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Menu Dropdown Icon</h4>\r\n");
      out.write("\t\t\t<div class=\"sidebar-radio-group pb-10 mb-10\">\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebaricon-1\" name=\"menu-dropdown-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-style-1\" checked=\"\">\r\n");
      out.write("\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebaricon-1\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-down\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebaricon-2\" name=\"menu-dropdown-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-style-2\"> <label\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-label\" for=\"sidebaricon-2\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"ion-plus-round\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebaricon-3\" name=\"menu-dropdown-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-style-3\"> <label\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-label\" for=\"sidebaricon-3\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-angle-double-right\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h4 class=\"weight-600 font-18 pb-10\">Menu List Icon</h4>\r\n");
      out.write("\t\t\t<div class=\"sidebar-radio-group pb-30 mb-10\">\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebariconlist-1\" name=\"menu-list-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-list-style-1\" checked=\"\">\r\n");
      out.write("\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-1\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"ion-minus-round\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebariconlist-2\" name=\"menu-list-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-list-style-2\"> <label\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-label\" for=\"sidebariconlist-2\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-circle-o\" aria-hidden=\"true\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebariconlist-3\" name=\"menu-list-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-list-style-3\"> <label\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-label\" for=\"sidebariconlist-3\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"dw dw-check\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebariconlist-4\" name=\"menu-list-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-list-style-4\" checked=\"\">\r\n");
      out.write("\t\t\t\t\t<label class=\"custom-control-label\" for=\"sidebariconlist-4\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-copy dw dw-next-2\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebariconlist-5\" name=\"menu-list-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-list-style-5\"> <label\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-label\" for=\"sidebariconlist-5\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"dw dw-fast-forward-1\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sidebariconlist-6\" name=\"menu-list-icon\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-input\" value=\"icon-list-style-6\"> <label\r\n");
      out.write("\t\t\t\t\t\tclass=\"custom-control-label\" for=\"sidebariconlist-6\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"dw dw-next\"></i></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"reset-options pt-30 text-center\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-danger\" id=\"reset-settings\">Reset\r\n");
      out.write("\t\t\t\t\tSettings</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"left-side-bar\">\r\n");
      out.write("\t<div class=\"brand-logo\">\r\n");
      out.write("\t\t<a href=\"index.html\"> <img src=\"src/images/deskapp-logo.svg\"\r\n");
      out.write("\t\t\talt=\"\" class=\"dark-logo\"> <img\r\n");
      out.write("\t\t\tsrc=\"src/images/deskapp-logo.svg\" alt=\"\" class=\"light-logo\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<div class=\"close-sidebar\" data-toggle=\"left-sidebar-close\">\r\n");
      out.write("\t\t\t<i class=\"ion-close-round\"></i>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"menu-block customscroll\">\r\n");
      out.write("\t\t<div class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t<ul id=\"accordion-menu\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\" class=\"dropdown-toggle no-arrow\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"micon dw dw-house-1\"></span><span class=\"mtext\">Home</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\"> <span class=\"micon dw dw-library\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"mtext\">Batimentos</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"submenu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"heartBeats\">Listagem</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"heart-beats-register.jsp\">Cadastro</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\"> <span class=\"micon dw dw-library\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"mtext\">Peso</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"submenu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"weightControl\">Listagem</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"weight-control-register.jsp\">Cadastro</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mobile-menu-overlay\"></div>");
      out.write("\r\n");
      out.write("\t<div class=\"pre-loader\">\r\n");
      out.write("\t\t<div class=\"pre-loader-box\">\r\n");
      out.write("\t\t\t<div class=\"loader-logo\">\r\n");
      out.write("\t\t\t\t<img src=\"src/images/deskapp-logo.svg\" alt=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class='loader-progress' id=\"progress_div\">\r\n");
      out.write("\t\t\t\t<div class='bar' id='bar1'></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class='percent' id='percent1'>0%</div>\r\n");
      out.write("\t\t\t<div class=\"loading-text\">Carregando...</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main-container\">\r\n");
      out.write("\t\t<div class=\"pd-ltr-20\">\r\n");
      out.write("\t\t\t<div class=\"card-box pd-20 height-100-p mb-30\">\r\n");
      out.write("\t\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"src/images/banner-img.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"font-20 weight-500 mb-10 text-capitalize\">\r\n");
      out.write("\t\t\t\t\t\t\tBem vindo de volta\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"weight-600 font-30 text-blue\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getNm_nome() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"font-18 max-width-600\">\r\n");
      out.write("\t\t\t\t\t\t\t\"É melhor você tentar algo, vê-lo não funcionar e aprender com\r\n");
      out.write("\t\t\t\t\t\t\tisso, do que não fazer nada.\" </br> </br> <i>Mark Zuckerberg</i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-3 mb-30\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-box height-100-p widget-style1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex flex-wrap align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"chart\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h4 mb-0\">2020</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"weight-600 font-14\">Passos dados</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-3 mb-30\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-box height-100-p widget-style1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex flex-wrap align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"chart2\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h4 mb-0\">2</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"weight-600 font-14\">Quilômetros Percorrido</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-3 mb-30\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-box height-100-p widget-style1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex flex-wrap align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"chart3\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h4 mb-0\">350</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"weight-600 font-14\">Calorias gastas</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-3 mb-30\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-box height-100-p widget-style1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex flex-wrap align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"chart4\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h4 mb-0\">102</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"weight-600 font-14\">Quilos</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-8 mb-30\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-box height-100-p pd-20\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"h4 mb-20\">Atividades</h2>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"chart5\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-4 mb-30\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-box height-100-p pd-20\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"h4 mb-20\">Meta</h2>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"chart6\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"footer-wrap pd-20 mb-20 card-box\">Health Track -\r\n");
      out.write("\t\t\t\tTodos os direitos reservados - 2020</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("<script src=\"src/scripts/core.js\"></script>\r\n");
      out.write("<script src=\"src/scripts/script.min.js\"></script> \r\n");
      out.write("<script src=\"src/scripts/core.min.js\"></script>\r\n");
      out.write("<script src=\"src/scripts/script.js\"></script>\r\n");
      out.write("<script src=\"src/scripts/process.js\"></script>\r\n");
      out.write("<script src=\"src/scripts/layout-settings.js\"></script> \r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"src/scripts/core.js\"></script>\r\n");
      out.write("<script src=\"src/scripts/script.min.js\"></script>\r\n");
      out.write("<script src=\"src/scripts/process.js\"></script>\r\n");
      out.write("<script src=\"src/scripts/layout-settings.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"src/plugins/apexcharts/apexcharts.min.js\"></script>\r\n");
      out.write("\t<script src=\"src/plugins/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t<script src=\"src/plugins/datatables/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\t<script src=\"src/plugins/datatables/js/dataTables.responsive.min.js\"></script>\r\n");
      out.write("\t<script src=\"src/plugins/datatables/js/responsive.bootstrap4.min.js\"></script>\r\n");
      out.write("\t<script src=\"src/scripts/dashboard.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
