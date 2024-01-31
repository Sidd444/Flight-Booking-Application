package Flights.Flight.Booking.Application.RequestDTOs;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class FlightRequestDTO {
    long id;
    String Destination;
    boolean availability;
}
