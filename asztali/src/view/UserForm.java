/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    public UserForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        northPnl = new javax.swing.JPanel();
        eastPnl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        delBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        southPnl = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        StatusLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        westPnl = new javax.swing.JPanel();
        centerPnl = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        tableTb = new javax.swing.JTabbedPane();
        userPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTb = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        northPnl.setBackground(new java.awt.Color(153, 204, 255));
        northPnl.setPreferredSize(new java.awt.Dimension(90, 40));
        northPnl.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 12));
        jPanel1.add(northPnl, java.awt.BorderLayout.NORTH);

        eastPnl.setBackground(new java.awt.Color(153, 204, 255));
        eastPnl.setPreferredSize(new java.awt.Dimension(150, 490));
        eastPnl.setLayout(new java.awt.GridLayout(9, 1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        eastPnl.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        eastPnl.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        saveBtn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        saveBtn.setText("Mentés");
        saveBtn.setToolTipText("");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel4.add(saveBtn);

        eastPnl.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        editBtn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        editBtn.setText("Módosítás");
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel5.add(editBtn);

        eastPnl.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        delBtn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        delBtn.setText("Törlés");
        delBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel6.add(delBtn);

        eastPnl.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        eastPnl.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        eastPnl.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        eastPnl.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        eastPnl.add(jPanel10);

        jPanel1.add(eastPnl, java.awt.BorderLayout.EAST);

        southPnl.setBackground(new java.awt.Color(153, 204, 255));
        southPnl.setMinimumSize(new java.awt.Dimension(336, 40));
        southPnl.setPreferredSize(new java.awt.Dimension(769, 40));
        southPnl.setLayout(new java.awt.GridLayout(1, 3));

        jPanel16.setBackground(new java.awt.Color(153, 204, 255));
        jPanel16.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel16.setPreferredSize(new java.awt.Dimension(211, 40));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 0));

        StatusLbl.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        StatusLbl.setText("jLabel1");
        jPanel16.add(StatusLbl);

        exitBtn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        exitBtn.setText("Kilépés");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel16.add(exitBtn);

        southPnl.add(jPanel16);

        jPanel1.add(southPnl, java.awt.BorderLayout.SOUTH);

        westPnl.setBackground(new java.awt.Color(153, 204, 255));
        westPnl.setPreferredSize(new java.awt.Dimension(5, 491));

        javax.swing.GroupLayout westPnlLayout = new javax.swing.GroupLayout(westPnl);
        westPnl.setLayout(westPnlLayout);
        westPnlLayout.setHorizontalGroup(
            westPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        westPnlLayout.setVerticalGroup(
            westPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(westPnl, java.awt.BorderLayout.LINE_START);

        centerPnl.setBackground(new java.awt.Color(153, 204, 255));
        centerPnl.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(0, 204, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(371, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        centerPnl.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(5, 320));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        centerPnl.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(5, 320));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        centerPnl.add(jPanel13, java.awt.BorderLayout.LINE_END);

        jPanel14.setBackground(new java.awt.Color(153, 204, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel14.setPreferredSize(new java.awt.Dimension(376, 5));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        centerPnl.add(jPanel14, java.awt.BorderLayout.PAGE_END);
        jPanel14.getAccessibleContext().setAccessibleName("");

        jPanel15.setBackground(new java.awt.Color(153, 204, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(452, 435));
        jPanel15.setLayout(new java.awt.GridLayout(1, 1));

        tableTb.setBackground(new java.awt.Color(153, 204, 255));
        tableTb.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        tableTb.setMinimumSize(new java.awt.Dimension(82, 113));

        userPnl.setBackground(new java.awt.Color(153, 204, 255));
        userPnl.setLayout(new java.awt.GridLayout(1, 0));

        userTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email", "Password"
            }
        ));
        jScrollPane1.setViewportView(userTb);

        userPnl.add(jScrollPane1);

        tableTb.addTab("Felhasználók", userPnl);

        jPanel15.add(tableTb);
        tableTb.getAccessibleContext().setAccessibleName("Felhasználók");

        centerPnl.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel1.add(centerPnl, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StatusLbl;
    private javax.swing.JPanel centerPnl;
    private javax.swing.JButton delBtn;
    private javax.swing.JPanel eastPnl;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel northPnl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel southPnl;
    private javax.swing.JTabbedPane tableTb;
    private javax.swing.JPanel userPnl;
    private javax.swing.JTable userTb;
    private javax.swing.JPanel westPnl;
    // End of variables declaration//GEN-END:variables

    public JLabel getStatusLbl() {
        return StatusLbl;
    }

    public void setStatusLbl( String text ) {
        StatusLbl.setText( text );
    }

    public JButton getDelBtn() {
        return delBtn;
    }

    public void setDelBtn(JButton delBtn) {
        this.delBtn = delBtn;
    }

    public JButton getEditBtn() {
        return editBtn;
    }

    public void setEditBtn(JButton editBtn) {
        this.editBtn = editBtn;
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JButton getSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(JButton saveBtn) {
        this.saveBtn = saveBtn;
    }


    public JTabbedPane getTableTb() {
        return tableTb;
    }

    public void setTableTb(JTabbedPane tableTb) {
        this.tableTb = tableTb;
    }

    public JTable getUserTb() {
        return userTb;
    }

    public void setUserTb(JTable userTb) {
        this.userTb = userTb;
    }

    
    
}