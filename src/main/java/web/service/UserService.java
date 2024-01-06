package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> list();

    public User user(int id);

    @Transactional
    public void save(User user);
    @Transactional
    public void update(User user, int id);

    @Transactional
    public void delete(int id);
}
