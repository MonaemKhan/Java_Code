
import java.sql.*;

public class NewMain {

    public static void main(String[] args){

        try
  {
     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sainik_data","root","");
     PreparedStatement sst = conn.prepareStatement("SELECT `name`, `rank` FROM `personal`,`official` WHERE `phn` = '+880'");
     ResultSet rs = sst.executeQuery();
     
     while(rs.next()){
         System.out.println(rs.getString("name")+rs.getString("rank"));
     }
     
     }
    catch(SQLException e)
    {    
        System.out.println(e);
    }
    }
    
}
