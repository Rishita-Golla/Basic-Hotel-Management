/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

import java.text.SimpleDateFormat;

import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author user11
 */
public class BookMyHotel extends javax.swing.JFrame implements Serializable{
    
    public Per c1;
    public String P;
    int checkInDate;
    Date today = new Date();
    static Per logperson1;
    public BookMyHotel() {
        initComponents();
        emailidHome.setText(SignInPage.logperson.getemailid());
        checkIn.setMinSelectableDate(today);
        checkOut.setMinSelectableDate(new Date());
        emailidHome.setEditable(false);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lWanderlustTitle = new javax.swing.JLabel();
        bRegister = new javax.swing.JButton();
        bSignin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lHotels = new javax.swing.JLabel();
        lDestination = new javax.swing.JLabel();
        lCheckin = new javax.swing.JLabel();
        lAdults = new javax.swing.JLabel();
        lCheckout = new javax.swing.JLabel();
        lRooms = new javax.swing.JLabel();
        lChildren = new javax.swing.JLabel();
        rooms = new javax.swing.JComboBox();
        adults = new javax.swing.JComboBox();
        children = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        DestName = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lDestination1 = new javax.swing.JLabel();
        emailidHome = new javax.swing.JTextField();
        checkIn = new com.toedter.calendar.JDateChooser();
        checkOut = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BookMyHotel\n\n");
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        lWanderlustTitle.setFont(new java.awt.Font("FrankRuehl", 1, 48)); // NOI18N
        lWanderlustTitle.setText("BookMyHotel");
        getContentPane().add(lWanderlustTitle);
        lWanderlustTitle.setBounds(24, 24, 316, 75);

        bRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bRegister.setText("Register");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(bRegister);
        bRegister.setBounds(1000, 30, 101, 36);

        bSignin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bSignin.setText("Sign in");
        bSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSigninActionPerformed(evt);
            }
        });
        getContentPane().add(bSignin);
        bSignin.setBounds(1160, 30, 96, 36);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 320));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 338));

        lHotels.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lHotels.setText("HOTELS");

        lDestination.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lDestination.setText("Destination");

        lCheckin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lCheckin.setText("Check in");

        lAdults.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lAdults.setText("Adults(18+)");

        lCheckout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lCheckout.setText("Check out");

        lRooms.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lRooms.setText("Rooms");

        lChildren.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lChildren.setText("Children");

        rooms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6+" }));
        rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsActionPerformed(evt);
            }
        });

        adults.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6+" }));

        children.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6+" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DestName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DestName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delhi", "Hyderabad", "Jaipur", "Mumbai", " " }));
        DestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestNameActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(238, 0, 51));

        lDestination1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lDestination1.setText("E-mail Id");

        emailidHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailidHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lDestination, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addComponent(lHotels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DestName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(lDestination1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adults, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lAdults, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(children, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailidHome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lHotels, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDestination)
                    .addComponent(lDestination1)
                    .addComponent(emailidHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DestName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAdults)
                            .addComponent(lChildren))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adults, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(children, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCheckout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lAdults, lCheckin});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adults, children});

        getContentPane().add(jPanel1);
        jPanel1.setBounds(43, 145, 1216, 334);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/backgrounds (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1720, 86);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(checkIn.getDate().compareTo(checkOut.getDate())>0)
        {
            jLabel1.setText("Check Out date is before Check In date!!!");          
        } 
        
       else
        {
            Object objDestination1=DestName.getSelectedItem();
            this.dispose();
            String strDestination1=objDestination1.toString();
    
     
        
      
       if(strDestination1.equals("Delhi"))
       {
           Delhi objDelhi=new Delhi();
           Delhi objDelhi1=new Delhi(Integer.valueOf((String)rooms.getSelectedItem()));
           System.out.println(Integer.valueOf((String)rooms.getSelectedItem()) + "BookMyHotel");
           objDelhi.setVisible(true);
       }
       else if(strDestination1.equals("Mumbai"))
       {
          
           Mumbai objMumbai=new Mumbai();
           Mumbai objMumbai1=new Mumbai(Integer.valueOf((String)rooms.getSelectedItem()));
           System.out.println(Integer.valueOf((String)rooms.getSelectedItem()) + "BookMyHotel");
           System.out.println("Mumbai");
           objMumbai.setVisible(true);
           //objMumbai1.setVisible(false);
    
       }
       else if(strDestination1.equals("Hyderabad"))
       {
           Hyderabad objHyderabad=new Hyderabad();
           Hyderabad objHyderabad1 = new Hyderabad(Integer.valueOf((String)rooms.getSelectedItem()));
           objHyderabad.setVisible(true);
       }
       else if(strDestination1.equals("Jaipur"))
       {
           Jaipur objJaipur=new Jaipur();
           Jaipur objJaipur1 = new Jaipur(Integer.valueOf((String)rooms.getSelectedItem()));
           objJaipur.setVisible(true);
       }
                
                P=SignInPage.logperson.getemailid();
       
        ArrayList<Per> al=new ArrayList();
        int flag=0;
        
        try{
             FileInputStream fis ;
             fis= new FileInputStream("newPerson.txt");
             ObjectInputStream ois;
             ois =new ObjectInputStream(fis);
             while((c1=(Per)ois.readObject())!=null)
             {
                 if(c1.getemailid().equals(emailidHome.getText()))
                 {
                     flag=1;
                     break;
                 }
                 al.add(c1);
             }
             ois.close();
             fis.close();
        }
        catch(FileNotFoundException e)
        {
        }
        catch(EOFException e)
        {
        }
        catch(ClassNotFoundException e)
        {
        }
        catch(IOException e)
        {
               e.printStackTrace();
        }
        if (flag==0)
        {
            Per p2 = new Per();
             String destination = (String)DestName.getSelectedItem();
        String room = (String)rooms.getSelectedItem();
       String adult = (String)adults.getSelectedItem();
      String child = (String)children.getSelectedItem();
       String check_in = checkIn.getDate().toString();
       String check_out = checkOut.getDate().toString();
           
            p2.homeAdd(check_in, check_out, destination, room, child, adult);
            
            al.add(p2);
            try
            {
                FileOutputStream fos;
                        fos = new FileOutputStream("newPerson.txt");
                ObjectOutputStream oos ;
                        oos = new ObjectOutputStream(fos);
                Iterator i = al.iterator();
                while(i.hasNext())
                {
                    c1 = (Per)i.next();
                    oos.writeObject(c1);
                }
                fos.close();
                oos.close();
            }
            catch(IOException e){}
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        
        registerPage ObjregisterPage=new registerPage();
        this.dispose();
        ObjregisterPage.setVisible(true);
    }//GEN-LAST:event_bRegisterActionPerformed

    private void DestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestNameActionPerformed

    private void bSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSigninActionPerformed
        SignInPage objSignInPage=new SignInPage();
        objSignInPage.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_bSigninActionPerformed

    private void roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomsActionPerformed

    private void emailidHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailidHomeActionPerformed
     
    }//GEN-LAST:event_emailidHomeActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main1(String args[]) {
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
            java.util.logging.Logger.getLogger(BookMyHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookMyHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookMyHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookMyHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMyHotel().setVisible(true);
            }
        });
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DestName;
    private javax.swing.JComboBox adults;
    private javax.swing.JButton bRegister;
    private javax.swing.JButton bSignin;
    private com.toedter.calendar.JDateChooser checkIn;
    private com.toedter.calendar.JDateChooser checkOut;
    private javax.swing.JComboBox children;
    private javax.swing.JTextField emailidHome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAdults;
    private javax.swing.JLabel lCheckin;
    private javax.swing.JLabel lCheckout;
    private javax.swing.JLabel lChildren;
    private javax.swing.JLabel lDestination;
    private javax.swing.JLabel lDestination1;
    private javax.swing.JLabel lHotels;
    private javax.swing.JLabel lRooms;
    private javax.swing.JLabel lWanderlustTitle;
    private javax.swing.JComboBox rooms;
    // End of variables declaration//GEN-END:variables


    

}
