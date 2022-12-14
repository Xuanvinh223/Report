/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happywedding.dao;

import com.happywedding.helper.JDBCHelper;
import com.happywedding.model.Sanh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanhDAO extends AbstractDAO<Sanh>{
    
    private final String INSERT_SANH = "INSERT INTO Sanh (MaSanh, TenSanh, MaPL, SucChua, GiaThueSanh, GiaBan) VALUES (?, ?, ?, ?, ?, ?)";

    private final String UPDATE_SANH = "UPDATE Sanh SET MaSanh=?, TenSanh=?, MaPL=?, SucChua=?, GiaThueSanh=?, GiaBan=? WHERE MaSanh=?";
    private final String DELELTE_SANH = "DELETE FROM Sanh WHERE MaSanh=?";
    private final String SELECT_ALL = "SELECT MaSanh, TenSanh, Sanh.MaPL, TenPL, SucChua, GiaThueSanh, GiaBan from Sanh inner join PhanLoaiSanh on Sanh.MaPL = PhanLoaiSanh.MaPL";
    private final String SELECT_BY_ID = "SELECT MaSanh, TenSanh, Sanh.MaPL, TenPL, SucChua, GiaThueSanh, GiaBan from Sanh inner join PhanLoaiSanh on Sanh.MaPL = PhanLoaiSanh.MaPL WHERE MaSanh=?";
   

    public boolean insert(Sanh sanh) {
        int rs = JDBCHelper.executeUpdate(INSERT_SANH,
                sanh.getMaSanh(),
                sanh.getTenSanh(),
                sanh.getMaPL(),
                sanh.getSucChua(),
                sanh.getGiaThueSanh(),
                sanh.getGiaBan());
        return rs > 0;
    }

    public boolean update(Sanh sanh) {
        int rs = JDBCHelper.executeUpdate(UPDATE_SANH,
                sanh.getMaSanh(),
                sanh.getTenSanh(),
                sanh.getMaPL(),
                sanh.getSucChua(),
                sanh.getGiaThueSanh(),
                sanh.getGiaBan());
        return rs > 0;
    }

    public void delete(String id) {
        int rs = JDBCHelper.executeUpdate(DELELTE_SANH, id);
    }

    @Override
    public List<Sanh> select() {
        //System.out.println("??ang th???c hi??n t??m ki???m t???t c???");
        return select(SELECT_ALL);
    }

    @Override
    public Sanh findById(String id) {
        //System.out.println("??ang th???c hi???n t??m theo m??");
        List<Sanh> list = select(SELECT_BY_ID, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List select(String sql, Object... args) {
        
        //System.out.println("??ang th???c hi???n select");
        
        List<Sanh> list = new ArrayList<>();
        try {
            System.out.println("G??n resultSet = null");
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Sanh sanh = readFromResultSet(rs);
                    list.add(sanh);
                }
            } finally {
                rs.getStatement().getConnection().close();            }

        } catch (SQLException ex) {
            System.out.println("L???i ??? select");
            throw new RuntimeException(ex);
        }
        return list;
    }

    
    // s???a l???i
    private Sanh readFromResultSet(ResultSet rs){
        
        //System.out.println("??ang th???c hi???n readFromResultSet");
        
        Sanh sanh = new Sanh();
        
        try {
               
            sanh.setMaSanh(rs.getString("MaSanh"));
            sanh.setTenSanh(rs.getString("TenSanh"));
            sanh.setMaPL(rs.getString("MaPL"));
            sanh.setTenPL(rs.getString("TenPL"));
            sanh.setSucChua(rs.getInt("SucChua"));
            sanh.setGiaThueSanh(rs.getLong("GiaThueSanh"));
            sanh.setGiaBan(rs.getLong("GiaBan"));

        } catch (Exception e) {
            System.out.println("L???i ??? readFromResultSet");
        }
//
        return sanh;

    }
}
    
