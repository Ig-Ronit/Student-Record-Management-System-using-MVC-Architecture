package MVC;
import java.sql.*;
public class MyConnection {
	Connection con ;
	public MyConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","password","password");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
