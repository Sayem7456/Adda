package com.example.adda;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("OpenPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 330, 494);
        Image image = new Image(new File("src/main/resources/com/example/icons/addaLogo.png").toURI().toString());
        stage.getIcons().add(image);
        stage.setTitle("ADDA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}