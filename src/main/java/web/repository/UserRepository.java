package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {
    public List<User> getUsersList();

    public User findUser(Long id);

    public void saveUser(User user);


    public void updateUser(User user);


    public void deleteUser(Long id);
}
