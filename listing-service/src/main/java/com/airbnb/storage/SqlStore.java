package com.airbnb.storage;

public class SqlStore implements DataStore {

    @Override
    public void save(String id, Object data) {
        System.out.println("Saving to SQL database");
    }
}
