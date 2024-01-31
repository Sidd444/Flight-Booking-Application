package Flights.Flight.Booking.Application.Transformers;

import Flights.Flight.Booking.Application.Models.Passenger;
import Flights.Flight.Booking.Application.RequestDTOs.PassengerRequestDTO;
import Flights.Flight.Booking.Application.ResponseDTOs.PasssengerResponseDTO;

public class PassengerTransformer {
    public static Passenger PassengerRequestDtoToPassenger(PassengerRequestDTO passengerRequestDTO) {
        return Passenger.builder()
        .name(passengerRequestDTO.getName())
        .age(passengerRequestDTO.getAge())
        .email(passengerRequestDTO.getEmail())
        .build();
    }
    public static PasssengerResponseDTO PassengerToPassengerResponseDto(Passenger passenger){
        return PasssengerResponseDTO.builder()
        .name(passenger.getName())
        .message("Congrats Passenger has been registered")
        .build();
    }
}
