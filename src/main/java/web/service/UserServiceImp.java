package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsersList() {
        return userRepository.getUsersList();
    }

    public User findUser(Long id) {
        return userRepository.findUser(id);
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }
    @Transactional
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }
}
