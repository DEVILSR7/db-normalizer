package javaapplication4;

import java.util.ArrayList;
import java.util.TreeSet;

public class JavaApplication4 extends javax.swing.JFrame {


    public JavaApplication4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        input_attributes = new javax.swing.JTextField(10);
        jLabel1 = new javax.swing.JLabel();
        input_fd = new javax.swing.JTextField(10);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currFDs = new javax.swing.JTextArea();
        finish_input = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showKeys = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        NF3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        BCNF = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        NF2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        show_2NF = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        showNFs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(237, 175, 75));

        input_attributes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_attributesActionPerformed(evt);
            }
        });
        input_attributes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_attributesKeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter the attributes for R():");

        input_fd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_fdActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Functional Dependencies:");

        jLabel3.setText("Functional Dependencies:");

        currFDs.setColumns(20);
        currFDs.setRows(5);
        jScrollPane1.setViewportView(currFDs);

        finish_input.setText("Finish!");
        finish_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish_inputActionPerformed(evt);
            }
        });

        showKeys.setColumns(20);
        showKeys.setRows(5);
        jScrollPane2.setViewportView(showKeys);

        jLabel4.setText("The final relation is :");

        NF3.setColumns(20);
        NF3.setRows(5);
        jScrollPane3.setViewportView(NF3);

        BCNF.setColumns(20);
        BCNF.setRows(5);
        jScrollPane4.setViewportView(BCNF);

        NF2.setColumns(20);
        NF2.setRows(5);
        jScrollPane5.setViewportView(NF2);

        jButton1.setText("Check Normal Form:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        show_2NF.setText("Show 2NF");
        show_2NF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_2NFActionPerformed(evt);
            }
        });

        jButton3.setText("Show 3NF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Show BCNF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        showNFs.setColumns(20);
        showNFs.setRows(5);
        jScrollPane6.setViewportView(showNFs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addComponent(input_attributes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(99, 99, 99)
                        .addComponent(input_fd, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(finish_input, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 94, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_2NF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_attributes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(input_fd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(finish_input))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(show_2NF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addGap(361, 361, 361)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String str="***************************************\n";
        if(R.NF==4){
            BCNF.setText("Already in BCNF");
            return;
        }
        relations_BCNF=new ArrayList<Relation>();
        if(R.NF==3){
            relations_BCNF=R.toBCNF();
        }
        else{
            relations_3NF=R.to3NF();
            for(Relation r : relations_3NF){
                System.out.println(r);
            }
            for(Relation r : relations_3NF){
                if(r.NF==4){
                    relations_BCNF.add(r);
                }
                else{
                    relations_BCNF.addAll(r.toBCNF());
                }
            }
        }
        for(int i=0;i<relations_BCNF.size();i++){
            if(relations_BCNF.get(i).checkNF()!=4){
                relations_BCNF.addAll(relations_BCNF.get(i).toBCNF());
                relations_BCNF.remove(i);
                i--;
            }
        }
        for(Relation r : relations_BCNF){
            str=str+r+"***************************************\n";
        }
        BCNF.setText(str);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String str="***************************************\n";
        if(R.NF>=3){
            NF3.setText("Already in 3NF");
            return;
        }
        else{
            relations_3NF=R.to3NF();
            for(Relation r : relations_3NF){
                str=str+r+"***************************************\n";
            }
        }
        NF3.setText(str);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void show_2NFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_2NFActionPerformed
        // TODO add your handling code here:
        String str="***************************************\n";
        if(R.NF>=2){
            NF2.setText("Already in 2NF");
            return;
        }
        else{
            relations_2NF=R.to2NF();
            for(int i=0;i<relations_2NF.size();i++){
                Relation r=relations_2NF.get(i);
                if(r.checkNF()<2){
                    System.out.println(r+" does not satisfy 2NF");
                    relations_2NF.addAll(r.to2NF());
                    relations_2NF.remove(r);
                    i--;
                }
            }
            for(int i=0;i<relations_2NF.size();i++){
                for(int j=0;j<relations_2NF.size();j++){
                    if(SetOp.isEqual(relations_2NF.get(i).attributes,relations_2NF.get(j).attributes) && i!=j){
                        relations_2NF.remove(j);
                        j--;
                    }
                }
            }
            for(Relation r : relations_2NF){
                str=str+r+"***************************************\n";
            }
        }
        NF2.setText(str);
    }//GEN-LAST:event_show_2NFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String str="";
        for(FD fd : R.fds){
            int k=R.checkNF(fd);
            if(k==4)
            str=str+fd+" satisfies BCNF\n\n";
            else
            str=str+fd+" satisfies "+k+"NF\n\n";
        }
        R.NF=R.checkNF();
        if(R.NF==4){
            str=str+"Hence the relation satisfies BCNF";
            showNFs.setText(str);
            return;
        }
        str=str+"Hence the relation satisfies "+R.NF+"NF";
        showNFs.setText(str);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void finish_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish_inputActionPerformed

        input_attributes.setEnabled(false);
        input_fd.setEnabled(false);
        R.generateKeys();
        R.minimalClosure(R.fds);
        String str="";
        for(TreeSet<String> i : R.Keys){
            str=str+i+"\n";
        }
        showKeys.setText(""+R);
        //System.out.println(R.super_keys);
    }//GEN-LAST:event_finish_inputActionPerformed

    private void input_fdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_fdActionPerformed
        // TODO add your handling code here:
        String str=input_fd.getText();
        String[] list1=str.split("->",5);
        if(list1.length!=2){
            System.out.println("Invalid input");
            return;
        }
        String[] x_list=list1[0].split(",",20);
        String[] y_list=list1[1].split(",",20);
        for(String i : x_list){
            if(!R.attributes.contains(i)){
                System.out.println("Invalid input");
                return;
            }
        }
        for(String i : y_list){
            if(!R.attributes.contains(i)){
                System.out.println("Invalid input");
                return;
            }
        }
        FD new_FD=new FD(list1[0],list1[1]);
        R.fds.add(new_FD);
        fd_strings=fd_strings+str+"\n";
        currFDs.setText(fd_strings);
        input_fd.setText("");
    }//GEN-LAST:event_input_fdActionPerformed

    private void input_attributesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_attributesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_attributesKeyPressed

    private void input_attributesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_attributesActionPerformed
        // TODO add your handling code here:
        String str=input_attributes.getText();
        String[] list=str.split(",",20);
        R=new Relation();
        for(int i=0;i<list.length;i++){
            R.attributes.add(list[i]);
        }
        System.out.println("Relation created");
        input_attributes.setEnabled(false);
    }//GEN-LAST:event_input_attributesActionPerformed

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
            java.util.logging.Logger.getLogger(JavaApplication4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaApplication4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaApplication4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaApplication4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaApplication4().setVisible(true);
                currFDs.setEditable(false);
            }
        });
    }
    
    Relation R;
    String fd_strings="";
    ArrayList<Relation> relations_2NF;
    ArrayList<Relation> relations_3NF;
    ArrayList<Relation> relations_BCNF;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BCNF;
    private javax.swing.JTextArea NF2;
    private javax.swing.JTextArea NF3;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JTextArea currFDs;
    private javax.swing.JButton finish_input;
    private javax.swing.JTextField input_attributes;
    private javax.swing.JTextField input_fd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private static javax.swing.JTextArea showKeys;
    private static javax.swing.JTextArea showNFs;
    private javax.swing.JButton show_2NF;
    // End of variables declaration//GEN-END:variables
}
