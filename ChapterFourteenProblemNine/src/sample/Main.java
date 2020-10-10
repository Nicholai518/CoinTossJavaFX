package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Constants for Scene
        final double SCENE_WIDTH = 700;
        final double SCENE_HEIGHT = 700;

        // Controls
        Label coinTossLabel = new Label("Toss the Coin! Press any Key!");

        //Images
        //Image PATH
        Image heads = new Image("file:C:\\dev\\saveFilesHere\\Source Code\\Chapter 12\\Images\\Coins\\Heads1.bmp");
        Image tails = new Image("file:C:\\dev\\saveFilesHere\\Source Code\\Chapter 12\\Images\\Coins\\Tails1.bmp");

        ImageView sideUP = new ImageView();
        sideUP.setFitHeight(200);
        sideUP.setFitWidth(200);


        // VBox container
        VBox gameScreen = new VBox(10, coinTossLabel, sideUP);
        gameScreen.setAlignment(Pos.CENTER);
        gameScreen.setPadding(new Insets(10));

        // Scene
        Scene scene = new Scene(gameScreen, SCENE_WIDTH, SCENE_HEIGHT);

        // Key Event Handling
        scene.setOnKeyPressed(event ->{
            // Randomly generate 0 or 1
            Random rng = new Random();
            int randomNumber = rng.nextInt(2);

            if(randomNumber == 0)
            {
                sideUP.setImage(heads);
            }
            else if(randomNumber == 1)
            {
                sideUP.setImage(tails);
            }
        });
        // Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChattrBox Coin Toss Application Software");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
