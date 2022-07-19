/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.DAO;

import com.EduPoLy.Entity.ChuyenDe;
import com.EduPoLy.Entity.HocVien;
import com.EduPoLy.utils.XJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUY PHUONG
 */
public class ChuyenDeDAO extends EduPolyDAO<ChuyenDe, String> {

	String INSERT_SQL = "insert into CHUYENDE(MACD,TENCD,HOCPHI,THOILUONG,HINH,MOTA) values(?,?,?,?,?,?)";
	String UPDATE_SQL = "update CHUYENDE set TENCD=?,HOCPHI=?,THOILUONG=?,HINH=?,MOTA=? where MACD=?";
	String DELETE_SQL = "delete from CHUYENDE where MACD=?";
	String SELECT_ALL_SQL = "select * from CHUYENDE";
	String SELECT_BY_ID_SQL = "select * from CHUYENDE where MACD=?";

	@Override
	public void insert(ChuyenDe entity) {
		XJDBC.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(),
				entity.getHinh(), entity.getMoTa());
	}

	@Override
	public void update(ChuyenDe entity) {
		XJDBC.update(UPDATE_SQL, entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(),
				entity.getMoTa(), entity.getMaCD());
	}

	/* them */
	public boolean checkdk(String macd, String tencd, double hocphi, int thoiluong, String hinh, String moTa) {
		ChuyenDe entity = new ChuyenDe();
		entity.setMaCD(macd);
		entity.setTenCD(tencd);
		entity.setHocPhi(hocphi);
		entity.setThoiLuong(thoiluong);
		entity.setHinh(hinh);
		entity.setMoTa(moTa);
		try {
			if (selectByID(macd) != null) {
				throw new Exception();
			} else if (entity != null) {
				XJDBC.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(),
						entity.getHinh(), entity.getMoTa());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	public boolean checkup(String tencd, double hocphi, int thoiluong, String hinh, String moTa, String macd) {
		ChuyenDe entity = new ChuyenDe();
		entity.setMaCD(macd);
		entity.setTenCD(tencd);
		entity.setHocPhi(hocphi);
		entity.setThoiLuong(thoiluong);
		entity.setHinh(hinh);
		entity.setMoTa(moTa);
		try {
			if (selectByID(macd) == null) {
				return false;
			} else if (macd.equalsIgnoreCase(entity.getMaCD()) && tencd.length() > 0 && hocphi > 0 && thoiluong > 0
					&& hinh.length() > 0 && moTa.length() > 0) {
				XJDBC.update(UPDATE_SQL, entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(),
						entity.getMoTa(), entity.getMaCD());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean checkdelete(String macd) {
		ChuyenDe entity = new ChuyenDe();
		entity.setMaCD(macd);
		try {
			if (macd.equalsIgnoreCase(entity.getMaCD())) {
				XJDBC.update(DELETE_SQL, entity.getMaCD());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void delete(String id) {
		XJDBC.update(DELETE_SQL, id);
	}

	@Override
	public List<ChuyenDe> selectAll() {
		return this.selectBySQL(SELECT_ALL_SQL);
	}

	@Override
	public ChuyenDe selectByID(String id) {
		List<ChuyenDe> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	protected List<ChuyenDe> selectBySQL(String sql, Object... args) {
		List<ChuyenDe> list = new ArrayList<ChuyenDe>();
		try {
			ResultSet rs = XJDBC.query(sql, args);
			while (rs.next()) {
				ChuyenDe entity = new ChuyenDe();
				entity.setMaCD(rs.getString(1));
				entity.setTenCD(rs.getString(2));
				entity.setHocPhi(rs.getDouble(3));
				entity.setThoiLuong(rs.getInt(4));
				entity.setHinh(rs.getString(5));
				entity.setMoTa(rs.getString(6));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
