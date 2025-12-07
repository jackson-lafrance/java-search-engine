
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

// main application class that sets up the MVC architecture
public class App extends Application {

    private static final String RESULTS_DIRECTORY = "crawlResults";

    // starts the JavaFX application and sets up MVC components
    public void start(Stage primaryStage) {
        // Create model components
        SearchData searchData = new SearchData(RESULTS_DIRECTORY);
        SearchEngine searchEngine = new SearchEngine(searchData);

        // Create controller
        SearchController controller = new SearchController(searchEngine);

        // Create view
        GUI view = new GUI();
        view.setController(controller);
        controller.setView(view);

        // Set up scene
        Scene scene = new Scene(view.getRootPane(), 900, 700);
        primaryStage.setTitle("Yehoo?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
