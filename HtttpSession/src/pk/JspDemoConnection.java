package pk;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JspDemoConnection {

public  static   int   heena(String  user) throws ClassNotFoundException, SQLException
{
	Connection  con;
    int  flag = 9;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","java");
    java.sql.Statement  smt =con.createStatement();
    ResultSet  rs=smt.executeQuery("select  *  from  heena1");
    while(rs.next())
    	{
   
     if (!(user.equals(rs.getString(2))))
            {
    	flag=0;
    	System.out.println("wrong  user");
    	System.out.println(rs.getString(2));
            }
     else if(user.equals(rs.getString(2)))
		{
	 flag=1;
	 System.out.println("connection  establish");
	 System.out.println(rs.getString(2));
	 
	    }
   }
    return  flag;
}
//public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	JspDemoConnection v=new JspDemoConnection();
//	v.heena("h");
//}
}
