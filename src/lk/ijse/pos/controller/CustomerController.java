
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pos.modal.Customer;

public class CustomerController {

    public boolean saveCustomer(Customer obj) throws ClassNotFoundException, SQLException {
       
        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("Insert into Customer Values(?,?,?)");
        
        stm.setObject(1, obj.getCustomerID());
        stm.setObject(2, obj.getName());
        stm.setObject(3, obj.getType());
        
        return stm.executeUpdate()>0;
        
        
        
        
    }

    public List<Customer> getCustomerList() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
                prepareStatement("select * from Customer").executeQuery();

        List<Customer>templist = new ArrayList<>();
        while(set.next())
        {
            templist.add(new Customer(
            
                    set.getString(1),
                    set.getString(2),
                    set.getString(3)
            
            ));
        }
        return templist;
    }

    public boolean updateCustomer(Customer obj) throws ClassNotFoundException, SQLException {

        Connection con=Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement
        ("Update Customer set CustomerID=?,Name =?,Type =? Where CustomerID =?");
         
        stm.setObject(1, obj.getCustomerID());
        stm.setObject(2, obj.getName());
        stm.setObject(3, obj.getType());
        stm.setObject(4, obj.getCustomerID());
        
        return stm.executeUpdate()>0;
        

    }

    public Customer getCustomerObj(String id) throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection()
         .prepareStatement("Select * from Customer where CustomerID = '"+id+"'")
                .executeQuery();
        
        if(set.next())
        {
            return (new Customer(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3)
            
            ));
        }
        return null;


    }

    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {

        Connection con = Dbcontroller.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement
        ("Delete from Customer Where CustomerID ='"+id+"'");
        
        return stm.executeUpdate()>0;

    }

    public int getCustomerCount() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().
               prepareStatement("Select Count(*) from Customer").executeQuery();
        
        if(set.next())
        {
            return set.getInt(1);
        }


        return 0;
    }

    public List<String> getCustomerName() throws ClassNotFoundException, SQLException {

        ResultSet set = Dbcontroller.getInstance().getConnection().prepareStatement
        ("Select Name FROM Customer").executeQuery();
        List<String>templist = new ArrayList<>();
        while(set.next())
        {
            templist.add(set.getString(1));
        }
        return templist;


    }

    public Customer getCustomerObjByName(String name) throws ClassNotFoundException, SQLException {
        ResultSet set = Dbcontroller.getInstance().getConnection().prepareStatement("Select * from Customer Where Name = '"+name+"'").executeQuery();
        if(set.next())
        {
            return new Customer(
            
                    set.getString(1),
                    set.getString(2),
                    set.getString(3)
            
            );
        }
        return null;

    }
}
    
    
    

