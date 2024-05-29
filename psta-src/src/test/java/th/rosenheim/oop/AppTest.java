package th.rosenheim.oop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

class AppTest {
    public class CityTest {
        @Test
        public void testGetContent() {
            City city = new SmallCity("Rosenheim", 1);

            assertEquals("<p>It is cloudy in Rosenheim.</p>", city.getContent());
        }

        @Test
        public void testGetURL() {
            City city = new BigCity("München", 2, List.of("Schwabing", "Sendling", "Lehel", "Nymphenburg"));
            assertEquals("weather_big_city_muenchen.html", city.getURL());
        }

        @Test
        public void changeNameTestt() {
            String name = "munich_airport";
            City city = new SmallCity("Munich Airport", 0);
            assertEquals(name, city.changeName("Munich Airport"));
        }

        @Test
        public void changeNameTest() {
            String name = "Luebeck";
            City city = new SmallCity("Lübeck", 0);
            assertEquals(name, city.changeName("Lübeck"));
        }

    }
}