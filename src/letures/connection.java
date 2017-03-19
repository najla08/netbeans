/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package letures;

/**
 *
 * @author Najla
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class connection {
  
   Connection con=null;
    PreparedStatement pst=null;
     ResultSet rs= null;
     
    public static Connection ConnerDb()
    {
        String URL="jdbc:sqlserver://localhost:1433;databaseName=Lectures";
        String username="admin3";
        String password="1234";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection(URL,username,password);
          
            return con;
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
                    return null;
        }
       
        }
    
}
