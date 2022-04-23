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

        String sql = "SELECT * FROM NguoiDung_BH";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
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
        } catch (SQLException e) {
            e.printStackTrace();;
        }
        return users;
    }

    public void DeleteBook(int id) throws SQLException {

        Connection connection = JDBCConnect.getJDBCConnection();

        String sql = "delete from NguoiDung_BH where idBHYT = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void AddBook(User user) throws SQLException {
        Connection connection = JDBCConnect.getJDBCConnection();
        
        String sql ="insert into NguoiDung_BH values (?,?,?,?,?,?,?,?)";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getHoTen());
            preparedStatement.setDate(2, user.getNgaySinh());
            preparedStatement.setBoolean(3, user.isGioiTinh());
            preparedStatement.setString(4, user.getSoDienThoai());
            preparedStatement.setString(5, user.getDiaChi());
            preparedStatement.setString(6, user.getNoiDK());
            preparedStatement.setDate(7, user.getNgayBatDau());
            preparedStatement.setDate(8, user.getNgayKetThuc());
            int rs = preparedStatement.executeUpdate();

            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
//    public void UpdateBook(User user) throws SQLException {
//        Connection connection = JDBCConnect.getJDBCConnection();
//
//        String sql = "UPDATE Books SET bookName = ?,price = ? WHERE id=?";
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, book.getBookName());
//            preparedStatement.setInt(2, book.getPrice());
//            preparedStatement.setInt(3, book.getID());
//
//            int rs = preparedStatement.executeUpdate();
//            System.out.println(rs);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
//}
    
}
