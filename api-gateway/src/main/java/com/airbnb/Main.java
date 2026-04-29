package com.airbnb;

import com.airbnb.gateway.LoadBalancer;

public class Main {
    public static void main(String[] args) {

        LoadBalancer lb = new LoadBalancer();

        for(int i = 0; i < 5; i++) {
            System.out.println("Request routed to: " + lb.getNextServer());
        }
    }
}
