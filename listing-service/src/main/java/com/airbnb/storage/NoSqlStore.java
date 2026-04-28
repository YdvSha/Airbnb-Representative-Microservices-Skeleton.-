package com.airbnb.storage;

public class NoSqlStore implements DataStore {

    @Override
    public void save(String id, Object data) {
        System.out.println("Saving to NoSQL database");
    }
}
