package com.example.spring;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
@Transactional
public class DAO {

    private Connection myConn = null;

    private boolean openConnection() {
        /*
        Database Parameter
         */
        try {
            /*
            the commented string url is for use of the database outside of the ATC timezone
             */
            //String url = "jdbc:mysql://localhost:3306/vyhs1bMBpj?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String url = "jdbc:mysql://remotemysql.com:3306/vyhs1bMBpj"; //accessing from ATC timezone-+
            String user = "vyhs1bMBpj";
            String password = "nh3kCOBPE5";

            // Get connection to the remote database
            myConn = DriverManager.getConnection(url, user, password);
            if (myConn != null)
                System.out.println("Connection Successful");
            return true;
        } catch (SQLException e) { // Exception thrown if connection fails
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void closeConnection()
    {
        /*
        Allows for database to be closed
         */
        try{
            if(myConn!= null)
                myConn.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }

    }

    public void insertUser(Staff theStaff) {

        /*
        To insert a user to the user table
         */
        //the mysql insert statement
        String query = "INSERT INTO Staff (StaffID, Fname, Lname, Role) values (?,?,?,?)";

        //create the mysql insert prepared statement
        try {
            PreparedStatement myPreStmt = myConn.prepareStatement(query);
            myPreStmt.setInt(1, theStaff.getStaffID());
            myPreStmt.setString(2, theStaff.getFname());
            myPreStmt.setString(3, theStaff.getLname());
            myPreStmt.setBoolean(4, theStaff.getRole());

            //execute the prepared statement
            myPreStmt.execute();
        } catch (Exception e) {
            System.out.println("Got an exception!"); // if issue arises this exception is thrown
            System.out.println(e.getMessage());
        }
    }

    /*public void loadTrainers() throws SQLException {
        try {
            String query = "SELECT * from Trainer order by Fname";
            PreparedStatement myPreStmt = myConn.prepareStatement(query);
            ResultSet rs = myPreStmt.executeQuery();
            //To remove previously added rows

            while (rs.next()){

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

}
