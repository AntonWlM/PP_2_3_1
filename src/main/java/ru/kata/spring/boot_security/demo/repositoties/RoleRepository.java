package ru.kata.spring.boot_security.demo.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.Role;
@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Role, Long>  {
    Role findRoleByName(String name);
}
