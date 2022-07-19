/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.DAO;

import com.EduPoLy.Entity.NhanVien;
import com.EduPoLy.utils.MsgBOX;
import com.EduPoLy.utils.XJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUY PHUONG
 */
public class NhanVienDAO extends EduPolyDAO<NhanVien, String> {

	String INSERT_SQL = "insert into NHANVIEN(MANV,MATKHAU,HOTEN,VAITRO) values(?,?,?,?)";
	String UPDATE_SQL = "update NHANVIEN set MATKHAU=?,HOTEN=?,VAITRO=? where MANV=?";
	String DELETE_SQL = "delete from NHANVIEN where MANV=?";
	String SELECT_ALL_SQL = "select * from NHANVIEN";
	String SELECT_BY_ID_SQL = "select * from NHANVIEN where MANV=?";
	/*----them-----*/
	String CHECK_LOGIN = "select * from NHANVIEN where MANV=? AND MATKHAU=?";
	/*----them-----*/
	String CHANGE_PASS = "update NHANVIEN set MATKHAU=? where MANV=?";

	@Override
	public void insert(NhanVien entity) {
		XJDBC.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro());
	}

	/*----them-----*/
	public boolean checkLogin(String username, String password) {
		List<NhanVien> list = this.selectBySQL(CHECK_LOGIN, username, password);
		if (list.isEmpty()) {
			return false;
		}else {
		System.out.println("dang nhap thanh cong");
		return true; // (list.get(0));
		}
	}

	/*----them-----*/
	public boolean checkChangePass(String username, String current_pass, String new_pass, String confirm_pass) {
		NhanVien entity = selectByID(username);
		if (username.equalsIgnoreCase(entity.getMaNV()) && current_pass.equalsIgnoreCase(entity.getMatKhau())
				&& new_pass.equalsIgnoreCase(confirm_pass)) {
			entity.setMatKhau(new_pass);
			XJDBC.update(CHANGE_PASS, entity.getMatKhau(), entity.getMaNV());
			System.out.println("Doi thanh cong!");
			return true;
		} else {
			return false;
		}
	}

	public boolean checkInsertNV(String manv, String password, String confirm_pass, String fullname, boolean role) {
		NhanVien entity = new NhanVien();
		entity.setMaNV(manv);
		entity.setMatKhau(password);
		entity.setHoTen(fullname);
		entity.setVaiTro(role);
		try {
			if (selectByID(manv) != null) {
				throw new Exception();
			} else if (entity != null && confirm_pass.equalsIgnoreCase(password)) {
				XJDBC.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro());
				System.out.println("Them thanh cong!");
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// System.out.println("ma id da ton tai!");
			return false;
		}

	}

	public boolean checkUpdateNV(String manv, String password, String confirm_pass, String fullname, boolean role) {
		NhanVien entity = new NhanVien();
		entity.setMaNV(manv);
		entity.setMatKhau(password);
		entity.setHoTen(fullname);
		entity.setVaiTro(role);
		try {
			if (selectByID(manv) == null) {
				return false;
			} else if (entity != null && confirm_pass.equalsIgnoreCase(password)) {
				XJDBC.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro(), entity.getMaNV());
				System.out.println("Cap thanh thanh cong!");
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// System.out.println("ma id da ton tai!");
			return false;
		}

	}

	@Override
	public void update(NhanVien entity) {
		XJDBC.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro(), entity.getMaNV());
	}

	@Override
	public void delete(String id) {
		XJDBC.update(DELETE_SQL, id);
	}

	@Override
	public List<NhanVien> selectAll() {
		return this.selectBySQL(SELECT_ALL_SQL);
	}

	@Override
	public NhanVien selectByID(String id) {
		List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	protected List<NhanVien> selectBySQL(String sql, Object... args) {
		List<NhanVien> list = new ArrayList<NhanVien>();
		try {
			ResultSet rs = XJDBC.query(sql, args);
			while (rs.next()) {
				NhanVien entity = new NhanVien();
				entity.setMaNV(rs.getString(1));
				entity.setMatKhau(rs.getString(2));
				entity.setHoTen(rs.getString(3));
				entity.setVaiTro(rs.getBoolean(4));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
