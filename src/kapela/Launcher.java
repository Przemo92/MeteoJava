package kapela;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kapela.view.MainWindowController;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Parent parent = FXMLLoader.load(getClass().getResource("view/MainWindow.fxml"));

        Scene scene = new Scene(parent, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}
