/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author DUY PHUONG
 */
//HO TRO CAC HOP THOAI THONG BAO(MESSAGE BOX)
public class MsgBOX {
    public static void alert(Component parent,String message){
        JOptionPane.showMessageDialog(parent, message,"HE THONG QUAN LY DAO TAO",JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(Component parent,String message){
        int kq=JOptionPane.showConfirmDialog(parent, message,"HE THONG QUAN LY DAO TAO",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return kq==JOptionPane.YES_OPTION;
    }
    public static String prompt(Component parent ,String message){
        return JOptionPane.showInputDialog(parent,message,"HE THONG QUAN LY DAO TAO",JOptionPane.INFORMATION_MESSAGE);
    }
}
