/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.DAO;

import com.EduPoLy.Entity.HocVien;
import com.EduPoLy.Entity.NhanVien;
import com.EduPoLy.utils.XJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUY PHUONG
 */
public class HocVienDAO extends EduPolyDAO<HocVien, Integer> {

    String INSERT_SQL = "insert into HOCVIEN(MAKH,MANH,DIEM) values(?,?,?)";
    String UPDATE_SQL = "update HOCVIEN set MAKH=?,MANH=?,DIEM=? where MAHV=?";
    String DELETE_SQL = "delete from HOCVIEN where MAHV=?";
    String SELECT_ALL_SQL = "select * from HOCVIEN";
    String SELECT_BY_ID_SQL = "select * from HOCVIEN where MAHV=?";

    @Override
    public void insert(HocVien entity) {
        XJDBC.update(INSERT_SQL,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
        XJDBC.update(UPDATE_SQL,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem(),
                entity.getMaHV());
    }
/* them */
public boolean checkdk(int makh, String manh, double diem) {
		HocVien entity = new HocVien();
		if (makh > 0 && manh.length() > 0 && diem > 0 && diem <= 10) {
			entity.setMaKH(makh);
			entity.setMaNH(manh);
			entity.setDiem(diem);
			XJDBC.update(INSERT_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
			System.out.println("Dang Ki Thanh Cong");
			return true;
		} else {
			return false;
		}
	}

	public boolean checkup(int makh, String manh, double diem, int mahv) {
		HocVien entity = new HocVien();
		entity.setMaKH(makh);
		entity.setMaNH(manh);
		entity.setDiem(diem);
		entity.setMaHV(mahv);
		try {
			if (selectByID(mahv) == null) {
				return false;
			} else if (mahv == entity.getMaHV() && entity!= null) {
				XJDBC.update(UPDATE_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem(), entity.getMaHV());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean checkdelete(int mahv) {
		HocVien entity = selectByID(mahv);
		if (mahv == (entity.getMaHV())) {
			XJDBC.update(DELETE_SQL, entity.getMaHV());
			System.out.println("Dang Ki Thanh Cong");
			return true;
		} else {
			return false;
		}

	}

    @Override
    public void delete(Integer id) {
        XJDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectByID(Integer id) {
        List<HocVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HocVien> selectBySQL(String sql, Object... args) {
        List<HocVien> list = new ArrayList<HocVien>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt(1));
                entity.setMaKH(rs.getInt(2));
                entity.setMaNH(rs.getString(3));
                entity.setDiem(rs.getDouble(4));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //nhận vào 1 đối số để lấy ra những học viên nằm trong 1 khóa học
    public List<HocVien>selectbykhoahoc(int makh){
        String sql="select * from HOCVIEN where MAKH=?";
        return this.selectBySQL(sql,makh);
    }
            }
