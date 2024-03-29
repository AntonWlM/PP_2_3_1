package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsersList();

    public User findUser(Long id);

    @Transactional
    public void saveUser(User user);
    @Transactional
    public void updateUser(User user);

    @Transactional
    public void deleteUser(Long id);
}
