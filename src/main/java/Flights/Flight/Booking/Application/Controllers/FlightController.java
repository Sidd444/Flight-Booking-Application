package Flights.Flight.Booking.Application.Controllers;

import Flights.Flight.Booking.Application.Models.Flight;
import Flights.Flight.Booking.Application.Services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    FlightService flightService;
    @PostMapping("/add-flight")
    public String addFlight(@RequestBody Flight flight){
        flightService.addFlight(flight);
        return "New Flight added successfully";
    }
    @GetMapping("get-all-flights")
    public List<Flight> getAllFlights(){
        return flightService.showAllFlights();
    }
    @GetMapping("/show-available-flights")
    public List<Flight> getAllAvailableFlights(){
        return flightService.showAvailableFlights();
    }
    @GetMapping("/number-of-flights-with-destination")
    public int getFlightsWithDestination(@RequestParam("destination") String s){
        return flightService.countFlightsWithDestination(s);
    }
}
