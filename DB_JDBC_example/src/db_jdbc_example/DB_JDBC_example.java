/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db_jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_JDBC_example {

    	public static void main(String[] args) {
                
            String url = "jdbc:mysql://localhost:3306/jd1_example";
            String user = "root";
            String pwd = "12345";
            try {
                Connection conn =
                    DriverManager.getConnection(url, user, pwd); 	// Get Connection
                Statement stmt = conn.createStatement();                // Create Statement
                String query = "SELECT * FROM Customer";
                ResultSet rs = stmt.executeQuery(query);                // Execute Query
                while (rs.next()) {                            		// Process Results
                    System.out.print(rs.getInt("CustomerID") + "  ");   	// Print Columns
                    System.out.print(rs.getString("FirstName") + "  ");
                    System.out.print(rs.getString("LastName") + "  ");
                    System.out.print(rs.getString("EMail") + "  ");
                    System.out.println(rs.getString("Phone"));
                }
            } catch (SQLException se) { }

                
    	}
}
