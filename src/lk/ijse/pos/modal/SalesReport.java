
package lk.ijse.pos.modal;

public class SalesReport {
    private String sid;
    private String Customername;
    private String orderID;
    private String Item;
    private String Catagory;
    private int qty;
    private double unitPrice;
    private String ordertype;
    private String paymentMethord;
    private String Date;
    private String Time;
    private String FloorName;
    private String TableName;
    private double total;

    /**
     * @return the sid
     */
   
    @Override
    public String toString() {
        return "SalesReport{" + "sid=" + sid + ", Customername=" + Customername + ", orderID=" + orderID + ", Item=" + Item + ", Catagory=" + Catagory + ", qty=" + qty + ", unitPrice=" + unitPrice + ", ordertype=" + ordertype + ", paymentMethord=" + paymentMethord + ", Date=" + Date + ", Time=" + Time + ", FloorName=" + FloorName + ", TableName=" + TableName + ", total=" + total + '}';
    }

    public SalesReport(String sid, String Customername, String orderID, String Item, String Catagory, int qty, double unitPrice, String ordertype, String paymentMethord, String Date, String Time, String FloorName, String TableName, double total) {
        this.sid = sid;
        this.Customername = Customername;
        this.orderID = orderID;
        this.Item = Item;
        this.Catagory = Catagory;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.ordertype = ordertype;
        this.paymentMethord = paymentMethord;
        this.Date = Date;
        this.Time = Time;
        this.FloorName = FloorName;
        this.TableName = TableName;
        this.total = total;
    }

    public SalesReport() {
    }

    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the Customername
     */
    public String getCustomername() {
        return Customername;
    }

    /**
     * @param Customername the Customername to set
     */
    public void setCustomername(String Customername) {
        this.Customername = Customername;
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the Item
     */
    public String getItem() {
        return Item;
    }

    /**
     * @param Item the Item to set
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * @return the Catagory
     */
    public String getCatagory() {
        return Catagory;
    }

    /**
     * @param Catagory the Catagory to set
     */
    public void setCatagory(String Catagory) {
        this.Catagory = Catagory;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the ordertype
     */
    public String getOrdertype() {
        return ordertype;
    }

    /**
     * @param ordertype the ordertype to set
     */
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * @return the paymentMethord
     */
    public String getPaymentMethord() {
        return paymentMethord;
    }

    /**
     * @param paymentMethord the paymentMethord to set
     */
    public void setPaymentMethord(String paymentMethord) {
        this.paymentMethord = paymentMethord;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
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
     * @return the FloorName
     */
    public String getFloorName() {
        return FloorName;
    }

    /**
     * @param FloorName the FloorName to set
     */
    public void setFloorName(String FloorName) {
        this.FloorName = FloorName;
    }

    /**
     * @return the TableName
     */
    public String getTableName() {
        return TableName;
    }

    /**
     * @param TableName the TableName to set
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
}

    