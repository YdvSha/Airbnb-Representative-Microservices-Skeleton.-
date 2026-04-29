package com.airbnb.identity;

public class AuthService {

    public String login(String username) {
        System.out.println("User logged in: " + username);
        return "JWT-TOKEN-" + username;
    }
}
