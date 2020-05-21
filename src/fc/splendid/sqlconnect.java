/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc.splendid;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Eternity
 */
public class sqlconnect {
    Connection conn = null;
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/splendid","root","root");
            return conn;
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        
    }
    }
    }
    
