package com.airbnb;

import com.airbnb.booking.BookingManager;

public class Main {

    public static void main(String[] args) {

        BookingManager manager = new BookingManager();

        Thread t1 = new Thread(() -> manager.createBooking("Shalini", "Room101"));
        Thread t2 = new Thread(() -> manager.createBooking("Divyansh", "Room101"));

        t1.start();
        t2.start();
    }
}