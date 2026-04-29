package com.airbnb;

import com.airbnb.gateway.LoadBalancer;
import com.airbnb.identity.AuthService;
import com.airbnb.booking.BookingManager;
import com.airbnb.storage.DataStore;
import com.airbnb.storage.SqlStore;

public class AirbnbApplication {

    public static void main(String[] args) {

        // Step 1: Load Balancer
        LoadBalancer lb = new LoadBalancer();
        String server = lb.getNextServer();
        System.out.println("🌐 Request routed to: " + server);

        // Step 2: Authentication
        AuthService authService = new AuthService();
        String token = authService.login("Shalini");

        if (token == null) {
            System.out.println("❌ Authentication Failed");
            return;
        }

        System.out.println("🔐 Auth Successful. Token: " + token);

        // Step 3: Booking
        BookingManager bookingManager = new BookingManager();
        bookingManager.createBooking("Shalini", "Room101");

        // Step 4: Save to DB (Listing Service)
        DataStore db = new SqlStore();
        db.save("101", "Room Booking Data");

        System.out.println("🎉 Flow Completed Successfully!");
    }
}