package Crud.com.allServices;

import Crud.com.Entity.UserDetail;
import Crud.com.repositories.UserDetailRespositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsersDetailServices {
    @Autowired
   private UserDetailRespositiry userRespositiry;

    public UserDetail findByid(String id){
        return userRespositiry.getReferenceById(id);
    }
    public void deleteByid(String id){
         userRespositiry.deleteById(id);
    }
    public UserDetail addUser(UserDetail userDetail){
        return userRespositiry.save(userDetail);
    }

    public UserDetail updateUser(UserDetail userDetail){
        UserDetail oldUser = userRespositiry.getReferenceById(userDetail.getUserId());
        if(Objects.nonNull(oldUser)){
            oldUser.setName(oldUser.getName()!=userDetail.getName()?userDetail.getName():oldUser.getName());
        }
        return oldUser;
    }
    public List<UserDetail> getall(){
       List<UserDetail> allUser = userRespositiry.findAll();
       Thread t1 = new Thread();
       return allUser;
    }

}
