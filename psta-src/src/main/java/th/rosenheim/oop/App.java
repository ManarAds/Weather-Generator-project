package th.rosenheim.oop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) throws IOException {
        List<City> cities = new ArrayList<>();
        cities.add(new SmallCity("Rosenheim", 1));
        cities.add(new BigCity("Munich", 2, List.of("Schwabing", "Sendling", "Lehel", "Nymphenburg")));
        cities.add(new BigCity("Berlin", 0, List.of("Kreuzberg", "Charlottenburg", "Prenzlauer Berg", "Friedrichshain", "Neukölln", "Schöneberg")));

        WebsiteGenerator generator = new WebsiteGenerator(cities);
        generator.generateWebsite();

    }
}
