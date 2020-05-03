package fr.aks.org;

import fr.aks.org.repository.HotelRepository;
import fr.aks.org.domaine.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/")
    public List<Hotel> getAllHotels()
    {
        return hotelRepository.findAll();
    }

    @GetMapping("/name/{nameOfHotel}")
    public Hotel getHotelByName(@PathVariable("nameOfHotel") String nameOfHotel)
    {
        return hotelRepository.findByNameUsingQuery(nameOfHotel);
    }
}
