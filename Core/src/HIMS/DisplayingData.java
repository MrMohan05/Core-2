package HIMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayingData 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "c##mohan";
        String password = "123";
        
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connection established successfully!");
            
            String display="Select * from doctor";
            
            PreparedStatement pst =connection.prepareStatement(display);
            ResultSet rs= pst.executeQuery();
            while(rs.next())
            {
            	System.out.println("Did :"+rs.getInt(1)+" Name :"+rs.getString(2)+" Doctor's specialisation :"+rs.getString(3));
            }
            
	}
}
