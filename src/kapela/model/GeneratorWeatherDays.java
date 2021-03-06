package kapela.model;

import java.io.IOException;

public class GeneratorWeatherDays {

    private ForecastDataWeather forecastDataWeather;

    public GeneratorWeatherDays(ForecastDataWeather forecastDataWeather) {
        this.forecastDataWeather = forecastDataWeather;
    }

    public String generateTemperature(int dayIndex, String nameTown){

        forecastDataWeather.fetchData(dayIndex, nameTown);

        return forecastDataWeather.getTemperature();
    }
    public String generateIcon(int dayIndex, String nameTown){

        forecastDataWeather.fetchData(dayIndex, nameTown);

        return forecastDataWeather.getIcon();
    }
    public String generateData(int dayIndex, String nameTown){

        forecastDataWeather.fetchData(dayIndex, nameTown);

        return forecastDataWeather.getReadableDate();
    }
    public String generateTime(int dayIndex, String nameTown){

        forecastDataWeather.fetchData(dayIndex, nameTown);

        return forecastDataWeather.getTime();
    }
    public String generateMessage(String nameTown){

        forecastDataWeather.fetchMessage(nameTown);

        return forecastDataWeather.getMsg();
    }
}
