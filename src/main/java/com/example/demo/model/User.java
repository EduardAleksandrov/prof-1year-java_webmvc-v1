package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Generates Getters, Setters, toString, equals, and hashCode
@NoArgsConstructor 
public class User {
    private Long id;
    private String name;
    private String email;
    private String role; // e.g., "ADMIN" or "USER"
    private boolean active;
    // Getters and Setters...
}
