
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.*;
public class booking extends javax.swing.JFrame {

    public booking() {
        initComponents();
        setTitle("Fill Form");
        setLocationRelativeTo(null);
        taxtf.setEnabled(false);
        subtotaltf.setEnabled(false);
        totaltf.setEnabled(false);
        ct.setEnabled(false);
        cn.setEnabled(false);
        ex.setEnabled(false);
        cvc.setEnabled(false);
        jButton5.setEnabled(false);
        pay.setEnabled(false);
        jButton2.setEnabled(false);
        otp.setEnabled(false);       
        otp.setForeground(Color.DARK_GRAY); 
        area.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        agetf = new javax.swing.JTextField();
        cls = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        prs = new javax.swing.JLabel();
        taxtf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        subtotaltf = new javax.swing.JTextField();
        totaltf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        gen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        date = new com.toedter.calendar.JDateChooser();
        pay = new javax.swing.JButton();
        otp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        ex = new javax.swing.JTextField();
        cvc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ct = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 20, 60, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Gender :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 180, 53, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 60, 90, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Last name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 100, 80, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Age :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 140, 40, 20);
        jPanel1.add(fn);
        fn.setBounds(110, 60, 250, 30);

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln);
        ln.setBounds(110, 100, 250, 30);

        agetf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                agetfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                agetfFocusLost(evt);
            }
        });
        agetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agetfActionPerformed(evt);
            }
        });
        agetf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agetfKeyTyped(evt);
            }
        });
        jPanel1.add(agetf);
        agetf.setBounds(110, 140, 250, 30);

        cls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AC First Class", "AC 2-Tier", "AC 3-Tier", "First Class", "Sleeper", "Second Sitting" }));
        cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsActionPerformed(evt);
            }
        });
        jPanel1.add(cls);
        cls.setBounds(110, 220, 250, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText(" Class:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 220, 53, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 260, 95, 25);

        prs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(prs);
        prs.setBounds(141, 409, 0, 0);
        jPanel1.add(taxtf);
        taxtf.setBounds(110, 310, 250, 30);

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(150, 430, 110, 23);

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.setText("Tax :");
        jPanel1.add(price);
        price.setBounds(40, 310, 40, 17);
        jPanel1.add(subtotaltf);
        subtotaltf.setBounds(110, 350, 250, 30);
        jPanel1.add(totaltf);
        totaltf.setBounds(110, 390, 250, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Subtotal :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 350, 70, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 390, 60, 17);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 430, 100, 23);

        jButton4.setText("<-- Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(270, 430, 90, 23);

        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female", "Other" }));
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });
        jPanel1.add(gen);
        gen.setBounds(110, 180, 100, 30);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(740, 10, 260, 450);
        jPanel1.add(date);
        date.setBounds(220, 180, 140, 30);

        pay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel1.add(pay);
        pay.setBounds(570, 280, 57, 25);

        otp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                otpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                otpFocusLost(evt);
            }
        });
        jPanel1.add(otp);
        otp.setBounds(490, 240, 220, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(560, 200, 73, 25);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Expire on.");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(390, 160, 70, 17);
        jPanel1.add(ex);
        ex.setBounds(490, 150, 80, 30);
        jPanel1.add(cvc);
        cvc.setBounds(620, 150, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("CVC :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(580, 160, 35, 17);

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        cn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnKeyPressed(evt);
            }
        });
        jPanel1.add(cn);
        cn.setBounds(490, 110, 210, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Card no.");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(390, 120, 70, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Type of card :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(390, 80, 90, 20);

        ct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Debit Card", "Credit Card" }));
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });
        jPanel1.add(ct);
        ct.setBounds(490, 70, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Payment information ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 20, 210, 22);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Enter OTP :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(400, 250, 80, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shruti\\Desktop\\confirm.jpg")); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(-400, -350, 1620, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ct.setEnabled(true);
        cn.setEnabled(true);
        ex.setEnabled(true);
        cvc.setEnabled(true);
        jButton5.setEnabled(true);
        pay.setEnabled(true);
        jButton2.setEnabled(true);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
        String s1=fn.getText();
        String s2=ln.getText();
        String s3=agetf.getText();  
        
        if(gen.getSelectedItem().equals(""))
        {
             JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }        
        else if(cls.getSelectedItem().equals(""))
        {
             JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }             
        else if(s1.isEmpty())
          { 
              JOptionPane.showMessageDialog(null, "Please fill all the fields");
          } 
        else if(s2.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
           }
        else if(s3.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }
        else {
                  
        double total;
        double subtotal = 0.00;
        final double TAXRATE = 0.06;
        double tax;
        double acfc = 3900.00 ;
        double ac2t= 3600.00;
        double ac3t= 3300.00;
        double fc= 3000.00;
        double s= 2700.00;
        double ss= 2000.00;
        
        if(gen.getSelectedItem().equals("Male"))
        {
        subtotal = subtotal + 50.00;
        }
        if(gen.getSelectedItem().equals("Female"))
        {
        subtotal = subtotal + 20.00;
        }
        if(gen.getSelectedItem().equals("Other"))
        {
        subtotal = subtotal + 00.00;
        }
        
        if(cls.getSelectedItem().equals("AC First Class"))
        {
        subtotal = subtotal + 3900.00;
        }
        if(cls.getSelectedItem().equals("AC 2-Tier"))
        {
        subtotal = subtotal + 3600.00;
        }
        if(cls.getSelectedItem().equals("AC 3-Tier"))
        {
        subtotal = subtotal + 3300.00;
        }        
        if(cls.getSelectedItem().equals("First Class"))
        {
        subtotal = subtotal + 3000.00;
        }
        if(cls.getSelectedItem().equals("Sleeper"))
        {
        subtotal = subtotal + 2700.00;
        }
        if(cls.getSelectedItem().equals("Second Sitting"))
        {
        subtotal = subtotal + 2000.00;
        }
        
        taxtf.setEnabled(true);
        subtotaltf.setEnabled(true);
        totaltf.setEnabled(true);
        taxtf.setEditable(false);
        subtotaltf.setEditable(false);
        totaltf.setEditable(false);
        subtotaltf.setText(Double.toString(subtotal));
        subtotal = Double.parseDouble(subtotaltf.getText());
        tax = subtotal * TAXRATE;
        total = tax + subtotal;
        taxtf.setText(Double.toString(tax));
        totaltf.setText(Double.toString(total)); 
        jButton2.setEnabled(true);
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new book().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       fn.setText(" ");
       ln.setText(" ");
       agetf.setText(" ");       
       taxtf.setText(" ");
       subtotaltf.setText(" ");
       totaltf.setText(" ");
       gen.setSelectedIndex(0);
       cls.setSelectedIndex(0);
       subtotaltf.setEnabled(false);
       totaltf.setEnabled(false);
       taxtf.setEnabled(false);
       jButton2.setEnabled(false);
        ct.setSelectedIndex(0);
        cn.setText(" ");
        ex.setText(" ");
        cvc.setText(" ");
        jButton5.setEnabled(false);
        pay.setEnabled(false);
        jButton2.setEnabled(false);    
        otp.setEnabled(false);       
        otp.setForeground(Color.DARK_GRAY);
        ct.setEnabled(false);
        cn.setEnabled(false);
        ex.setEnabled(false);
        cvc.setEnabled(false);
        jButton5.setEnabled(false);
        pay.setEnabled(false);
        otp.setEnabled(false);       
        otp.setForeground(Color.DARK_GRAY);
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void agetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agetfActionPerformed

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genActionPerformed

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        ct.setEnabled(true);
    }//GEN-LAST:event_ctActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void otpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otpFocusLost
     
    }//GEN-LAST:event_otpFocusLost

    private void otpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otpFocusGained
      
    }//GEN-LAST:event_otpFocusGained

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
      String otpp=otp.getText();
      
      if(otpp.isEmpty())
          { 
              JOptionPane.showMessageDialog(null, "Please Enter OTP");
          } 
      else {
          
      JOptionPane.showMessageDialog(null, "Booking successfull");
         area.setEnabled(true);
         area.setEditable(false);
               
       
        area.setText("*************************************************\n"
                      +"*                                  Ticket                                 *\n"
                      + "*************************************************\n");
        
        
        area.setText(area.getText()+"Name : "+ fn.getText()+" "+ ln.getText()+"\n\n");
        area.setText(area.getText()+"Age : "+ agetf.getText()+"\n\n");
        if(gen.getSelectedItem().equals("Male"))
        {area.setText(area.getText()+"Gender : "+ gen.getSelectedItem()+"\n\n");}
        if(gen.getSelectedItem().equals("Female"))
        {area.setText(area.getText()+"Gender : "+ gen.getSelectedItem()+"\n\n");}
        if(gen.getSelectedItem().equals("Other"))
        {area.setText(area.getText()+"Gender : "+ gen.getSelectedItem()+"\n\n");}             
        
        if(cls.getSelectedItem().equals("AC First Class"))
        {area.setText(area.getText()+"Class : "+ cls.getSelectedItem()+"\n\n");}
        if(cls.getSelectedItem().equals("AC 2-Tier"))
        {area.setText(area.getText()+"Class : "+ cls.getSelectedItem()+"\n\n");}
        if(cls.getSelectedItem().equals("AC 3-Tier"))
        {area.setText(area.getText()+"Class : "+ cls.getSelectedItem()+"\n\n");}       
        if(cls.getSelectedItem().equals("First Class"))
        {area.setText(area.getText()+"Class : "+ cls.getSelectedItem()+"\n\n");}
        if(cls.getSelectedItem().equals("Sleeper"))
        {area.setText(area.getText()+"Class : "+ cls.getSelectedItem()+"\n\n");}
        if(cls.getSelectedItem().equals("Second Sitting"))
        {area.setText(area.getText()+"Class : "+ cls.getSelectedItem()+"\n\n");}
        
        area.setText(area.getText()+"Date : "+"6-Dec-2020"+"\n\n");
        area.setText(area.getText()+"Tax : "+ taxtf.getText()+"\n\n");
        area.setText(area.getText()+"Sub total : "+ subtotaltf.getText()+"\n\n");
        area.setText(area.getText()+"Total : "+ totaltf.getText()+"\n\n");
        
      }
    }//GEN-LAST:event_payActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        String s11=cn.getText();
        String s22=ex.getText();
        String s33=cvc.getText();  
        if(ct.getSelectedItem().equals(""))
        {
             JOptionPane.showMessageDialog(null, "Please fill all payment details");
        } 
        else if(s11.isEmpty())
          { 
              JOptionPane.showMessageDialog(null, "Please fill all payment details");
          }        
        else if(s22.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all payment details");
           }
        else if(s33.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all payment details");
            }
        else{
            otp.setEnabled(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void agetfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agetfKeyTyped
        char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
      }
    }//GEN-LAST:event_agetfKeyTyped

    private void agetfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agetfFocusLost

    }//GEN-LAST:event_agetfFocusLost

    private void agetfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agetfFocusGained
        
    }//GEN-LAST:event_agetfFocusGained

    private void cnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyPressed
         char cr = evt.getKeyChar();
         if (!((cr >= '0') && (cr <= '9') ||
         (cr == KeyEvent.VK_BACK_SPACE) ||
         (cr == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
      }
    }//GEN-LAST:event_cnKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetf;
    private javax.swing.JTextArea area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cls;
    private javax.swing.JTextField cn;
    private javax.swing.JComboBox<String> ct;
    private javax.swing.JTextField cvc;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField ex;
    private javax.swing.JTextField fn;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField otp;
    private javax.swing.JButton pay;
    private javax.swing.JLabel price;
    private javax.swing.JLabel prs;
    private javax.swing.JTextField subtotaltf;
    private javax.swing.JTextField taxtf;
    private javax.swing.JTextField totaltf;
    // End of variables declaration//GEN-END:variables
}
