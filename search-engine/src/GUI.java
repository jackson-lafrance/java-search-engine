
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.List;

// GUI view component implementing MVC pattern
public class GUI extends Pane implements SearchView {

    private SearchController controller;
    private TextField searchField;
    private RadioButton boostButton;
    private RadioButton noBoostButton;
    private ListView<String> resultsList;

    public GUI() {
        initializeUI();
    }

    // initializes all UI components
    private void initializeUI() {
        Label titleLabel = new Label("Yehoo?");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        titleLabel.setTextFill(Color.web("#7B0099"));
        titleLabel.relocate(20, 10);

        searchField = new TextField();
        searchField.setPromptText("Enter search query...");
        searchField.setPrefWidth(500);
        searchField.relocate(20, 50);

        Button searchButton = new Button("Search");
        searchButton.setPrefWidth(100);
        searchButton.relocate(530, 50);
        searchButton.setOnAction(e -> handleSearchButtonClick());

        Label boostLabel = new Label("PageRank Boost:");
        boostLabel.relocate(20, 90);

        ToggleGroup boostGroup = new ToggleGroup();
        noBoostButton = new RadioButton("Off");
        noBoostButton.setToggleGroup(boostGroup);
        noBoostButton.setSelected(true);
        noBoostButton.relocate(150, 90);
        noBoostButton.setOnAction(e -> handleBoostChange());

        boostButton = new RadioButton("On");
        boostButton.setToggleGroup(boostGroup);
        boostButton.relocate(200, 90);
        boostButton.setOnAction(e -> handleBoostChange());

        Label resultsLabel = new Label("Top 10 Results:");
        resultsLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        resultsLabel.relocate(20, 120);

        resultsList = new ListView<>();
        resultsList.setPrefWidth(610);
        resultsList.setPrefHeight(400);
        resultsList.relocate(20, 145);

        getChildren().addAll(titleLabel, searchField, searchButton, boostLabel,
                noBoostButton, boostButton, resultsLabel, resultsList);
    }

    // handles search button click event
    private void handleSearchButtonClick() {
        if (controller != null) {
            String query = searchField.getText();
            boolean boost = boostButton.isSelected();
            controller.handleSearch(query, boost, 10);
        }
    }

    // handles boost option change event
    private void handleBoostChange() {
        handleSearchButtonClick();
    }

    // gets the root pane for this view
    public Pane getRootPane() {
        return this;
    }

    // displays search results in the UI
    public void displayResults(List<SearchResult> results) {
        if (resultsList == null) {
            return;
        }
        ObservableList<String> resultStrings = FXCollections.observableArrayList();
        if (results != null) {
            for (SearchResult result : results) {
                String displayText = String.format("%s (Score: %.4f)", result.getTitle(), result.getScore());
                resultStrings.add(displayText);
            }
        }
        resultsList.setItems(resultStrings);
    }

    // sets the controller for handling user interactions
    public void setController(SearchController controller) {
        this.controller = controller;
    }
}
