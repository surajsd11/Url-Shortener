package com.url.url_Shortener.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {
    private String Username;
    private String email;
    private Set<String> role;
    private String password;
}
