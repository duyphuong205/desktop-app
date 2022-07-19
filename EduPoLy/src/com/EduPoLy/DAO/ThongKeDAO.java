/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.DAO;

import com.EduPoLy.utils.XJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUY PHUONG
 */
public class ThongKeDAO {
    List<Object[]> getListOfArraay(String sql, String[] cols, Object... args) {//cậu lệnh sql ,giá trị các cột,tham số biến đổi
        try {
            List<Object[]> list = new ArrayList<>();//danh sách chứa các mảng 
            ResultSet rs = XJDBC.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //{CALL sp_bangdiem(@makh)}->Loi goi 
    //(manh,hoten,diem)->cau truc mang ket qua nhan duoc(danhsach các cột)

    public List<Object[]> getBangDiem(Integer makh) {
        String sql = "{call sp_bangdiem(?)}";
        String[] cols = {"MANH", "HOTEN", "DIEM"};
        return this.getListOfArraay(sql, cols, makh);
    }
    //{call sp_thongkenguoihoc()}
    //(Nam, soluong, dautien ,cuoicung)
    public List<Object[]> getLuongNguoiHoc() {
        String sql = "{call sp_thongkenguoihoc}";
        String[] cols = {"NAM", "SOLUONG", "DAUTIEN", "CUOICUNG"};
        return this.getListOfArraay(sql, cols);
    }
    //{call sp_thongkediem()}
    //(chuyende,sohv,thapnhat,caonhat,trugbinh)
    public List<Object[]> getDiemChuyenDe() {
        String sql = "{call sp_thongkediem}";
        String[] cols = {"ChuyenDe", "SoHocVien", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArraay(sql, cols);
    }
    //{call sp_thongkedoanhthu(@nam)}
    //(chuyende,sokh,sohv,doanhthu,thapnhat,caonhat,trungbinh)
    public List<Object[]> getDoanhThu(int nam) {
        String sql = "{call sp_thongkedoanhthu(?)}";
        String[] cols = {"ChuyenDe", "SoKH", "SoHV", "DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArraay(sql, cols, nam);
    }
}
