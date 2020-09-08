
package lk.ijse.pos.modal;

public class Catagory {
    
    private String CatId;
    private String status;
    private String catagory;

    public Catagory() {
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

    public Catagory(String CatId, String status, String catagory) {
        this.CatId = CatId;
        this.status = status;
        this.catagory = catagory;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the catagory
     */
    public String getCatagory() {
        return catagory;
    }

    /**
     * @param catagory the catagory to set
     */
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    
    
}
