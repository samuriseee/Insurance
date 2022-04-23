/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HOME-SINGLE
 */
public class JDBCConnect {
        public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:sqlserver://HOME-SINGLE:1433;databaseName = QuanLi_BH";
        final String login = "sa";
        final String password = "cabber123";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
