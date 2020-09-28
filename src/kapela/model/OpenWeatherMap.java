package kapela.model;

public class OpenWeatherMap {


    private final String APIBASE = "http://api.openweathermap.org/data/2.5/forecast?q=";

    private final String UNITS = "metric";
    private final String LANG = "pl";
    private final String APIKEY = "347d51e680aef0b1dc1e56c9851eaaf9";
    private String fullApi1;


    public String getFullApi(String nameTown) {

        fullApi1 = APIBASE + nameTown + "&units=" + UNITS + "&appid=" + APIKEY + "&lang=" + LANG;
        return fullApi1;
    }

}
