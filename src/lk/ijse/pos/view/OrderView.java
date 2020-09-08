/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import lk.ijse.pos.controller.CatagoryController;
import lk.ijse.pos.controller.CustomerController;
import lk.ijse.pos.controller.Dbcontroller;
import lk.ijse.pos.controller.FloorController;
import lk.ijse.pos.controller.ItemController;
import lk.ijse.pos.controller.LabourController;
import lk.ijse.pos.controller.LoginController;
import lk.ijse.pos.controller.OrderController;
import lk.ijse.pos.controller.PaymentController;
import lk.ijse.pos.controller.TableController;
import lk.ijse.pos.controller.salesController;
import lk.ijse.pos.modal.Customer;
import lk.ijse.pos.modal.Item;
import lk.ijse.pos.modal.Order;
import lk.ijse.pos.modal.OrderDetails;
import lk.ijse.pos.modal.SalesReport;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
//import sun.java2d.pipe.SpanShapeRenderer;

public class OrderView extends javax.swing.JPanel {

    public static String getOid() {

        return OrderId;


    }

    public OrderView() {
        try {
            initComponents();
            setEmployeeName();
            setDateTime();
            setOrderId();
            getCustomerList();
            getItemList();
            getFloorList();
             getTableName();
            //setPaymentId();
            getCatagoryName();
            // getTableId();
            setItemImage();
            
            
            
            AutoCompleteDecorator.decorate(cmbCustomerName);
            AutoCompleteDecorator.decorate(cmbItemName);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static String Employeeid;
    //List<String>tableName; 
    static String catagoryname;
    List<String> tableId;
    String FloorId;
    //String tableName;
    static String Floorname;
    static String TableID;
    static double net ;
    static String Customername;
    static String ItemName;
    static String time;
    static String Date;
    static String ordertype;
    static String paymentmethord ;
    String tablename;
    static String OrderId;
    
    
    
    
    

    Date date = new Date();
    SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
    SimpleDateFormat format2 = new SimpleDateFormat("HH.mm.ss");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmpID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbItemName = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbFloor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbCustomerName = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cmbPaymentMethord = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cmbOrderType = new javax.swing.JComboBox<>();
        cmbTable = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtItemId = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        TxtDate = new javax.swing.JTextField();
        TxtTime = new javax.swing.JTextField();
        txtCustomerType = new javax.swing.JTextField();
        txtCatagoryId = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        TxtOrderId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        lblnetTotal = new javax.swing.JLabel();
        btnAddtoCart = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpID.setBackground(new java.awt.Color(204, 0, 51));
        lblEmpID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmpID.setText("Label");
        add(lblEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Manage Order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Catagory Id");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Item id");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        cmbItemName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemNameItemStateChanged(evt);
            }
        });
        add(cmbItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Order Id");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total price");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Time");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, -1, -1));

        cmbFloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbFloor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFloorItemStateChanged(evt);
            }
        });
        add(cmbFloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 250, 33));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Customer name");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cust_ID");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Customer Type");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Item name");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Order Type");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("qty");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        cmbCustomerName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerNameItemStateChanged(evt);
            }
        });
        cmbCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerNameActionPerformed(evt);
            }
        });
        add(cmbCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 33));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("unit Price");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        cmbPaymentMethord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbPaymentMethord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Card Payment", "Cash On Hand" }));
        add(cmbPaymentMethord, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 250, 33));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Table");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 40, -1));

        cmbOrderType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbOrderType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "VIP", "Family", "couple" }));
        cmbOrderType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrderTypeItemStateChanged(evt);
            }
        });
        cmbOrderType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrderTypeActionPerformed(evt);
            }
        });
        add(cmbOrderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 250, 33));

        cmbTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbTable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTableItemStateChanged(evt);
            }
        });
        cmbTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTableActionPerformed(evt);
            }
        });
        add(cmbTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 250, 33));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Floor");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 40, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itemcode", "Catagory", "ItemName", "Qty", "UnitPrice", "Order_Type", "Payment_Method", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1220, 240));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Payment Methord");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 250, 33));

        txtItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIdActionPerformed(evt);
            }
        });
        add(txtItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 250, 33));

        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });
        add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 250, 33));

        TxtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDateActionPerformed(evt);
            }
        });
        add(TxtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 250, 33));

        TxtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTimeActionPerformed(evt);
            }
        });
        add(TxtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 280, 33));

        txtCustomerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerTypeActionPerformed(evt);
            }
        });
        add(txtCustomerType, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 280, 33));

        txtCatagoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatagoryIdActionPerformed(evt);
            }
        });
        add(txtCatagoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 280, 33));

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });
        add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 280, 33));

        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 250, 33));

        TxtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOrderIdActionPerformed(evt);
            }
        });
        add(TxtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 250, 33));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Remove From Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, -1, 40));

        btnPlaceOrder.setBackground(new java.awt.Color(0, 153, 51));
        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPlaceOrder.setText("Pace Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 740, -1, 40));

        lblnetTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblnetTotal.setForeground(new java.awt.Color(153, 0, 0));
        lblnetTotal.setText("Net Total");
        add(lblnetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 760, -1, -1));

        btnAddtoCart.setBackground(new java.awt.Color(0, 153, 51));
        btnAddtoCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddtoCart.setText("Add to Cart");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });
        add(btnAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, -1, 40));

        jButton4.setBackground(new java.awt.Color(0, 153, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Add to Cart");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, -1, 40));

        jLabel3.setBackground(new java.awt.Color(153, 0, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Operator");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 320, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed


    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemIdActionPerformed

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void TxtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDateActionPerformed

    private void TxtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTimeActionPerformed

    private void txtCustomerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerTypeActionPerformed

    private void txtCatagoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatagoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatagoryIdActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void TxtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOrderIdActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed

        try {
            String Orderid = TxtOrderId.getText();
            Date = TxtDate.getText();
            String CustomerID = txtCustomerId.getText();
            String Empid = Employeeid;
            String tableid = cmbTable.getSelectedItem().toString();
            String OrderType = cmbOrderType.getSelectedItem().toString();
            time = format2.format(date);
            ArrayList<OrderDetails> list = new ArrayList<>();
            DefaultTableModel modal = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < modal.getRowCount(); i++) {
                list.add(new OrderDetails(
                        Orderid,
                        modal.getValueAt(i, 0).toString(),
                        Integer.parseInt( modal.getValueAt(i, 3).toString()),
                        Double.parseDouble( modal.getValueAt(i, 4).toString())
                ));
            }
            Order order = new Order(Orderid, Date, CustomerID, Empid, tableid, OrderType, time, list);
            
            System.out.println("order = " + order);
            boolean isSave = new OrderController().saveOrder(order);

            System.out.println("isSave = " + isSave);

       //////////////////////////////////////////////////////////////////////////////////////////////
       
        paymentmethord = cmbPaymentMethord.getSelectedItem().toString();
        boolean SavePayment= new PaymentController().savePayment(Orderid,paymentmethord,net);
       
            System.out.println(SavePayment);
        
         
       /////////////////////////////////////////////////////////////////////////////////////////////
       TableID =cmbTable.getSelectedItem().toString();
       Floorname = cmbFloor.getSelectedItem().toString();
       net=this.net;
       Customername =cmbCustomerName.getSelectedItem().toString();
       ItemName =cmbItemName.getSelectedItem().toString();
       ordertype = cmbOrderType.getSelectedItem().toString();
       //////////////////////////////////////////////////////////////////////////////////////////////
       //ArrayList<SalesReport> saleslist = new ArrayList();
       //DefaultTableModel modal= (DefaultTableModel) jTable1.getModel();
       for(int i =0;i<modal.getRowCount();i++)
       {
            
                
                boolean saveSalesList = new salesController().saveSalereport(
                        Customername,
                        OrderId= TxtOrderId.getText(),
                        modal.getValueAt(i,2).toString(),
                        modal.getValueAt(i, 1).toString(),
                        Integer.parseInt(modal.getValueAt(i,3).toString()),
                        Double.parseDouble(modal.getValueAt(i,4).toString()) ,
                        modal.getValueAt(i,5).toString(),
                        modal.getValueAt(i,6).toString(),
                        TxtDate.getText(),
                        time,
                        Floorname,
                        cmbTable.getSelectedItem().toString(),
                        Double.parseDouble(modal.getValueAt(i, 7).toString())
                        
                );
       }
                
            ////////////////////////////////////////////////////////////////////////////////////////////    
            
            BillPrint print = new BillPrint();
            print.setVisible(true);
            /////////////////////////////////////////////////////////////////////////////////////////////
            
            
                Connection con = Dbcontroller.getInstance().getConnection();
                JasperDesign jdeDesign = JRXmlLoader.load("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\MyProjectResturant\\src\\lk\\ijse\\pos\\view\\Bill.jrxml");
                String query = "select * from salesreport Where orderId ='"+OrderId+"'";
                
          
                JRDesignQuery updateQuery = new JRDesignQuery();
                updateQuery.setText(query);
                
                jdeDesign.setQuery(updateQuery);
                
                JasperReport jreReport = JasperCompileManager.compileReport(jdeDesign);
                JasperPrint jpriPrint = JasperFillManager.fillReport(jreReport, null,con);
          
                JasperViewer.viewReport(jpriPrint);
                
           
                
           
           
            } 
        catch (ClassNotFoundException | NumberFormatException | SQLException | JRException e) 
        {
           
       }
        
       


    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void cmbOrderTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrderTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrderTypeActionPerformed

    private void cmbCustomerNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerNameItemStateChanged

        try {
            Customer c1 = new CustomerController().getCustomerObjByName(cmbCustomerName.getSelectedItem().toString());
            txtCustomerId.setText(c1.getCustomerID());
            txtCustomerType.setText(c1.getType());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cmbCustomerNameItemStateChanged

    private void cmbItemNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemNameItemStateChanged

        try {
            Item item = new ItemController().getItemObjbyName(cmbItemName.getSelectedItem().toString());
            txtCatagoryId.setText(item.getCatId());
            txtUnitPrice.setText(String.valueOf(item.getPrice()));
            txtItemId.setText(item.getItemId());

            /////////////////////////////////////////////////////////////////////////////////////////////
            setItemImage();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cmbItemNameItemStateChanged

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        try {
            double qty = Double.parseDouble(txtQty.getText());
            double unitprice = Double.parseDouble(txtUnitPrice.getText());
            double total = qty * unitprice;
            txtTotalPrice.setText(String.valueOf(total));
        } catch (Exception e) {
            System.out.println("Qty field empty");
        }
        txtTotalPrice.setBackground(Color.green);


    }//GEN-LAST:event_txtQtyKeyReleased

    private void cmbTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTableActionPerformed

    private void cmbOrderTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrderTypeItemStateChanged

       

    }//GEN-LAST:event_cmbOrderTypeItemStateChanged

    private void cmbFloorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFloorItemStateChanged

        try {
            FloorId = new FloorController().getFloorIdFromName(cmbFloor.getSelectedItem().toString());
            // List<String>tableName = new TableController().getTableNoList(FloorId);
            tableId = new TableController().getTableID(FloorId);
            cmbTable.removeAllItems();
            for (String temp : tableId) {

                cmbTable.addItem(temp);
            }
            ///////////////////////////////////////////////////////////////////////////////////////
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cmbFloorItemStateChanged

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed

        DefaultTableModel modal = (DefaultTableModel) jTable1.getModel();

        int qty = Integer.parseInt(txtQty.getText());
        double unitprice = Double.parseDouble(txtUnitPrice.getText());
        double total = qty * unitprice;

        int rowNumber = isAlreadyExists(txtItemId.getText());
        if (rowNumber == -1) {
            Object[] rowdata = {
                txtItemId.getText(),
                catagoryname,
                cmbItemName.getSelectedItem().toString(),
                txtQty.getText(),
                txtUnitPrice.getText(),
                //cmbFloor.getSelectedItem().toString(),
                //cmbTable.getSelectedItem().toString(),
                cmbOrderType.getSelectedItem().toString(),
                cmbPaymentMethord.getSelectedItem().toString(),
                txtTotalPrice.getText()

            };
            modal.addRow(rowdata);
        } else {

            qty += Integer.parseInt(modal.getValueAt(rowNumber, 3).toString());
            total = qty * unitprice;
            //String floor = cmbFloor.getSelectedItem().toString();
           // String table = cmbTable.getSelectedItem().toString();
            String paymentmethord = cmbPaymentMethord.getSelectedItem().toString();
            String orderType = cmbOrderType.getSelectedItem().toString();
            jTable1.setValueAt(qty, rowNumber, 3);
            jTable1.setValueAt(total, rowNumber, 7);
           // jTable1.setValueAt(floor, rowNumber, 5);
           // jTable1.setValueAt(table, rowNumber, 6);
            jTable1.setValueAt(orderType, rowNumber, 5);
            jTable1.setValueAt(paymentmethord, rowNumber, 6);

        }
        calculate(modal);


    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel modal = (DefaultTableModel) jTable1.getModel();
        int rowid = jTable1.getSelectedRow();
        if (rowid == -1) {
            return;
        }
        modal.removeRow(rowid);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbTableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTableItemStateChanged

        System.out.println(tablename);

    }//GEN-LAST:event_cmbTableItemStateChanged

    private void cmbCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerNameActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_cmbCustomerNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDate;
    private javax.swing.JTextField TxtOrderId;
    private javax.swing.JTextField TxtTime;
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> cmbCustomerName;
    private javax.swing.JComboBox<String> cmbFloor;
    private javax.swing.JComboBox<String> cmbItemName;
    private javax.swing.JComboBox<String> cmbOrderType;
    private javax.swing.JComboBox<String> cmbPaymentMethord;
    private javax.swing.JComboBox<String> cmbTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblnetTotal;
    private javax.swing.JTextField txtCatagoryId;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerType;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void setEmployeeName() throws ClassNotFoundException, SQLException {

        Employeeid = new LoginView().EmpId;
        String employeename = new LabourController().getEmployeeName(Employeeid);
        lblEmpID.setText(employeename);

    }

    private void setDateTime() throws ClassNotFoundException, SQLException {

        
        TxtDate.setText(format1.format(date));
        TxtTime.setText(format2.format(date));

    }

    private void getCustomerList() throws ClassNotFoundException, SQLException {

        List<String> CustomerName = new CustomerController().getCustomerName();
        for (String temp : CustomerName) {
            cmbCustomerName.addItem(temp);
        }

    }

    private void getItemList() throws ClassNotFoundException, SQLException {

        List<String> itemname = new ItemController().getItemName();
        for (String temp : itemname) {
            cmbItemName.addItem(temp);
        }

    }

  /*  private void setPaymentId() throws ClassNotFoundException, SQLException {

        String PID = new PaymentController().getPaymentId();
        txtPID.setText(PID);

    }*/

    private void getFloorList() throws ClassNotFoundException, SQLException {

        List<String> floorname = new FloorController().getFloorNameList();
        for (String temp : floorname) {
            cmbFloor.addItem(temp);
        }
    }

    private void getCatagoryName() throws ClassNotFoundException, SQLException {

        catagoryname = new CatagoryController().getCatagoryName(txtCatagoryId.getText());

    }

    private int isAlreadyExists(String code) {

        DefaultTableModel modal = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < modal.getRowCount(); i++) {
            String temp = (String) modal.getValueAt(i, 0);
            if (temp.equals(code)) {
                return i;
            }
        }
        return -1;

    }

    private void calculate(DefaultTableModel modal) {

        net = 0;

        for (int i = 0; i < modal.getRowCount(); i++) {
            net += Double.parseDouble(modal.getValueAt(i, 7).toString());
        }

        lblnetTotal.setText("NetTotal " + net + "/=");

    }

    /*private void getTableId() throws ClassNotFoundException, SQLException {

        


    }*/

  private void getTableName() throws ClassNotFoundException, SQLException {

        tablename=new TableController().getTableName(cmbTable.getSelectedItem().toString());
        


    }

    private void setOrderId() throws ClassNotFoundException, SQLException {

        String orderid = new OrderController().getOrderId();
        TxtOrderId.setText(orderid);


    }

    private void setItemImage() throws ClassNotFoundException, SQLException {

       
            byte[]image = new ItemController().getImage(txtItemId.getText());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance( 320,170, Image.SCALE_SMOOTH));
            lblimage.setIcon(imageicon);
        


    }

  
}
