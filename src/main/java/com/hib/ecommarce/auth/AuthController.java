package com.hib.ecommarce.auth;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthController {

	 private final AuthService authService;

	    @PostMapping("/signup")
	    public ResponseEntity<AuthResponse> signup(
	            @Valid @RequestBody SignupRequest request
	    ) {

	        AuthResponse response =
	                authService.signup(request);

	        return ResponseEntity.ok(response);
	    }

	    @PostMapping("/login")
	    public ResponseEntity<AuthResponse> login(
	            @Valid @RequestBody LoginRequest request
	    ) {

	        AuthResponse response =
	                authService.login(request);

	        return ResponseEntity.ok(response);
	    }
}
