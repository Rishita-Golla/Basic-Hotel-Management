/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;
import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author user11
 */
public class ReservePage extends javax.swing.JFrame implements Serializable {

    
   String HotelName;
    public double Cost;
    static int rooms;
     public double temp;
    static double t1;
    public ReservePage() {
        initComponents();
      
    }
   
   public ReservePage(String HotelName , double Cost,int rooms)
   {
       this.HotelName= HotelName;
       this.Cost=Cost;
 
       System.out.println(Cost);
       t1=Cost;
       System.out.println(t1);
           this.rooms=rooms;
           temp=rooms;
  
           System.out.println("Hey"+temp);
           System.out.println(rooms + "reserve");
           

    }
   
  

        
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contactName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtax = new javax.swing.JTextField();
        jamount = new javax.swing.JTextField();
        lRooms = new javax.swing.JLabel();
        jrent = new javax.swing.JTextField();
        Rrooms = new javax.swing.JTextField();
        calculatebutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("FrankRuehl", 1, 48)); // NOI18N
        jLabel1.setText("BookMyHotel");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 310, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/backgrounds (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1720, 86);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 100, 20);

        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        getContentPane().add(phoneNumber);
        phoneNumber.setBounds(30, 220, 260, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contact Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 110, 100, 20);

        contactName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNameActionPerformed(evt);
            }
        });
        getContentPane().add(contactName);
        contactName.setBounds(30, 140, 260, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Taxes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 330, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total Amount per day");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 420, 180, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Rent");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 330, 90, 20);
        getContentPane().add(jtax);
        jtax.setBounds(160, 360, 110, 30);

        jamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamountActionPerformed(evt);
            }
        });
        getContentPane().add(jamount);
        jamount.setBounds(210, 410, 140, 40);

        lRooms.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lRooms.setText("Rooms");
        getContentPane().add(lRooms);
        lRooms.setBounds(290, 330, 49, 20);
        getContentPane().add(jrent);
        jrent.setBounds(30, 360, 110, 30);

        Rrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RroomsActionPerformed(evt);
            }
        });
        getContentPane().add(Rrooms);
        Rrooms.setBounds(290, 360, 70, 30);

        calculatebutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calculatebutton.setText("Calculate");
        calculatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(calculatebutton);
        calculatebutton.setBounds(90, 280, 130, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 470, 120, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 470, 120, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(160, 470, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void contactNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNameActionPerformed

    private void calculatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebuttonActionPerformed
        ///    calculatebutton ob=new calculatebutton();
        
       // calculatebutton.addActionListener((ActionListener) calculatebutton);
        System.out.println("hello ");
        System.out.println(t1);
        double rent = rooms * t1;
            System.out.println(rent + " RENT");
            System.out.println(rooms + " Rooms");
            jrent.setText(rent+ "");
            double taxes=0.15*rent;
            System.out.println(taxes);
            jtax.setText(Double.toString(taxes));
            double amount=rent+taxes;
            System.out.println(amount);
            jamount.setText(amount+"");
            System.out.println(amount + " AMOUNT RESERVE PAGE");
             String d=Integer.toString(rooms);
       Rrooms.setText(d);
              Rrooms.setEditable(false);
             
    }//GEN-LAST:event_calculatebuttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jamountActionPerformed

    private void RroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RroomsActionPerformed
      
    }//GEN-LAST:event_RroomsActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BookMyHotel objBookMyHotel3=new BookMyHotel();
        this.dispose();
        objBookMyHotel3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean g=phoneNumber.getText().matches("[0-9]+");
        if(!g)
        {
            JOptionPane.showMessageDialog(null, "Enter valid phone number.","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        if(contactName.getText().equals("") || phoneNumber.getText().equals(""))
        {
        JOptionPane.showMessageDialog(null, "Please enter the above details.","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(g==true)
        {
        JOptionPane.showMessageDialog(null, "Booking successful!"+"\n"+"Payment can be done on arrival.","Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main10(String args[]) {
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
            java.util.logging.Logger.getLogger(ReservePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       /* ReservePage r=new ReservePage();
        r.ReservePage1();*/
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservePage().setVisible(true);
            }
            
        });       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rrooms;
    private javax.swing.JButton calculatebutton;
    private javax.swing.JTextField contactName;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jamount;
    private javax.swing.JTextField jrent;
    private javax.swing.JTextField jtax;
    private javax.swing.JLabel lRooms;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables
}
