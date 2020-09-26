package kapela.model;

import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForecastDataWeather {

    private String nameTown;
    private String temperatureString;
    private double temperatureDouble;
    private String description;
    private String readableDate;
    private String time;
    private String icon;
    private JsonReader jsonReader;

    public ForecastDataWeather(JsonReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    public void fetchData(int dayIndex) throws IOException {

        JSONObject item = jsonReader.fetchJsonWeatherDataFromApi().getJSONObject(dayIndex - 1);
        description = item.getJSONArray("weather").getJSONObject(0).get("description").toString();
        icon = item.getJSONArray("weather").getJSONObject(0).get("icon").toString();

        nameTown = "londyn";
        long dateInSeconds = item.optLong("dt");
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
        readableDate = format.format(new Date(dateInSeconds * 1000)); // convert that in milliseconds

        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm");
        time = format2.format(new Date(dateInSeconds *1000));

        JSONObject main = item.getJSONObject("main");
        temperatureString = main.get("temp").toString();
        try {
            temperatureDouble = Math.round(Double.parseDouble(temperatureString));

            temperatureString = String.format("%d",(long)temperatureDouble);
        }
        catch (NumberFormatException e)
        {
            temperatureDouble = 0;
        }
    }

    public String getNameTown() {
        return nameTown;
    }

    public String getTemperature() {
        return temperatureString;
    }

    public String getDescription() {
        return description;
    }

    public String getReadableDate() {
        return readableDate;
    }

    public String getIcon() {
        return icon;
    }

    public String getTime() {
        return time;
    }
}
