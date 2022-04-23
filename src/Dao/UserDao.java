/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Model.User;
import java.sql.*;
import java.util.*;
import Dao.JDBCConnect;
/**
 *
 * @author HOME-SINGLE
 */
public class UserDao {
        public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<User>();
        
        Connection connection = JDBCConnect.getJDBCConnection();

        String sql = "SELECT * FROM Books";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
                User user = new User();
                
                  user.setIdBHYT(rs.getInt("idBHYT"));
                  user.setHoTen(rs.getString("hoTen"));
                  user.setNgaySinh(rs.getDate("ngaySinh"));
                  user.setGioiTinh(rs.getBoolean("gioiTinh"));
                  user.setSoDienThoai(rs.getString("soDienThoai"));
                  user.setDiaChi(rs.getString("diaChi"));
                  user.setNoiDK(rs.getString("noiDK"));
                  user.setNgayBatDau(rs.getDate("ngayBatDau"));
                  user.setNgayKetThuc(rs.getDate("ngayKetThuc"));
                  
                  users.add(user);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();;
        }
        return users;
    }
        
    
}
