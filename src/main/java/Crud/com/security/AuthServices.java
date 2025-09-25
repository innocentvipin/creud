package Crud.com.security;

import Crud.com.Entity.User;
import Crud.com.dto.LoggingRequestDto;
import Crud.com.dto.LoggingResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServices {
    private final AuthenticationManager authenticationManager;
    public LoggingResponseDto login(LoggingRequestDto loggingRequestDto) {
       Authentication authenticat = authenticationManager.authenticate(
               new UsernamePasswordAuthenticationToken(loggingRequestDto.getUsername(),loggingRequestDto.getPassword())
       );
      // User user = (User)  .getPrincipal();

        return null;
    }
}
