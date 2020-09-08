
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbcontroller {
    
    
    private static Dbcontroller dBConnection;
    private Connection connection;
    
    private Dbcontroller() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/resturant",
                "root",
                "1234"
        
        
        );
        
    }
    public static Dbcontroller getInstance() throws ClassNotFoundException, SQLException{
        
        return (dBConnection==null)?(dBConnection=new Dbcontroller()):(dBConnection);
        
    }
    public Connection getConnection(){
        
        return connection;
    }
    
    
}
