package gui;
import db.Dbconnect;
import java.sql.*;
import javax.swing.JOptionPane;
public class ViewClient extends javax.swing.JFrame {

    /**
     * Creates new form ViewClient
     */
    public ViewClient() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cd = new javax.swing.JLabel();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        d = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        co = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        l3 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        l4 = new javax.swing.JCheckBox();
        n = new javax.swing.JTextField();
        l2 = new javax.swing.JCheckBox();
        g1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Enter Name:");

        t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tKeyReleased(evt);
            }
        });

        rTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client ID", "Name", "Gender", "DOB", "Country", "Address", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rTable.getTableHeader().setReorderingAllowed(false);
        rTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Client ID:");

        cd.setText("_________________");

        buttonGroup1.add(g2);
        g2.setText("Female");

        buttonGroup1.add(g3);
        g3.setText("Other");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Name:");

        co.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "Nepal", "USA", "Japan", "SriLanka", "Dubai" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Gender:");

        a.setColumns(20);
        a.setRows(5);
        jScrollPane2.setViewportView(a);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("DOB:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Country");

        l1.setText("Hindi");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Address:");

        l3.setText("German");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Language:");

        l4.setText("Spanish");

        l2.setText("English");

        buttonGroup1.add(g1);
        g1.setSelected(true);
        g1.setText("Male");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Back");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cd))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(co, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(d, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(g1)
                            .addComponent(g2)
                            .addComponent(g3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(l1)
                    .addComponent(l2)
                    .addComponent(l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String name=n.getText();
        String gender;
        if(g1.isSelected())
            gender=g1.getText();
        else if(g2.isSelected())
            gender=g2.getText();   
        else
            gender=g3.getText();
        java.util.Date dt=d.getDate();
        String country=(String)co.getSelectedItem();
        String address=a.getText();
        String language="";
        if(l1.isSelected())
            language+=language+l1.getText()+",";
        if(l2.isSelected())
            language+=language+l2.getText()+",";
        if(l3.isSelected())
            language+=language+l3.getText()+",";
        if(l4.isSelected())
            language+=language+l4.getText()+",";
        if(!language.equals(""))
            language=language.substring(0,language.length()-1);
        if(!name.equals("") && dt!=null && !address.equals(""))
        try{ 
            int id=Integer.parseInt(cd.getText());
            java.sql.Date dob=new java.sql.Date(dt.getTime());
 //db.Dbconnect.st.executeUpdate("insert into client_info(name,gender,dob,country,address,language)values('"+name+"','"+gender+"','"+dt+"','"+country+"','"+address+"','"+language+"')");
    db.Dbconnect.updateClient.setString(1,name);
    db.Dbconnect.updateClient.setString(2,gender);
    db.Dbconnect.updateClient.setDate(3,dob);
    db.Dbconnect.updateClient.setString(4,country);
    db.Dbconnect.updateClient.setString(5,address);
    db.Dbconnect.updateClient.setString(6,language);
    db.Dbconnect.updateClient.setInt(7,id);
     db.Dbconnect.updateClient.executeUpdate();
    
             JOptionPane.showMessageDialog(null,"Client Details Updated Successfully!!!");
              tKeyReleased(null);
             
             cd.setText(null);
        n.setText(null);
        g1.setSelected(true);
        d.setDate(null);
        co.setSelectedItem("India");
        a.setText(null);
        l1.setSelected(false);
        l2.setSelected(false);
        l3.setSelected(false);
        l4.setSelected(false);
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
        
        else
            JOptionPane.showMessageDialog(null,"Please Fill The Form");     
                                   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tKeyReleased
          //keyrelease
          javax.swing.table.DefaultTableModel dtm=(javax.swing.table.DefaultTableModel)rTable.getModel();
    //doubt
          int row=dtm.getRowCount();
     while(row--!=0)
     {
         dtm.removeRow(0);
     }
          String na=t.getText();
          try{
          db.Dbconnect.getClient.setString(1,"%"+na+"%");
          ResultSet rs=db.Dbconnect.getClient.executeQuery();
          while(rs.next())
          {
              int cid=rs.getInt("cid");
              String name=rs.getString("name");
               String gender=rs.getString("gender");
               java.util.Date dob=rs.getDate("dob");
               String country=rs.getString("country");
               String address=rs.getString("address");
               String language=rs.getString("language");
               java.util.Vector r=new java.util.Vector();
               r.add(cid);
               r.add(name);
               r.add(gender);
               r.add(dob);
               r.add(country);
               r.add(address);
               r.add(language);
               dtm.addRow(r);
          }
          }catch(Exception e)
          {
             JOptionPane.showMessageDialog(null,e); 
          }
    }//GEN-LAST:event_tKeyReleased

    private void rTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rTableMouseClicked
      //click
      
      
      int k=rTable.getSelectedRow();
      if(k!=-1)
      {
          int id=(int)rTable.getValueAt(k,0);
          String name=(String)rTable.getValueAt(k,1);
          String gender=(String)rTable.getValueAt(k,2);
          java.util.Date dob=(java.util.Date)rTable.getValueAt(k,3);
          String country=(String)rTable.getValueAt(k,4);
          String address=(String)rTable.getValueAt(k,5);
           String language=(String)rTable.getValueAt(k,6);
           cd.setText(id+"");
           n.setText(name);
           if(gender.equalsIgnoreCase("male"))
           {
               g1.setSelected(true);
           }
           else if(gender.equalsIgnoreCase("female")){
               g2.setSelected(true);
              
           }
           else
               g3.setSelected(true);
           d.setDate(dob);
           co.setSelectedItem(true);
           a.setText(address);
           l1.setSelected(false);
           l2.setSelected(false);
           l3.setSelected(false);
           l4.setSelected(false);
           java.util.StringTokenizer st=new  java.util.StringTokenizer(language,",");
           while(st.hasMoreTokens())
           {
               String s=st.nextToken();
               if(s.equalsIgnoreCase("hindi"))
               {
                   l1.setSelected(true);
               }
               else if(s.equalsIgnoreCase("english"))
               {
                   l2.setSelected(true);
               }
               else if(s.equalsIgnoreCase("german"))
               {
                   l3.setSelected(true);
               }
               else{
                   l4.setSelected(true);
               }
           }
           
           
      }
    }//GEN-LAST:event_rTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //delete
        int x=JOptionPane.showConfirmDialog(null, "Do u really want to delete", "Delete Confirmation",JOptionPane.YES_NO_OPTION);
        if(x==JOptionPane.YES_NO_OPTION)
        {
       try{
            int id=Integer.parseInt(cd.getText());
 db.Dbconnect.st.executeUpdate("delete from client_info where cid="+id);
             JOptionPane.showMessageDialog(null,"Client Details Deleted Successfully!!!");
              tKeyReleased(null);
             
             cd.setText(null);
        n.setText(null);
        g1.setSelected(true);
        d.setDate(null);
        co.setSelectedItem("India");
        a.setText(null);
        l1.setSelected(false);
        l2.setSelected(false);
        l3.setSelected(false);
        l4.setSelected(false);
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
        }    
        else
            JOptionPane.showMessageDialog(null,"Please Fill The Form");     
                               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // back
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cd;
    private javax.swing.JComboBox<String> co;
    private com.toedter.calendar.JDateChooser d;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox l1;
    private javax.swing.JCheckBox l2;
    private javax.swing.JCheckBox l3;
    private javax.swing.JCheckBox l4;
    private javax.swing.JTextField n;
    private javax.swing.JTable rTable;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
