/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.utils;

import com.EduPoLy.Entity.NhanVien;

/**
 *
 * @author DUY PHUONG
 */
//HO TRO QUAN LY THONG TIN DANG NHAP(AUTHENTICATION)
public class AUTH {
    //DUY TRI USER DA DANG NHAP VAO HE THONG
    public static NhanVien user=null;
    //XOA TAI KHOAN DA DANG NHAP TRC DO
    public static void clear(){
        AUTH.user=null;
    }
    //KIEM TRA DA DANG NHAP CHUA.NEU BIEN USER !=NULL LA DUNG 
    public static boolean isLoGin(){
        return AUTH.user !=null;
    }
    //XAC DINH VAI TRO (PHÂN QUYỀN)
    public static boolean isManager(){
       return AUTH.isLoGin()&&user.getVaiTro();
    }
}
