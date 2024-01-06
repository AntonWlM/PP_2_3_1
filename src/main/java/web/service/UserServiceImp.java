package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.userDAO.UserDAOImp;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UserDAOImp userDAOImp;

    @Autowired
    public UserServiceImp(UserDAOImp userDAOImp) {
        this.userDAOImp = userDAOImp;
    }

    public List<User> list() {
        return userDAOImp.list();
    }

    public User user(int id) {
        return userDAOImp.user(id);
    }

    @Transactional
    public void save(User user) {
        userDAOImp.save(user);
    }
    @Transactional
    public void update(User user, int id) {
        userDAOImp.update(user, id);
    }

    @Transactional
    public void delete(int id) {
        userDAOImp.delete(id);
    }
}
