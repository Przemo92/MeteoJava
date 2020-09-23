package kapela.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import kapela.WeatherManager;
import kapela.view.ViewFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class MainWindowController extends BaseController implements Initializable {

    @FXML
    private TextField townNameField;

    @FXML
    private Pane onedayAfterField;

    @FXML
    private Pane twoDayAfterFied;

    @FXML
    private Pane threeDayAfterField;

    @FXML
    private Pane fourDayAfterField;

    @FXML
    private AnchorPane todayField;

    @FXML
    private Label nameTown;

    @FXML
    private Label temperatureToday1;

    @FXML
    private Label descriptionToday1;

    @FXML
    private Label dateToday1;

    private WeatherManager weatherManager = new WeatherManager();
    public MainWindowController(WeatherManager weatherManager, ViewFactory viewFactory, String fxmlName) throws IOException {
        super(weatherManager, viewFactory, fxmlName);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        nameTown.setText(weatherManager.getNameTown());
        dateToday1.setText(weatherManager.getDescription());
    }
    private void setUpEmailsTableView() {
        /*todayWeather1.setCellValueFactory((new PropertyValueFactory<, String>("sender")));
        subjectCol.setCellValueFactory((new PropertyValueFactory<EmailMessage, String>("subject")));
        recipientCol.setCellValueFactory((new PropertyValueFactory<EmailMessage, String>("recipient")));
        sizeCol.setCellValueFactory((new PropertyValueFactory<EmailMessage, SizeInteger>("size")));
        dateCol.setCellValueFactory((new PropertyValueFactory<EmailMessage, Date>("date")));*/

    }
}
