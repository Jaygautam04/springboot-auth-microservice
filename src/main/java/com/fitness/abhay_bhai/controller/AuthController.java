package com.fitness.abhay_bhai.controller;

import com.fitness.abhay_bhai.dto.AuthRequest;
import com.fitness.abhay_bhai.dto.AuthResponse;
import com.fitness.abhay_bhai.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.login(request);
    }
}