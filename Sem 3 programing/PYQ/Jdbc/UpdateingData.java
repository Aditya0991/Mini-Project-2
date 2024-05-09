import java.sql.*;
import java.io.*;
import java.sql.Connection;

class UpdateingData{
	public static void main(String[] args) {
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","gaurav123");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			if (con.isClosed()) {
				System.out.println("Connection can't be established :@(");

			}else{

				System.out.println("Connection is established :@)");

				

				System.out.println("Enter new name:");
				String name = br.readLine();

				System.out.println("Enter new city:");
				String city = br.readLine();

				System.out.println("Enter Student id:");
				int id = Integer.parseInt(br.readLine());




				String q = "update table1 set tName = ? ,tCity = ? where tId = ?";


				PreparedStatement pstmt = con.prepareStatement(q);

				pstmt.setString(1,name);
				pstmt.setString(2,city);
				pstmt.setInt(3,id);

				pstmt.executeUpdate();

				con.close();
		}

		}catch(Exception e){
			e.printStackTrace();
		}

		


	}
}