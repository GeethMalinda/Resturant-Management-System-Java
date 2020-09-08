
package lk.ijse.pos.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaymentController {

    public boolean savePayment(String Orderid, String paymentmethord, double net) throws ClassNotFoundException, SQLException {

        PreparedStatement stm = Dbcontroller.getInstance().getConnection().
         prepareStatement("Insert into payment (OrderID,Total,PaymentType) Values (?,?,?)");
        
        stm.setObject(1, Orderid);
        stm.setObject(2, net);
        stm.setObject(3, paymentmethord);
        
        return stm.executeUpdate()>0;

    }


    
    
    
}
