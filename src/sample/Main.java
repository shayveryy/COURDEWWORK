package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();

        Scene scene = new Scene(root);
        stage.setResizable(false);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();

        ListView<String> list = new ListView<>();
        ObservableList<String> items = FXCollections.observableArrayList (
                "Single", "Double", "Suite", "Family App");
        list.setItems(items);
        list.setPrefWidth(100);
        list.setMinWidth(300);
        list.setLayoutX(50);
        list.setLayoutY(200);
        list.setMinHeight(300);
        list.setPrefHeight(70);

        root.getChildren().add(list);

        HBox TopBar = new HBox(10);
        TopBar.setPadding(new Insets(20));
        Button[] BUTTON = new Button[4];
        BUTTON[0] = new Button("HOME");
        BUTTON[0].setPrefSize(200, 50);
        BUTTON[0].setOnAction((ActionEvent ae) -> doSomething());
        BUTTON[1] = new Button("LIBRARY");
        BUTTON[1].setPrefSize(200, 50);
        BUTTON[1].setOnAction((ActionEvent ae) -> doSomething());
        BUTTON[2] = new Button("PLAYLISTS");
        BUTTON[2].setPrefSize(200, 50);
        BUTTON[2].setOnAction((ActionEvent ae) -> doSomething());
        BUTTON[3] = new Button("HISTORY");
        BUTTON[3].setPrefSize(200, 50);
        BUTTON[3].setOnAction((ActionEvent ae) -> doSomething());
        TopBar.getChildren().addAll(BUTTON);
        root.getChildren().add(TopBar);
    }

    private void doSomething() {
        System.out.println ("iM FATTY");
    }

    public static void main(String[] args) {
        launch(args);
    }
}


























