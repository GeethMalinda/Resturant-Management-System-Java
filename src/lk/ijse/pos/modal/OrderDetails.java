
package lk.ijse.pos.modal;


public class OrderDetails {
    
    private String OrderID;
    private String ItemId;
    private int qty;
    private double unitPrice;

    /**
     * @return the OrderID
     */
     
    
   

    @Override
    public String toString() {
        return "OrderDetails{" + "OrderID=" + OrderID + ", ItemId=" + ItemId + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }

    public OrderDetails(String OrderID, String ItemId, int qty, double unitPrice) {
        this.OrderID = OrderID;
        this.ItemId = ItemId;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public OrderDetails() {
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
     * @return the ItemId
     */
    public String getItemId() {
        return ItemId;
    }

    /**
     * @param ItemId the ItemId to set
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
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
    
    
    
}
