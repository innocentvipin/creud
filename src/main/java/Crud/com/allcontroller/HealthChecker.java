package Crud.com.allcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class HealthChecker {
    @GetMapping
    public String check(){
        return "well an good";
    }

}
