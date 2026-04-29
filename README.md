# Airbnb-Representative-Microservices-Skeleton.-
A representative backend architecture demonstrating key distributed systems concepts using Java and Maven. This project explores how microservices interact, handle data storage, and manage concurrent user requests.

Project Architecture
The system is divided into functional modules, each handling a specific domain of the "Airbnb" ecosystem:

api-gateway: The entry point for all client requests, responsible for routing and load balancing.

listing-service: Manages property listings. It utilizes the Strategy Design Pattern to switch between SQL (PostgreSQL) and NoSQL (MongoDB) data stores seamlessly.

booking-service: Handles the reservation logic. It features Concurrency Control to prevent double-booking using thread-safe locking mechanisms.

common-lib: Shared models (like User.java) and utilities used across all microservices.


Shutterstock
🚀 Key Features Demonstrated
1. Strategy Pattern (Listing Service)
The DataStore interface allows the system to swap database implementations without changing the core business logic.

SQL Store: Ensures ACID compliance for transactional data.

NoSQL Store: Provides horizontal scaling for high-volume listing data.

2. Thread Safety (Booking Service)
The BookingManager uses ReentrantLock to handle high-traffic scenarios.

Scenario: Two users try to book "Room 101" at the same time.

Solution: The code uses lock.tryLock() to ensure only the first thread succeeds, while the second receives a "Room already booked" notification, preventing race conditions.