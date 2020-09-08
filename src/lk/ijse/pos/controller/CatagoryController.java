
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.pos.modal.Catagory;

public class CatagoryController {

    


    public List<Catagory> getCatagoryList() throws ClassNotFoundException, SQLException {
        
        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("SELECT * FROM Catagory").executeQuery();
            
        List<Catagory> templist = new ArrayList<>();
        while(set.next())
        {
           templist.add(new Catagory(
           
                   set.getString(1),
                   set.getString(2),
                   set.getString(3)
           
           
           
           ));
        }
        return templist;
        
        
        
        
        
    }

    public boolean Saved(Catagory obj) throws ClassNotFoundException, SQLException {
        Connection connection = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement
        ("Insert Into Catagory Values (?,?,?)");
        
        stm.setObject(1,obj.getCatId() );
        stm.setObject(2,obj.getStatus() );
        stm.setObject(3,obj.getCatagory() );
        
        return stm.executeUpdate()>0;
        
        
    }

    public boolean Update(Catagory obj) throws ClassNotFoundException, SQLException {
        
        Connection connection = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement
                ("Update Catagory set CatId=?,status=?,catagory=? WHERE CatId = ? ");
        stm.setObject(1, obj.getCatId());
        stm.setObject(2, obj.getStatus());
        stm.setObject(3, obj.getCatagory());
        stm.setObject(4, obj.getCatId());
        
        if(stm.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
        
    }

    public Catagory getCatagory(String id) throws ClassNotFoundException, SQLException {
        
        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select * from Catagory Where CatId = '"+id+"'" )
                .executeQuery();
        
        if(set.next())
        {
            return new Catagory(
                  set.getString(1),
                  set.getString(2),
                  set.getString(3)
            
            
            );
        }
        return null;
                
    }

    public boolean DeleteCatagory(String id) throws ClassNotFoundException, SQLException {
         Connection connection = Dbcontroller.getInstance().getConnection();
        return connection.prepareStatement
                ("DELETE FROM Catagory Where CatId = '"+id+"'").
                executeUpdate()>0;
      
       
    }

    public List<String> getCatagoryname() throws SQLException, ClassNotFoundException {
        
        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select  catagory from Catagory")
                .executeQuery();
        
        List<String> list = new ArrayList<>();
        while(set.next())
        {
            list.add(set.getString(1));
        }
        return list;
      
        
        
           }

    public int getCatagoryCount() throws ClassNotFoundException, SQLException {
       
          ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select Count(*) from Catagory")
                .executeQuery();
          if(set.next())
          {
              return set.getInt(1);
          }
        
        return 0;
        
    }

    public String getCatagoryName(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
         prepareStatement("select catagory from catagory where CatId ='"+id+"'").
                executeQuery();
        
        if(set.next())
        {
            return set.getString(1);
        }

        return null;

    }
    
    
    
    
}
