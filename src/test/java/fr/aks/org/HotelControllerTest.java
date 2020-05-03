package fr.aks.org;

import fr.aks.org.domaine.Hotel;
import fr.aks.org.repository.HotelRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HotelControllerTest {


    @MockBean
    HotelRepository hotelRepository;
    @Autowired
    TestRestTemplate testRestTemplate;
    @Test
    void should_GetAllHotels() {
        Mockito.when(hotelRepository.findAll()).thenReturn(Arrays.asList(new Hotel("_1235464","CaliHotel",125.21,null,null)));
        testRestTemplate.getForObject("/hotels/", List.class);
    }

    @Test
    void should_GetHotelByName() {
    }
}
