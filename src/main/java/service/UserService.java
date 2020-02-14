package service;

import dao.UserDAO;
import model.User;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        userDAO = new UserDAO(getMysqlConnection());
    }

    public void saveUser(User user) throws SQLException {
        userDAO.saveUser(user);
    }

    public User getUserById(long id) throws SQLException {
        return userDAO.getUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDAO.getAllUsers();
    }

    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void deleteUser(User user) throws SQLException {
        userDAO.deleteUser(user);
    }

    private static Connection getMysqlConnection() {
        try {
            Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            DriverManager.registerDriver(driver);
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/PreProject1?serverTimezone=Europe/Moscow",
                    "root",
                    "sanek1982");
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }

}
