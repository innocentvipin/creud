package Crud.com.repositories;

import Crud.com.Entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespositiry extends JpaRepository<UserDetail,String> {
}
