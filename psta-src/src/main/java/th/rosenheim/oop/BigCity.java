package th.rosenheim.oop;

import java.util.List;

public class BigCity extends City {
    private final List<String> districts;

    public BigCity(String name, int weatherCondition, List<String> districts) {
        super(name, weatherCondition);
        this.districts = districts;
    }

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder("<p>It is " + getWeatherState() + " in " + name + ".</p>");
        content.append("<p>This also applies to ");
        for (int i = 0; i < districts.size(); i++) {
            String editName = districts.get(i);
            content.append(editName);
            if (i < districts.size()) {
                content.append(",");
            } else {
                content.append("and");
            }
        }
        content.append(".</p>");
        return content.toString();

    }

    @Override
    public String getURL() {
        return "weather_big_city" + changeName(name) + ".html";
    }
}
