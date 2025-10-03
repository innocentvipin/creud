package Crud.com.allcontroller;

import Crud.com.dto.LoggingRequestDto;
import Crud.com.dto.LoggingResponseDto;
import Crud.com.security.AuthServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthServices authServices;

    @PostMapping("/logging")
    public ResponseEntity<LoggingResponseDto> loging(@RequestBody LoggingRequestDto loggingRequestDto){
        System.out.println("********************");
        return ResponseEntity.ok(authServices.login(loggingRequestDto));
    }


}
