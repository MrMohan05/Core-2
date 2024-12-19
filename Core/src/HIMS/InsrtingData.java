package HIMS;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsrtingData 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "c##mohan";
        String password = "123";
        
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = DriverManager.getConnection(url, username, password);
           
            System.out.println("Connection established successfully!");
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Name : ");
            String name=sc.nextLine();
            System.out.println("Enter Admit date : ");
            String date=sc.nextLine();
            System.out.println("Enter ID : ");
            int id=sc.nextInt();
            System.out.println("Enter paitent room number : ");
            int rno=sc.nextInt();
            String query = "insert into paitent values(?,?,?,?)"; 
            System.out.println("Data enterd succefully:");
            
            
            PreparedStatement pst = connection.prepareStatement(query);
            System.out.println("Data enterd succefully:");
            pst.setString(2,name);
            System.out.println("Done");
            pst.setInt(1,id);
            System.out.println("Done");
            pst.setInt(3,rno);
            System.out.println("Done");
            pst.setString(4,date);
            System.out.println("Data enterd succefully:");
            pst.executeUpdate();
            System.out.println("Data enterd succefully:");
            
            sc.close();
	}
}
