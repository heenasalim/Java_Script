package build;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JspDemoConnection {

public  static   int   heena(String  user) throws ClassNotFoundException, SQLException
{
	Connection  con;
    int  flag = 0;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","java");
    java.sql.Statement  smt =con.createStatement();
    ResultSet  rs=smt.executeQuery("select  *  from  heena1");
    while(rs.next())
    	{
    if(rs.getString(2)==user)
    		{
    	flag=1;
    	System.out.println(("connection  establish"));
    	
    		}
    if(rs.getString(2)!=user)
    {
    	flag=0;
    	System.out.println("wrong  user");
    	
     }
    }
    return  flag;
}
//public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	JspDemoConnection v=new JspDemoConnection();
//	v.heena("user");
//}
}
