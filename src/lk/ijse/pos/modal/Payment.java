
package lk.ijse.pos.modal;

public class Payment {
 
 private String  PID ;    
 private String OrderID; 
 private double Total;
 private String PaymentType;

 
    @Override
    public String toString() {
        return "Payment{" + "PID=" + PID + ", OrderID=" + OrderID + ", Total=" + Total + ", PaymentType=" + PaymentType + '}';
    }

    public Payment(String PID, String OrderID, double Total, String PaymentType) {
        this.PID = PID;
        this.OrderID = OrderID;
        this.Total = Total;
        this.PaymentType = PaymentType;
    }

    public Payment() {
    }

    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
    }

    /**
     * @return the OrderID
     */
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
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }

    /**
     * @return the PaymentType
     */
    public String getPaymentType() {
        return PaymentType;
    }

    /**
     * @param PaymentType the PaymentType to set
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }
 
 
}

