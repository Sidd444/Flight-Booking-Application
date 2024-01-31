package Flights.Flight.Booking.Application.Controllers;

import Flights.Flight.Booking.Application.Models.Passenger;
import Flights.Flight.Booking.Application.RequestDTOs.PassengerRequestDTO;
import Flights.Flight.Booking.Application.ResponseDTOs.PasssengerResponseDTO;
import Flights.Flight.Booking.Application.Services.PassengerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    PassengerService passengerService;
    @PostMapping("/addPassenger")
    public ResponseEntity addPassenger(@RequestBody PassengerRequestDTO passengerRequestDTO){
        PasssengerResponseDTO response= passengerService.addPassenger(passengerRequestDTO);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
    @GetMapping("/getAllPassengers")
    public List<Passenger> getAllPassengers(){
        return passengerService.getAllPassenger();
    }
    @GetMapping("/getPassengerById")
    public Passenger getPassengerById(@RequestParam long id){
        return passengerService.getPassengerById(id);
    }
}
