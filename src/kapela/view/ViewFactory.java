package kapela.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kapela.WeatherManager;
import kapela.controller.BaseController;
import kapela.controller.MainWindowController;

import java.io.IOException;

public class ViewFactory {

    private WeatherManager weatherManager = new WeatherManager();

    public ViewFactory(WeatherManager weatherManager) {
        this.weatherManager = weatherManager;
    }

    public void showMainWindow(){

        BaseController controller = new MainWindowController(weatherManager, this, "MainWindow.fxml");
        initializeStage(controller);
    }
    private void initializeStage(BaseController baseController){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
