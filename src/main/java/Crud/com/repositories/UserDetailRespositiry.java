package Crud.com.repositories;

import Crud.com.Entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRespositiry extends JpaRepository<UserDetail,String> {
}
