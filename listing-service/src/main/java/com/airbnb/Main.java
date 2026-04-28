package com.airbnb;

import com.airbnb.storage.DataStore;
import com.airbnb.storage.SqlStore;
import com.airbnb.storage.NoSqlStore;

public class Main {

    public static void main(String[] args) {

        DataStore db;

        // Try switching this
        db = new SqlStore();
        db.save("1", "Listing Data");

        db = new NoSqlStore();
        db.save("2", "Listing Data");
    }
}
