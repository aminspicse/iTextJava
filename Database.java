/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itextpdf;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author AL AMIN
 */
public class Database {
    Connection conn;
    public void dbConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url,"password","password");
            JOptionPane.showMessageDialog(null,"Success");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    public static void main(String arg[]){
        Database data = new Database();
        data.dbConnection();
    }
}
