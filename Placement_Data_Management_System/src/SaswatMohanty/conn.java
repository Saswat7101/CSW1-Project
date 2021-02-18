/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaswatMohanty;

/**
 *
 * @author SASWAT7101
 */
import java.sql.*;

public class conn {
     public Connection connection;
    public Statement statement;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///PlacementDataManagement","root","");
            statement = connection.createStatement();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
