package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.userDAO.UserDAO;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> list() {
        return userDAO.list();
    }

    public User user(int id) {
        return userDAO.user(id);
    }

    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }
    @Transactional
    public void update(User user, int id) {
        userDAO.update(user, id);
    }

    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }
}
