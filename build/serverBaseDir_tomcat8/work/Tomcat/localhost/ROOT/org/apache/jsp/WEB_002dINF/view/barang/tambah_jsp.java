/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2018-06-09 09:12:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.barang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tambah_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1528485284000L));
    _jspx_dependants.put("jar:file:/home/rizki/Documents/RSIAHIKMAH/build/inplaceWebapp/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323233178000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.2.RELEASE-sources.jar", Long.valueOf(1528485284000L));
    _jspx_dependants.put("jar:file:/home/rizki/Documents/RSIAHIKMAH/build/inplaceWebapp/WEB-INF/lib/spring-webmvc-5.0.2.RELEASE-sources.jar!/META-INF/spring.tld", Long.valueOf(1511753084000L));
    _jspx_dependants.put("jar:file:/home/rizki/Documents/RSIAHIKMAH/build/inplaceWebapp/WEB-INF/lib/spring-webmvc-5.0.2.RELEASE-sources.jar!/META-INF/spring-form.tld", Long.valueOf(1511753084000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody;

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
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../app/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<section class=\"section\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<small>Keterangan : <span style=\"color:red\">*</span> Wajib Diisi</small>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ScriptBarang.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../app/footer.jsp", out, false);
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/view/barang/tambah.jsp(10,6) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("barangModel");
      // /WEB-INF/view/barang/tambah.jsp(10,6) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/view/barang/tambah.jsp(10,6) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("store");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<div class=\"row card-block\">\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"col-6\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Jenis Barang</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_form_005fradiobutton_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Obat</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_form_005fradiobutton_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Alat</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_form_005fradiobutton_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Jasa</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Kode</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control boxed form-control-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Nama Barang<span style=\"color:red\">*</span></label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control boxed form-control-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Satuan Terkecil<span style=\"color:red\">*</span></label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<select class=\"form-control boxed form-control-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<option>Option one</option>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<option>Option two</option>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<option>Option three</option>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<option>Option four</option>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"col-6\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Keterangan</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control boxed form-control-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Profit(%)<span style=\"color:red\">*</span></label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control boxed form-control-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Stok Minimal</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control boxed form-control-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Harga HET</label>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"input-group input-group-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">Rp</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">,00</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Harga Jual<span style=\"color:red\">*</span></label>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"input-group input-group-sm\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">Rp</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">,00</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t<div class=\"col col-12\" style=\"padding:0\">\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"card sameheight-item\" data-exclude=\"xs\" id=\"dashboard-history\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"card-header card-header-sm bordered\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"nav-link active\" href=\"#satuan\" role=\"tab\" data-toggle=\"tab\">Satuan Konversi</a>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"#detail\" role=\"tab\" data-toggle=\"tab\">Detail Paket</a>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"#jenis-pasien\" role=\"tab\" data-toggle=\"tab\">Untuk Jenis Pasien</a>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"#jasa\" role=\"tab\" data-toggle=\"tab\">Jasa</a>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"card-block\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-block\" style=\"background-color: #f4f4f4\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"table-responsive\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<table class=\"table table-sm table-striped table-bordered table-hover\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Satuan</th>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Nilai</th>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th>Satuan Default?</th>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tbody id=\"barang-list\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane fade\" id=\"detail\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"container-fluid\" style=\"padding:0\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<small>Kosong</small>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane fade\" id=\"jenis-pasien\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"container-fluid\" style=\"padding:0\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<small>Kosong</small>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane fade\" id=\"jasa\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"container-fluid\" style=\"padding:0\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<small>Kosong</small>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t<div class=\"container form-group\" style=\"float: right;background-color: #f5f5f5;margin-bottom:20px\">\r\n");
            out.write("\t\t\t\t\t<a href=\"v_barang_index.html\"><button type=\"button\" class=\"btn btn-danger d_pasien-button\">Batal</button></a>\r\n");
            out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary d_pasien-button\">Simpan</button>\r\n");
            out.write("\t\t\t\t</div>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t<div class=\"container\">\r\n");
            out.write("\t\t\t\t\t<div class=\"form-group\" style=\"float: right;\">\r\n");
            out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-sm btn-danger\">Hapus</button>\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fradiobutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_005fradiobutton_005f0 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    boolean _jspx_th_form_005fradiobutton_005f0_reused = false;
    try {
      _jspx_th_form_005fradiobutton_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fradiobutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/barang/tambah.jsp(17,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fradiobutton_005f0.setPath("IdJenisBarang");
      // /WEB-INF/view/barang/tambah.jsp(17,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fradiobutton_005f0.setValue("0");
      int[] _jspx_push_body_count_form_005fradiobutton_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fradiobutton_005f0 = _jspx_th_form_005fradiobutton_005f0.doStartTag();
        if (_jspx_th_form_005fradiobutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fradiobutton_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fradiobutton_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fradiobutton_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_form_005fradiobutton_005f0);
      _jspx_th_form_005fradiobutton_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fradiobutton_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fradiobutton_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fradiobutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_005fradiobutton_005f1 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    boolean _jspx_th_form_005fradiobutton_005f1_reused = false;
    try {
      _jspx_th_form_005fradiobutton_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005fradiobutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/barang/tambah.jsp(21,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fradiobutton_005f1.setPath("IdJenisBarang");
      // /WEB-INF/view/barang/tambah.jsp(21,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fradiobutton_005f1.setValue("1");
      int[] _jspx_push_body_count_form_005fradiobutton_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fradiobutton_005f1 = _jspx_th_form_005fradiobutton_005f1.doStartTag();
        if (_jspx_th_form_005fradiobutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fradiobutton_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fradiobutton_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fradiobutton_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_form_005fradiobutton_005f1);
      _jspx_th_form_005fradiobutton_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fradiobutton_005f1, _jsp_getInstanceManager(), _jspx_th_form_005fradiobutton_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fradiobutton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_005fradiobutton_005f2 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    boolean _jspx_th_form_005fradiobutton_005f2_reused = false;
    try {
      _jspx_th_form_005fradiobutton_005f2.setPageContext(_jspx_page_context);
      _jspx_th_form_005fradiobutton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/view/barang/tambah.jsp(25,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fradiobutton_005f2.setPath("IdJenisBarang");
      // /WEB-INF/view/barang/tambah.jsp(25,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fradiobutton_005f2.setValue("2");
      int[] _jspx_push_body_count_form_005fradiobutton_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fradiobutton_005f2 = _jspx_th_form_005fradiobutton_005f2.doStartTag();
        if (_jspx_th_form_005fradiobutton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fradiobutton_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fradiobutton_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fradiobutton_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_form_005fradiobutton_005f2);
      _jspx_th_form_005fradiobutton_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fradiobutton_005f2, _jsp_getInstanceManager(), _jspx_th_form_005fradiobutton_005f2_reused);
    }
    return false;
  }
}