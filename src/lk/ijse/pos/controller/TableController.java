
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.modal.Table;


public class TableController {

    public List<Table> getTablelist() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select * from  tables ").executeQuery();
        
        List <Table> templist = new ArrayList<>();
        while(set.next())
        {
            templist.add(new Table(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getInt(4)
            
            ));
        }
        return templist;


    }

 
    

    public boolean saveTables(Table obj) throws ClassNotFoundException, SQLException {
       
        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Insert into tables Values (?,?,?,?)");
        
        stm.setObject(1, obj.getTableID());
        stm.setObject(2, obj.getFloorId());
        stm.setObject(3, obj.getTableNo());
        stm.setObject(4, obj.getChairs());
        
        return stm.executeUpdate()>0;

    }

    public boolean UpdateTable(Table obj) throws ClassNotFoundException, SQLException {
        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con. prepareStatement("Update tables set TableID = ?,FloorId = ?,TableNo =?,Chairs = ? Where TableID = ?");
        
        stm.setObject(1,obj.getTableID() );
        stm.setObject(2, obj.getFloorId());
        stm.setObject(3, obj.getTableNo());
        stm.setObject(4, obj.getChairs());
        stm.setObject(5, obj.getTableID());
        
        return stm.executeUpdate()>0;
    }

    public boolean DeleteTable(String id) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Delete From tables Where TableID = '"+id+"'");
        
        return stm.executeUpdate()>0;

    }

    public int getTableCount() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("Select Count(*) from tables").executeQuery();
        
        if(set.next())
        {
            return set.getInt(1);
        }
     return 0;   
    }

    public Table getTableObj(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
              prepareStatement("Select * from tables WHERE TableID = '"+id+"'").
                executeQuery();
        
        if(set.next())
            return new Table(
                    
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getInt(4)
            
            
            );
        return null;


    }

    public List<String> getTableNoList(String floor) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
               prepareStatement("select TableNo from tables where FloorId = '"+floor+"'").
                executeQuery();
        
        List<String>temp= new ArrayList<>();
        while(set.next())
        {
            temp.add(set.getString(1));
        }
        return temp;


    }

   public String getTableID(String toString, String FloorId) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("Select TableID  from tables where TableNo= '"+toString+"'and FloorId='"+FloorId+"'").executeQuery();
        if(set.next())
        {
            return set.getString(1);
        }


        return null;

    }

    

    

    public List<String> getTableID(String FloorId) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
               prepareStatement("select TableID from tables where FloorId = '"+FloorId+"'").
                executeQuery();
        
        List<String>temp= new ArrayList<>();
        while(set.next())
        {
            temp.add(set.getString(1));
        }
        return temp;
        
        
        
        
    }

    public String getTableName(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().prepareStatement("Select TableNo from tables where TableID ='"+id+"'").executeQuery();
        if(set.next())
        {
            return set.getString(1);
        }
        

        return null;

    }

 
    
    
}
