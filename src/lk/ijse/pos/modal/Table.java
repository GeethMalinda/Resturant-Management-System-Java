
package lk.ijse.pos.modal;

public class Table {
    
    private String TableID;
    private String FloorId;
    private String TableNo;
    private int Chairs;

    public Table(String TableID, String FloorId, String TableNo, int Chairs) {
        this.TableID = TableID;
        this.FloorId = FloorId;
        this.TableNo = TableNo;
        this.Chairs = Chairs;
    }

    @Override
    public String toString() {
        return "Table{" + "TableID=" + TableID + ", FloorId=" + FloorId + ", TableNo=" + TableNo + ", Chairs=" + Chairs + '}';
    }

   

    
    public Table() {
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
     * @return the FloorId
     */
    public String getFloorId() {
        return FloorId;
    }

    /**
     * @param FloorId the FloorId to set
     */
    public void setFloorId(String FloorId) {
        this.FloorId = FloorId;
    }

    /**
     * @return the TableNo
     */
    public String getTableNo() {
        return TableNo;
    }

    /**
     * @param TableNo the TableNo to set
     */
    public void setTableNo(String TableNo) {
        this.TableNo = TableNo;
    }

    /**
     * @return the Chairs
     */
    public int getChairs() {
        return Chairs;
    }

    /**
     * @param Chairs the Chairs to set
     */
    public void setChairs(int Chairs) {
        this.Chairs = Chairs;
    }
     
}
