package HIMS;
import javax.swing.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HIMS {
    static List<String> name = new ArrayList<String>();
    static List<String> ids = new ArrayList<String>(); 
    static List<String> roomNo = new ArrayList<String>(); 
    static List<String> admitDate = new ArrayList<String>();

    static List<String> did=new ArrayList<String>();
    static List<String> pid=new ArrayList<String>();
    static List<String> date=new ArrayList<String>();

    static JPanel panel = new JPanel();
    static JFrame jf = new JFrame("Hospital Information Management System");
    static JScrollPane scrollPane = new JScrollPane(panel); 

    static JLabel label = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
    static final JButton go=new JButton("Add paitent information");
    static final JButton dc=new JButton("See doctors name");
    static final JButton ap=new JButton("Add appintments for doctors");
    static JButton disp=new JButton("Display Paitent");
    public static void main(String args[]) {

    jf.setSize(800, 500);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	
    panel.add(label);
    
	panel.add(go);
	go.addActionListener( a->
	{
	   try {
		paitent();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	});
	
	panel.add(dc);
	dc.addActionListener(a->
	{
		doctorDisp();
	});
	
	panel.add(ap);
	ap.addActionListener(a->
	{
		addApintment();		
	});
	jf.add(scrollPane);
	jf.setVisible(true);
    }

    public static void paitent() throws SQLException
    {
	JTextField[] inputFields = addData(panel);

    JButton submitButton = new JButton("Submit");

     submitButton.addActionListener(e ->
	 {   
        ids.add(inputFields[0].getText());
        name.add(inputFields[1].getText());
        roomNo.add(inputFields[2].getText());
        admitDate.add(inputFields[3].getText());

	 });

    panel.add(submitButton);
    panel.revalidate(); 
    panel.repaint(); 
   
	panel.add(disp);
	disp.addActionListener( d->
	{
	StringBuilder patientDetails = new StringBuilder();
	
	for(int i=0;i<ids.size();i++)
	{
		patientDetails.append("Paitent id : ").append(ids.get(i)).append(" Name : ").append(name.get(i)).append(" Room number : ").append(roomNo.get(i))
						.append(" Admit Date : ").append(admitDate.get(i)).append("<br><br>");
	}
	JLabel j=new JLabel("<html>"+patientDetails+"</html>");
	panel.add(j);
	panel.revalidate(); 
    panel.repaint(); 
			});
    
	panel.add(dc);
	panel.add(go);
	panel.add(ap);
    }

    public static JTextField[] addData(JPanel panel) throws SQLException {
	JLabel label = new JLabel("<html><br></html>");
	panel.add(label);
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String username = "c##mohan";
    String password = "123";
    
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		

        Connection connection = DriverManager.getConnection(url, username, password);
       
        System.out.println("Connection established successfully!");
        
        Scanner sc=new Scanner(System.in);
        JLabel nameLabel = new JLabel("Enter Patient Name:");
        JTextField nameField = new JTextField(15);
        nameField.setPreferredSize(new Dimension(200,30));
        panel.add(nameLabel);
        panel.add(nameField);
        JLabel dateLabel = new JLabel("Enter Patient Admit Date:");
        JTextField dateField = new JTextField(15);
        dateField.setPreferredSize(new Dimension(200,30));
        panel.add(dateLabel);
        panel.add(dateField);
        JLabel idLabel = new JLabel("Enter Patient ID:");
        JTextField idField = new JTextField(15);
        panel.add(idLabel);
        panel.add(idField);
        JLabel roomLabel = new JLabel("Enter Patient Room Number:");
        JTextField roomField = new JTextField(15);
        roomField.setPreferredSize(new Dimension(200,30));
        panel.add(roomLabel);
        panel.add(roomField);
        String query = "insert into paitent values(?,?,?,?)"; 
        System.out.println("Data enterd succefully:");
        
        int id = Integer.parseInt(idField.getText());
        //String name = nameField.getText();
        int roomNo = Integer.parseInt(roomField.getText()); // Convert Room No to number
        String dateText = dateField.getText();

        
        PreparedStatement pst = connection.prepareStatement(query);
        System.out.println("Data enterd succefully:");
        pst.setString(2,nameField.toString());
        System.out.println("Done");
        pst.setInt(1,(id));
        System.out.println("Done");
        pst.setInt(3,roomNo);
        System.out.println("Done");
        pst.setString(4,dateText);
        System.out.println("Data enterd succefully:");
        pst.executeUpdate();
        System.out.println("Data enterd succefully:");
        
        sc.close();
        return new JTextField[]{idField, nameField, roomField, dateField};

        }
        catch (ClassNotFoundException e) {
        	e.printStackTrace();
        	return null;
        }
		
	
        
        //idField.setPreferredSize(new Dimension(200, 30));

    }


   public static void doctorDisp()
   {
	StringBuilder sb = new StringBuilder();
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String username = "c##mohan";
    String password = "123";
    
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

        Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        
        
        String display="Select * from doctor";
        
        PreparedStatement pst = null;
		try {
			pst = connection.prepareStatement(display);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        ResultSet rs = null;
		try {
			rs = pst.executeQuery();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        try {
			while(rs.next())
			{
				//System.out.println("Did :"+rs.getInt(1)+" Name :"+rs.getString(2)+" Doctor's specialisation :"+rs.getString(3));
				sb=sb.append(rs.getInt(1));
				sb=sb.append(" &nbsp ");
				sb=sb.append(rs.getString(2));
				sb=sb.append(" &nbsp ");
				sb=sb.append(rs.getString(3));
				sb=sb.append("<br>");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}


	JLabel label = new JLabel("<html>" + sb + "</html>");


	panel.add(label);

	panel.revalidate();
	panel.repaint();


	panel.add(go);
	panel.add(ap);
   }
   
   public static void addApintment() {
	    JLabel didLabel = new JLabel("Enter Doctor's ID: ");
	    JTextField didField = new JTextField(10);
	    panel.add(didLabel);
	    panel.add(didField);

	    JLabel pidLabel = new JLabel("Enter Patient's ID: ");
	    JTextField pidField = new JTextField(10);
	    panel.add(pidLabel);
	    panel.add(pidField);

	    JLabel dateLabel = new JLabel("Enter Appointment Date: ");
	    JTextField dateField = new JTextField(10);
	    panel.add(dateLabel);
	    panel.add(dateField);

	    JButton submitAppointmentButton = new JButton("Submit Appointment");
	    panel.add(submitAppointmentButton);

	    submitAppointmentButton.addActionListener(e -> {
	        did.add(didField.getText());
	        pid.add(pidField.getText());
	        date.add(dateField.getText());

	        JButton displayAppointmentButton = new JButton("Display Appointments");
	        panel.add(displayAppointmentButton);
	        panel.revalidate();
	        panel.repaint();

	        displayAppointmentButton.addActionListener(d -> dispAppointments());
	    });

	    panel.revalidate();
	    panel.repaint();
	}

	public static void dispAppointments() {
	    StringBuilder appointmentDetails = new StringBuilder();
	    for (int i = 0; i < did.size(); i++) {
	        appointmentDetails.append("<br><br>Doctor's ID: ").append(did.get(i))
	                .append(", Patient's ID: ").append(pid.get(i))
	                .append(", Appointment Date: ").append(date.get(i));
	    }

	    JLabel appointmentsLabel = new JLabel("<html>" + appointmentDetails + "</html>");
	    panel.add(appointmentsLabel);

	    panel.revalidate();
	    panel.repaint();
	    panel.add(dc);
	    panel.add(go);
		panel.add(ap);
	}

}
