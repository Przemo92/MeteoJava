package kapela;

import javafx.beans.property.SimpleStringProperty;
import kapela.model.JsonReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

import static kapela.model.JsonReader.readJsonFromUrl;

public class WeatherManager {

    private String nameTown;
    private String weather;

    private String description;

    public WeatherManager() throws IOException {
        //getWeatherDataString();
    }


    /*public JSONObject getWeatherDataString() throws IOException {

        JSONObject json = readJsonFromUrl("http://jsonviewer.stack.hu/#http://api.openweathermap.org/data/2" +
               ".5/forecast?q=London&units=metric&appid=347d51e680aef0b1dc1e56c9851eaaf9&lang=pl");
        setNameTown((String) json.get("name"));


        *//*String jsonString = yourstring;
        JSONObject data = JSON.parse(jsonString);

//reading data using index
        long firstData_uid = data["data"][0]["uid"];
        String firstData_birthday = data["data"][0]["birthday"];
        String firstData_name = data["data"][0]["name"];*//*
        return json;
    }*/
    public String getNameTown() {
        return nameTown;
    }

    public void setNameTown(String nameTown) {
        this.nameTown = nameTown;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
