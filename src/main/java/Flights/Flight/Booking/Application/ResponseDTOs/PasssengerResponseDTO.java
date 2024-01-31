package Flights.Flight.Booking.Application.ResponseDTOs;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PasssengerResponseDTO {
    String name;
    String message;
}
