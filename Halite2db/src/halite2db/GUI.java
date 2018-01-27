package halite2db;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class GUI extends javax.swing.JFrame{
    ArrayList<User> users = new ArrayList<>();
    private Image ibLines;  //we do all drawing of lines onto this image buffer
    private Image ib; //this is the main buffer
    private Graphics ibgLines;  //graphics object of ibLines
    private Graphics ibg; //graphics object of main image buffer
    private int boxWidth=850;
    private int boxHeight = 589;
    private Timer timmy;
    private boolean active=false;
    private int stepDelay = 500;
    private Color borderColor=new Color(20,20,20);
    
    public GUI() {
        initComponents();
        initiateChoices();
        setUpImageBuffer();
        refreshPanel();
    }
    @SuppressWarnings("serial")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        buttonAddUser = new java.awt.Button();
        fieldUserId = new java.awt.TextField();
        label1 = new java.awt.Label();
        buttonDraw = new java.awt.Button();
        label2 = new java.awt.Label();
        buttonRemoveUser = new java.awt.Button();
        fieldUsername = new java.awt.TextField();
        label3 = new java.awt.Label();
        xChoice = new java.awt.Choice();
        yChoice = new java.awt.Choice();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        listUsers = new java.awt.List();
        canvas = new javax.swing.JPanel();
        orderChoice = new java.awt.Choice();
        label6 = new java.awt.Label();
        Title = new java.awt.Label();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonAddUser.setActionCommand("draw");
        buttonAddUser.setLabel("Add User");
        buttonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddUserActionPerformed(evt);
            }
        });

        fieldUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUserIdActionPerformed(evt);
            }
        });

        label1.setText("user id");

        buttonDraw.setActionCommand("draw");
        buttonDraw.setLabel("Draw");
        buttonDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDrawActionPerformed(evt);
            }
        });

        label2.setText("Users");

        buttonRemoveUser.setActionCommand("remove");
        buttonRemoveUser.setLabel("Remove User");
        buttonRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveUserActionPerformed(evt);
            }
        });

        fieldUsername.setEditable(false);
        fieldUsername.setEnabled(false);
        fieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsernameActionPerformed(evt);
            }
        });

        label3.setText("username");

        label4.setText("X axis");

        label5.setText("Y axis");

        display.setColumns(20);
        display.setRows(5);
        jScrollPane2.setViewportView(display);

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );

        label6.setText("Order in");

        Title.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        Title.setText("Graph");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDraw, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(buttonRemoveUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(fieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(fieldUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemoveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(xChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(yChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(orderChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buttonDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setUpImageBuffer(){
        ibLines=this.createImage(boxWidth,boxHeight);
        ib=this.createImage(boxWidth,boxHeight);
        ibgLines=ibLines.getGraphics();
        ibg=ib.getGraphics();
    }
    
    public void draw(){
        ibg.drawImage(ibLines,0,0,this);
        //copy over ibg
        Graphics g = canvas.getGraphics();
        g.drawImage(ib,0,0,this);
    }
    
    public void refreshPanel(){
        refreshLinesGraphics();
        draw();
    }
    public void refreshLinesGraphics() {
       //clear the area, draw white background
        ibgLines.clearRect(0, 0, boxWidth,boxHeight);
        ibgLines.setColor(Color.white);
        ibgLines.fillRect(0, 0, boxWidth, boxHeight);
        //draws a black border around edge of grid
        ibgLines.setColor(Color.black);
        ibgLines.drawRect(0,0,boxWidth,boxHeight);
    }
    public void updateList(){
        listUsers.removeAll();
        for(User user: users){
            listUsers.add(user.getName());
        }
        
    }
    
    public void step(double xbefore, double ybefore, double xAfter, double yAfter) {   
            ibgLines.setColor(Color.RED);
            int xb = (int)xbefore;
            int yb = (int)ybefore;
            int xa = (int)xAfter;
            int ya = (int)yAfter;
            ibgLines.drawLine(xb,yb,xa,ya);
        draw();
    }
    
    public void initiateChoices(){
       // xChoice.add("mu");
        xChoice.add("game_id");
       // xChoice.add("user_id");
        //xChoice.add("rank");
        //xChoice.add("leaderboard_rank");
        //xChoice.add("sigma");
        
        yChoice.add("mu");
        yChoice.add("game_id");
        yChoice.add("user_id");
        yChoice.add("rank");
        yChoice.add("leaderboard_rank");
        yChoice.add("sigma");
        
        orderChoice.add("ASC");
        orderChoice.add("DESC");
    }
    
    public String getUsernameFromId(){
        String userId = fieldUserId.getText();
            try{
                String username = Database.getString(("SELECT * FROM users WHERE user_id = " + userId), "username");
                return username;
            }catch(Exception e){
                System.out.println(e);
                return e.toString();
            }
        
    }
    
    public String getIdFromUsername(){
        String username = fieldUsername.getText();
        username = "'" + username + "'";
        try{
            String userId = Database.getString(("SELECT * FROM users WHERE username = " + username), "user_id");
            return userId;
        }catch(Exception e){
            System.out.println(e);
            return e.toString();
        } 
        
    }
    
    private void buttonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddUserActionPerformed
        String userId = fieldUserId.getText();
        String username = "";
        String usernameUnmodified = "";
        if(userId.isEmpty()){
            username = fieldUsername.getText();
            usernameUnmodified = username;
            username = "'" + username + "'";
        }
        User newUser = new User(userId, usernameUnmodified);
        if(userId.isEmpty()){
            userId = getIdFromUsername();
            
        }else{
            username = getUsernameFromId();
            newUser = new User(userId, username);
        }
        
        if(!users.contains(newUser)){
            users.add(newUser);
        }
        updateList();
        System.out.println(users.get(0).getId() + ", " + users.get(0).getName());
    }//GEN-LAST:event_buttonAddUserActionPerformed

    private void fieldUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUserIdActionPerformed

    private void buttonDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDrawActionPerformed
        refreshPanel();
        for(User user: users){
            ArrayList<Double> data = new ArrayList<>();
            ArrayList<Double> xAxis = new ArrayList<>();
            
            /*double highestY = 1;
            double lowestY = 1;
            try{
                highestY = Double.parseDouble(Database.getString(("SELECT MAX(" + yChoice.getSelectedItem() + ") FROM games_users WHERE user_id = " + user.getId()), yChoice.getSelectedItem()));
                lowestY = Double.parseDouble(Database.getString(("SELECT MIN(" + yChoice.getSelectedItem() + ") FROM games_users WHERE user_id = " + user.getId()), yChoice.getSelectedItem()));
            }catch(Exception e){
                System.out.println(e);
            }
            */
            if(xChoice.getSelectedItem().equals("game_id")){
                try{
                  data = Database.getAxis(("SELECT * FROM games_users WHERE user_id = " + user.getId()), xChoice.getSelectedItem());
                  for(double i = 0; i < data.size() - 1; i += (double)canvas.getWidth()/(double)data.size()){
                      System.out.println(i);
                      xAxis.add(i);
                  }
                }catch(Exception e){
                    System.out.println(e);
                }  
            }
            
            
            ArrayList<Double> yAxis = new ArrayList<>();
            try{
                yAxis = Database.getAxis(("SELECT * FROM games_users WHERE user_id =" + user.getId()), yChoice.getSelectedItem());
            }catch(Exception e){
                System.out.println(e);
            }
            
            Title.setText("Graph of " + yChoice.getSelectedItem() + " versus " + xChoice.getSelectedItem());
            
            for(int i = 0; i < data.size() - 2; i++){
                double beforeX = (double)xAxis.get(i);
                double beforeY = (double)yAxis.get(i) ;//* (canvas.getHeight()/(highestY - lowestY));
                double afterX = (double)xAxis.get(i + 1);
                double afterY = (double)yAxis.get(i + 1) ;//* (canvas.getHeight()/(highestY - lowestY));
                
                step(beforeX,beforeY,afterX,afterY);
                System.out.println("GUI.buttonDrawActionPerformed: Plotting line from (" + beforeX  + "," + beforeY + ") to (" + afterX + "," + afterY + ")");
            }
            
        }
    }//GEN-LAST:event_buttonDrawActionPerformed

    private void buttonRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveUserActionPerformed
        String userId = fieldUserId.getText();
        String username = "";
        if(userId.isEmpty()){
            username = fieldUsername.getText();
            username = "'" + username + "'";
        }
        if(userId.isEmpty()){
            userId = getIdFromUsername();
        }else{
            username = getUsernameFromId();
        }
        User newUser = new User(userId, username);
        //users.remove(newUser);
        for(int index = users.size() - 1; index >= 0; index--){
            if(users.get(index).getId().equals(newUser.getId())){
                users.remove(index);
                System.out.println(newUser.getName() + " removed");
            }
        }
        updateList();
    }//GEN-LAST:event_buttonRemoveUserActionPerformed

    private void fieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Title;
    private java.awt.Button buttonAddUser;
    private java.awt.Button buttonDraw;
    private java.awt.Button buttonRemoveUser;
    private javax.swing.JPanel canvas;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JTextArea display;
    private java.awt.TextField fieldUserId;
    private java.awt.TextField fieldUsername;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.List listUsers;
    private java.awt.Choice orderChoice;
    private java.awt.Choice xChoice;
    private java.awt.Choice yChoice;
    // End of variables declaration//GEN-END:variables
}
