/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ITD-STU
 */
public class Penarikan extends javax.swing.JFrame {
    int id = 0;
    String idnum;
    Connection con;
    Statement st;
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    String nama;
    String uang;
    /**
     * Creates new form Penarikan
     */
    public Penarikan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jnorek = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jjlhuang = new javax.swing.JTextField();
        jOke = new javax.swing.JButton();
        jBatalkan = new javax.swing.JButton();
        jKeluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(727, 502));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Penarikan");

        jLabel2.setText("Nomor Rekening");

        jLabel3.setText("Jumlah Uang");

        jOke.setText("Oke");
        jOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOkeActionPerformed(evt);
            }
        });

        jBatalkan.setText("Batalkan");
        jBatalkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatalkanActionPerformed(evt);
            }
        });

        jKeluar.setText("Keluar");
        jKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKeluarActionPerformed(evt);
            }
        });

        jLabel4.setText("Rp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jnorek, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jjlhuang))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jOke, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jBatalkan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jKeluar)))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jnorek, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jjlhuang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOke, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBatalkan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBatalkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatalkanActionPerformed
        // TODO add your handling code here:
        Menu _menu = new Menu();
        _menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBatalkanActionPerformed

    private void jOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOkeActionPerformed
        // TODO add your handling code here:
        String no_rek = jnorek.getText();
        String jlh_uang = jjlhuang.getText();
        
         try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "pbo");
            st = con.createStatement();

            //String sql = "SELECT * FROM datanasabah where " + "no_rek ='" + jnorekanda.getText()+ "'";
            

            //String sql1 = "SELECT * FROM datanasabah where " + "no_rek ='" + no_rektujuan + "'";
            //rs1 = st.executeQuery(sql1);
            if (no_rek != null && jlh_uang != null) {
                rs = st.executeQuery("SELECT * FROM transaksi");
                while (rs.next()) {
                    id++;
                }
                id++;
                idnum = Integer.toString(id);
                

                String sql = "SELECT saldo FROM datanasabah where no_rek='" + jnorek.getText() + "'";

                ResultSet hasil = st.executeQuery(sql);
                hasil.last();
                int saldo = hasil.getInt("saldo");
                int saldo2 = saldo - Integer.valueOf(jjlhuang.getText());
                String saldo3 = String.valueOf(saldo2);

                st.executeUpdate("update datanasabah set saldo='" + saldo3 + "' where no_rek='" + jnorek.getText() + "'");

                String sql1 = "INSERT INTO transaksi " + "(id_transaksi, no_rek, jlh_uang)" + "VALUES ('" + idnum + "', '" + no_rek + "', '" + jlh_uang + "')";
                st.executeUpdate(sql1);
                
                JOptionPane.showMessageDialog(null, "Transaksi Anda Mulai Diproses");

                

                nama = jnorek.getText();
                uang = jjlhuang.getText();
                Transferljt1 _transferljt1 = new Transferljt1();
                _transferljt1.setVisible(true);
                this.dispose();
            }

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Nomor Rekening Tidak Terdapat pada Sistem !!");
        }

    }//GEN-LAST:event_jOkeActionPerformed

    private void jKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKeluarActionPerformed
        // TODO add your handling code here:
        System.exit (0);
    }//GEN-LAST:event_jKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penarikan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBatalkan;
    private javax.swing.JButton jKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jOke;
    private javax.swing.JTextField jjlhuang;
    private javax.swing.JTextField jnorek;
    // End of variables declaration//GEN-END:variables
}
