package th.rosenheim.oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WebsiteGenerator {
    private final List<City> cities;

    public WebsiteGenerator(List<City> cities) {
        this.cities = cities;
    }

    public String getNavigation() {
        StringBuilder content = new StringBuilder("<h1>The Weather App</h1>");
        if (cities != null) {
            content.append("<p>");
            for (City city : cities) {
                content.append("<a href=\"").append(city.getURL()).append("\">")
                        .append(city.name).append("</a> | ");
            }
            content.append("</p>");
        }
        return content.toString();

    }

    public String generatePage(String content ) {
        String star = "<html><body>" + getNavigation() +content+  "</body></html>";
        return star;
    }

    public void generateWebsite() throws IOException {
        Files.write(Paths.get("index.html"), generatePage("").getBytes());
        for (City city : cities) {
            String cityContent = generatePage(city.getContent());
            Files.write(Paths.get(city.getURL()), cityContent.getBytes());
        }


    }
}
