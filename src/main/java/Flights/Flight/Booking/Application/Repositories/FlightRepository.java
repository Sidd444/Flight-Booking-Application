package Flights.Flight.Booking.Application.Repositories;

import Flights.Flight.Booking.Application.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
}
