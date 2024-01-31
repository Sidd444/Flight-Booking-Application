package Flights.Flight.Booking.Application.Services;

import Flights.Flight.Booking.Application.Models.Flight;
import Flights.Flight.Booking.Application.Repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;
    public void addFlight(Flight flight){
        flightRepository.save(flight);
    }
    public List<Flight> showAllFlights(){
        return flightRepository.findAll();
    }
    public List<Flight> showAvailableFlights(){
        List<Flight> ll= flightRepository.findAll();
        List<Flight> ans=new ArrayList<>();
        for(Flight f:ll) if(f.isAvailability()==true) ans.add(f);
        return ans;
    }
    public int countFlightsWithDestination(String des){
        List<Flight> ll=flightRepository.findAll();
        int count=0;
        for(Flight f:ll) if(f.getDestination().equals(des)) count++;
        return count;
    }
}
