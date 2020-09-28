package kapela;

import javafx.application.Application;
import javafx.stage.Stage;
import kapela.view.ViewFactory;


public class Launcher extends Application {

    public Launcher() {
    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showMainWindow();
    }
}
