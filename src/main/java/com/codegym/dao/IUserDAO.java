package com.codegym.dao;

import com.codegym.model.User;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws Exception;
    public User selectUser(int id);
    public List<User> selectAllUsers();
    public boolean deleteUser(int id) throws Exception;
    public boolean updateUser(User user) throws Exception;

    // Tìm kiếm user theo country (gần đúng, không phân biệt hoa thường)
    public List<User> searchByCountry(String country);

    // Sắp xếp user theo name: order = "asc" (A-Z) hoặc "desc" (Z-A)
    public List<User> sortByName(String order);
}
