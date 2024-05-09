import java.sql.*; 
public class jdbc {
 static final String url="jdbc:mysql://localhost:3306/student";  
 public static void main(String args[]) throws ClassNotFoundException
 {
    try{
Class.forName("com.mysql.jdbc.Driver");
Connection cnt=DriverManager.getConnection(url,"root","Vinit@mysql12");
Statement st=cnt.createStatement();
ResultSet rst;
rst=st.executeQuery("select * from student");
int rollno;
String name;
while(rst.next())
{
    rollno=rst.getInt("rollno");
    name=rst.getString("name").trim();
    System.out.println("rollno :"+rollno+"\t"+"name :"+ name);
}
rst.close();
st.close();
cnt.close();
    }
    catch(SQLException e)
    {
        System.out.println(e);
    }
 }
}
