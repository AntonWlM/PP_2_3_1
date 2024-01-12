package web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImp implements UserRepository {

    @PersistenceContext
    private final EntityManager entityManager;


    @Autowired
    public UserRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> getUsersList() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    public User findUser(Long id) {
        return entityManager.find(User.class,id);
    }

    public void saveUser(User user) {
        if (!user.getName().isBlank() && !user.getLastName().isBlank()) {
        entityManager.persist(user);
        entityManager.flush();}
    }

    @Override
    public void updateUser(User user) {
        if (!user.getName().isBlank() && !user.getLastName().isBlank()) {
            entityManager.merge(user);
            entityManager.flush();}
    }

    public void deleteUser(Long id) throws NullPointerException {
        User user = findUser(id);
        if (user == null) {
            throw new NullPointerException("User not found");
        }
        entityManager.remove(user);
        entityManager.flush();
    }
}
