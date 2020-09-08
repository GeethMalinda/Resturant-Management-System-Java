
package lk.ijse.pos.modal;

import java.util.ArrayList;

public class Order {
    
    private String OrderID;
    private String OrderDate;
    private String CustomerID;
    private String EmpId;
    private String TableID;
    private String OrderType;
    private String Time;
    private ArrayList<OrderDetails> list;

    /**
     * @return the OrderID
     */
    
   

    public Order(String OrderID, String OrderDate, String CustomerID, String EmpId, String TableID, String OrderType, String Time, ArrayList<OrderDetails> list) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.CustomerID = CustomerID;
        this.EmpId = EmpId;
        this.TableID = TableID;
        this.OrderType = OrderType;
        this.Time = Time;
        this.list = list;
    }

    public Order() {
    }

    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the OrderDate
     */
    public String getOrderDate() {
        return OrderDate;
    }

    /**
     * @param OrderDate the OrderDate to set
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * @return the CustomerID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID the CustomerID to set
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return the PID
     */
   

    /**
     * @return the EmpId
     */
    public String getEmpId() {
        return EmpId;
    }

    /**
     * @param EmpId the EmpId to set
     */
    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    /**
     * @return the TableID
     */
    public String getTableID() {
        return TableID;
    }

    /**
     * @param TableID the TableID to set
     */
    public void setTableID(String TableID) {
        this.TableID = TableID;
    }

    /**
     * @return the OrderType
     */
    public String getOrderType() {
        return OrderType;
    }

    /**
     * @param OrderType the OrderType to set
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @return the list
     */
    public ArrayList<OrderDetails> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<OrderDetails> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", OrderDate=" + OrderDate + ", CustomerID=" + CustomerID + ", EmpId=" + EmpId + ", TableID=" + TableID + ", OrderType=" + OrderType + ", Time=" + Time + ", list=" + list + '}';
    }

    
    
    
}
