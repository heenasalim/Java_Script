package fbappservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MessageServlet
 */
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		PrintWriter  out=response.getWriter();
		//String  enter1=request.getParameter("post333");
		 System.out.println("connection  establishment");
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","java");
			System.out.println("got  driver");
			System.out.println("got  connection");
			String user=request.getParameter("user");
			 //String  pass=request.getParameter("pass");
			 //String  post1=request.getParameter("post333");
			 String  t=request.getParameter("te");
			// System.out.println("user" +  user);
			// System.out.println("pass"  +  pass);
			 //System.out.println("ppst  value  is"  + post1);
			 System.out.println("t  ur  message  is " + t);
			 PreparedStatement   psmt=con.prepareStatement("insert  into  MESSAGE1 values(?,?)");
			 psmt.setString(1,"heena");
			 psmt.setString(2, t);
			int  rs1= psmt.executeUpdate();
			System.out.println("database  updat  or  not0/1" +  rs1);
			 Statement  smt=con.createStatement();
			 ResultSet  rs=smt.executeQuery("select  * from  login");
//			 if(user.equals(rs.getString(1))  &&   pass.equals(rs.getString(2)) )
//			 {
//		    System.out.println("correct  username  and  password");
//		    RequestDispatcher  rd=request.getRequestDispatcher("home.html");
//		    rd.include(request,response);
//			//response.sendRedirect("home.html");
//			
//			 }
//			else 
//				if(!user.equals(rs.getString(1))&&  !pass.equals(rs.getString(2)))
			//  {
			// System.out.println("wrong  username  and  password");
			// response.sendRedirect("FACEBOOKGUI.html");
			//  RequestDispatcher  rd=request.getRequestDispatcher("FACEBOOKGUI.html");
			//    rd.include(request,response);
			  // } 
			 }
		
		 
		 catch(Exception  e ) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("got  driver");
//		System.out.println("got  connection");
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h1>yOUR  POST   IS </h1>");
//		out.println("<h1>" + enter1 + "</h1>");
//         
//		out.println("</body>");
//		out.println("</html>");
//		System.out.println("((((((((((((");
//		RequestDispatcher   rd=request.getRequestDispatcher("Profile");
//		rd.include(request, response);
//		out.close();
	
	}

}
