
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import lk.ijse.pos.view.OrderView;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class IreportController extends JFrame{
    
  /* public IreportController(String filename ,HashMap parameters) {
       
       try {
           Connection con = Dbcontroller.getInstance().getConnection();
           
            JasperPrint print = JasperFillManager.fillReport(filename, parameters ,con);
           
           
           
           
           
           
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(IreportController.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(IreportController.class.getName()).log(Level.SEVERE, null, ex);
       } catch (JRException ex) {
           Logger.getLogger(IreportController.class.getName()).log(Level.SEVERE, null, ex);
       }
       setBounds(10,10,600,500);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       
       
       
   }
  
    
    

public static void main(String [] args){
    
    HashMap param = new HashMap();
    param.put("orderID", OrderView.getOid());
    
    IreportController showme = new IreportController
    ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\MyProjectResturant\\src\\lk\\ijse\\pos\\view\\Bill.jrxml", param);
     showme.setVisible(true);
    
    
}*/
}

