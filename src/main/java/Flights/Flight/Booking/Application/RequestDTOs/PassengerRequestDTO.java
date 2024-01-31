package Flights.Flight.Booking.Application.RequestDTOs;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PassengerRequestDTO{
    String name;
    int age;
    String email;
}