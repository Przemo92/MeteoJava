package kapela.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kapela.WeatherManager;
import kapela.view.ViewFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController extends BaseController implements Initializable {

    @FXML
    private TextField townNameField;

    @FXML
    private Label nameTown;

    private WeatherManager weatherManager = new WeatherManager();
    public MainWindowController(WeatherManager weatherManager, ViewFactory viewFactory, String fxmlName) throws IOException {
        super(weatherManager, viewFactory, fxmlName);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameTown.setText(weatherManager.getNameTown());
    }
}
