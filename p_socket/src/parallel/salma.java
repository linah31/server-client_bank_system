/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallel;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static parallel.salma.ADDRESS;
import static parallel.salma.dos;
import static parallel.salma.loginfield;
import static parallel.salma.logsuss;
import static parallel.tasneem.l;
import static parallel.tasneem.logsuss;


public class salma extends javax.swing.JFrame {

   static final String ADDRESS = "127.0.0.1";
    static final int PORT = 8001;
    static final String name = "salma";
    
    Thread sendMessage;
    static String oper="";
    static String FromText="";
    static DataOutputStream dos;
    static DataInputStream dis;
      static  double amount=0;
    static final String password = "123";
    static String logsuss="";
    static salma s= new salma();
    
    static double balance=5000;
    double b_update ;
    
    public salma() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        depositbtn = new javax.swing.JButton();
        withdrawbtn = new javax.swing.JButton();
        exsitbtn = new javax.swing.JButton();
        depfield = new javax.swing.JTextField();
        transfield = new javax.swing.JTextField();
        login = new java.awt.Label();
        checkfield = new javax.swing.JTextField();
        loginfield = new javax.swing.JTextField();
        withfield = new javax.swing.JTextField();
        pass = new java.awt.Label();
        transbtn = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        welcome = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        checkbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("salma");

        depositbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        depositbtn.setForeground(new java.awt.Color(0, 102, 102));
        depositbtn.setText("Deposit");
        depositbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositbtnActionPerformed(evt);
            }
        });

        withdrawbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdrawbtn.setForeground(new java.awt.Color(0, 102, 102));
        withdrawbtn.setText("Withdraw");
        withdrawbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawbtnActionPerformed(evt);
            }
        });

        exsitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exsitbtn.setForeground(new java.awt.Color(204, 0, 0));
        exsitbtn.setText("EXIT");
        exsitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exsitbtnActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 102, 102));
        login.setText("Login :");

        pass.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 102, 102));
        pass.setName(""); // NOI18N
        pass.setText("Password: ");

        transbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transbtn.setForeground(new java.awt.Color(0, 102, 102));
        transbtn.setText("Transcate");
        transbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transbtnActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        welcome.setForeground(new java.awt.Color(0, 0, 102));
        welcome.setText("Welcome, ");

        loginbtn.setBackground(new java.awt.Color(51, 51, 51));
        loginbtn.setForeground(new java.awt.Color(0, 102, 102));
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        checkbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkbtn.setForeground(new java.awt.Color(0, 102, 102));
        checkbtn.setText("Check Balance");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(51, 51, 51));
        cancelbtn.setForeground(new java.awt.Color(255, 0, 0));
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "linah", "tasneem", "monica" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkfield)
                    .addComponent(depfield, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(withfield)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transfield, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(exsitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField1)
                                    .addComponent(loginfield, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbtn)
                    .addComponent(cancelbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkbtn)
                    .addComponent(checkfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawbtn)
                    .addComponent(withfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositbtn)
                    .addComponent(depfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(transbtn))
                .addGap(22, 22, 22)
                .addComponent(exsitbtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exsitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exsitbtnActionPerformed
        System.exit(0);// TODO add your handling code here:
          logsuss="exitttt";
       // t.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_exsitbtnActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        //Sendd("login",jTextField1.getText(),jPasswordField1.getText());
        if(loginfield.getText().equals(name) && jPasswordField1.getText().equals(password)){

                
                
             
                checkbtn.setVisible(true);
                depositbtn.setVisible(true);
                exsitbtn.setVisible(true);
                withdrawbtn.setVisible(true);
                transbtn.setVisible(true);
                depfield.setVisible(true);
                withfield.setVisible(true);
                 cancelbtn.setVisible(false);
                login.setVisible(false);
                loginbtn.setVisible(false);
                loginfield.setVisible(false);
                jPasswordField1.setVisible(false);
                pass.setVisible(false);
                checkfield.setVisible(true);
                transfield.setVisible(true);
                welcome.setVisible(true);
                jComboBox2.setVisible(true);
                welcome.setText("welcome "+name);
                s.setSize(400, 500);
            logsuss=" logged in "; 
        }
            else
        {
           logsuss=" couldn't login ";  
        }
                
   
              
    }//GEN-LAST:event_loginbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_cancelbtnActionPerformed

    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        // TODO add your handling code here:
            logsuss=" checked the balance";
        checkfield.setText(Double.toString(balance));
    }//GEN-LAST:event_checkbtnActionPerformed

    private void withdrawbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawbtnActionPerformed
        // TODO add your handling code here:
       double m=Double.parseDouble(withfield.getText());
     if(balance>=m){
      balance=balance-m;
       amount=amount+m;
        if(amount>7000){
           String err="maximum amount is 7000 per day ";
       withfield.setText(err);
       logsuss=" could'nt preforme withdraw ";
      }
        else{
      withfield.setText(Double.toString(balance));
      logsuss=" preformed withdraw by amount :"+Double.toString(m);
      }}
      else{
      String err="unavailalble balance ";
       withfield.setText(err);
       logsuss=" could'nt preforme withdraw ";
      }
      
    }//GEN-LAST:event_withdrawbtnActionPerformed

    private void depositbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositbtnActionPerformed
        // TODO add your handling code here:
          double m=Double.parseDouble(depfield.getText());
      balance=balance+m;
      depfield.setText(Double.toString(balance));
      logsuss="  preformed deposite by amount :"+Double.toString(m);
      
    }//GEN-LAST:event_depositbtnActionPerformed

    private void transbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transbtnActionPerformed
               // TODO add your handling code here:
//        linah lo = new linah();
       
//        
//       double m=Double.parseDouble(transfield.getText());
//        
//        if(balance>=m)
//        {
//        balance-=m;
//       double b_update = balance +=m;
//       lo.transfield.setText(Double.toString(b_update));
//       lo.balance+=m;
//       transfield.setText(" sendinng...");
//       lo.sendMessage("money senntt");
//       
//        //String msg="sento to linah";
//        //transfield.setText(msg);
                                           
     //   }
     String selectedValue =jComboBox2.getSelectedItem().toString();
     if(selectedValue.equals("linah")){
     
     String s = transfield.getText();
     linah ob = new linah();
     ob.transfield.setText(s);
       ob.checkbtn.setVisible(false);
                ob.depositbtn.setVisible(false);
                ob.exsitbtn.setVisible(false);
                ob.withdrawbtn.setVisible(false);
                ob.transbtn.setVisible(false);
                ob.depfield.setVisible(false);
                ob.withfield.setVisible(false);
                ob.checkfield.setVisible(false);
                ob.transfield.setVisible(false);
                ob.welcome.setVisible(false);
                ob.jComboBox2.setVisible(false);
     ob.setVisible(true);
     
     
     double m=Double.parseDouble(s);
        
        if(balance>=m)
        {double v = balance-=m;
        checkfield.setText(Double.toString(v));
      
       double b_update = ob.balance +=m;
       //ob.balance +=b_update;
       //ob.checkfield.setText(Double.toString(b_update));
        logsuss="transacted to Linah by amount :"+Double.toString(m); 
        }
     }
      else  if(selectedValue.equals("monica")){
     
     String s = transfield.getText();
     monica ob = new monica();
     ob.transfield.setText(s);
        ob.checkbtn.setVisible(false);
                ob.depositbtn.setVisible(false);
                ob.exsitbtn.setVisible(false);
                ob.withdrawbtn.setVisible(false);
                ob.transbtn.setVisible(false);
                ob.depfield.setVisible(false);
                ob.withfield.setVisible(false);
                ob.checkfield.setVisible(false);
                ob.transfield.setVisible(false);
                ob.welcome.setVisible(false);
                ob.jComboBox2.setVisible(false);
     ob.setVisible(true);
     
     
     double m=Double.parseDouble(s);
        
        if(balance>=m)
        {double v = balance-=m;
        checkfield.setText(Double.toString(v));
      
       double b_update = ob.balance +=m;
       //ob.balance +=b_update;
       //ob.checkfield.setText(Double.toString(b_update));
         logsuss="transacted to monica by amount :"+Double.toString(m); 
        }
     }
     else
      { 
     
     String s = transfield.getText();
     tasneem ob = new tasneem();
     ob.transfield.setText(s);
       ob.checkbtn.setVisible(false);
                ob.depositbtn.setVisible(false);
                ob.exsitbtn.setVisible(false);
                ob.withdrawbtn.setVisible(false);
                ob.transbtn.setVisible(false);
                ob.depfield.setVisible(false);
                ob.withfield.setVisible(false);
                ob.checkfield.setVisible(false);
                ob.transfield.setVisible(false);
                ob.welcome.setVisible(false);
                ob.jComboBox2.setVisible(false);
     ob.setVisible(true);
     
     
     double m=Double.parseDouble(s);
        
        if(balance>=m)
        {double v = balance-=m;
        checkfield.setText(Double.toString(v));
      
       double b_update = ob.balance +=m;
       //ob.balance +=b_update;
       //ob.checkfield.setText(Double.toString(b_update));
       logsuss="transacted to Tasneem by amount :"+Double.toString(m); 
        }
     } 


    }//GEN-LAST:event_transbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //tasneem l = new tasneem();
                s.setVisible(true);
                checkbtn.setVisible(false);
                depositbtn.setVisible(false);
                exsitbtn.setVisible(false);
                withdrawbtn.setVisible(false);
                transbtn.setVisible(false);
                depfield.setVisible(false);
                withfield.setVisible(false);
                checkfield.setVisible(false);
                transfield.setVisible(false);
                jComboBox2.setVisible(false);
                welcome.setVisible(false);
                s.setSize(400, 300);
            }
        });
        
        Socket socket = new Socket(ADDRESS, PORT);

       dis= new DataInputStream(socket.getInputStream());
       dos = new DataOutputStream(socket.getOutputStream());
        
        /* Set the Nimbus look and feel */
 
        while (socket.isConnected()){
        try { 

            dos.writeUTF("Salma");

            
                 System.out.println("socket not closed");
                //socket.close();
               
                
                String data = logsuss;
                System.out.println(data);
                dos.writeUTF(data);

            if (socket.isClosed())//connection
        {
            dos.writeUTF("salma closed");
            socket.close();
            break;
            
        }
            
            
            /*if (logsuss=="login")//login
        {
            dos.writeUTF("tasneem logged in");
            
            String tosend = logsuss;
            System.out.println(tosend);
                dos.writeUTF(tosend);
                System.out.println("still not closed");
            
        } */

   
            
        } catch(Exception e){
            e.printStackTrace();
        }//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(tasneem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tasneem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tasneem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tasneem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         }//end while
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cancelbtn;
    public static javax.swing.JButton checkbtn;
    public static javax.swing.JTextField checkfield;
    public static javax.swing.JTextField depfield;
    public static javax.swing.JButton depositbtn;
    public static javax.swing.JButton exsitbtn;
    public static javax.swing.JComboBox<String> jComboBox2;
    public static javax.swing.JPasswordField jPasswordField1;
    public static java.awt.Label login;
    public static javax.swing.JButton loginbtn;
    public static javax.swing.JTextField loginfield;
    public static java.awt.Label pass;
    public static javax.swing.JButton transbtn;
    public static javax.swing.JTextField transfield;
    public static javax.swing.JLabel welcome;
    public static javax.swing.JButton withdrawbtn;
    public static javax.swing.JTextField withfield;
    // End of variables declaration//GEN-END:variables
}