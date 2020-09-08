package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.pos.modal.OrderDetails;

public class OrderdetailController {

    boolean saveOrderdetail(ArrayList<OrderDetails> list) throws ClassNotFoundException, SQLException {
       for(OrderDetails temp:list)
       {
           Connection con =Dbcontroller.getInstance().getConnection();
           PreparedStatement stm = con.prepareStatement("Insert into orderdetails Values (?,?,?,?)");
           
           stm.setObject(1, temp.getOrderID());
           stm.setObject(2, temp.getItemId());
           stm.setObject(3, temp.getQty());
           stm.setObject(4, temp.getUnitPrice());
           
           boolean isSaved = stm.executeUpdate()>0;
           if(!isSaved){
               
               return false;
               
           }
           
       }
       return true;
        

      
    }

}
