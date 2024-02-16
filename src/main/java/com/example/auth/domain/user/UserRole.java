package com.example.auth.domain.user;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    //Contructor 
     UserRole(String role) {
        this.role = role;
    }
    public String getRole(){
        return role;
    }

}
