package kapela;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kapela.model.JsonReader;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import static kapela.model.JsonReader.readJsonFromUrl;

public class Launcher extends Application {

    private JsonReader jsonReader = new JsonReader();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception, IOException, JSONException {

        JSONObject json = readJsonFromUrl("http://api.openweathermap.org/data/2.5/weather?q=London&units=metric&APPID=347d51e680aef0b1dc1e56c9851eaaf9&lang=pl");
        System.out.println(json.toString());
        System.out.println(json.get("id"));

        Parent parent = FXMLLoader.load(getClass().getResource("view/MainWindow.fxml"));

        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
