package com.airbnb.gateway;

import java.util.Arrays;
import java.util.List;

public class LoadBalancer {

    private List<String> servers = Arrays.asList("Server1", "Server2");
    private int counter = 0;

    public String getNextServer() {
        String server = servers.get(counter % servers.size());
        counter++;
        return server;
    }
}
