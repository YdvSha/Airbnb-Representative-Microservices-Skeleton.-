package com.airbnb;

import com.airbnb.identity.AuthService;

public class Main {

    public static void main(String[] args) {

        AuthService auth = new AuthService();

        String token = auth.login("Shalini");

        System.out.println("Generated Token: " + token);
    }
}
