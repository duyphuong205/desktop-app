/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.Entity;

/**
 *
 * @author DUY PHUONG
 */
public class ChuyenDe {

    String maCD;
    String tenCD;
    double hocPhi;
    int thoiLuong;
    String hinh;
    String moTa;

    public ChuyenDe() {
    }

    public ChuyenDe(String maCD, String tenCD, double hocPhi, int thoiLuong, String hinh, String moTa) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.hinh = hinh;
        this.moTa = moTa;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
//Override 2 phuong thuc toString() va equals() trong lop
 //thuc the chuyende de hien thi chuyen de trong combobox
    @Override
    public String toString() {//lay ten de hien thi trong commbobox
        return this.tenCD;
    }
    @Override
    public boolean equals(Object obj){
        ChuyenDe other=(ChuyenDe) obj;
        return other.getMaCD().equals(this.getMaCD());//lay ma de so sanh 2 chuyende   
    }
}
