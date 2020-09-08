/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view;

//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.scene.AccessibleAttribute;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.pos.controller.CatagoryController;
import lk.ijse.pos.controller.ItemController;
//import lk.ijse.pos.modal.Catagory;
import lk.ijse.pos.modal.Item;

/**
 *
 * @author ASUS
 */
public class ItemView extends javax.swing.JPanel {
    
    
    public ItemView() {
        try {
            initComponents();
            addAllcatagories();
            setDateAndTime();
            ItemList();
            this.img=null;
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCatagory = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        btncleartext = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnimg = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1250, 800));
        setPreferredSize(new java.awt.Dimension(1250, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/icon/icons8_pizza_48px.png"))); // NOI18N
        jLabel1.setText("Manage Items");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 330, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Price");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 30));

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 410, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 60, 30));

        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 410, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Item Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 30));

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });
        add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 410, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Item Id ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 30));

        txtItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIdActionPerformed(evt);
            }
        });
        add(txtItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 410, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 30));

        cmbCatagory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCatagoryItemStateChanged(evt);
            }
        });
        cmbCatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCatagoryActionPerformed(evt);
            }
        });
        add(cmbCatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 500, 30));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Id", "Item Name", "Price", "Catagory", "Quentity", "Date ", "Time", "image"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 1180, 340));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Time");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Catagory");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 80, 30));

        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 410, 30));

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 410, 30));

        lblimage.setBackground(new java.awt.Color(255, 255, 255));
        add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 470, 180));

        btncleartext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncleartext.setText("Clear Text");
        btncleartext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleartextActionPerformed(evt);
            }
        });
        add(btncleartext, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 100, -1));

        btnDelete.setBackground(new java.awt.Color(204, 0, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 730, 130, 50));

        btnEdit.setBackground(new java.awt.Color(0, 153, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 730, 130, 50));

        btnAdd.setBackground(new java.awt.Color(0, 0, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 130, 50));

        btnimg.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnimg.setText("choose");
        btnimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimgActionPerformed(evt);
            }
        });
        add(btnimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIdActionPerformed

        if(txtItemId.getText().length()>0)
        {
            try {
                Item obj = new ItemController().getItemObj(txtItemId.getText().trim());
                
                
                String catname=new ItemController().getCatagoryName(obj.getCatId());
                
                if(obj != null)
                {
                    txtItemName.setText(obj.getIteamName());
                    txtprice.setText(String.valueOf(obj.getPrice()));
                    txtqty.setText(String.valueOf(obj.getQtyOnHand()));
                    txtDate.setText(obj.getDate());
                    txtTime.setText(obj.getTime());
                    cmbCatagory.setSelectedItem(catname);
                    byte[]pic = obj.getPicture();
                    ImageIcon imageicon = new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(lblimage.getWidth(), lblimage.getHeight(),Image.SCALE_SMOOTH));
                    lblimage.setIcon(imageicon);
                    
                }
                
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Please Insert Id","Error",JOptionPane.ERROR_MESSAGE);
        }



        
    }//GEN-LAST:event_txtItemIdActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void cmbCatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCatagoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCatagoryActionPerformed

    private void cmbCatagoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCatagoryItemStateChanged


        try {
            CatId = new ItemController().getCatagoryId(cmbCatagory.getSelectedItem().toString());
            System.out.println(CatId);
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }//GEN-LAST:event_cmbCatagoryItemStateChanged

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked

        try {
            DefaultTableModel modal = (DefaultTableModel) tbl.getModel();
            int row = tbl.getSelectedRow();
            String id= modal.getValueAt(row, 3).toString();
             catagoryname = new ItemController().getCatagoryName(id);
            
            
            txtItemId.setText(modal.getValueAt(row, 0).toString());
            txtItemName.setText(modal.getValueAt(row, 1).toString());
            txtprice.setText(modal.getValueAt(row, 2).toString());
            cmbCatagory.setSelectedItem(catagoryname);
            txtqty.setText(modal.getValueAt(row, 4).toString());
            txtDate.setText(modal.getValueAt(row, 5).toString());
            txtTime.setText(modal.getValueAt(row, 6).toString());
            try
            {
            byte[]pic = new ItemController().getItemList().get(row).getPicture();
            ImageIcon imageicon = new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(lblimage.getWidth(), lblimage.getHeight(),Image.SCALE_SMOOTH));
            lblimage.setIcon(imageicon);
            img=pic;
            }
              catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"set Image","Warnig",JOptionPane.WARNING_MESSAGE);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }
        



        
    }//GEN-LAST:event_tblMouseClicked

    private void btncleartextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleartextActionPerformed
        txtItemId.setText("");
        txtItemName.setText("");
        txtDate.setText("");
        txtTime.setText("");
        txtprice.setText("");
        txtqty.setText("");
        cmbCatagory.setSelectedIndex(0);
       
        lblimage.setIcon(null);
        
        
    }//GEN-LAST:event_btncleartextActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        
        if(txtItemId.getText().length()>0)
        {
            try {
                boolean isDeleted = new ItemController().DeleteItem(txtItemId.getText().trim());
                 if(isDeleted)
                {
                    JOptionPane.showMessageDialog(null, "Deleted");
                    ItemList();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Try again","Warning",JOptionPane.WARNING_MESSAGE);
                }
                
                
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please Insert Id","Error",JOptionPane.ERROR_MESSAGE);
        }

        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if(txtItemId.getText().length()>0)
        {
            try {
                
                DefaultTableModel modal = (DefaultTableModel) tbl.getModel();
                int row = tbl.getSelectedRow();
                String id =txtItemId.getText();
                
                double price = Double.parseDouble(txtprice.getText());
                int qty = Integer.parseInt(txtqty.getText());
                String name = txtItemName.getText();
                String Date = format1.format(date);
                String time=format2.format(date);
               // byte[]pic = new ItemController().getItemList().get(row).getPicture();
                //String fileName = new ItemController().getItemList().get(row).getPath();
               //Item object = new ItemController().getItemObj(id);
              /// byte[]pic = object.getPicture();
              // String fileName = object.getPath();
               
                
                
                Item  obj = new Item(id, CatId, price, qty, name, Date, time,img);
                
                boolean isUpdate = new ItemController().updateItem(obj);
                
                if(isUpdate)
                {
                    JOptionPane.showMessageDialog(this, "Updated..");
                    ItemList();
                }
                else
                {
                    try
                    {
                    
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(this, "Try again","Warning",JOptionPane.WARNING_MESSAGE);
                    }
                }
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "Please Insert Id..","Error",JOptionPane.ERROR_MESSAGE);
        }
       

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

         String id =txtItemId.getText();
            String cataId =CatId;
            double price = Double.parseDouble(txtprice.getText());
            int qty = Integer.parseInt(txtqty.getText());
            String name = txtItemName.getText();
            String Date = format1.format(date);
            String time=format2.format(date);
            
            if(txtItemId.getText().length()>0)
            {
             try {
                 Item obj = new Item(id, CatId, price, qty, name, Date, time, img);
                 boolean isSaved = new ItemController().saveItem(obj);
                 ItemList();
                 if(isSaved)
                 {
                     JOptionPane.showMessageDialog(null, "Saved");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "Try Again","Warning",JOptionPane.WARNING_MESSAGE);
                 }} catch (ClassNotFoundException ex) {
                 Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
             }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please Inset Id..","Error",JOptionPane.ERROR_MESSAGE);
            }
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblimage.getWidth(), lblimage.getHeight(),Image.SCALE_SMOOTH));
        lblimage.setIcon(imageicon);
        try
        {
            
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readnum;(readnum=fis.read(buf)) != -1;)
            {
                bos.write(buf,0,readnum);
            }
            img=bos.toByteArray();
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e );
        }
        
    }//GEN-LAST:event_btnimgActionPerformed


    String CatId;
    String catagoryname;
    SimpleDateFormat format1= new SimpleDateFormat("YYYY-MM-dd");
    SimpleDateFormat format2= new SimpleDateFormat("HH:mm:ss");
    String filename = null;
    byte [] img;

    
     Date date = new Date();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btncleartext;
    private javax.swing.JButton btnimg;
    private javax.swing.JComboBox<String> cmbCatagory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables

    private void addAllcatagories() throws SQLException, ClassNotFoundException {
        List<String>catagorynames= new CatagoryController().getCatagoryname();
        for(String temp :catagorynames)
        {
            cmbCatagory.addItem(temp);
        }
        
        
        
      
    }

    private void setDateAndTime() {
       
       
       
        
        txtDate.setText(format1.format(date));
        txtTime.setText(format2.format(date));
    }

    private void ItemList() throws SQLException, ClassNotFoundException {

        DefaultTableModel modal= (DefaultTableModel) tbl.getModel();
        modal.setRowCount(0);
        List<Item> ItemList = new ItemController().getItemList();
        for(Item temp :ItemList)
        {
        modal.addRow(new Object[]{
            temp.getItemId(),
            temp.getIteamName(),
            temp.getPrice(),
            temp.getCatId(),
            temp.getQtyOnHand(),
            temp.getDate(),
            temp.getTime(),
            temp.getPicture()
                
                
            
            
        });
        
        }
        


    }

  
}
