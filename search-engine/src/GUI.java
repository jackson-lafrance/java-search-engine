
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

public class GUI extends Pane {

    private static final String RESULTS_DIRECTORY = "crawlResults";
    private final SearchData searchData;
    private final SearchEngine searchEngine;
    private TextField searchField;
    private RadioButton boostButton;
    private RadioButton noBoostButton;
    private ListView<String> resultsList;

    public GUI() {
        // Initialize search components
        this.searchData = new SearchData(RESULTS_DIRECTORY);
        this.searchEngine = new SearchEngine(searchData);

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
        searchButton.setOnAction(e -> performSearch());

        Label boostLabel = new Label("PageRank Boost:");
        boostLabel.relocate(20, 90);

        ToggleGroup boostGroup = new ToggleGroup();
        noBoostButton = new RadioButton("Off");
        noBoostButton.setToggleGroup(boostGroup);
        noBoostButton.setSelected(true);
        noBoostButton.relocate(150, 90);
        noBoostButton.setOnAction(e -> performSearch());

        boostButton = new RadioButton("On");
        boostButton.setToggleGroup(boostGroup);
        boostButton.relocate(200, 90);
        boostButton.setOnAction(e -> performSearch());

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

    /**
     * Performs a search and updates the results list.
     */
    private void performSearch() {
        String query = searchField.getText().trim();
        if (query.isEmpty()) {
            resultsList.setItems(FXCollections.observableArrayList());
            return;
        }

        boolean boost = boostButton.isSelected();
        List<SearchResult> results = searchEngine.search(query, boost);

        ObservableList<String> resultStrings = FXCollections.observableArrayList();
        for (SearchResult result : results) {
            String displayText = String.format("%s (Score: %.4f)", result.getTitle(), result.getScore());
            resultStrings.add(displayText);
        }

        resultsList.setItems(resultStrings);
    }
};
