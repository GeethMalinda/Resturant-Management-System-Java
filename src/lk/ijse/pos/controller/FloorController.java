
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.modal.Floor;

public class FloorController {

    public static String getFloorname(String floorid) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
        prepareStatement("Select Name from Floor where FloorId = '"+floorid+"'").
                executeQuery();
        if(set.next())
        {
            return set.getString(1);
        }
        return null;

    }

    public boolean savedFloor(Floor obj) throws ClassNotFoundException, SQLException {
        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con. prepareStatement("INSERT INTO Floor VALUES (?,?,?)");
        
        stm.setObject(1, obj.getFloorId());
        stm.setObject(2, obj.getName());
        stm.setObject(3, obj.getEntry_Date());
        
        return stm.executeUpdate()>0;
        
        
        
    }

    public List<Floor> getFloorList() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select * from Floor").executeQuery();
        
        List<Floor> templist = new ArrayList<>();
        while(set.next())
        {
            templist.add(new Floor(
                    
                    set.getString(1),
                    set.getString(2),
                    set.getString(3)
            
            ));
        }
            
            


        return templist;

    }

    public Floor getFloorObj(String id) throws ClassNotFoundException, SQLException {

        
        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("Select * from Floor WHERE FloorId = '"+id+"'")
                .executeQuery();
        
        if(set.next())
        {
            return new Floor(
                    
                    set.getString(1),
                    set.getString(2),
                    set.getString(3)
                    
            
            );
        }

        return null;
    }

    public boolean updateFloor(Floor floor) throws ClassNotFoundException, SQLException {
        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement
        ("Update Floor set FloorId =?,Name =?,Entry_Date =? Where FloorId =?");
        
        stm.setObject(1, floor.getFloorId());
        stm.setObject(2, floor.getName());
        stm.setObject(3, floor.getEntry_Date());
        stm.setObject(4, floor.getFloorId());
        
        
        return stm.executeUpdate()>0;
    }

    public boolean DeleteFloor(String id) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement
                ("Delete From Floor WHERE FloorId ='"+id+"'");
        
        if(stm.executeUpdate()>0)
        {
            return true;
        }
        else
        {
            return false;
            
        }



    }

    public List<String> getFloorNameList() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("Select  Name FROM Floor").executeQuery();
        
        List<String>tempList = new ArrayList<>();
        while(set.next())
        {
            tempList.add(set.getString(1));
        }
        return tempList;
        


    }

    public String getFloorId(String id) throws ClassNotFoundException, SQLException {


        ResultSet set = Dbcontroller.getInstance().getConnection().
            prepareStatement("Select FloorId from Floor where Name ='"+id+"'").
                executeQuery();
           if(set.next())
           {
               return set.getString(1);
           }
           return null;
    }

    public String getFloorName(String FloorId) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
            prepareStatement("Select  Name from Floor where FloorId ='"+FloorId+"'").
                executeQuery();
        
        if(set.next())
        {
            return set.getString(1);
        }
        return null;
    }

    public String getFloorIdFromName(String name) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
          prepareStatement(" select FloorId from Floor where Name ='"+name+"'").
                executeQuery();
        
        if(set.next())
        {
            return set.getString(1);
        }

        return null;

    }

    

    }

