package kapela.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kapela.WeatherManager;
import kapela.view.ViewFactory;

public class MainWindowController extends BaseController{

    @FXML
    private TextField townNameField;

    @FXML
    private Label nameTown;

    public MainWindowController(WeatherManager weatherManager, ViewFactory viewFactory, String fxmlName) {
        super(weatherManager, viewFactory, fxmlName);
    }

    public void setWeatherValue(){

        nameTown.setText("lolek");
    }
}
