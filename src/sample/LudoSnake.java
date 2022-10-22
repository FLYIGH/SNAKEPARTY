package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class LudoSnake extends Application {
    Group tileGroup = new Group();

    public static final int tileSize = 40;
    int height
    int xLine = 100;
    int yLine = 360;

    public Pane createContent() {
        Pane root = new Pane();
        root.setPrefSize(400, 400);
        root.getChildren().addAll(tileGroup);
        Button player1Button = new Button("Player One");
        player1Button.setTranslateX(10);
        player1Button.setTranslateY(yLine);

        Button player2Button = new Button("Player Two");
        player2Button.setTranslateX(300);
        player2Button.setTranslateY(yLine);

        Button gameButton = new Button("Start Game");
        gameButton.setTranslateX(150);
        gameButton.setTranslateY(yLine);
        tileGroup.getChildren().addAll(player1Button, player2Button, gameButton);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Ludo Snake");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
