/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.modal;

/**
 *
 * @author ASUS
 */
public class Labour {
    
    private String EmpId;
    private String Name;
    private String Sex;
    private String Nic;
    private String Adress;
    private String Tp;

    /**
     * @return the EmpId
     */
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public Labour(String EmpId, String Name, String Sex, String Nic, String Adress, String Tp) {
        this.EmpId = EmpId;
        this.Name = Name;
        this.Sex = Sex;
        this.Nic = Nic;
        this.Adress = Adress;
        this.Tp = Tp;
    }

    public Labour() {
    }

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
     * @return the Sex
     */
    public String getSex() {
        return Sex;
    }

    /**
     * @param Sex the Sex to set
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * @return the Nic
     */
    public String getNic() {
        return Nic;
    }

    /**
     * @param Nic the Nic to set
     */
    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    /**
     * @return the Adress
     */
    public String getAdress() {
        return Adress;
    }

    /**
     * @param Adress the Adress to set
     */
    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    /**
     * @return the Tp
     */
    public String getTp() {
        return Tp;
    }

    /**
     * @param Tp the Tp to set
     */
    public void setTp(String Tp) {
        this.Tp = Tp;
    }
    
    
}
