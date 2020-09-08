
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.modal.Labour;

public class LabourController {

    public boolean saveLabour(Labour obj) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Insert into employee Values (?,?,?,?,?,?)");
        stm.setObject(1, obj.getEmpId());
        stm.setObject(2, obj.getName());
        stm.setObject(3, obj.getSex());
        stm.setObject(4, obj.getNic());
        stm.setObject(5, obj.getAdress());
        stm.setObject(6, obj.getTp());
        
        return stm.executeUpdate()>0;

    }

    public List<Labour> getLabourList() throws ClassNotFoundException, SQLException {
        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select * from employee").executeQuery();
        List<Labour> templist = new ArrayList<>();
        while(set.next())
        {
        templist.add(new Labour(
                
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getString(4),
                set.getString(5),
                set.getString(6)
        
        ));
        }
        
        return templist;
        
        
        
    }

    public boolean updateLabour(Labour obj) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement
        ("Update employee set EmpId = ?,Name = ?,Sex =?,Nic=?,Adress = ?,Tp = ? Where EmpId = ?");
        stm.setObject(1, obj.getEmpId());
        stm.setObject(2, obj.getName());
        stm.setObject(3, obj.getSex());
        stm.setObject(4, obj.getNic());
        stm.setObject(5, obj.getAdress());
        stm.setObject(6, obj.getTp());
        stm.setObject(7, obj.getEmpId());
        
        return stm.executeUpdate()>0;


    }

    public boolean deleteLabour(String id) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Delete From employee Where EmpId = '"+id+"'");
        
        return stm.executeUpdate()>0;
                
        

    }

    public Labour getLabourObj(String id) throws ClassNotFoundException, SQLException {
        
        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("Select * from employee where EmpId = '"+id+"'").
                executeQuery();
        
        if(set.next())
        {
            return new Labour(
            
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6)
                    
            
            
            );
        }
       return null;  
    }

    public String getEmployeeName(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().prepareStatement
        ("Select Name from employee where EmpId ='"+id+"'").executeQuery();
        
        if(set.next())
        {
            return set.getString(1);
        }
        return null;
                

    }
    
    
    
}
