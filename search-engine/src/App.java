
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class App extends Application {

    public void start(Stage primaryStage) {
        GUI gui = new GUI();
        Scene scene = new Scene(gui, 900, 700);
        primaryStage.setTitle("Yehoo?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
