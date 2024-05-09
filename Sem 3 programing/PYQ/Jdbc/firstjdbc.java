//Program for jdbc 1 program:
import java.sql.*;
class FirstJJDBC{
	public static void main(String[] args) {
		try{
			//load the driver :
			Class.forName("com.mysql.cj.jdbc.Driver");

			//creating a connection
			Connection con = null;
			String url = "jdbc:mysql://127.0.0.1:3306/youtube";
			String username = "root";
			String password = "gaurav123";
			con = DriverManager.getConnection(url,username,password);

			if (con.isClosed()) {
				System.out.println("Connection is Closed");
			}
			else{
				System.out.println("Connection Created....");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}