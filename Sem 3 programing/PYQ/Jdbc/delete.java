import java.sql.*;
public class delete {
    static final String url="jdbc:mysql://localhost:3306/student";
    public static void main(String[] args) throws ClassNotFoundException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,"root","Vinit@mysql12");
            Statement st=conn.createStatement();
            int rst=st.executeUpdate("delete from student where dbms>=90");
            if(rst>0)
            {
                System.out.println("successful update");
            }
            else{
                System.out.println("unsuccessful update");
            }
            st.close();
            conn.close();
        }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
         
        
    }
}
