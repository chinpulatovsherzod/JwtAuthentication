package com.example.authorization.auth;


import lombok.RequiredArgsConstructor;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
        public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request ){
        return ResponseEntity.ok(service.register(request));

    }


    @PostMapping("/authentication")
    public ResponseEntity<AuthenticationResponse> authenticationResponseResponseEntity(
            @RequestBody AuthenticationRequest request ){
        return ResponseEntity.ok(service.authenticate(request));

    }

}
