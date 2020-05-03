package fr.aks.org.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Hotels")
public class Hotel {
    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private double price;
    private Address address;
    private List<Review> reviews;


    public List<Review> getReviews() {
        if(reviews==null)
            reviews = new ArrayList<>();
        return reviews;
    }
}
