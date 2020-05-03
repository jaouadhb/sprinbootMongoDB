package fr.aks.org.runner;


import fr.aks.org.domaine.Address;
import fr.aks.org.domaine.Hotel;
import fr.aks.org.domaine.Review;
import fr.aks.org.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public void run(String... args) throws Exception {
        Hotel hotel1 = new Hotel();
        hotel1.setName("flexHotel");
        hotel1.setPrice(125);

        Address address1 = new Address();
        address1.setCity("paris");
        address1.setCountry("France");

        hotel1.setAddress(address1);
        hotel1.getReviews().add(new Review("Jaouad Hba",5,true));



        Hotel hotel2 = new Hotel();
        hotel2.setName("NightHotel");
        hotel2.setPrice(635);

        Address address2 = new Address();
        address2.setCity("fes");
        address2.setCountry("Maroc");

        hotel2.setAddress(address2);
        hotel2.getReviews().add(new Review("Aksil Hba",5,true));

        hotelRepository.deleteAll();
        hotelRepository.insert(hotel1);
        hotelRepository.insert(hotel2);
    }
}
