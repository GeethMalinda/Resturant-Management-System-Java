package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.pos.modal.Order;

public class OrderController {

    public String getOrderId() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("SELECT OrderID FROM orders ORDER BY OrderID DESC LIMIT 1").
                executeQuery();
        if (set.next()) {
            String tempId = set.getString(1);
            String arr[] = tempId.split("D");
            int id = Integer.parseInt(arr[1]);
            id += 1;
            if (id < 10) {
                return "D00" + id;
            } else if (id < 100) {
                return "D0" + id;
            } else {
                return "D" + id;
            }

        } else {
            return "D001";
        }

    }

    public boolean saveOrder(Order order) throws ClassNotFoundException, SQLException {

        Connection con = null;
        try{
        con= Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Insert into Orders Values (?,?,?,?,?,?,?)");
        con.setAutoCommit(false);
        stm.setObject(1, order.getOrderID());
        stm.setObject(2, order.getOrderDate());
        stm.setObject(3, order.getCustomerID());
        stm.setObject(4, order.getEmpId());
        stm.setObject(5, order.getTableID());
        stm.setObject(6, order.getOrderType());
        stm.setObject(7, order.getTime());
        
        if(stm.executeUpdate()>0){
        
            boolean orderDetailSave = new OrderdetailController().saveOrderdetail(order.getList());
            
            if(!orderDetailSave){
                
                con.rollback();
                return false;
            }
            boolean UpdateQtyOnHand = new ItemController().updateQty(order.getList());
            if(!UpdateQtyOnHand){
                con.rollback();
                return false;
            }
            
                
        }
        con.commit();
        return true;
        
        }
        finally{
            con.setAutoCommit(true);
        }
        
      
    }

}
