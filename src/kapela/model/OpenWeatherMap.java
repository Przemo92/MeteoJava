package kapela.model;

public class OpenWeatherMap {


    private final String apiBase = "http://api.openweathermap.org/data/2.5/forecast?q=";
    private String nameTown = "Londyn";
    private final String units = "metric";
    private final String lang = "pl";
    private final String apiKey = "347d51e680aef0b1dc1e56c9851eaaf9";
    private String fullApi = apiBase + nameTown + "&units=" + units + "&appid=" + apiKey + "&lang=" + lang;

    public OpenWeatherMap(String nameTown) {
        this.nameTown = nameTown;
    }

    public OpenWeatherMap() {
    }
    public String getFullApi() {
        return fullApi;
    }

}
