package practice;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
public class JDBC
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "c##mohan";
        String password = "123";
        
            Class className=Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connection established successfully!");
            
            //Statement statement = connection.createStatement();
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name : ");
            String name=sc.nextLine();
            System.out.println("Enter ID : ");
            int id=sc.nextInt();
            String query = "INSERT INTO DEMO VALUES(?,?)"; 
            
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setInt(1,id);
            pst.setString(2,name);
            
           // pst.executeUpdate();
            String qruey2;
//            qruey2="update demo set name=? where id=?";
//            pst=connection.prepareStatement(qruey2);
//            pst.setString(1, name);
//            pst.setInt(2, id);
            qruey2="delete from demo where id=?";
            pst=connection.prepareStatement(qruey2);
            pst.setInt(1, id);
            //int n=pst.executeUpdate();
            int r = pst.executeUpdate();
            if(r>0)
            {
            	System.out.println("Data Updated successfully");
            }
            else
            {
            	System.out.println("Data not updated");
            }
//           
//             qruey2="Select * from demo";
//            ResultSet rs = pst.executeQuery();
//            while(rs.next())
//            {
//            	System.out.println(rs.getInt(1)+"    "+rs.getString(2));
//            }
            
            pst.close();
            //statement.close();
            connection.close();
            System.out.println("Connection closed.");
            sc.close();
		
		
	}
}
