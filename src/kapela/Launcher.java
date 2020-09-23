package kapela;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kapela.model.JsonReader;
import kapela.model.OpenWeatherMap;
import kapela.view.ViewFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static kapela.model.JsonReader.readJsonFromUrl;

public class Launcher extends Application {

    private final WeatherManager weatherManager = new WeatherManager();
    JSONArray list;
    OpenWeatherMap openWeatherMap = new OpenWeatherMap();

    public Launcher() throws IOException {
    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception, IOException, JSONException {

        JSONObject json = readJsonFromUrl(openWeatherMap.getFullApi());
        System.out.println(json.toString());
      /*  System.out.println((String) json.get("name"));
        System.out.println(json.get("weather"));
        System.out.println(json.get("main"));*/
        try {
            list = json.getJSONArray("list");
        } catch (JSONException e) {
            System.out.println(e);
        }
        // Getting the required element from list by dayIndex
        String[] result = new String[11];

        JSONObject item = list.getJSONObject(1 - 1);
        result[0] = item.getJSONArray("weather").getJSONObject(0).get("description").toString();
        JSONObject main = item.getJSONObject("main");
        result[1] = main.get("temp").toString();
        result[2] = "londyn";
        result[3] = item.getJSONArray("weather").getJSONObject(0).get("id").toString();
        result[4] = main.get("pressure").toString();
        result[5] = main.get("humidity").toString();
        result[6] = main.get("temp_min").toString();
        result[7] = main.get("temp_max").toString();
        JSONObject wind = item.getJSONObject("wind");
        result[8] = wind.get("speed").toString();
        result[9] = wind.get("deg").toString();

        long dateInSeconds = item.optLong("dt");
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:mm");

        String readableDate = format.format(new Date(dateInSeconds * 1000)); // convert that in milliseconds
        System.out.println(readableDate);
        System.out.println(result[0]);
        //System.out.println(readableDate);
        //weatherManager.getWeatherDataString();
        ViewFactory viewFactory = new ViewFactory(weatherManager);
        viewFactory.showMainWindow();
    }
}
