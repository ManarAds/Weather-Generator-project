package th.rosenheim.oop;

public class SmallCity extends City {
    public SmallCity(String name, int weatherCondition) {
        super(name, weatherCondition);
    }

    @Override
    public String getURL() {
        return "weather_small_city" + changeName(name) + ".html";
    }
}
