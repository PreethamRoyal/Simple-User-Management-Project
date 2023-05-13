package net.javaguides.UserManagemnt.service;

import net.javaguides.UserManagemnt.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUser(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
