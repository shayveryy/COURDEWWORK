package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static GraphicsContext gc;
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
                "Single", "Double", "Suite", "Family App", "Money Make");
        list.setItems(items);
        list.setPrefWidth(100);
        list.setMinWidth(300);
        list.setLayoutX(50);
        list.setLayoutY(200);
        list.setMinHeight(300);
        list.setPrefHeight(70);
        root.getChildren().add(list);

        Canvas canvas = new Canvas();
        canvas.setWidth(1280);
        canvas.setHeight(1024);
        root.getChildren().add(canvas);

        gc = canvas.getGraphicsContext2D();

        Image cake = new Image("trutriuflkdmp.png",300, 300, true, false);
        gc.drawImage(cake, 600,500);
        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(50);
        slider.setLayoutX(400);
        slider.setLayoutY(100);

        ProgressBar progressBar = new ProgressBar();
        progressBar.setPrefSize(400, 30);
        progressBar.setProgress(0.5);

        slider.valueProperty().addListener(
                (observable, old_value, new_value) -> progressBar.setProgress(new_value.doubleValue() / 100)
        );

        progressBar.setLayoutX(400);
        progressBar.setLayoutY(200);

        root.getChildren().addAll(slider, progressBar);


        HBox TopBar = new HBox(10);
        TopBar.setPadding(new Insets(20));
        Button[] buttons = new Button[4];
        buttons[0] = new Button("HOME");
        buttons[0].setPrefSize(200, 50);
        buttons[0].setOnAction((ActionEvent ae) -> doSomething());
        buttons[1] = new Button("LIBRARY");
        buttons[1].setPrefSize(200, 50);
        buttons[1].setOnAction((ActionEvent ae) -> doSomething());
        buttons[2] = new Button("PLAYLISTS");
        buttons[2].setPrefSize(200, 50);
        buttons[2].setOnAction((ActionEvent ae) -> doSomething());
        buttons[3] = new Button("HISTORY");
        buttons[3].setPrefSize(200, 50);
        buttons[3].setOnAction((ActionEvent ae) -> doSomething());
        TopBar.getChildren().addAll(buttons);
        root.getChildren().add(TopBar);



    }

    private void doSomething() {
        System.out.println ("iM FATTY");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
f

























