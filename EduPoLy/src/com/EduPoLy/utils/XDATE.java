/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DUY PHUONG
 */
//HO TRO CHUYEN DOI DATE <=>STRING (EXTENSION DATE)
public class XDATE {

    static SimpleDateFormat sdf = new SimpleDateFormat();

    //chuyển đổi string sang date 
    //date là date cần chuyển đổi
    //pattern là định dạng thời gian
    //return date là kết quả
    public static Date toDate(String date, String pattern) {
        try {
            sdf.applyPattern(pattern);
            return sdf.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    //chuyển đổi date sang string
    //date là string cần chuyển đổi
    //pattern là định dạng thời gian
    //return date là kết quả
    public static String toString(Date date, String pattern) {
        sdf.applyPattern(pattern);
        return sdf.format(date);
    }
    //trả về ngày hiện tại
    public static Date now(){
        return new Date();
    }
    //Bo sung ngay vao ngay hien tai.Vidu:+10,-10 
    //date là thời gian hiện có 
    //days là thời gian cần bổ sung
    //return trả về kết quả
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
}
