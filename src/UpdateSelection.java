
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class UpdateSelection extends javax.swing.JFrame {

  
    public UpdateSelection() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Update Selection");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 61, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 1110, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("UserName :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 174, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 175, 183, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/search1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 234, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("City :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 309, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 179, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, 1110, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Hotels");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 441, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Transport");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 496, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 596, 1110, 10));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/Update details.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 659, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/icons8_reset_16.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 659, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 659, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 480, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton1.setText("Bus");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton2.setText("Train");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButton3.setText("Taxi/Auto");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Password :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 238, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 239, 183, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/sd.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1110, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
                 setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        
   

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           if(jTextField2.getText().equals("Mumbai"))
        {String data[]={"The Taj Mahal Tower, Hotel in South Mumbai, 5500 per night",
            "ITC Maratha, Hotel in western Suburbs, 3600 per night",
            "Trident Nariman Point, Hotel in South Mumbai, 4500 per night",
            "Taj Lands End , Hotel in western suburbs, per night 5250 ",
            "Grand hyatt Mumbai hotel and residencies ,hotel in western suburbs , per night 4250",
            "hyatt regency Mumbai , hotel in western suburbs , per night 3400",
            "Novotel Mumbai , juhu beach Hotel in juhu , 3850 per night",
            "Taj Santacruz hotel , in Mumbai , per night 4250",
            "ibis Mumbai airport , hotel in Mumbai , 4600 per night",
            "Courtyard by Marriott  Mumbai international airport , hotel in western suburbs , per night 5000 "};
        DefaultComboBoxModel mod = new DefaultComboBoxModel(data);
        jComboBox1.setModel(mod);}
           else if(jTextField2.getText().equals("Pune")){
            String data[]={" Crown Plaza , Pune City Centre , Price per night 3,835 ",
            " Lemon Tree Premier , Pune , Price per night 2,871 ",
            " Novotel Pune  , Nagar Road , Price per night 2,688 ",
            "Four Points by Sheraton Hotel , Price  per night 2,519 ",
            "Holiday Inn Express , Pune , Price per night 1,728 ",
            "Hyatt Regency Pune Hotel , Price per night 2,760 ",
            "Hotel Royale Heritage ,Pune , Price per night 1,013 ",
            "Hotel Shree Panchratna ,  Pune , Price per nigh 2,451"};
            
        DefaultComboBoxModel mod = new DefaultComboBoxModel(data);
        jComboBox1.setModel(mod);
        }
            else if(jTextField2.getText().equals("Nashik")){
            String data[]={"Quality Inn Regency , Price per night 2,218",
            "Hotel Panchavati , Nashik , Price per night 1,904",
            "Ginger Nashik Price per night 2,219",
            "Hotel Seven Heaven , Price per night 1,814",
            "Hotel Rama Heritage, Price per night 2,501",
            "Panchavati Elite Inn , Price per night 1,247",
            "Holiday Inn Express Nashik , Price per night 2,020",
            "Hotel Grand Rio , Nashik ,Price per night 2.571",};
        DefaultComboBoxModel mod = new DefaultComboBoxModel(data);
        jComboBox1.setModel(mod);
        }
            else if(jTextField2.getText().equals("Satara")){
            String data[]={"Treebo Trend City Inn , Price per night 2,629",
            "Hotel Radhika Palace , Price per night 1,379",
            "Hotel Maratha Palace , Price per night 1,434",
            "The Fern Residency ,Satara , Price per night 2,664",
            "Hotel Maharaja Perl , Price per night 1,141",
            "Rutu Farm Agri Tourism Holiday Homes , Price per night 2,889",};
        DefaultComboBoxModel mod = new DefaultComboBoxModel(data);
        jComboBox1.setModel(mod);
        }
            else{
                 String data[]={"Hotel Embassy International , Price per night 3,656" ,
                "Hotel Parth Executive , Price per night 1,498 " ,
                "Hotel Grand International , Price per night 2,199 " ,
                "Hotel Vrinda Lodge & Restaurant , Price per night 3,989" ,
                "Aroma Hotel , Price per night 5,043" ,
                "Hotel Sudarshan Palace , Price per night 3,988 " };
                    DefaultComboBoxModel mod = new DefaultComboBoxModel(data);
                    jComboBox1.setModel(mod);
                
            
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private String transport;
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      
        transport="Bus";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
   
        transport="Train";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       
        transport="Auto/Taxi";
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String hotel=(String)jComboBox1.getSelectedItem();
            String username=jTextField1.getText();
            String city=jTextField2.getText();
            String password=jTextField3.getText();
            int flag=0;
            
           
           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","omkar");
            Statement st=conn.createStatement();
            
           String s = "SELECT username , password FROM register";
           
            ResultSet r=st.executeQuery(s);
            while (r.next()) {
                String u = r.getString("username");
                String n = r.getString("password");
                System.out.println(u + "   " + n);
                if(username.equals(u) && password.equals(n))
                {
                
                int rs= st.executeUpdate("update cities set hotel='"+hotel+"',transport='"+transport+"' where username ='"+username+"' and city='"+city+"'  ");
                JOptionPane.showMessageDialog(null,"Updated Successfully");
                flag=1;
                
                setVisible(false);
                new home().setVisible(true);
                
                
                }
                
            }
            
                if(flag!=1){
                    JOptionPane.showMessageDialog(null,"Your account is not registered, please register first");
                    setVisible(false);
                         new Registration().setVisible(true);
                    
                }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateSelection.class.getName()).log(Level.SEVERE, null, ex);
         
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         setVisible(false);
        new UpdateSelection().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
