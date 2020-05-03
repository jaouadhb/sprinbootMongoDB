package fr.aks.org.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private String userName;
    private int rating;
    private boolean approved;

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + userName.hashCode();
        result = 31 * result + rating;
        return result;
    }
}
