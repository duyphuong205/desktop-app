/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EduPoLy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DUY PHUONG
 */
//HO TRO LAP TRINH JDBC(JDBC HELPER)
public class XJDBC {

    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String db = "jdbc:sqlserver://localhost:1433;databaseName=DB_DuAnMau";//DB_DuAnMau
    public static String user = "sa";
    public static String pass = "songlong";
    //nap driver

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(db, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);//proc
        } else {
            stmt = conn.prepareStatement(sql);//sql
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    public static int update(String sql, Object... args){
        try {
            PreparedStatement stmt = XJDBC.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = XJDBC.getStmt(sql, args);
        return stmt.executeQuery();
    }
    //tra ve 1 gia tri

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = XJDBC.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);//lay gia tri dau tien
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
