import java.sql.*;
import java.io.*;
class ImageSave{
	public static void main(String[] args) {
		try{
			//Connecting to database
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "gaurav123";
			Connection con = DriverManager.getConnection(url,username,password);

			if (con.isClosed()) {
				System.out.println("Connection is not created :@(");
			}else{
				System.out.println("Connection is successfully established :@)");

				String q = "insert into images(pic) values(?)";

				PreparedStatement pstmt = con.prepareStatement(q);

				// pstmt.setString(1,"value");

				FileInputStream fis = new FileInputStream("rick.jpg");

				pstmt.setBinaryStream(1,fis,fis.available());

				pstmt.executeUpdate();

				System.out.println("Done... :@)");

				con.close();


			}




		}catch(Exception e){
			System.out.println("Error :@(");
		}
	}
}