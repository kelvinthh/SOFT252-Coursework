/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.gui;

import university.datamodel.DataModel;
import university.datamodel.Logger;
import university.datamodel.User;
import university.datamodel.UserType;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author WEEGEE
 */
public class Controller extends javax.swing.JFrame {

    /**
     * Creates new form Controller
     */
    DataModel datamodel = new DataModel();
    DefaultListModel tempRoomList = new DefaultListModel();
    DefaultListModel tempUserList = new DefaultListModel();
    
    /**
     *
     */
    public Controller() {
        datamodel.generateData();
        UpdateRoomList();
        UpdateUserList();
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomList = new javax.swing.JList<>();
        logButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        changeModeText = new javax.swing.JTextField();
        changeModeButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        removeUserButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addUserNameText = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        addUserIDText = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        addUserTypeBox = new javax.swing.JComboBox<>();
        changePositionButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        swipeButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University Controller");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("University Controller");

        roomList.setForeground(new java.awt.Color(0, 0, 0));
        roomList.setModel(tempRoomList);
        jScrollPane1.setViewportView(roomList);

        logButton.setText("Open Log");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Room: ");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Personnel");

        userList.setModel(tempUserList);
        jScrollPane2.setViewportView(userList);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setText("ID, Name, Position");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setText("Building Code + Room Number");

        changeModeButton.setText("Change");
        changeModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeModeButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Change Mode");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel7.setText("Enter the building code, e.g BGB");

        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Add User");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel9.setText("Name");

        addUserNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserNameTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel10.setText("ID");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel11.setText("Position");

        addUserTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guest/Visitor", "Staff", "Student", "Cleaner", "Manager", "Security", "Emergency Responder" }));

        changePositionButton.setText("Change Position");
        changePositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePositionButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel12.setText("Pick a user and choose at");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel13.setText("combo box to change position");

        swipeButton.setText("Swipe Card Simulation");
        swipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swipeButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Choose an user and a room");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(changeModeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeModeText)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(addUserTypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePositionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(addUserIDText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUserNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton))
                    .addComponent(swipeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeModeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeModeButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(addUserNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(addUserIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUserTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changePositionButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(swipeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logButton)
                            .addComponent(exitButton))
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        // TODO add your handling code here:
        File file = new File("log.txt");
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_logButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void changeModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeModeButtonActionPerformed
        // TODO add your handling code here:
        ChangeMode();
        changeModeText.setText("");
    }//GEN-LAST:event_changeModeButtonActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        // TODO add your handling code here:
        RemoveUser();
    }//GEN-LAST:event_removeUserButtonActionPerformed

    private void addUserNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserNameTextActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
        AddUser();
        addUserNameText.setText("");
        addUserIDText.setText("");
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void changePositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePositionButtonActionPerformed
        // TODO add your handling code here:
        ChangePosition();
    }//GEN-LAST:event_changePositionButtonActionPerformed

    private void swipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swipeButtonActionPerformed
        // TODO add your handling code here:
        SwipeSim();
    }//GEN-LAST:event_swipeButtonActionPerformed
    
    private void UpdateRoomList(){
        
        String room = "";
        tempRoomList.clear();
        
        for(int i = 0;i < datamodel.getC17().getBldgList().size(); i++)
        {
            for(int a =0 ;a <datamodel.getC17().getBldgList().get(i).getRoomList().size();a++)
            {
                room += datamodel.getC17().getBldgList().get(i).getRoomList().get(a).getStringNo() + " Building " +datamodel.getC17().getBldgList().get(i).getBldgName() + " (" + datamodel.getC17().getBldgList().get(i).getRoomList().get(a).getRoomType().getTypeString() + ": " + datamodel.getC17().getBldgList().get(i).getRoomList().get(a).getMode() + " Mode)";
                tempRoomList.addElement(room);
                room = "";
            }
        }
    }
    
    private void UpdateUserList() {
        
        String user = "";
        tempUserList.clear();
        
        for(int i = 0;i < datamodel.getUserArrayList().size(); i++) //getC17().getBldgList().size(); i++)
        {
            user += datamodel.getUserArrayList().get(i).getCardNo() + " " + datamodel.getUserArrayList().get(i).getName() + " (" + datamodel.getUserArrayList().get(i).getUserType().getTypeString() + ")";
            tempUserList.addElement(user);
            user = "";
        }
    }
    
    private void ChangeMode(){
        
        String i = changeModeText.getText();
        try
        {
            if(i != null)
            {
                datamodel.getC17().FindBuilding(i).ChangeMode();
            }
            UpdateRoomList();
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(this, "Invalid building code", "ERROR", ERROR_MESSAGE);
        }

    }
    
    private void AddUser(){
        
        String name = addUserNameText.getText();
        String id = addUserIDText.getText();
        String position = addUserTypeBox.getSelectedItem().toString();
        
        if(!name.isEmpty() && !id.isEmpty()) //
        {
            if(position.equals("Guest/Visitor")){
                datamodel.getUserArrayList().add(new User(name, UserType.GUEST, id));
            }
            if(position.equals("Staff")){
                datamodel.getUserArrayList().add(new User(name, UserType.STAFF, id));
            }
            if(position.equals("Student")){
                datamodel.getUserArrayList().add(new User(name, UserType.STUDENT, id));
            }
            if(position.equals("Cleaner")){
                datamodel.getUserArrayList().add(new User(name, UserType.CLEANER, id));
            }
            if(position.equals("Manager")){
                datamodel.getUserArrayList().add(new User(name, UserType.MANAGER, id));
            }
            if(position.equals("Security")){
                datamodel.getUserArrayList().add(new User(name, UserType.SECURITY, id));
            }
            if(position.equals("Emergency Responder")){
                datamodel.getUserArrayList().add(new User(name, UserType.EMER, id));
            }
            UpdateUserList();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid name or id", "ERROR", ERROR_MESSAGE);
        }
    }
    
    private void RemoveUser() {
        
        int index = userList.getSelectedIndex();
        if(index == -1)
        {
            JOptionPane.showMessageDialog(this, "Please pick a person", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            User user = datamodel.getUserArrayList().get(index);
            int confirm = JOptionPane.showConfirmDialog(this, "Please confirm your action", "Confirm", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION)
            {
                Logger logger = new Logger();
                logger.doLog("Removed user: " + user.getName() + " (" + user.getUserType().getTypeString() + "), ID: " + user.getCardNo());
                datamodel.getUserArrayList().remove(user);

                UpdateUserList();
            }
        }
    }
    
    private void ChangePosition(){
        int index = userList.getSelectedIndex();
        if(index == -1)
        {
            JOptionPane.showMessageDialog(this, "Please pick a person", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }else
        {
            User user = datamodel.getUserArrayList().get(index);
            String position = addUserTypeBox.getSelectedItem().toString();
            
            int confirm = JOptionPane.showConfirmDialog(this, "Please confirm your action", "Confirm", JOptionPane.YES_NO_OPTION);
            String oldType = user.getUserType().getTypeString();
            
            if(confirm == JOptionPane.YES_OPTION)
            {
                Logger logger = new Logger();
                if(position.equals("Guest/Visitor"))
                {
                    user.setUserType(UserType.GUEST);
                }
                if(position.equals("Staff"))
                {
                    user.setUserType(UserType.STAFF);
                }
                if(position.equals("Student"))
                {
                    user.setUserType(UserType.STUDENT);
                }
                if(position.equals("Cleaner"))
                {
                    user.setUserType(UserType.CLEANER);
                }
                if(position.equals("Manager"))
                {
                    user.setUserType(UserType.MANAGER);
                }
                if(position.equals("Security"))
                {
                    user.setUserType(UserType.SECURITY);
                }
                if(position.equals("Emergency Responder"))
                {
                    user.setUserType(UserType.EMER);
                }
                logger.doLog("Changed user's position: " + user.getName() + " (" + user.getCardNo() + ")'s position from " + oldType + " to " + user.getUserType().getTypeString());                
                UpdateUserList();
            }
        }
    }
    
    private void SwipeSim(){
        int personIndex = userList.getSelectedIndex();
        int roomIndex = roomList.getSelectedIndex();
        
        if(personIndex == -1 || roomIndex == -1)
        {
            JOptionPane.showMessageDialog(this, "Please pick an user and a room", "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            User user = datamodel.getUserArrayList().get(personIndex);
            String roomName = tempRoomList.getElementAt(roomIndex).toString().substring(0,6);  
            
            for(int i = 0; i < datamodel.getRoomArrayList().size(); i++){
                if(datamodel.getRoomArrayList().get(i).getStringNo().equals(roomName))
                {
                    user.Access(datamodel.getRoomArrayList().get(i));
                    break;
                }               
            }
            JOptionPane.showMessageDialog(this, "Please see the log file for the result.");
            
        }
    }
    
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
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private java.awt.TextField addUserIDText;
    private java.awt.TextField addUserNameText;
    private javax.swing.JComboBox<String> addUserTypeBox;
    private javax.swing.JButton changeModeButton;
    private javax.swing.JTextField changeModeText;
    private javax.swing.JButton changePositionButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton logButton;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JList<String> roomList;
    private javax.swing.JButton swipeButton;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables


}
