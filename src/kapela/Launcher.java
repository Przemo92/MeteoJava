package kapela;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kapela.model.JsonReader;
import kapela.view.ViewFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import static kapela.model.JsonReader.readJsonFromUrl;

public class Launcher extends Application {

    private final WeatherManager weatherManager = new WeatherManager();

    public Launcher() throws IOException {
    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception, IOException, JSONException {

        JSONObject json = readJsonFromUrl("http://api.openweathermap.org/data/2.5/weather?q=London&units=metric&APPID=347d51e680aef0b1dc1e56c9851eaaf9&lang=pl");
        System.out.println(json.toString());
        System.out.println((String) json.get("name"));
        System.out.println(json.get("weather"));
        System.out.println(json.get("main"));

        weatherManager.getWeatherDataString();
        ViewFactory viewFactory = new ViewFactory(weatherManager);
        viewFactory.showMainWindow();
    }
}
