package Flights.Flight.Booking.Application.Services;

import Flights.Flight.Booking.Application.Exceptions.EmailAlreadyExistsException;
import Flights.Flight.Booking.Application.Models.Passenger;
import Flights.Flight.Booking.Application.Repositories.PassengerRepository;
import Flights.Flight.Booking.Application.RequestDTOs.PassengerRequestDTO;
import Flights.Flight.Booking.Application.ResponseDTOs.PasssengerResponseDTO;
import Flights.Flight.Booking.Application.Transformers.PassengerTransformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;
    public PasssengerResponseDTO addPassenger(PassengerRequestDTO passengerRequestDTO){
       Passenger p=passengerRepository.findByEmail(passengerRequestDTO.getEmail());
       if(p!=null) throw new EmailAlreadyExistsException("Email is already present");
       
       Passenger passenger=PassengerTransformer.PassengerRequestDtoToPassenger(passengerRequestDTO);
       Passenger savedPassenger=passengerRepository.save(passenger);
       return PassengerTransformer.PassengerToPassengerResponseDto(savedPassenger);
    }
    public List<Passenger> getAllPassenger(){
        return passengerRepository.findAll();
    }
    public Passenger getPassengerById(long id){
        return passengerRepository.findById(id).orElse(null);
    }
}
