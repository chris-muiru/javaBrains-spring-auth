package com.example.SpringSecurity.Entity.Response;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private final String jwt;
}
