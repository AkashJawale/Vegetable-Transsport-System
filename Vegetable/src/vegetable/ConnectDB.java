/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetable;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author heartless
 */
public class ConnectDB {
    
    
    
     public static Connection condb()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
            return con2;
            
        }
        catch(Exception e)
        {
            
        }
        return null;
    }
      public static void main(String a[])
    {}
    
}
    