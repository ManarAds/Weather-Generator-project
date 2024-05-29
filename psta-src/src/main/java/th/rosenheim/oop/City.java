package th.rosenheim.oop;

public abstract class City {
    public String name;
    protected int weatherCondtion;

    public City(String name, int weatherCondtion) {
        this.name = name;
        this.weatherCondtion = weatherCondtion;
    }

    public String getWeatherState() {
        switch (weatherCondtion) {
            case 0:
                return "sunny";
            case 1:
                return "cloudy";
            case 2:
                return "rainy";
            default:
                return "this is an invalid entry";
        }
    }

    public String getContent() {
        return "<p> it is " + getWeatherState() + "in" + name + ".<p>";
    }

    public abstract String getURL();

    public String changeName(String name) {
        return name.toLowerCase().replace(" ", "_").replace("ä", "ae").replace("ö", "oe").replace("ü", "ue");
    }
}