package kapela;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kapela.model.GeneratorWeatherDays;
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


        ViewFactory viewFactory = new ViewFactory(weatherManager);
        viewFactory.showMainWindow();
    }
}
