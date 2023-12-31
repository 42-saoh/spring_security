package com.example.security.entity;

public class UserDTO {
    private String name;
    private String email;
    private String naverId;
    private String roles;
    public UserDTO() {
    }

    public UserDTO(String name, String email, String naverId, String roles) {
        this.name = name;
        this.email = email;
        this.naverId = naverId;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNaverId() {
        return naverId;
    }

    public void setNaverId(String naverId) {
        this.naverId = naverId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
