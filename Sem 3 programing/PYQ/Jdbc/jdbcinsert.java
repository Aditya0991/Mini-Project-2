import java.sql.*;
public class jdbcinsert
{
    static final String url="jdbc:mysql://localhost:3306/student";
    public static void main( String [] args ) throws ClassNotFoundException
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,"root","Vinit@mysql12");
            Statement st=conn.createStatement();
            int result=st.executeUpdate("insert into student(name,class,coa,dbms,os) values ('rachel','b.tech',45,98,100)");
            if(result>0)
            {
                System.out.println("successfully inserterd");

            }
            else{
                System.out.println("unsuccessful insertion");
            
            }
            conn.close();

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}