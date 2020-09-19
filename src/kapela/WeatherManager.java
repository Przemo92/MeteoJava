package kapela;

import javafx.beans.property.SimpleStringProperty;
import kapela.model.JsonReader;
import org.json.JSONObject;

import java.io.IOException;

import static kapela.model.JsonReader.readJsonFromUrl;

public class WeatherManager {

    private String nameTown;

    public WeatherManager() throws IOException {
        getWeatherDataString();
    }


    public JSONObject getWeatherDataString() throws IOException {

        JSONObject json = readJsonFromUrl("http://api.openweathermap.org/data/2.5/weather?q=London&units=metric&APPID=347d51e680aef0b1dc1e56c9851eaaf9&lang=pl");
        setNameTown((String) json.get("name"));
        return json;
    }
    public String getNameTown() {
        return nameTown;
    }

    public void setNameTown(String nameTown) {
        this.nameTown = nameTown;
    }


}
