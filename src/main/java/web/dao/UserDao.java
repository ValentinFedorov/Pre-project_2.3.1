package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    public List<User> getAllUsers();
}
