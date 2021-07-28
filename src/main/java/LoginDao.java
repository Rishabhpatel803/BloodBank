import java.sql.*;

public class LoginDao {

    public static Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","lucious","u*r*good1");
            return connection;
        }catch(Exception e){System.out.println(e);}
        return connection;
    }
}