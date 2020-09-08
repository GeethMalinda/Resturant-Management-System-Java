/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.modal.Item;
import lk.ijse.pos.modal.OrderDetails;

public class ItemController {

    public String getCatagoryId(String catagoryname) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("select CatId from Catagory where  catagory ='" + catagoryname + "'")
                .executeQuery();
        if (set.next()) {
            return set.getString(1);
        }
        return null;

    }

    public boolean saveItem(Item obj) throws ClassNotFoundException, SQLException {
        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Insert into Item Values(?,?,?,?,?,?,?,?)");

        stm.setObject(1, obj.getItemId());
        stm.setObject(2, obj.getCatId());
        stm.setObject(3, obj.getPrice());
        stm.setObject(4, obj.getQtyOnHand());
        stm.setObject(5, obj.getIteamName());
        stm.setObject(6, obj.getDate());
        stm.setObject(7, obj.getTime());
        stm.setObject(8, obj.getPicture());
        
        return stm.executeUpdate() > 0;
    }

    public List<Item> getItemList() throws SQLException, ClassNotFoundException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("Select * from Item").executeQuery();
        List<Item> tempList = new ArrayList<>();
        while (set.next()) {
            tempList.add(new Item(
                    set.getString(1),
                    set.getString(2),
                    set.getDouble(3),
                    set.getInt(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7),
                    set.getBytes(8)
                 
            ));
        }

        return tempList;
    }

    public String getCatagoryName(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select catagory from Catagory where CatId='" + id + "' ")
                .executeQuery();

        if (set.next()) {
            return set.getString(1);
        }
        return null;

    }

    public boolean updateItem(Item obj) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Update Item set ItemId=?,CatId=?,Price=?,QtyOnHand=?,iteamName = ?,Date=?,Time=?,img =? Where ItemId =?");

        stm.setObject(1, obj.getItemId());
        stm.setObject(2, obj.getCatId());
        stm.setObject(3, obj.getPrice());
        stm.setObject(4, obj.getQtyOnHand());
        stm.setObject(5, obj.getIteamName());
        stm.setObject(6, obj.getDate());
        stm.setObject(7, obj.getTime());
        stm.setObject(8, obj.getPicture());
        stm.setObject(9, obj.getItemId());

        if (stm.executeUpdate() > 0) {
            return true;
        }
        return false;

    }

    public boolean DeleteItem(String id) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Delete from Item where ItemId ='" + id + "' ");

        return stm.executeUpdate() > 0;

    }

    public Item getItemObj(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection()
                .prepareStatement("Select * from Item where ItemId ='" + id + "'")
                .executeQuery();

        if (set.next()) {
            return new Item(
                    set.getString(1),
                    set.getString(2),
                    set.getDouble(3),
                    set.getInt(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7),
                    set.getBytes(8)
                 
            );
        }

        return null;

    }

    public int getItemCount() throws ClassNotFoundException, SQLException {
        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("Select COUNT(*) FROM Item").executeQuery();

        if (set.next()) {
            return set.getInt(1);
        }

        return 0;

    }

    public List<String> getItemName() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().prepareStatement("Select iteamName from item").executeQuery();

        List<String> templist = new ArrayList<>();
        while (set.next()) {
            templist.add(set.getString(1));
        }
        return templist;

    }

    public Item getItemObjbyName(String name) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("select * from item where iteamName = '" + name + "'").
                executeQuery();

        if (set.next()) {
            return new Item(
                    set.getString(1),
                    set.getString(2),
                    set.getDouble(3),
                    set.getInt(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7),
                    set.getBytes(8)
                    //set.getString(9)
            );
        }

        return null;

    }

    boolean updateQty(ArrayList<OrderDetails> list) throws ClassNotFoundException, SQLException {

        PreparedStatement stm = Dbcontroller.getInstance().getConnection().
        prepareStatement("Update Item set QtyOnHand =(QtyOnHand - ?) where ItemId = ?");
        
        for(OrderDetails temp:list){
        
            stm.setObject(1, temp.getQty());
            stm.setObject(2, temp.getItemId());
        

        boolean issaved = stm.executeUpdate()>0;
        if(!issaved){
            return false;
        }
        }
        return true;
      
      

      
      
      
      
      
       

    }

    public byte[] getImage(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
        prepareStatement("Select img from item where itemId = '"+id+"'").executeQuery();
        
        if(set.next())
        {
            return set.getBytes(1);
        }
        
        return null;
        

    }

}
