import java.awt.Component;
import java.util.Arrays;
import javax.swing.*;

public class registration extends javax.swing.JFrame {
  
         
    public registration() {      
      
       
        initComponents();
        setTitle("Registration form");
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        heading = new javax.swing.JLabel();
        t1fn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2ln = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t3em = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4pn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbgender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        t6un = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t7pa = new javax.swing.JPasswordField();
        jb1rg = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setText("<-- Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 360, 73, 23);

        heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Registration Form");
        jPanel1.add(heading);
        heading.setBounds(50, 20, 220, 29);

        t1fn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t1fn);
        t1fn.setBounds(110, 80, 177, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 80, 73, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 120, 73, 17);

        t2ln.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t2ln);
        t2ln.setBounds(110, 120, 177, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 63, 17);

        t3em.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t3em);
        t3em.setBounds(110, 160, 177, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone no.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 200, 63, 17);

        t4pn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4pnActionPerformed(evt);
            }
        });
        jPanel1.add(t4pn);
        t4pn.setBounds(110, 200, 177, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 240, 53, 17);

        cmbgender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(cmbgender);
        cmbgender.setBounds(110, 240, 95, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 280, 70, 17);

        t6un.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t6un);
        t6un.setBounds(110, 280, 180, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 320, 67, 17);

        t7pa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t7pa);
        t7pa.setBounds(110, 320, 180, 23);

        jb1rg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb1rg.setText("Registor");
        jb1rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1rgActionPerformed(evt);
            }
        });
        jPanel1.add(jb1rg);
        jb1rg.setBounds(110, 360, 100, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shruti\\Desktop\\login.jpg")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(-120, -60, 490, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb1rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1rgActionPerformed
        
        String s1=t1fn.getText();
        String s2=t2ln.getText();
        String s3=t3em.getText();
        String s4=t4pn.getText();             
        String s5=(String) cmbgender.getSelectedItem();
        String s6=t6un.getText();
        String s7=t7pa.getText();
        
               if(s1.isEmpty()){  JOptionPane.showMessageDialog(null, "Please fill all the required fields"); }
               else if(s2.isEmpty()){ JOptionPane.showMessageDialog(null, "Please fill all the required fields"); }
               
               
               else if(s2.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields");
               }
               else if(s3.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields");
               }
               else if(s4.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields");
               } 
               else   if(s6.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields");
               }
               else    if(s7.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields");
               }
                
                   else
                {
                 JOptionPane.showMessageDialog(null, "Register Successful");
                    new loginpage().setVisible(true);
                    this.setVisible(false);     
          
           }
        
        
    }//GEN-LAST:event_jb1rgActionPerformed

    private void t4pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4pnActionPerformed
        
    }//GEN-LAST:event_t4pnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new loginpage().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JLabel heading;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb1rg;
    private javax.swing.JTextField t1fn;
    private javax.swing.JTextField t2ln;
    private javax.swing.JTextField t3em;
    private javax.swing.JTextField t4pn;
    private javax.swing.JTextField t6un;
    private javax.swing.JPasswordField t7pa;
    // End of variables declaration//GEN-END:variables
}
