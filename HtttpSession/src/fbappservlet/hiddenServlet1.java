package fbappservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hiddenServlet1
 */
public class hiddenServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hiddenServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
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
		PrintWriter  out=response.getWriter();
		String  user=request.getParameter("user");
		String   pass=request.getParameter("pass");
		out.println("<html>");
		out.println("<body>");
		out.println("<form  action='hiddenServet2'   method='post' >");
		System.out.println("******************");
		out.println(" <input  type='hidden'  name='user'   value=" + user + "/>");
		out.println(" <input  type='hidden'  name='pass'   value=" + pass + "/>");
		out.println("<input  type='submit'   value='goheena' ");
		out.println("</form>");;
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
