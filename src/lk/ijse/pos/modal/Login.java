
package lk.ijse.pos.modal;


public class Login {
    
    private int LoginId;
    private String EmpId;
    private String username;
    private String passward;

    public Login() {
    }

    public Login(int LoginId, String EmpId, String username, String passward) {
        this.LoginId = LoginId;
        this.EmpId = EmpId;
        this.username = username;
        this.passward = passward;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * @return the LoginId
     */
    public int getLoginId() {
        return LoginId;
    }

    /**
     * @param LoginId the LoginId to set
     */
    public void setLoginId(int LoginId) {
        this.LoginId = LoginId;
    }

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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the passward
     */
    public String getPassward() {
        return passward;
    }

    /**
     * @param passward the passward to set
     */
    public void setPassward(String passward) {
        this.passward = passward;
    }
    
}
