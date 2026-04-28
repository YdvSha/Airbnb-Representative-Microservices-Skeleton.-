package com.airbnb.booking;

import java.util.concurrent.locks.ReentrantLock;

public class BookingManager {

    private final ReentrantLock lock = new ReentrantLock();

    public void createBooking(String userId, String roomId) {

        if (lock.tryLock()) {
            try {
                System.out.println("🔒 Room " + roomId + " locked for user " + userId);

                // simulate processing
                Thread.sleep(2000);

                System.out.println("✅ Booking successful for user " + userId);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
                System.out.println("🔓 Lock released");
            }
        } else {
            System.out.println("❌ Room is already being booked by someone else!");
        }
    }
}
