package Flights.Flight.Booking.Application.Repositories;

import Flights.Flight.Booking.Application.Models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    public Passenger findByEmail(String email);
}
