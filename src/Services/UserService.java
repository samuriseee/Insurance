/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Dao.UserDao;
import java.sql.*;
import java.util.*;
import Model.User;
/**
 *
 * @author HOME-SINGLE
 */
public class UserService {
    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }
    
    public List<User> getALlUser() throws SQLException {
        return userDao.getAllUsers();
    }
    
}
