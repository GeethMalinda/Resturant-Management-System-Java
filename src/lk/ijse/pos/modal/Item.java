
package lk.ijse.pos.modal;

public class Item {
    
    private String ItemId;
    private String CatId;
    private double Price;
    private int QtyOnHand;
    private String iteamName;
    private String Date;
    private String Time;
    private byte[] picture;
  

    public Item(String ItemId, String CatId, double Price, int QtyOnHand, String iteamName, String Date, String Time, byte[] picture) {
        this.ItemId = ItemId;
        this.CatId = CatId;
        this.Price = Price;
        this.QtyOnHand = QtyOnHand;
        this.iteamName = iteamName;
        this.Date = Date;
        this.Time = Time;
        this.picture = picture;
      
    }
 
    
 

    public Item() {
        
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
     * @return the CatId
     */
    public String getCatId() {
        return CatId;
    }

    /**
     * @param CatId the CatId to set
     */
    public void setCatId(String CatId) {
        this.CatId = CatId;
    }

    /**
     * @return the Price
     */
    public double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(double Price) {
        this.Price = Price;
    }

    /**
     * @return the QtyOnHand
     */
    public int getQtyOnHand() {
        return QtyOnHand;
    }

    /**
     * @param QtyOnHand the QtyOnHand to set
     */
    public void setQtyOnHand(int QtyOnHand) {
        this.QtyOnHand = QtyOnHand;
    }

    /**
     * @return the iteamName
     */
    public String getIteamName() {
        return iteamName;
    }

    /**
     * @param iteamName the iteamName to set
     */
    public void setIteamName(String iteamName) {
        this.iteamName = iteamName;
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

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the picture
     */
    public byte[] getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    /**
     * @return the path
     */
 
    
}
