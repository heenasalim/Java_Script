package fbappservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fbuser2servlet
 */
public class Fbuser2servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fbuser2servlet() {
        super();
        // TODO Auto-generated constructor stub
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter  out=response.getWriter();
		String  enter1=request.getParameter("post333");
		 System.out.println("connection  establishment");
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","java");
			System.out.println("got  driver");
			System.out.println("got  connection");
			String user=request.getParameter("user");
			String  pass=request.getParameter("pass");
			String   fname=request.getParameter("heena");
			String  mesg=request.getParameter("mesg");
			 String  post1=request.getParameter("post333");
			 String  t=request.getParameter("te");
		      System.out.println("user" +  user);
		      System.out.println("pass"  +  pass);
			 System.out.println("ppst  value  is"  + post1);
         	 System.out.println("  selected  value is " + fname );
    		 PreparedStatement   psmt=con.prepareStatement("insert  into  messages values(?)");
         	 psmt.setString(1,"heena");
		 	  int  rs1= psmt.executeUpdate();
          	 	System.out.println("database  updat  or  not0/1" +  rs1);
          	 	
			 Statement  smt=con.createStatement();
			 ResultSet  rs=smt.executeQuery("select  * from  login");
//			 if(user.equals(rs.getString(1))  &&   pass.equals(rs.getString(2)) )
//			 {
//		    System.out.println("correct  username  and  password");
//		    RequestDispatcher  rd=request.getRequestDispatcher("home.html");
//		    rd.include(request,response);
//			response.sendRedirect("home.html");
//			
		// String user=request.getParameter("user");
			 while(rs.next())
			 {
    if(user.equals(rs.getString(1))  &&   pass.equals(rs.getString(2)) )
    		 {
    	    System.out.println("correct  username  and  password");
    	    RequestDispatcher  rd1=request.getRequestDispatcher("FBUSER2.html");
    	    rd1.include(request,response);
    		//response.sendRedirect("home.html");
    	 
             }   
    		else 
    			if(!user.equals(rs.getString(1))   &&  !pass.equals(rs.getString(2)))
    	     	  {
    		 System.out.println("wrong  username  and  password");
    		 response.sendRedirect("FACEBOOKFORUSER2.html");
    	  RequestDispatcher  rd1=request.getRequestDispatcher("FACEBOOKGUI.html");
    		    rd1.include(request,response);
    		      } 
             }
 			 
			 }
		 catch (Exception e) {
			// TODO: handle exception
		}
	}

}
