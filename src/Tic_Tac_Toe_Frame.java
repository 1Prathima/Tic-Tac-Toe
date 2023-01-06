
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PRATIMA
 */
public class Tic_Tac_Toe_Frame extends javax.swing.JFrame {
    private String turn;
    private int xCount;
    private int oCount;
    private int totalCount;

    /**
     * Creates new form Tic_Tac_Toe_Frame
     */
    public Tic_Tac_Toe_Frame() {
        initComponents();
        turn = "O";
        xCount=0;
        oCount=0;
        totalCount=0;
    }
    
    private void choosePlayer(){
        if(turn.equals("O")){
            turn = "X";
        }
        else {
            turn = "O";
        }
    }
    
    public void invokeButton(JButton BTN) {   //minimizing writing code for all buttons
        if(!BTN.getText().equals("")) {   //if text is there return and dont overwrite
            return;
        }
        
        totalCount++;
        BTN.setText(turn);
        
        if(turn.equals("O")){
            BTN.setForeground(blue);
        }
        else {
            BTN.setForeground(red);
        }
        checkWin();
        choosePlayer();
    }
    
    public void resetGame(){
        BTN1.setText("");
        BTN2.setText("");
        BTN3.setText("");
        BTN4.setText("");
        BTN5.setText("");
        BTN6.setText("");
        BTN7.setText("");
        BTN8.setText("");
        BTN9.setText("");
        
        BTN1.setBackground(white);
        BTN2.setBackground(white);
        BTN3.setBackground(white);
        BTN4.setBackground(white);
        BTN5.setBackground(white);
        BTN6.setBackground(white);
        BTN7.setBackground(white);
        BTN8.setBackground(white);
        BTN9.setBackground(white);
        
        totalCount=0;
    }
   
    public void updateScore(){
        XSCORE.setText(String.valueOf(xCount));
        OSCORE.setText(String.valueOf(oCount));
    }
    
    
    public void checkWin() {
        String B1 = BTN1.getText();
        String B2 = BTN2.getText();
        String B3 = BTN3.getText();
        String B4 = BTN4.getText();
        String B5 = BTN5.getText();
        String B6 = BTN6.getText();
        String B7 = BTN7.getText();
        String B8 = BTN8.getText();
        String B9 = BTN9.getText();
        
        if((B1.equals(B2) && B2.equals(B3)) && (!B1.equals(""))) { //no three buttons should be equal to null
            BTN1.setBackground(green);
            BTN2.setBackground(green);
            BTN3.setBackground(green);
            
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if((B4.equals(B5) && B5.equals(B6)) && (!B4.equals(""))) { //no three buttons should be equal to null
            BTN4.setBackground(green);
            BTN5.setBackground(green);
            BTN6.setBackground(green);
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if((B7.equals(B8) && B8.equals(B9)) && (!B7.equals(""))) { //no three buttons should be equal to null
            BTN7.setBackground(green);
            BTN8.setBackground(green);
            BTN9.setBackground(green);
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if((B1.equals(B4) && B4.equals(B7)) && (!B1.equals(""))) { //no three buttons should be equal to null
            BTN1.setBackground(green);
            BTN4.setBackground(green);
            BTN7.setBackground(green);
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    
            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if((B2.equals(B5) && B5.equals(B8)) && (!B2.equals(""))) { //no three buttons should be equal to null
            BTN2.setBackground(green);
            BTN5.setBackground(green);
            BTN8.setBackground(green);
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if((B3.equals(B6) && B6.equals(B9)) && (!B3.equals(""))) { //no three buttons should be equal to null
            BTN3.setBackground(green);
            BTN6.setBackground(green);
            BTN9.setBackground(green);
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if((B1.equals(B5) && B5.equals(B9)) && (!B1.equals(""))) { //no three buttons should be equal to null
            BTN1.setBackground(green);
            BTN5.setBackground(green);
            BTN9.setBackground(green);
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if((B3.equals(B5) && B5.equals(B7)) && (!B3.equals(""))) { //no three buttons should be equal to null
            BTN3.setBackground(green);
            BTN5.setBackground(green);
            BTN7.setBackground(green);
            JOptionPane.showMessageDialog(this,"Player "+ turn + " wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

            if(turn.equals("O")) {
                oCount++;
            }
            else{
                xCount++;
            }
            
            updateScore();
            resetGame();
        }
        else if(totalCount==9){
            JOptionPane.showMessageDialog(this,"Draw ! ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
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
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        RESETBTN = new javax.swing.JButton();
        EXITBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OSCORE = new javax.swing.JLabel();
        XSCORE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        BTN1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        BTN4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });

        BTN5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });

        BTN6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });

        BTN7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });

        BTN8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });

        BTN9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });

        RESETBTN.setBackground(new java.awt.Color(102, 255, 102));
        RESETBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RESETBTN.setText("RESET");
        RESETBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBTNActionPerformed(evt);
            }
        });

        EXITBTN.setBackground(new java.awt.Color(255, 102, 51));
        EXITBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EXITBTN.setText("EXIT");
        EXITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTNActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORECARD");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("PLAYER O");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setText("PLAYER X");

        OSCORE.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        OSCORE.setText("0");

        XSCORE.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        XSCORE.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(XSCORE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(OSCORE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(OSCORE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(XSCORE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RESETBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EXITBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RESETBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    private void EXITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTNActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_EXITBTNActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        // TODO add your handling code here:
              
           invokeButton(BTN1);

    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        // TODO add your handling code here:
          invokeButton(BTN2);
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        // TODO add your handling code here:
        invokeButton(BTN3);        
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        // TODO add your handling code here:
        invokeButton(BTN4);     
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        // TODO add your handling code here:
        invokeButton(BTN5);
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        // TODO add your handling code here:
        invokeButton(BTN6);
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        // TODO add your handling code here:
        invokeButton(BTN7);
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        // TODO add your handling code here:
       invokeButton(BTN8);
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        // TODO add your handling code here:
        invokeButton(BTN9);
    }//GEN-LAST:event_BTN9ActionPerformed

    private void RESETBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBTNActionPerformed
        // TODO add your handling code here:
        resetGame();
    }//GEN-LAST:event_RESETBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private javax.swing.JButton EXITBTN;
    private javax.swing.JLabel OSCORE;
    private javax.swing.JButton RESETBTN;
    private javax.swing.JLabel XSCORE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    
}
