package fbappservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

/**
 * Servlet implementation class HttpSession2
 */
public class HttpSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSession2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	   HttpSession session=request.getSession(false);
	   String  userid=(String) session.getAttribute("userid");
	   String  pass= (String) session.getAttribute("passid");
	   String  mob=(String) session.getAttribute("mobid");
	   PrintWriter out=response.getWriter();
	   out.println("<h1  username  is >"  +   userid  +"</h1>");
       out.println("<h1> password  is"  +  pass +  "</h1>");
       out.println("<h1> mobile  is"  +  mob +  "</h1>");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
