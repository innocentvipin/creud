package Crud.com.repositories;

import Crud.com.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositoory extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String name);
}
