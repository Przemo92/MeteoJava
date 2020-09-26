package kapela.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import kapela.WeatherManager;
import kapela.model.ForecastDataWeather;
import kapela.model.GeneratorWeatherDays;
import kapela.model.JsonReader;
import kapela.model.OpenWeatherMap;
import kapela.view.ViewFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class MainWindowController extends BaseController implements Initializable {


    @FXML
    private Label firstWeatherData;

    @FXML
    private Label temperatureLabel1;

    @FXML
    private Label iconLabel11;

    @FXML
    private Label firstDay;

    @FXML
    private Label secondDay;

    @FXML
    private Label thirdDay;

    @FXML
    private Label fourthDay;

    @FXML
    private Label fifthDay;

    @FXML
    private Label time1;

    @FXML
    private Label time2;

    @FXML
    private Label time3;

    @FXML
    private Label time4;

    @FXML
    private Label time5;

    @FXML
    private Label time6;

    @FXML
    private Label time7;

    @FXML
    private Label time8;

    private GeneratorWeatherDays generatorWeatherDays =
            new GeneratorWeatherDays(
                    new ForecastDataWeather(
                            new JsonReader(
                                    new OpenWeatherMap())));
    public MainWindowController(WeatherManager weatherManager, ViewFactory viewFactory, String fxmlName) throws IOException {
        super(weatherManager, viewFactory, fxmlName);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            firstDay.setText(generatorWeatherDays.generateData(1));
            secondDay.setText(generatorWeatherDays.generateData(9));
            thirdDay.setText(generatorWeatherDays.generateData(17));
            fourthDay.setText(generatorWeatherDays.generateData(25));
            fifthDay.setText(generatorWeatherDays.generateData(34));

            time1.setText(generatorWeatherDays.generateTime(1));
            time2.setText(generatorWeatherDays.generateTime(2));
            time3.setText(generatorWeatherDays.generateTime(3));
            time4.setText(generatorWeatherDays.generateTime(4));
            time5.setText(generatorWeatherDays.generateTime(5));
            time6.setText(generatorWeatherDays.generateTime(6));
            time7.setText(generatorWeatherDays.generateTime(7));
            time8.setText(generatorWeatherDays.generateTime(8));

            firstWeatherData.setText(generatorWeatherDays.generateDescription(1));
            temperatureLabel1.setText(generatorWeatherDays.generateTemperature(1) + "°C");
            iconLabel11.setGraphic(new ImageView("http://openweathermap.org/img/wn/"+generatorWeatherDays.generateIcon(1)+".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        // dateToday1.setText(weatherManager.getDescription());
    }

}
