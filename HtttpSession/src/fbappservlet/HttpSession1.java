package fbappservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSession1
 */
public class HttpSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSession1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      HttpSession  sesion=request.getSession(true);
      String user=request.getParameter("user");
      String pass=request.getParameter("pass");
      String mob=request.getParameter("mob");
      sesion.setAttribute("userid",user);
      
      sesion.setAttribute("passid",pass);
      sesion.setAttribute("mobid", mob);
  
      sesion.setAttribute("email", "2688188191");
      sesion.getAttribute("email");
      
      String  email=(String) sesion.getAttribute("email");
      PrintWriter  out=response.getWriter();
      
      out.print("<h1>  email  id    is :=" + email + "</h1>");
      out.println("<html>");
      out.println("<body>");
      out.println("<form  action='HttpSession2' method='get' > ");
      out.println("<input  type='submit'  value='gohttpsesion2'/ >");
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
      
      
	}

}
