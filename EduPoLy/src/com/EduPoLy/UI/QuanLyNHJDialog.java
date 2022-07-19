/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.UI;

import com.EduPoLy.DAO.NguoiHocDAO;
import com.EduPoLy.Entity.ChuyenDe;
import com.EduPoLy.Entity.NguoiHoc;
import com.EduPoLy.Entity.NhanVien;
import com.EduPoLy.utils.AUTH;
import com.EduPoLy.utils.MsgBOX;
import com.EduPoLy.utils.XDATE;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author DUY PHUONG
 */
public class QuanLyNHJDialog extends javax.swing.JDialog {

    /**
     * Creates new form QuanLyNHJDialog
     */
    public QuanLyNHJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdogioitinh = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmanguoihoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthemmoi = new javax.swing.JButton();
        btnfisrt = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        txtngaysinh = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txttim = new javax.swing.JTextField();
        btntim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblquanlynguoihoc = new javax.swing.JTable();
        btnprint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("QUẢN LÝ NGƯỜI HỌC");

        jLabel2.setText("Mã Người Học");

        jLabel3.setText("Họ Và Tên");

        txthoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotenActionPerformed(evt);
            }
        });

        jLabel4.setText("Giới Tính");

        jLabel5.setText("Ngày Sinh");

        jLabel6.setText("Ghi Chú");

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        jScrollPane2.setViewportView(txtghichu);

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/save-icon.png"))); // NOI18N
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/update-icon.png"))); // NOI18N
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Button-Close-icon.png"))); // NOI18N
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthemmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Button-New-icon.png"))); // NOI18N
        btnthemmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemmoiActionPerformed(evt);
            }
        });

        btnfisrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Button-First-icon.png"))); // NOI18N
        btnfisrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfisrtActionPerformed(evt);
            }
        });

        btnprev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Button-Rewind-icon.png"))); // NOI18N
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Button-Forward-icon.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Button-Last-icon.png"))); // NOI18N
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        jLabel7.setText("So Dien Thoai");

        jLabel8.setText("Dia Chi Email");

        rdogioitinh.add(rdonam);
        rdonam.setText("Nam");

        rdogioitinh.add(rdonu);
        rdonu.setText("Nu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmanguoihoc)
                    .addComponent(txthoten)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(26, 26, 26)
                        .addComponent(btnxoa)
                        .addGap(27, 27, 27)
                        .addComponent(btnthemmoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(btnfisrt)
                        .addGap(28, 28, 28)
                        .addComponent(btnprev)
                        .addGap(27, 27, 27)
                        .addComponent(btnnext)
                        .addGap(18, 18, 18)
                        .addComponent(btnlast))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdonam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdonu))
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                            .addComponent(txtngaysinh))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmanguoihoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdonam)
                        .addComponent(rdonu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlast)
                    .addComponent(btnthem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnnext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnprev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnfisrt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnthemmoi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsua, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        tabs.addTab("CẬP NHẬT", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N

        txttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimActionPerformed(evt);
            }
        });
        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimKeyPressed(evt);
            }
        });

        btntim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/search-icon.png"))); // NOI18N
        btntim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txttim)
                .addGap(18, 18, 18)
                .addComponent(btntim, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntim, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tblquanlynguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MANH", "HO TEN", "NGAY SINH  ", "GIOI TINH", "DIEN THOAI", "EMAIL ", "GHICHU", "MANV ", "NAGYDK        "
            }
        ));
        tblquanlynguoihoc.setRowHeight(22);
        tblquanlynguoihoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblquanlynguoihoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblquanlynguoihocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblquanlynguoihoc);

        btnprint.setText("PRINT");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnprint))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnprint)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthotenActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
        this.print();
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            this.insert();
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthemmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemmoiActionPerformed
        // TODO add your handling code here:
        this.reset();
    }//GEN-LAST:event_btnthemmoiActionPerformed

    private void btnfisrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfisrtActionPerformed
        // TODO add your handling code here:
        this.fisrt();
    }//GEN-LAST:event_btnfisrtActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnlastActionPerformed

    private void btntimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btntimActionPerformed

    private void tblquanlynguoihocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblquanlynguoihocMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblquanlynguoihoc.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblquanlynguoihocMouseClicked

    private void txttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txttimActionPerformed

    private void txttimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyPressed
        // TODO add your handling code here:
        timkiem();
    }//GEN-LAST:event_txttimKeyPressed

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
            java.util.logging.Logger.getLogger(QuanLyNHJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNHJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNHJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNHJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLyNHJDialog dialog = new QuanLyNHJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfisrt;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthemmoi;
    private javax.swing.JButton btntim;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup rdogioitinh;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblquanlynguoihoc;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextArea txtghichu;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmanguoihoc;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        setTitle("QUẢN LÝ NGƯỜI HỌC");
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }
    NguoiHocDAO nhdao = new NguoiHocDAO();
    int row = -1;
    DefaultTableModel model;
    ArrayList<NguoiHoc> dsnv;

    void fillTable() {
        model = (DefaultTableModel) tblquanlynguoihoc.getModel();
        model.setRowCount(0);
        try {
            String keyword = txttim.getText();
            String manh=txttim.getText();
            String sdt=txttim.getText();
            dsnv = (ArrayList<NguoiHoc>) nhdao.selectByKeyword(keyword,manh,sdt);
            for (NguoiHoc nh : dsnv) {
                Object[] row = new Object[]{nh.getMaNH(), nh.getHoTen(), XDATE.toString(nh.getNgaySinh(), "dd/MM/yyyy"), nh.isGioiTinh() ? "Nam" : "Nữ",
                    nh.getDienThoai(), nh.getEmail(), nh.getGhiChu(), nh.getMaNV(), XDATE.toString(nh.getNgayDK(), "dd/MM/yyyy")};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBOX.alert(this, "Lổi truy vấn dử liệu");
        }
    }

    boolean isValidate() {
        if (txtmanguoihoc.getText().length() == 0) {
            MsgBOX.alert(this, "MA NGUOI HOC KHONG DUOC TRONG!!!");
            txtmanguoihoc.requestFocus();
            return false;
        }
        try {
            String manh = txtmanguoihoc.getText();
            if (nhdao.selectByID(manh) != null) {
                throw new Exception();
            }
        } catch (Exception e) {
            MsgBOX.alert(this, "MA DA TON TAI!!!");
            txtmanguoihoc.requestFocus();
            txtmanguoihoc.setText("");
            return false;
        }
        if (txtmanguoihoc.getText().length() > 7) {
            MsgBOX.alert(this, "MA KHONG DUOC QUA 7 KY TU!!!");
            txtmanguoihoc.requestFocus();
            txtmanguoihoc.setText("");
            return false;
        }
        if (txthoten.getText().length() == 0) {
            MsgBOX.alert(this, "HOTEN NGUOI HOC KHONG DUOC TRONG!!!");
            txthoten.requestFocus();
            return false;
        }
        if (!rdonam.isSelected() && !rdonu.isSelected()) {
            MsgBOX.alert(this, "BAN CHUA CHON GIOI TINH!!!");
            return false;
        }
        if (txtngaysinh.getText().length() == 0) {
            MsgBOX.alert(this, "BAN CHUA NHAP NGAY!!!");
            txtngaysinh.requestFocus();
            return false;
        }
        try {
            XDATE.toDate(txtngaysinh.getText(), "dd/MM/yyyy");
        } catch (Exception e) {
            MsgBOX.alert(this, "NGAY KHONG DUNG DINH DANG(dd/MM/yyyy)!!!");
            txtngaysinh.requestFocus();
            txtngaysinh.setText("");
            return false;
        }

        if (txtsdt.getText().length() == 0) {
            MsgBOX.alert(this, "CHUA NHAP SDT!!!");
            txtsdt.requestFocus();
            return false;
        }
        try {
            String sdt = txtsdt.getText();
            if (!sdt.matches("039\\d{7}")) {
                throw new Exception();
            }
        } catch (Exception e) {
            MsgBOX.alert(this, "SDT KHONG DUNG DINH DANG!!!");
            txtsdt.setText("");
            txtsdt.requestFocus();
            return false;
        }
        if (txtemail.getText().length() == 0) {
            MsgBOX.alert(this, "CHUA NHAP EMAIL!!!");
            txtemail.requestFocus();
            return false;
        }
        try {
            String email = txtemail.getText();
            if (!email.matches("\\w+@\\w+(\\.\\w+){1,2}")) {
                throw new Exception();
            }
        } catch (Exception e) {
            MsgBOX.alert(this, "EMAIL KHONG DUNG DINH DANG!!!");
            txtemail.setText("");
            txtemail.requestFocus();
            return false;
        }
        if (txtghichu.getText().length() == 0) {
            MsgBOX.alert(this, "GHI CHU KHONG DUOC DE TRONG!!!");
            txtghichu.requestFocus();
            return false;
        }
        return true;
    }

    void insert() {
        NguoiHoc nh = getForm();
        try {
            nhdao.insert(nh);
            this.fillTable();
            this.reset();
            MsgBOX.alert(this, "THEM MOI THANH CONG!!!");
        } catch (Exception e) {
            MsgBOX.alert(this, "THEM MOI THAT BAI!!!");
        }
    }

    void update() {
        NguoiHoc nh = getForm();
        try {
            nhdao.update(nh);
            this.fillTable();
            MsgBOX.alert(this, "SUA THANH CONG!!!");
        } catch (Exception e) {
            MsgBOX.alert(this, "SUA THAT BAI!!!");
        }
    }

    void delete() {
        if (!AUTH.isManager()) {
            MsgBOX.alert(this, "BAN KHONG CO QUYEN XOA!!!");
        } else if (MsgBOX.confirm(this, "BAN CO THUC SU MUON XOA MA NGUOI HOC NAY KHONG?")) {
            String manh = txtmanguoihoc.getText();
            try {
                nhdao.delete(manh);
                this.fillTable();
                this.reset();
                MsgBOX.alert(this, "XOA THANH CONG!!!");
            } catch (Exception e) {
                MsgBOX.alert(this, "XOA THAT BAI!!!");
            }
        }
    }

    void edit() {
        String manv = (String) tblquanlynguoihoc.getValueAt(this.row, 0);
        NguoiHoc nh = nhdao.selectByID(manv);
        this.setForm(nh);
        tabs.setSelectedIndex(0);
        updateStatus();
    }

    void reset() {
        NguoiHoc nh = new NguoiHoc();
        this.setForm(nh);
        rdogioitinh.clearSelection();
        nh.setMaNV(AUTH.user.getMaNV());
//        nh.setNgayDK(XDATE.now());
        this.row = -1;
        this.updateStatus();
    }

    void fisrt() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblquanlynguoihoc.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblquanlynguoihoc.getRowCount() - 1;
        this.edit();
    }

    void setForm(NguoiHoc nh) {
        txtmanguoihoc.setText(nh.getMaNH());
        txthoten.setText(nh.getHoTen());
        rdonam.setSelected(nh.isGioiTinh());
        rdonu.setSelected(!nh.isGioiTinh());
        txtngaysinh.setText(XDATE.toString(nh.getNgaySinh(), "dd/MM/yyyy"));       
        txtsdt.setText(nh.getDienThoai());
        txtemail.setText(nh.getEmail());
        txtghichu.setText(nh.getGhiChu());
    }

    NguoiHoc getForm() {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNH(txtmanguoihoc.getText());
        nh.setHoTen(txthoten.getText());
        nh.setNgaySinh(XDATE.toDate(txtngaysinh.getText(), "dd/MM/yyyy"));
        nh.setGioiTinh(rdonam.isSelected());
        nh.setDienThoai(txtsdt.getText());
        nh.setEmail(txtemail.getText());
        nh.setGhiChu(txtghichu.getText());
        nh.setMaNV(AUTH.user.getMaNV());
        nh.setNgayDK(XDATE.now());
        return nh;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean fisrt = (this.row == 0);
        boolean last = (this.row == tblquanlynguoihoc.getRowCount() - 1);
        //trang thai form
        txtmanguoihoc.setEditable(!edit);//khong duoc cap nhap ma.Khi nao gia tri edit=false thi moi dc cap nhap va nguoc lai
        btnthem.setEnabled(!edit);//khi hien thong tin tren o nhap thi khong hien button va nguoc lai
        btnxoa.setEnabled(edit);//khi co thong tin (true) thi hien buuton va nguoc lai
        btnsua.setEnabled(edit);//nhu tren
        //cac thanh dieu huong
        //khi trong trang thai edit thi moi hien button va nguoc lai
        btnfisrt.setEnabled(edit && !fisrt);//chi hien len khi dang edit va khong phai la hang dau tien
        btnprev.setEnabled(edit && !fisrt);//nhu tren
        btnnext.setEnabled(edit && !last);//chi hien len khi dang edit va khong phai la hang cuoi cung
        btnlast.setEnabled(edit && !last);//nhu tren
    }

    void print() {
        FileOutputStream excelfou = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook exceljtableExporter = null;
        //chon noi luu file 
        JFileChooser excelfile = new JFileChooser("d:\\prinexcel");
        //Thanh tiu de
        excelfile.setDialogTitle("Save As");
        //cac dang ten duoi mo rong cua excel
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlxs", "xlsm");
        excelfile.setFileFilter(fnef);
        int excelchoose = excelfile.showSaveDialog(null);

        //kiểm tra xem nút lưu có được nhấp không
        if (excelchoose == JFileChooser.APPROVE_OPTION) {
            try {
                //import thu vien apache poi excel
                exceljtableExporter = new XSSFWorkbook();
                XSSFSheet excelsheet = exceljtableExporter.createSheet("JTable Sheet");
                // vòng lặp để lấy cột và hàng của bảng
                for (int i = 0; i < model.getRowCount(); i++) {
                    XSSFRow excelrow = excelsheet.createRow(i);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        XSSFCell excelCell = excelrow.createCell(j);
                        excelCell.setCellValue(tblquanlynguoihoc.getValueAt(i, j).toString());
                    }
                }
                //nối phần mở rộng tệp xlsx vào các tệp đã chọn. để tạo tên tệp duy nhất  
                excelfou = new FileOutputStream(excelfile.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelfou);
                exceljtableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(this, "Tao va them thanh cong");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(QuanLyNVQTJDialog.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelfou != null) {
                        excelfou.close();
                    }
                    if (exceljtableExporter != null) {
                        exceljtableExporter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    void timkiem() {
        this.fillTable();//đỗ lại dữ liệu lên bảng
        this.row = -1;//hàng chưa đc chọn
        this.reset();//xóa trắng form 
        this.updateStatus();//cập nhật trạng thái các nút
    }
}
