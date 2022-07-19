/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.DAO;

import com.EduPoLy.Entity.KhoaHoc;
import com.EduPoLy.Entity.NguoiHoc;
import com.EduPoLy.utils.XJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DUY PHUONG
 */
public class NguoiHocDAO extends EduPolyDAO<NguoiHoc, String> {

	String INSERT_SQL = "insert into NguoiHoc(MaNH,HoTen,NgaySinh,GioiTinh,DienThoai,Email,GhiChu,MaNV,NgayDK) values (?,?,?,?,?,?,?,?,?)";
	String UPDATE_SQL = "update NguoiHoc set HoTen=?,NgaySinh=?,GioiTinh=?,DienThoai=?,Email=?,GhiChu=?,MaNV=? where MaNH=?";
	String DELETE_SQL = "delete from NguoiHoc where MaNH=?";
	String SELECT_ALL_SQL = "select * from NguoiHoc";
	String SELECT_BY_ID_SQL = "select * from NguoiHoc where MaNH=?";

	/* them */
	public boolean checkdk(String manh, String hoten, Date ngaysinh, boolean gioitinh, String dienthoai, String email,
			String ghichu, String manv, Date ngaydangki) {
		NguoiHoc entity = new NguoiHoc();
		entity.setMaNH(manh);
		entity.setHoTen(hoten);
		entity.setNgaySinh(ngaysinh);
		entity.setGioiTinh(gioitinh);
		entity.setDienThoai(dienthoai);
		entity.setEmail(email);
		entity.setGhiChu(ghichu);
		entity.setMaNV(manv);
		entity.setNgayDK(ngaydangki);
		try {
			if (selectByID(manh) != null) {
				throw new Exception();
			} else if (entity != null) {
				XJDBC.update(INSERT_SQL, entity.getMaNH(), entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(),
						entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(),
						entity.getNgayDK());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	public boolean checkup(String hoten, Date ngaysinh, boolean gioitinh, String dienthoai, String email, String ghichu,
			String manv, String manh) {
		NguoiHoc entity = new NguoiHoc();
		entity.setMaNH(manh);
		entity.setHoTen(hoten);
		entity.setNgaySinh(ngaysinh);
		entity.setGioiTinh(gioitinh);
		entity.setDienThoai(dienthoai);
		entity.setEmail(email);
		entity.setGhiChu(ghichu);
		entity.setMaNV(manv);
		try {
			if (selectByID(manh) == null) {
				return false;
			} else if (manh.equalsIgnoreCase(entity.getMaNH()) && entity != null) {
				XJDBC.update(UPDATE_SQL, entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(),
						entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(),
						entity.getMaNH());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public void insert(NguoiHoc entity) {
		XJDBC.update(INSERT_SQL, entity.getMaNH(), entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(),
				entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK());
	}

	@Override
	public void update(NguoiHoc entity) {
		XJDBC.update(UPDATE_SQL, entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDienThoai(),
				entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getMaNH());

	}

	@Override
	public void delete(String id) {
		XJDBC.update(DELETE_SQL, id);
	}

	@Override
	public List<NguoiHoc> selectAll() {
		return this.selectBySQL(SELECT_ALL_SQL);
	}

	@Override
	public NguoiHoc selectByID(String id) {
		ArrayList<NguoiHoc> dsnv = (ArrayList<NguoiHoc>) this.selectBySQL(SELECT_BY_ID_SQL, id);
		if (dsnv.isEmpty()) {
			return null;
		}
		return dsnv.get(0);
	}

	@Override
	protected List<NguoiHoc> selectBySQL(String sql, Object... args) {
		ArrayList<NguoiHoc> dsnv = new ArrayList<>();
		try {
			ResultSet rs = XJDBC.query(sql, args);
			while (rs.next()) {
				NguoiHoc entity = new NguoiHoc();
				entity.setMaNH(rs.getString("MaNH"));
				entity.setHoTen(rs.getString("HoTen"));
				entity.setNgaySinh(rs.getDate("NgaySinh"));
				entity.setGioiTinh(rs.getBoolean("GioiTinh"));
				entity.setDienThoai(rs.getString("DienThoai"));
				entity.setEmail(rs.getString("Email"));
				entity.setGhiChu(rs.getString("GhiChu"));
				entity.setMaNV(rs.getString("MaNV"));
				entity.setNgayDK(rs.getDate("NgayDK"));
				dsnv.add(entity);
			}
			rs.getStatement().getConnection().close();
			return dsnv;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	// nhận vào 1 đối số là tìm nguoi học theo hoten

	public List<NguoiHoc> selectByKeyword(String keyword, String manh, String sdt) {
		String sql = "select * from NguoiHoc where HoTen like ? or MANH like ? or dienthoai like ?";
		return this.selectBySQL(sql, "%" + keyword + "%", manh + "%", sdt + "%");
	}

	// nhận vào 2 đối số là tìm người học theo họ tên và người học k có trong khóa
	// học (không phải học viên)
	public List<NguoiHoc> selectNotInCouurse(int makh, String keyword) {
		String sql = "select *from NGUOIHOC where HOTEN like ? and MANH "
				+ "not in (select MANH from HOCVIEN where MAKH=?)";
		return this.selectBySQL(sql, "%" + keyword + "%", makh);
	}
}
