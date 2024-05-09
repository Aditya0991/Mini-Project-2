import java.sql.*;
class InsertJDBC{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			//creating a connection
			Connection con = null;
			String url = "jdbc:mysql://127.0.0.1:3306/youtube";
			String username = "root";
			String password = "gaurav123";
			con = DriverManager.getConnection(url,username,password);

			//Create a query
			String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";

			//Create a statement

			Statement stmt = con.createStatement();

			stmt.executeUpdate(q);

			System.out.println("table is createdd in database..");

			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}