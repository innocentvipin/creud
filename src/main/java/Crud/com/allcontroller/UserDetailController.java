package Crud.com.allcontroller;

import Crud.com.Entity.UserDetail;
import Crud.com.allServices.UsersDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("userDetail")
public class UserDetailController {
    @Autowired
    private UsersDetailServices usersDetailServices;
    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "Working Fine";
    }
    @GetMapping("/allUser")
    public ResponseEntity<?> getAll(){
       // usersDetailServices.getall();
        return ResponseEntity.ok(usersDetailServices.getall());
    }
    @GetMapping(value = "/userDetail",  produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public UserDetail getObj(){
        System.out.println("======getObj======");
     return new UserDetail("Vipin","12",24);
    }
    @GetMapping(value  ="/{id}")
    public ResponseEntity<?> findByID(@PathVariable String id) {
        UserDetail userDetail = usersDetailServices.findByid(id);
        if (userDetail != null) {
            return ResponseEntity.ok(userDetail);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Not Found given user");
    }

   @DeleteMapping("/{id}")
    public ResponseEntity<?>  deleteById(@PathVariable String id){
         usersDetailServices.deleteByid(id);
         return ResponseEntity.ok(HttpStatus.OK);
    }
}
