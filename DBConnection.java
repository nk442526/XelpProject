/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.sql.*;
/**
 *
 * @author Neha
 */

public class DBConnection {
    Connection conn=null;
    static final String DB_URl= "jdbc:mysql://localhost:3306/registeration_details";
    static final String USER= "root";
    static final String PASS= "";
    public static Connection connectDB(){
        Connection conn =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //open to connection
            conn= DriverManager.getConnection(DB_URl, USER, PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors while connecting to db.");
            return null;
        }
    }
}
