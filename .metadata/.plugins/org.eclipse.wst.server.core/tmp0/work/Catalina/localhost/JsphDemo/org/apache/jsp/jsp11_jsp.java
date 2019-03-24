package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsp11_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  int  i=0;int z; 
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("abc:lengthUser", pk.expressionlanguage.class, "lengthUser", new Class[] {java.lang.String.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("abc:heena", pk.oracle.class, "heena", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/taglib.tld");
    _jspx_dependants.add("/WEB-INF/customtag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxyz_005fabc_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxyz_005fabc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxyz_005fabc_005fnobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h1>jsp  11   file</h1>\r\n");
      out.write("<form action=\"jsp11.jsp\">\r\n");
      out.write("Enter  username:<input type=\"text\"  name=\"user\"  />\r\n");
      out.write("Enter  age<input  type=\"text\"   name=\"age\" />\r\n");
      out.write("<input  type=\"submit\"  name=\"signin\" />\r\n");
      out.write("</form>\r\n");
      out.write("<br/>\r\n");
      out.write("<b>length  of  user by  expression  tag (nethods) is:=</b>\r\n");
      out.write("<br/>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${abc:lengthUser(param.user)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<b>length  of  user by  custom tag  is:=</b>\r\n");
      out.write("\r\n");
      if (_jspx_meth_xyz_005fabc_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
 
for(i=0; i<10 ; i++)
{

      out.write('\r');
      out.write('\n');
      out.print( z=i*i+10 );
      out.write('	');
      out.write('\r');
      out.write('\n');
 
}


out.println("i is" + z);


      out.write("\r\n");
      out.write("<br/>\r\n");
      pkforjsp.Usebean11 u = null;
      synchronized (request) {
        u = (pkforjsp.Usebean11) _jspx_page_context.getAttribute("u", PageContext.REQUEST_SCOPE);
        if (u == null){
          u = new pkforjsp.Usebean11();
          _jspx_page_context.setAttribute("u", u, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("u"), request);
      out.write('\r');
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((pkforjsp.Usebean11)_jspx_page_context.findAttribute("u")).getUser())));
      out.write('\r');
      out.write('\n');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((pkforjsp.Usebean11)_jspx_page_context.findAttribute("u")).getAge())));
      out.write("\r\n");
      out.write("</br>\r\n");
 

String  k=u.getUser();

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<b> after  11  year </b>\r\n");
      out.write("<br/>\r\n");
      out.write("<h1>Age  of  person  is:</h1>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ abc:heena(param.user) }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
      out.write("\r\n");
      out.write("  <h1> u  can  open</h1>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_xyz_005fabc_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xyz:abc
    pk.demotaglib _jspx_th_xyz_005fabc_005f0 = (pk.demotaglib) _005fjspx_005ftagPool_005fxyz_005fabc_005fnobody.get(pk.demotaglib.class);
    _jspx_th_xyz_005fabc_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005fabc_005f0.setParent(null);
    int _jspx_eval_xyz_005fabc_005f0 = _jspx_th_xyz_005fabc_005f0.doStartTag();
    if (_jspx_th_xyz_005fabc_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxyz_005fabc_005fnobody.reuse(_jspx_th_xyz_005fabc_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fxyz_005fabc_005fnobody.reuse(_jspx_th_xyz_005fabc_005f0);
    return false;
  }
}
