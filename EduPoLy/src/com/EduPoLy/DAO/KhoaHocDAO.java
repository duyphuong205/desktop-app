/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.DAO;

import com.EduPoLy.Entity.HocVien;
import com.EduPoLy.Entity.KhoaHoc;
import com.EduPoLy.utils.XJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DUY PHUONG
 */
public class KhoaHocDAO extends EduPolyDAO<KhoaHoc, Integer> {

	String INSERT_SQL = "insert into KHOAHOC(MACD,HOCPHI,THOILUONG,NGAYKG,GHICHU,MANV,NGAYTAO) values (?,?,?,?,?,?,?)";
	String UPDATE_SQL = "update KHOAHOC set MACD=?,HOCPHI=?,THOILUONG=?,NGAYKG=?,GHICHU=?,MANV=? where MAKH=?";
	String DELETE_SQL = "delete from KHOAHOC where MAKH=?";
	String SELECT_ALL_SQL = "select * from KHOAHOC";
	String SELECT_BY_ID_SQL = "select * from KHOAHOC where MAKH=?";

	@Override
	public void insert(KhoaHoc entity) {
		XJDBC.update(INSERT_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(),
				entity.getGhiChu(), entity.getMaNV(), entity.getNgayTao());

	}

	@Override
	public void update(KhoaHoc entity) {
		XJDBC.update(UPDATE_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(),
				entity.getGhiChu(), entity.getMaNV(), entity.getMaKH());
	}

	/* them */
	public boolean checkdk(int makh, String macd, double hocphi, int thoiluong, Date ngaykhaigiang, String ghichu,
			String manv) {
		KhoaHoc entity = new KhoaHoc();
		entity.setMaKH(makh);
		entity.setMaCD(macd);
		entity.setHocPhi(hocphi);
		entity.setThoiLuong(thoiluong);
		entity.setNgayKG(ngaykhaigiang);
		entity.setGhiChu(ghichu);
		entity.setMaNV(manv);
		try {
			if (selectByID(makh) != null) {
				throw new Exception();
			} else if (entity != null) {
				XJDBC.update(UPDATE_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(),
						entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getMaKH());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	public boolean checkup(String macd, double hocphi, int thoiluong, Date ngaykhaigiang, String ghichu, String manv,
			int makh) {
		KhoaHoc entity = new KhoaHoc();
		entity.setMaKH(makh);
		entity.setMaCD(macd);
		entity.setHocPhi(hocphi);
		entity.setThoiLuong(thoiluong);
		entity.setNgayKG(ngaykhaigiang);
		entity.setGhiChu(ghichu);
		entity.setMaNV(manv);
		try {
			if (macd == null) {
				return false;
			} else if (makh == entity.getMaKH()) {
				XJDBC.update(UPDATE_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(),
						entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getMaKH());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void delete(Integer id) {
		XJDBC.update(DELETE_SQL, id);
	}

	@Override
	public List<KhoaHoc> selectAll() {
		return this.selectBySQL(SELECT_ALL_SQL);
	}

	@Override
	public KhoaHoc selectByID(Integer id) {
		List<KhoaHoc> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	protected List<KhoaHoc> selectBySQL(String sql, Object... args) {
		List<KhoaHoc> list = new ArrayList<KhoaHoc>();
		try {
			ResultSet rs = XJDBC.query(sql, args);
			while (rs.next()) {
				KhoaHoc entity = new KhoaHoc();
				entity.setMaKH(rs.getInt(1));
				entity.setMaCD(rs.getString(2));
				entity.setHocPhi(rs.getDouble(3));
				entity.setThoiLuong(rs.getInt(4));
				entity.setNgayKG(rs.getDate(5));
				entity.setGhiChu(rs.getString(6));
				entity.setMaNV(rs.getString(7));
				entity.setNgayTao(rs.getDate(8));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<KhoaHoc> selectbyChuyende(String macd) {
		String sql = "select * from KHOAHOC where MACD=?";
		return this.selectBySQL(sql, macd);
	}

	public List<Integer> selectYears() {
		String sql = "SELECT DISTINCT Year(NgayKG) from  KhoaHoc ORDER BY Year(NgayKG) DESC";
		List<Integer> list = new ArrayList<>();
		try {
			ResultSet rs = XJDBC.query(sql);
			while (rs.next()) {
				list.add(rs.getInt(1));
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
}
