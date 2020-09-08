
package lk.ijse.pos.modal;

public class Floor {
    private String FloorId;
    private String Name;
    private String Entry_Date;

    public Floor() {
    }

    public Floor(String FloorId, String Name, String Entry_Date) {
        this.FloorId = FloorId;
        this.Name = Name;
        this.Entry_Date = Entry_Date;
    }

    /**
     * @return the FloorId
     */
    
   

    @Override
    public String toString() {
        return "Floor{" + "FloorId=" + FloorId + ", Name=" + Name + ", Entry_Date=" + Entry_Date + '}';
    }

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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Entry_Date
     */
    public String getEntry_Date() {
        return Entry_Date;
    }

    /**
     * @param Entry_Date the Entry_Date to set
     */
    public void setEntry_Date(String Entry_Date) {
        this.Entry_Date = Entry_Date;
    }
    
}

   