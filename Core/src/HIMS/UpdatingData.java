package HIMS;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatingData
{
	public static void main(String... args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
	    String username = "c##mohan";
	    String password = "123";
	    
	        Class.forName("oracle.jdbc.driver.OracleDriver");

	        Connection connection = DriverManager.getConnection(url, username, password);
	        
	        System.out.println("Connection established successfully!");
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter updated name :");
	        String pname=sc.nextLine();
	        
	        System.out.println("Enter id of paitent to update data :");
	        int pid=sc.nextInt();
	        	        
	        String update="update paitent set pname=? where pid=?";
	        PreparedStatement pst=connection.prepareStatement(update);
	        System.out.println("update");
	        pst.setString(1, pname);
	        System.out.println("Done");
	        
	        pst.setInt(2, pid);
	        System.out.println("done");
	        int r = pst.executeUpdate();
	        System.out.println("done");
          if(r>0)
          {
          	System.out.println("Data Updated successfully");
          }
          else
          {
          	System.out.println("Data not updated");
          }
          sc.close();
	}
}
