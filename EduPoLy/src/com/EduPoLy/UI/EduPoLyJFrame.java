/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.UI;

import com.EduPoLy.utils.AUTH;
import com.EduPoLy.utils.MsgBOX;
import com.EduPoLy.utils.Ximage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.control.ButtonBar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author DUY PHUONG
 */
public class EduPoLyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form EduPoLyJFrame
     */
    public EduPoLyJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        toolbar = new javax.swing.JToolBar();
        btndangxuat = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnketthuc = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnchuyende = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnnguoihoc = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnkhoahoc = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnhocvien = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnhuongdan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbldongho = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuhethong = new javax.swing.JMenu();
        mnidoimatkhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnidangxuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniketthuc = new javax.swing.JMenuItem();
        mnuquanly = new javax.swing.JMenu();
        mnichuyende = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnikhoahoc = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        mninguoihoc = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        mnihocvien = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mninhanvien = new javax.swing.JMenuItem();
        mnuthongke = new javax.swing.JMenu();
        mnibangdiem = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        mniluongnguoihoc = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnidiemchuyende = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mnidoanhthu = new javax.swing.JMenuItem();
        mnutrogiup = new javax.swing.JMenu();
        mnihuongdan = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        mnigioithieusanpham = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolbar.setBackground(new java.awt.Color(255, 255, 255));
        toolbar.setRollover(true);
        toolbar.setMargin(new java.awt.Insets(2, 30, 2, 30));

        btndangxuat.setBackground(new java.awt.Color(255, 255, 255));
        btndangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/exit.png"))); // NOI18N
        btndangxuat.setText("Đăng Xuất ");
        btndangxuat.setFocusable(false);
        btndangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });
        toolbar.add(btndangxuat);
        toolbar.add(jSeparator5);

        btnketthuc.setBackground(new java.awt.Color(255, 255, 255));
        btnketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/CPASS.png"))); // NOI18N
        btnketthuc.setText("Kết Thúc ");
        btnketthuc.setFocusable(false);
        btnketthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnketthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnketthucActionPerformed(evt);
            }
        });
        toolbar.add(btnketthuc);
        toolbar.add(jSeparator6);

        btnchuyende.setBackground(new java.awt.Color(255, 255, 255));
        btnchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/dcm.png"))); // NOI18N
        btnchuyende.setText("Chuyên Đề");
        btnchuyende.setFocusable(false);
        btnchuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnchuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchuyendeActionPerformed(evt);
            }
        });
        toolbar.add(btnchuyende);
        toolbar.add(jSeparator7);

        btnnguoihoc.setBackground(new java.awt.Color(255, 255, 255));
        btnnguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/NH.png"))); // NOI18N
        btnnguoihoc.setText("Người Học");
        btnnguoihoc.setFocusable(false);
        btnnguoihoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnguoihoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnguoihocActionPerformed(evt);
            }
        });
        toolbar.add(btnnguoihoc);
        toolbar.add(jSeparator8);

        btnkhoahoc.setBackground(new java.awt.Color(255, 255, 255));
        btnkhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/KH.png"))); // NOI18N
        btnkhoahoc.setText("Khóa Học");
        btnkhoahoc.setFocusable(false);
        btnkhoahoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnkhoahoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnkhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoahocActionPerformed(evt);
            }
        });
        toolbar.add(btnkhoahoc);
        toolbar.add(jSeparator9);

        btnhocvien.setBackground(new java.awt.Color(255, 255, 255));
        btnhocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/HV.png"))); // NOI18N
        btnhocvien.setText("Học Viên");
        btnhocvien.setFocusable(false);
        btnhocvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhocvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhocvienActionPerformed(evt);
            }
        });
        toolbar.add(btnhocvien);
        toolbar.add(jSeparator10);

        btnhuongdan.setBackground(new java.awt.Color(255, 255, 255));
        btnhuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/HD.png"))); // NOI18N
        btnhuongdan.setText("Hướng Dẫn");
        btnhuongdan.setFocusable(false);
        btnhuongdan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhuongdan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuongdanActionPerformed(evt);
            }
        });
        toolbar.add(btnhuongdan);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Picture8.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/CTHICH.png"))); // NOI18N
        jLabel3.setText("Hệ Quản Lý Đào Tạo");

        lbldongho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/clock.png"))); // NOI18N
        lbldongho.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldongho))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldongho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        mnuhethong.setText("Hệ Thống");

        mnidoimatkhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_MASK));
        mnidoimatkhau.setBackground(new java.awt.Color(102, 102, 102));
        mnidoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/cpass.png"))); // NOI18N
        mnidoimatkhau.setText("Đổi Mật Khẩu");
        mnidoimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidoimatkhauActionPerformed(evt);
            }
        });
        mnuhethong.add(mnidoimatkhau);
        mnuhethong.add(jSeparator2);

        mnidangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mnidangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/exit.png"))); // NOI18N
        mnidangxuat.setText("Đăng Xuất");
        mnidangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidangxuatActionPerformed(evt);
            }
        });
        mnuhethong.add(mnidangxuat);
        mnuhethong.add(jSeparator3);

        mniketthuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        mniketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/stop.png"))); // NOI18N
        mniketthuc.setText("Kết Thúc");
        mniketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniketthucActionPerformed(evt);
            }
        });
        mnuhethong.add(mniketthuc);

        jMenuBar1.add(mnuhethong);

        mnuquanly.setText("Quản Lý");

        mnichuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnichuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/dcm.png"))); // NOI18N
        mnichuyende.setText("Chuyên Đề");
        mnichuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnichuyendeActionPerformed(evt);
            }
        });
        mnuquanly.add(mnichuyende);
        mnuquanly.add(jSeparator14);

        mnikhoahoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnikhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/KH.png"))); // NOI18N
        mnikhoahoc.setText("Khóa Học");
        mnikhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnikhoahocActionPerformed(evt);
            }
        });
        mnuquanly.add(mnikhoahoc);
        mnuquanly.add(jSeparator15);

        mninguoihoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mninguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/NH.png"))); // NOI18N
        mninguoihoc.setText("Người Học");
        mninguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninguoihocActionPerformed(evt);
            }
        });
        mnuquanly.add(mninguoihoc);
        mnuquanly.add(jSeparator16);

        mnihocvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnihocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/HV.png"))); // NOI18N
        mnihocvien.setText("Học Viên");
        mnihocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnihocvienActionPerformed(evt);
            }
        });
        mnuquanly.add(mnihocvien);
        mnuquanly.add(jSeparator4);

        mninhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mninhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/NV.png"))); // NOI18N
        mninhanvien.setText("Nhân Viên");
        mninhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninhanvienActionPerformed(evt);
            }
        });
        mnuquanly.add(mninhanvien);

        jMenuBar1.add(mnuquanly);

        mnuthongke.setText("Thống Kê");

        mnibangdiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        mnibangdiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/BD.png"))); // NOI18N
        mnibangdiem.setText("Bảng Điểm");
        mnibangdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnibangdiemActionPerformed(evt);
            }
        });
        mnuthongke.add(mnibangdiem);
        mnuthongke.add(jSeparator11);

        mniluongnguoihoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        mniluongnguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/LNH.png"))); // NOI18N
        mniluongnguoihoc.setText("Lượng Người Học");
        mniluongnguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniluongnguoihocActionPerformed(evt);
            }
        });
        mnuthongke.add(mniluongnguoihoc);
        mnuthongke.add(jSeparator12);

        mnidiemchuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mnidiemchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/DCD.png"))); // NOI18N
        mnidiemchuyende.setText("Điểm Chuyên Đề");
        mnidiemchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidiemchuyendeActionPerformed(evt);
            }
        });
        mnuthongke.add(mnidiemchuyende);
        mnuthongke.add(jSeparator13);

        mnidoanhthu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        mnidoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/DT.png"))); // NOI18N
        mnidoanhthu.setText("Doanh Thu");
        mnidoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidoanhthuActionPerformed(evt);
            }
        });
        mnuthongke.add(mnidoanhthu);

        jMenuBar1.add(mnuthongke);

        mnutrogiup.setText("Trợ Giúp");

        mnihuongdan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.ALT_MASK));
        mnihuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/HD.png"))); // NOI18N
        mnihuongdan.setText("Hướng Dẫn Sử Dụng");
        mnihuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnihuongdanActionPerformed(evt);
            }
        });
        mnutrogiup.add(mnihuongdan);
        mnutrogiup.add(jSeparator17);

        mnigioithieusanpham.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        mnigioithieusanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/EduPoLy/icon/Home.png"))); // NOI18N
        mnigioithieusanpham.setText("Giới Thiệu Sản Phẩm");
        mnigioithieusanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnigioithieusanphamActionPerformed(evt);
            }
        });
        mnutrogiup.add(mnigioithieusanpham);

        jMenuBar1.add(mnutrogiup);

        setJMenuBar(jMenuBar1);

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

    private void mnichuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnichuyendeActionPerformed
        // TODO add your handling code here:
        this.QuanLychuyende();
    }//GEN-LAST:event_mnichuyendeActionPerformed

    private void mnidoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidoimatkhauActionPerformed
        // TODO add your handling code here:
        this.changepass();
    }//GEN-LAST:event_mnidoimatkhauActionPerformed

    private void mnidangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidangxuatActionPerformed
        // TODO add your handling code here:
        this.logout();
    }//GEN-LAST:event_mnidangxuatActionPerformed

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        // TODO add your handling code here:
        this.logout();
    }//GEN-LAST:event_btndangxuatActionPerformed

    private void mniketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniketthucActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_mniketthucActionPerformed

    private void btnketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnketthucActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btnketthucActionPerformed

    private void mnikhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnikhoahocActionPerformed
        // TODO add your handling code here:
        this.QuanLyKhoaHoc();
    }//GEN-LAST:event_mnikhoahocActionPerformed

    private void mninguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninguoihocActionPerformed
        // TODO add your handling code here:
        this.Quanlynguoihoc();
    }//GEN-LAST:event_mninguoihocActionPerformed

    private void mnihocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnihocvienActionPerformed
        // TODO add your handling code here:
        this.QuanLyhocvien();
    }//GEN-LAST:event_mnihocvienActionPerformed

    private void mninhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninhanvienActionPerformed
        // TODO add your handling code here:
        this.QuanLyNhanvien();
    }//GEN-LAST:event_mninhanvienActionPerformed

    private void mnibangdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnibangdiemActionPerformed
        // TODO add your handling code here:
        this.ThongKeTonghop(0);
    }//GEN-LAST:event_mnibangdiemActionPerformed

    private void btnchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchuyendeActionPerformed
        // TODO add your handling code here:
        this.QuanLychuyende();
    }//GEN-LAST:event_btnchuyendeActionPerformed

    private void btnnguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnguoihocActionPerformed
        // TODO add your handling code here:
        this.Quanlynguoihoc();
    }//GEN-LAST:event_btnnguoihocActionPerformed

    private void btnkhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoahocActionPerformed
        // TODO add your handling code here:
        this.QuanLyKhoaHoc();
    }//GEN-LAST:event_btnkhoahocActionPerformed

    private void btnhocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhocvienActionPerformed
        // TODO add your handling code here:
        this.QuanLyhocvien();
    }//GEN-LAST:event_btnhocvienActionPerformed

    private void mniluongnguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniluongnguoihocActionPerformed
        // TODO add your handling code here:
        this.ThongKeTonghop(1);
    }//GEN-LAST:event_mniluongnguoihocActionPerformed

    private void mnidiemchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidiemchuyendeActionPerformed
        // TODO add your handling code here:
        this.ThongKeTonghop(2);
    }//GEN-LAST:event_mnidiemchuyendeActionPerformed

    private void mnidoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidoanhthuActionPerformed
        // TODO add your handling code here:
        this.ThongKeTonghop(3);
    }//GEN-LAST:event_mnidoanhthuActionPerformed

    private void btnhuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuongdanActionPerformed
        // TODO add your handling code here:
        HuongdanSD();

    }//GEN-LAST:event_btnhuongdanActionPerformed

    private void mnihuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnihuongdanActionPerformed
        // TODO add your handling code here:
        HuongdanSD();

    }//GEN-LAST:event_mnihuongdanActionPerformed

    private void mnigioithieusanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnigioithieusanphamActionPerformed
        // TODO add your handling code here:
        Gioithieu();
    }//GEN-LAST:event_mnigioithieusanphamActionPerformed

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
            java.util.logging.Logger.getLogger(EduPoLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduPoLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduPoLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduPoLyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduPoLyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchuyende;
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btnhocvien;
    private javax.swing.JButton btnhuongdan;
    private javax.swing.JButton btnketthuc;
    private javax.swing.JButton btnkhoahoc;
    private javax.swing.JButton btnnguoihoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JLabel lbldongho;
    private javax.swing.JMenuItem mnibangdiem;
    private javax.swing.JMenuItem mnichuyende;
    private javax.swing.JMenuItem mnidangxuat;
    private javax.swing.JMenuItem mnidiemchuyende;
    private javax.swing.JMenuItem mnidoanhthu;
    private javax.swing.JMenuItem mnidoimatkhau;
    private javax.swing.JMenuItem mnigioithieusanpham;
    private javax.swing.JMenuItem mnihocvien;
    private javax.swing.JMenuItem mnihuongdan;
    private javax.swing.JMenuItem mniketthuc;
    private javax.swing.JMenuItem mnikhoahoc;
    private javax.swing.JMenuItem mniluongnguoihoc;
    private javax.swing.JMenuItem mninguoihoc;
    private javax.swing.JMenuItem mninhanvien;
    private javax.swing.JMenu mnuhethong;
    private javax.swing.JMenu mnuquanly;
    private javax.swing.JMenu mnuthongke;
    private javax.swing.JMenu mnutrogiup;
    private javax.swing.JToolBar toolbar;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        this.setIconImage(Ximage.getAppIcon());
        new HelloJDialog(this, true).setVisible(true);
        new LoginJDialog(this, true).setVisible(true);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                String time = sdf.format(now);
                lbldongho.setText(time);
            }
        }).start();
    }

    private void QuanLychuyende() {
        if (AUTH.isLoGin()) {
            new QuanlyCDJDialog(this, true).setVisible(true);
        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP!!!");
        }
    }

    private void changepass() {
        if (AUTH.isLoGin()) {
            new ChangePassJDialog(this, true).setVisible(true);
        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP");
        }
    }

    private void logout() {
        AUTH.clear();
        new LoginJDialog(this, true).setVisible(true);

    }

    private void exit() {
        if (MsgBOX.confirm(this, "BAN CO MUON KET THUC KHONG?")) {
            System.exit(0);
        }
    }

    private void QuanLyKhoaHoc() {
        if (AUTH.isLoGin()) {
            new QuanLyKHJDialog(this, true).setVisible(true);
        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP!!!");
        }
    }

    private void Quanlynguoihoc() {
        if (AUTH.isLoGin()) {
            new QuanLyNHJDialog(this, true).setVisible(true);
        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP!!!");
        }
    }

    private void QuanLyhocvien() {
        if (AUTH.isLoGin()) {
            new QuanlyHVJDialog(this, true).setVisible(true);
        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP!!!");
        }
    }

    private void QuanLyNhanvien() {
        if (AUTH.isLoGin()) {
            new QuanLyNVQTJDialog(this, true).setVisible(true);
        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP!!!");
        }
    }

    private void ThongKeTonghop(int index) {
        if (AUTH.isLoGin()) {
            if (index == 3 && !AUTH.isManager()) {//phai la truong phong moi co quyen xem DT hoac xoa
                MsgBOX.alert(this, "BAN KHONG CO QUYEN XEM THONG TIN DOANH THU!!!");
            } else {
                ThongKeTongHopJDialog tkwin = new ThongKeTongHopJDialog(this, true);
                tkwin.setVisible(true);
                tkwin.selectTab(index);
            }

        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP!!!");
        }
    }

    private void HuongdanSD() {
        if (AUTH.isLoGin()) {
            try {
                Desktop.getDesktop().browse(new File("help/index.html").toURI());
            } catch (IOException EX) {
                MsgBOX.alert(this, "KHONG TIM THAY FILE HUONG DAN");
            }
        } else {
            MsgBOX.alert(this, "VUI LONG DANG NHAP!!!");
        }
    }

    private void Gioithieu() {
        if(AUTH.isLoGin()){
        new GioiThieuSPJDialog(this, true).setVisible(true);    
        }else{
            MsgBOX.alert(this,"VUI LONG DANG NHAP!!!");
        }
        
    }

}