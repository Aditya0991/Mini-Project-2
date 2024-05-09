
import java.sql.*;
import java.io.*;
class Insert2JDBC{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			//creating a connection
			Connection con = null;
			String url = "jdbc:mysql://127.0.0.1:3306/youtube";
			String username = "root";
			String password = "gaurav123";
			con = DriverManager.getConnection(url,username,password);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			 

			if (con.isClosed()) {

				System.out.println("connection not created.");
			}
			else{
				System.out.println("Connection is created!:@)");
			 //Connection has been established
			 //making a query now

				System.out.print("Enter the name:");
				String name = br.readLine();

			System.out.print("Enter the city:");
			String city = br.readLine();

			 String q = "insert into table1(tName,tCity) values(?,?)";
			 //get the PreparedStatement object

			 PreparedStatement pstmt = con.prepareStatement(q);

			 //set the values to query
			 pstmt.setString(1,name);
			 pstmt.setString(2,city);

			 pstmt.executeUpdate();

			 System.out.println("data inserted...");

			 con.close();
			}



		}catch(Exception e){
			e.printStackTrace();
		}
	}
}