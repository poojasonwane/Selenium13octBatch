package testngdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class databaseTest 
{
	private Connection connection;
	   private static Statement statement;
	   private static ResultSet rs;

	    @BeforeTest
	    public void setUp() {
	            String databaseURL = "jdbc:mysql://localhost:3306/fortunecloud";
	            String user = "root";
	            String password = "";
	            
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	                System.out.println("Connecting to Database...");
	                connection = DriverManager.getConnection(databaseURL, user, password);
	                if (connection != null) {
	                    System.out.println("Connected to the Database...");
	                }
	            } catch (SQLException ex) {
	               ex.printStackTrace();
	            }
	            catch (ClassNotFoundException ex) {
	               ex.printStackTrace();
	            }
	    }

	    @Test
	    public void getEmployeesFromDataBase() {
	        try {
	            String query = "select * from employee";
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);

	            while(rs.next()){
	                int EmpId= rs.getInt(1);
	                String EmpName= rs.getString(2);
	                String EmpAddress=rs.getString(3);
	                //String EmpDept=rs.getString("EmpDept");
	                //Double EmpSal= rs.getDouble(5);
	                System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t");
	            }
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
	    }

	    @AfterTest
	    public void tearDown() {
	      if (connection != null) {
	                try {
	                    System.out.println("Closing Database Connection...");
	                    connection.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
}


}
