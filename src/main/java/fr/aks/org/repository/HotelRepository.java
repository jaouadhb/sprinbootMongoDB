package fr.aks.org.repository;


import fr.aks.org.domaine.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String> {

    List<Hotel> findHotelByPriceIsLessThan(int price);


    @Query(value = "{name : ?0}")
    Hotel findByNameUsingQuery(String nameOfHotel);
}
