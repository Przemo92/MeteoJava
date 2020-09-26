package kapela.model;

import java.io.IOException;

public class GeneratorWeatherDays {

    private ForecastDataWeather forecastDataWeather;

    public GeneratorWeatherDays(ForecastDataWeather forecastDataWeather) {
        this.forecastDataWeather = forecastDataWeather;
    }

    public String generateDescription(int dayIndex) throws IOException {

        forecastDataWeather.fetchData(dayIndex);

        return forecastDataWeather.getDescription();
        }
    public String generateTemperature(int dayIndex) throws IOException {

        forecastDataWeather.fetchData(dayIndex);

        return forecastDataWeather.getTemperature();
    }
    public String generateIcon(int dayIndex) throws IOException {

        forecastDataWeather.fetchData(dayIndex);

        return forecastDataWeather.getIcon();
    }
    public String generateData(int dayIndex) throws IOException {

        forecastDataWeather.fetchData(dayIndex);

        return forecastDataWeather.getReadableDate();
    }
    public String generateTime(int dayIndex) throws IOException {

        forecastDataWeather.fetchData(dayIndex);

        return forecastDataWeather.getTime();
    }
}
