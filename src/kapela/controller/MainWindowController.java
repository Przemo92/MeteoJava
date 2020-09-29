package kapela.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import kapela.model.ForecastDataWeather;
import kapela.model.GeneratorWeatherDays;
import kapela.model.JsonReader;
import kapela.model.OpenWeatherMap;
import kapela.view.ViewFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainWindowController extends BaseController implements Initializable {

    private String nameTown1 = "LONDYN";
    private String nameTown2 = "POZNAŃ";
    private String msg;

    @FXML
    private Label temperatureLabel1;

    @FXML
    private Label iconLabel1;

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

    @FXML
    private Label temperatureLabel2;

    @FXML
    private Label iconLabel2;

    @FXML
    private Label temperatureLabel3;

    @FXML
    private Label iconLabel3;

    @FXML
    private Label temperatureLabel4;

    @FXML
    private Label iconLabel4;

    @FXML
    private Label temperatureLabel5;

    @FXML
    private Label iconLabel5;

    @FXML
    private Label temperatureLabel6;

    @FXML
    private Label iconLabel6;

    @FXML
    private Label temperatureLabel7;

    @FXML
    private Label iconLabel7;

    @FXML
    private Label temperatureLabel8;

    @FXML
    private Label iconLabel8;

    @FXML
    private Label temperatureLabel9;

    @FXML
    private Label iconLabel9;

    @FXML
    private Label temperatureLabel10;

    @FXML
    private Label iconLabel10;

    @FXML
    private Label temperatureLabel11;

    @FXML
    private Label iconLabel11;

    @FXML
    private Label temperatureLabel12;

    @FXML
    private Label iconLabel12;

    @FXML
    private Label temperatureLabel13;

    @FXML
    private Label iconLabel13;

    @FXML
    private Label temperatureLabel14;

    @FXML
    private Label iconLabel14;

    @FXML
    private Label temperatureLabel15;

    @FXML
    private Label iconLabel15;

    @FXML
    private Label temperatureLabel16;

    @FXML
    private Label iconLabel16;

    @FXML
    private Label temperatureLabel17;

    @FXML
    private Label iconLabel17;

    @FXML
    private Label temperatureLabel18;

    @FXML
    private Label iconLabel18;

    @FXML
    private Label temperatureLabel19;

    @FXML
    private Label iconLabel19;

    @FXML
    private Label temperatureLabel20;

    @FXML
    private Label iconLabel20;

    @FXML
    private Label temperatureLabel21;

    @FXML
    private Label iconLabel21;

    @FXML
    private Label temperatureLabel22;

    @FXML
    private Label iconLabel22;

    @FXML
    private Label temperatureLabel23;

    @FXML
    private Label iconLabel23;

    @FXML
    private Label temperatureLabel24;

    @FXML
    private Label iconLabel24;

    @FXML
    private Label temperatureLabel25;

    @FXML
    private Label iconLabel25;

    @FXML
    private Label temperatureLabel26;

    @FXML
    private Label iconLabel26;

    @FXML
    private Label temperatureLabel27;

    @FXML
    private Label iconLabel27;

    @FXML
    private Label temperatureLabel28;

    @FXML
    private Label iconLabel28;

    @FXML
    private Label temperatureLabel29;

    @FXML
    private Label iconLabel29;

    @FXML
    private Label temperatureLabel30;

    @FXML
    private Label iconLabel30;

    @FXML
    private Label temperatureLabel31;

    @FXML
    private Label iconLabel31;

    @FXML
    private Label temperatureLabel32;

    @FXML
    private Label iconLabel32;

    @FXML
    private Label temperatureLabel33;

    @FXML
    private Label iconLabel33;

    @FXML
    private Label temperatureLabel34;

    @FXML
    private Label iconLabel34;

    @FXML
    private Label temperatureLabel35;

    @FXML
    private Label iconLabel35;

    @FXML
    private Label temperatureLabel36;

    @FXML
    private Label iconLabel36;

    @FXML
    private Label temperatureLabel37;

    @FXML
    private Label iconLabel37;

    @FXML
    private Label temperatureLabel38;

    @FXML
    private Label iconLabel38;

    @FXML
    private Label temperatureLabel39;

    @FXML
    private Label iconLabel39;

    @FXML
    private Label temperatureLabel40;

    @FXML
    private Label iconLabel40;

    @FXML
    private Label errorLabel1;

    @FXML
    private Label errorLabel2;

    @FXML
    private Label nameTownLabel1;

    @FXML
    private TextField textField1;

    @FXML
    private Label temperatureLabel41;

    @FXML
    private Label iconLabel41;

    @FXML
    private Label firstDay2;

    @FXML
    private Label secondDay2;

    @FXML
    private Label thirdDay2;

    @FXML
    private Label fourthDay2;

    @FXML
    private Label fifthDay2;

    @FXML
    private Label time9;

    @FXML
    private Label time10;

    @FXML
    private Label time11;

    @FXML
    private Label time12;

    @FXML
    private Label time13;

    @FXML
    private Label time614;

    @FXML
    private Label time15;

    @FXML
    private Label time16;

    @FXML
    private Label temperatureLabel42;

    @FXML
    private Label iconLabel42;

    @FXML
    private Label temperatureLabel43;

    @FXML
    private Label iconLabel43;

    @FXML
    private Label temperatureLabel44;

    @FXML
    private Label iconLabel44;

    @FXML
    private Label temperatureLabel45;

    @FXML
    private Label iconLabel45;

    @FXML
    private Label temperatureLabel46;

    @FXML
    private Label iconLabel46;

    @FXML
    private Label temperatureLabel47;

    @FXML
    private Label iconLabel47;

    @FXML
    private Label temperatureLabel48;

    @FXML
    private Label iconLabel48;

    @FXML
    private Label temperatureLabel49;

    @FXML
    private Label iconLabel49;

    @FXML
    private Label temperatureLabel50;

    @FXML
    private Label iconLabel50;

    @FXML
    private Label temperatureLabel51;

    @FXML
    private Label iconLabel51;

    @FXML
    private Label temperatureLabel52;

    @FXML
    private Label iconLabel52;

    @FXML
    private Label temperatureLabel53;

    @FXML
    private Label iconLabel53;

    @FXML
    private Label temperatureLabel54;

    @FXML
    private Label iconLabel54;

    @FXML
    private Label temperatureLabel55;

    @FXML
    private Label iconLabel55;

    @FXML
    private Label temperatureLabel56;

    @FXML
    private Label iconLabel56;

    @FXML
    private Label temperatureLabel57;

    @FXML
    private Label iconLabel57;

    @FXML
    private Label temperatureLabel58;

    @FXML
    private Label iconLabel58;

    @FXML
    private Label temperatureLabel59;

    @FXML
    private Label iconLabel59;

    @FXML
    private Label temperatureLabel60;

    @FXML
    private Label iconLabel60;

    @FXML
    private Label temperatureLabel61;

    @FXML
    private Label iconLabel61;

    @FXML
    private Label temperatureLabel62;

    @FXML
    private Label iconLabel62;

    @FXML
    private Label temperatureLabel63;

    @FXML
    private Label iconLabel63;

    @FXML
    private Label temperatureLabel64;

    @FXML
    private Label iconLabel64;

    @FXML
    private Label temperatureLabel65;

    @FXML
    private Label iconLabel65;

    @FXML
    private Label temperatureLabel66;

    @FXML
    private Label iconLabel66;

    @FXML
    private Label temperatureLabel67;

    @FXML
    private Label iconLabel67;

    @FXML
    private Label temperatureLabel68;

    @FXML
    private Label iconLabel68;

    @FXML
    private Label temperatureLabel69;

    @FXML
    private Label iconLabel69;

    @FXML
    private Label temperatureLabel70;

    @FXML
    private Label iconLabel70;

    @FXML
    private Label temperatureLabel71;

    @FXML
    private Label iconLabel71;

    @FXML
    private Label temperatureLabel72;

    @FXML
    private Label iconLabel72;

    @FXML
    private Label temperatureLabel73;

    @FXML
    private Label iconLabel73;

    @FXML
    private Label temperatureLabel74;

    @FXML
    private Label iconLabel74;

    @FXML
    private Label temperatureLabel75;

    @FXML
    private Label iconLabel75;

    @FXML
    private Label temperatureLabel76;

    @FXML
    private Label iconLabel76;

    @FXML
    private Label temperatureLabel77;

    @FXML
    private Label iconLabel77;

    @FXML
    private Label temperatureLabel78;

    @FXML
    private Label iconLabel78;

    @FXML
    private Label temperatureLabel79;

    @FXML
    private Label iconLabel79;

    @FXML
    private Label temperatureLabel80;

    @FXML
    private Label iconLabel80;

    @FXML
    private Label errorLabel11;

    @FXML
    private Label nameTownLabel2;

    @FXML
    private TextField textField2;

    @FXML
    void foundAction2(){

        nameTown2 = textField2.getText().toUpperCase();

        if(fieldsAreValid2()){

            inputDataIntoObjects2();
        }
    }
    @FXML
    void foundAction1(){

        nameTown1 = textField1.getText().toUpperCase();
        if(fieldsAreValid1()){

                inputDataIntoObjects1();
        }
    }
   private GeneratorWeatherDays generatorWeatherDays =
            new GeneratorWeatherDays(
                    new ForecastDataWeather(
                            new JsonReader(
                                    new OpenWeatherMap())));
    public MainWindowController(ViewFactory viewFactory, String fxmlName) throws IOException {
        super(viewFactory, fxmlName);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        inputDataIntoObjects1();
        inputDataIntoObjects2();
        try {
            setLabelsWithDateAndTime();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setLabelsWithDateAndTime() throws IOException {

        firstDay.setText(generatorWeatherDays.generateData(1, nameTown1));
        secondDay.setText(generatorWeatherDays.generateData(9, nameTown1));
        thirdDay.setText(generatorWeatherDays.generateData(17, nameTown1));
        fourthDay.setText(generatorWeatherDays.generateData(25, nameTown1));
        fifthDay.setText(generatorWeatherDays.generateData(34, nameTown1));

        time1.setText(generatorWeatherDays.generateTime(1, nameTown1));
        time2.setText(generatorWeatherDays.generateTime(2, nameTown1));
        time3.setText(generatorWeatherDays.generateTime(3, nameTown1));
        time4.setText(generatorWeatherDays.generateTime(4, nameTown1));
        time5.setText(generatorWeatherDays.generateTime(5, nameTown1));
        time6.setText(generatorWeatherDays.generateTime(6, nameTown1));
        time7.setText(generatorWeatherDays.generateTime(7, nameTown1));
        time8.setText(generatorWeatherDays.generateTime(8, nameTown1));

        firstDay2.setText(firstDay.getText());
        secondDay2.setText(secondDay.getText());
        thirdDay2.setText(thirdDay.getText());
        fourthDay2.setText(fourthDay.getText());
        fifthDay2.setText(fifthDay.getText());

        time9.setText(time1.getText());
        time10.setText(time2.getText());
        time11.setText(time3.getText());
        time12.setText(time4.getText());
        time13.setText(time5.getText());
        time614.setText(time6.getText());
        time15.setText(time7.getText());
        time16.setText(time8.getText());
    }
    public void inputDataIntoObjects1() {

        try {
            nameTownLabel1.setText(nameTown1);
            errorLabel1.setText("");

            temperatureLabel1.setText(generatorWeatherDays.generateTemperature(1, nameTown1) + "°C");
            iconLabel1.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(1, nameTown1) + ".png"));

            temperatureLabel2.setText(generatorWeatherDays.generateTemperature(2, nameTown1) + "°C");
            iconLabel2.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(2, nameTown1) + ".png"));

            temperatureLabel3.setText(generatorWeatherDays.generateTemperature(3, nameTown1) + "°C");
            iconLabel3.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(3, nameTown1) + ".png"));

            temperatureLabel4.setText(generatorWeatherDays.generateTemperature(4, nameTown1) + "°C");
            iconLabel4.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(4, nameTown1) + ".png"));

            temperatureLabel5.setText(generatorWeatherDays.generateTemperature(5, nameTown1) + "°C");
            iconLabel5.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(5, nameTown1) + ".png"));

            temperatureLabel6.setText(generatorWeatherDays.generateTemperature(6, nameTown1) + "°C");
            iconLabel6.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(6, nameTown1) + ".png"));

            temperatureLabel7.setText(generatorWeatherDays.generateTemperature(7, nameTown1) + "°C");
            iconLabel7.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(7, nameTown1) + ".png"));

            temperatureLabel8.setText(generatorWeatherDays.generateTemperature(8, nameTown1) + "°C");
            iconLabel8.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(8, nameTown1) + ".png"));

            temperatureLabel9.setText(generatorWeatherDays.generateTemperature(9, nameTown1) + "°C");
            iconLabel9.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(9, nameTown1) + ".png"));

            temperatureLabel10.setText(generatorWeatherDays.generateTemperature(10, nameTown1) + "°C");
            iconLabel10.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(10, nameTown1) + ".png"));

            temperatureLabel11.setText(generatorWeatherDays.generateTemperature(11, nameTown1) + "°C");
            iconLabel11.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(11, nameTown1) + ".png"));

            temperatureLabel12.setText(generatorWeatherDays.generateTemperature(12, nameTown1) + "°C");
            iconLabel12.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(12, nameTown1) + ".png"));

            temperatureLabel13.setText(generatorWeatherDays.generateTemperature(13, nameTown1) + "°C");
            iconLabel13.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(13, nameTown1) + ".png"));

            temperatureLabel14.setText(generatorWeatherDays.generateTemperature(14, nameTown1) + "°C");
            iconLabel14.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(14, nameTown1) + ".png"));

            temperatureLabel15.setText(generatorWeatherDays.generateTemperature(15, nameTown1) + "°C");
            iconLabel15.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(15, nameTown1) + ".png"));

            temperatureLabel16.setText(generatorWeatherDays.generateTemperature(16, nameTown1) + "°C");
            iconLabel16.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(16, nameTown1) + ".png"));

            temperatureLabel17.setText(generatorWeatherDays.generateTemperature(17, nameTown1) + "°C");
            iconLabel17.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(17, nameTown1) + ".png"));

            temperatureLabel18.setText(generatorWeatherDays.generateTemperature(18, nameTown1) + "°C");
            iconLabel18.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(18, nameTown1) + ".png"));

            temperatureLabel19.setText(generatorWeatherDays.generateTemperature(19, nameTown1) + "°C");
            iconLabel19.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(19, nameTown1) + ".png"));

            temperatureLabel20.setText(generatorWeatherDays.generateTemperature(20, nameTown1) + "°C");
            iconLabel20.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(20, nameTown1) + ".png"));

            temperatureLabel21.setText(generatorWeatherDays.generateTemperature(21, nameTown1) + "°C");
            iconLabel21.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(21, nameTown1) + ".png"));

            temperatureLabel22.setText(generatorWeatherDays.generateTemperature(22, nameTown1) + "°C");
            iconLabel22.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(22, nameTown1) + ".png"));

            temperatureLabel23.setText(generatorWeatherDays.generateTemperature(23, nameTown1) + "°C");
            iconLabel23.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(23, nameTown1) + ".png"));

            temperatureLabel24.setText(generatorWeatherDays.generateTemperature(24, nameTown1) + "°C");
            iconLabel24.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(24, nameTown1) + ".png"));

            temperatureLabel25.setText(generatorWeatherDays.generateTemperature(25, nameTown1) + "°C");
            iconLabel25.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(25, nameTown1) + ".png"));

            temperatureLabel26.setText(generatorWeatherDays.generateTemperature(26, nameTown1) + "°C");
            iconLabel26.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(26, nameTown1) + ".png"));

            temperatureLabel27.setText(generatorWeatherDays.generateTemperature(27, nameTown1) + "°C");
            iconLabel27.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(27, nameTown1) + ".png"));

            temperatureLabel28.setText(generatorWeatherDays.generateTemperature(28, nameTown1) + "°C");
            iconLabel28.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(28, nameTown1) + ".png"));

            temperatureLabel29.setText(generatorWeatherDays.generateTemperature(29, nameTown1) + "°C");
            iconLabel29.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(29, nameTown1) + ".png"));

            temperatureLabel30.setText(generatorWeatherDays.generateTemperature(30, nameTown1) + "°C");
            iconLabel30.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(30, nameTown1) + ".png"));

            temperatureLabel31.setText(generatorWeatherDays.generateTemperature(31, nameTown1) + "°C");
            iconLabel31.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(31, nameTown1) + ".png"));

            temperatureLabel32.setText(generatorWeatherDays.generateTemperature(32, nameTown1) + "°C");
            iconLabel32.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(32, nameTown1) + ".png"));

            temperatureLabel33.setText(generatorWeatherDays.generateTemperature(33, nameTown1) + "°C");
            iconLabel33.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(33, nameTown1) + ".png"));

            temperatureLabel34.setText(generatorWeatherDays.generateTemperature(34, nameTown1) + "°C");
            iconLabel34.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(34, nameTown1) + ".png"));

            temperatureLabel35.setText(generatorWeatherDays.generateTemperature(35, nameTown1) + "°C");
            iconLabel35.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(35, nameTown1) + ".png"));

            temperatureLabel36.setText(generatorWeatherDays.generateTemperature(36, nameTown1) + "°C");
            iconLabel36.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(36, nameTown1) + ".png"));

            temperatureLabel37.setText(generatorWeatherDays.generateTemperature(37, nameTown1) + "°C");
            iconLabel37.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(37, nameTown1) + ".png"));

            temperatureLabel38.setText(generatorWeatherDays.generateTemperature(38, nameTown1) + "°C");
            iconLabel38.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(38, nameTown1) + ".png"));

            temperatureLabel39.setText(generatorWeatherDays.generateTemperature(39, nameTown1) + "°C");
            iconLabel39.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(39, nameTown1) + ".png"));

            temperatureLabel40.setText(generatorWeatherDays.generateTemperature(40, nameTown1) + "°C");
            iconLabel40.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(40, nameTown1) + ".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void inputDataIntoObjects2() {

        try {
            nameTownLabel2.setText(nameTown2);
            errorLabel2.setText("");

            temperatureLabel41.setText(generatorWeatherDays.generateTemperature(1, nameTown2) + "°C");
            iconLabel41.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(1, nameTown2) + ".png"));

            temperatureLabel42.setText(generatorWeatherDays.generateTemperature(2, nameTown2) + "°C");
            iconLabel42.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(2, nameTown2) + ".png"));

            temperatureLabel43.setText(generatorWeatherDays.generateTemperature(3, nameTown2) + "°C");
            iconLabel43.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(3, nameTown2) + ".png"));

            temperatureLabel44.setText(generatorWeatherDays.generateTemperature(4, nameTown2) + "°C");
            iconLabel44.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(4, nameTown2) + ".png"));

            temperatureLabel45.setText(generatorWeatherDays.generateTemperature(5, nameTown2) + "°C");
            iconLabel45.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(5, nameTown2) + ".png"));

            temperatureLabel46.setText(generatorWeatherDays.generateTemperature(6, nameTown2) + "°C");
            iconLabel46.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(6, nameTown2) + ".png"));

            temperatureLabel47.setText(generatorWeatherDays.generateTemperature(7, nameTown2) + "°C");
            iconLabel47.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(7, nameTown2) + ".png"));

            temperatureLabel48.setText(generatorWeatherDays.generateTemperature(8, nameTown2) + "°C");
            iconLabel48.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(8, nameTown2) + ".png"));

            temperatureLabel49.setText(generatorWeatherDays.generateTemperature(9, nameTown2) + "°C");
            iconLabel49.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(9, nameTown2) + ".png"));

            temperatureLabel50.setText(generatorWeatherDays.generateTemperature(10, nameTown2) + "°C");
            iconLabel50.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(10, nameTown2) + ".png"));

            temperatureLabel51.setText(generatorWeatherDays.generateTemperature(11, nameTown2) + "°C");
            iconLabel51.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(11, nameTown2) + ".png"));

            temperatureLabel52.setText(generatorWeatherDays.generateTemperature(12, nameTown2) + "°C");
            iconLabel52.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(12, nameTown2) + ".png"));

            temperatureLabel53.setText(generatorWeatherDays.generateTemperature(13, nameTown2) + "°C");
            iconLabel53.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(13, nameTown2) + ".png"));

            temperatureLabel54.setText(generatorWeatherDays.generateTemperature(14, nameTown2) + "°C");
            iconLabel54.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(14, nameTown2) + ".png"));

            temperatureLabel55.setText(generatorWeatherDays.generateTemperature(15, nameTown2) + "°C");
            iconLabel55.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(15, nameTown2) + ".png"));

            temperatureLabel56.setText(generatorWeatherDays.generateTemperature(16, nameTown2) + "°C");
            iconLabel56.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(16, nameTown2) + ".png"));

            temperatureLabel57.setText(generatorWeatherDays.generateTemperature(17, nameTown2) + "°C");
            iconLabel57.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(17, nameTown2) + ".png"));

            temperatureLabel58.setText(generatorWeatherDays.generateTemperature(18, nameTown2) + "°C");
            iconLabel58.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(18, nameTown2) + ".png"));

            temperatureLabel59.setText(generatorWeatherDays.generateTemperature(19, nameTown2) + "°C");
            iconLabel59.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(19, nameTown2) + ".png"));

            temperatureLabel60.setText(generatorWeatherDays.generateTemperature(20, nameTown2) + "°C");
            iconLabel60.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(20, nameTown2) + ".png"));

            temperatureLabel61.setText(generatorWeatherDays.generateTemperature(21, nameTown2) + "°C");
            iconLabel61.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(21, nameTown2) + ".png"));

            temperatureLabel62.setText(generatorWeatherDays.generateTemperature(22, nameTown2) + "°C");
            iconLabel62.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(22, nameTown2) + ".png"));

            temperatureLabel63.setText(generatorWeatherDays.generateTemperature(23, nameTown2) + "°C");
            iconLabel63.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(23, nameTown2) + ".png"));

            temperatureLabel64.setText(generatorWeatherDays.generateTemperature(24, nameTown2) + "°C");
            iconLabel64.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(24, nameTown2) + ".png"));

            temperatureLabel65.setText(generatorWeatherDays.generateTemperature(25, nameTown2) + "°C");
            iconLabel65.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(25, nameTown2) + ".png"));

            temperatureLabel66.setText(generatorWeatherDays.generateTemperature(26, nameTown2) + "°C");
            iconLabel66.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(26, nameTown2) + ".png"));

            temperatureLabel67.setText(generatorWeatherDays.generateTemperature(27, nameTown2) + "°C");
            iconLabel67.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(27, nameTown2) + ".png"));

            temperatureLabel68.setText(generatorWeatherDays.generateTemperature(28, nameTown2) + "°C");
            iconLabel68.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(28, nameTown2) + ".png"));

            temperatureLabel69.setText(generatorWeatherDays.generateTemperature(29, nameTown2) + "°C");
            iconLabel69.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(29, nameTown2) + ".png"));

            temperatureLabel70.setText(generatorWeatherDays.generateTemperature(30, nameTown2) + "°C");
            iconLabel70.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(30, nameTown2) + ".png"));

            temperatureLabel71.setText(generatorWeatherDays.generateTemperature(31, nameTown2) + "°C");
            iconLabel71.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(31, nameTown2) + ".png"));

            temperatureLabel72.setText(generatorWeatherDays.generateTemperature(32, nameTown2) + "°C");
            iconLabel72.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(32, nameTown2) + ".png"));

            temperatureLabel73.setText(generatorWeatherDays.generateTemperature(33, nameTown2) + "°C");
            iconLabel73.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(33, nameTown2) + ".png"));

            temperatureLabel74.setText(generatorWeatherDays.generateTemperature(34, nameTown2) + "°C");
            iconLabel74.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(34, nameTown2) + ".png"));

            temperatureLabel75.setText(generatorWeatherDays.generateTemperature(35, nameTown2) + "°C");
            iconLabel75.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(35, nameTown2) + ".png"));

            temperatureLabel76.setText(generatorWeatherDays.generateTemperature(36, nameTown2) + "°C");
            iconLabel76.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(36, nameTown2) + ".png"));

            temperatureLabel77.setText(generatorWeatherDays.generateTemperature(37, nameTown2) + "°C");
            iconLabel77.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(37, nameTown2) + ".png"));

            temperatureLabel78.setText(generatorWeatherDays.generateTemperature(38, nameTown2) + "°C");
            iconLabel78.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(38, nameTown2) + ".png"));

            temperatureLabel79.setText(generatorWeatherDays.generateTemperature(39, nameTown2) + "°C");
            iconLabel79.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(39, nameTown2) + ".png"));

            temperatureLabel80.setText(generatorWeatherDays.generateTemperature(40, nameTown2) + "°C");
            iconLabel80.setGraphic(new ImageView("http://openweathermap.org/img/wn/" + generatorWeatherDays.generateIcon(40, nameTown2) + ".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private boolean fieldsAreValid1(){

        msg = generatorWeatherDays.generateMessage(nameTown1);

        if(textField1.getText().isEmpty()) {
            errorLabel1.setText("Proszę wpisz nazwę miasta");
            return false;
        }
        if(msg == "city not found") {
            errorLabel1.setText("Wpisano błędną nazwę miasta");
            return false;
        }
        return true;
    }
    private boolean fieldsAreValid2(){

        msg = generatorWeatherDays.generateMessage(nameTown2);

        if(textField2.getText().isEmpty()) {
            errorLabel2.setText("Proszę wpisz nazwę miasta");
            return false;
        }
        if(msg == "city not found") {
            errorLabel2.setText("Wpisano błędną nazwę miasta");
            return false;
        }
        return true;
    }
}
