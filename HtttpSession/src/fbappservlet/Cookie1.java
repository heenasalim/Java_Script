package fbappservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie1
 */
public class Cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie1() {
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
		
	//	<!!!!!   generating   cookie    >
		   String  user=request.getParameter("user");
		//   String  pass=request.getParameter("pass");
		   String  mobiles=request.getParameter("mob");
		   Cookie c=new Cookie("userid",user);
		   Cookie  s=  new   Cookie("password","password ='*******'");
		  Cookie  p=new  Cookie("mobieno",mobiles);
		  // Cookie  p=new  Cookie(mobiles, mobiles);
		   response.addCookie(s);
		   response.addCookie(c);
		   response.addCookie(p);
		   PrintWriter   out=response.getWriter();
		   out.println("<html>");
		   out.println("<body>");
		   out.println(" <form  action=Cookie2 method='post'  >" );
		   out.println("<input  type='submit'  name='  go'   value='goheena'/>");
		   out.println("</form>");
		   out.println("</body>");
		   out.println("</html>");
		  // out.println();
		   
		
		
	}

}
