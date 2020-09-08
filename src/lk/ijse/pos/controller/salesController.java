
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.modal.SalesReport;

public class salesController {

    public SalesReport getSalesObj;

    /*public boolean saveSaleList(ArrayList<SalesReport>list) throws ClassNotFoundException, SQLException {
        
        PreparedStatement stm = Dbcontroller.getInstance().getConnection().prepareStatement
         ("Insert into salesreport (Customername,orderID,Item,Catagory,qty,unitPrice,ordertype,paymentMethord,Date,Time,FloorName,TableName,total)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        for(SalesReport temp:list)
        {
            stm.setObject(1, temp.getCustomername());
            stm.setObject(2, temp.getOrderID());
            stm.setObject(3, temp.getItem());
            stm.setObject(4, temp.getCatagory());
            stm.setObject(5, temp.getQty());
            stm.setObject(6, temp.getUnitPrice());
            stm.setObject(7, temp.getOrdertype());
            stm.setObject(8, temp.getPaymentMethord());
            stm.setObject(9, temp.getDate());
            stm.setObject(10, temp.getTime());
            stm.setObject(11, temp.getFloorName());
            stm.setObject(12, temp.getTableName());
            stm.setObject(13, temp.getTotal());
            
           
        }
        
       
       return stm.executeUpdate()>0;
        
        
    }*/

    public List<SalesReport> getSalesList() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("select * from salesreport").executeQuery();

        List<SalesReport>temp=new ArrayList<>();
        while(set.next())
        {
           temp.add(new SalesReport(
                   
                   set.getString(1),
                   set.getString(2),
                   set.getString(3),
                   set.getString(4),
                   set.getString(5),
                   set.getInt(6),
                   set.getDouble(7),
                   set.getString(8),
                   set.getString(9),
                   set.getString(10),
                   set.getString(11),
                   set.getString(12),
                   set.getString(13),
                   set.getDouble(14)
                   
           
           
           
           ));
        }
        return temp;
    }

    public boolean saveSalereport
    (String Customername, String orderid, String item, String catagory,
     int qty, double unitprice, String otype, String paymentmethord,
     String date, String time, String Floorname, String table, double total) 
     throws ClassNotFoundException, SQLException {
   
        PreparedStatement stm = Dbcontroller.getInstance().getConnection().prepareStatement( 
         "Insert into salesreport (Customername,orderID,Item,Catagory,qty,unitPrice,"
                 + "ordertype,paymentMethord,Date,Time,FloorName,TableName,total)values"
                 + "(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
        stm.setObject(1, Customername);
        stm.setObject(2, orderid);
        stm.setObject(3, item);
        stm.setObject(4, catagory);
        stm.setObject(5, qty);
        stm.setObject(6, unitprice);
        stm.setObject(7,otype);
        stm.setObject(8,paymentmethord);
        stm.setObject(9,date);
        stm.setObject(10,time);
        stm.setObject(11,Floorname);
        stm.setObject(12,table);
        stm.setObject(13,total);
      
        
        
        
        return (stm.executeUpdate()>0);
        
    }

    public ResultSet getSearchdata(String text) throws ClassNotFoundException, SQLException {

        PreparedStatement stm = Dbcontroller.getInstance().getConnection().prepareStatement( "Select * FROM salesreport WHERE Customername LIKE '%"+text+"%'");
        ResultSet set=stm.executeQuery();
        return set;
       

    }

    public List<SalesReport> getSalesObj(String orderId) throws ClassNotFoundException, SQLException {
         
        ResultSet set = Dbcontroller.getInstance().getConnection().
          prepareStatement("select * from salesreport WHERE orderID = '"+orderId+"'").
                executeQuery();
        
        ArrayList <SalesReport> temp= new ArrayList<>();
        while(set.next())
        {
            temp.add(new SalesReport(
                    
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getInt(6),
                    set.getDouble(7),
                    set.getString(8),
                    set.getString(9),
                    set.getString(10),
                    set.getString(11),
                    set.getString(12),
                    set.getString(13),
                    set.getDouble(14)
                   
            
            
            
            ));
        }
        
        return temp;
        
    }

    

   
    
    
}
