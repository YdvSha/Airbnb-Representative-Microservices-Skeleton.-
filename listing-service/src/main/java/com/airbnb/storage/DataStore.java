package com.airbnb.storage;

public interface DataStore {
    void save(String id, Object data);
}
