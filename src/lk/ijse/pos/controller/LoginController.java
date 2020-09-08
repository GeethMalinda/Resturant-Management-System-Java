
package lk.ijse.pos.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController 
{

    public boolean checkPassward(String username, String ps) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().prepareStatement
        ("Select * from login where username = '"+username+"' and passward = '"+ps+"'").
                executeQuery();
        
        if(set.next())
        {
            return true;
        }
        return false;

    }

    public String getEmpID(String username, String ps) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().prepareStatement("Select EmpId from login  where username = '"+username+"' and passward = '"+ps+"'").executeQuery();
        if(set.next())
        {
            return set.getString(1);
        }
        return null;
        
    }
    
   
    
}
