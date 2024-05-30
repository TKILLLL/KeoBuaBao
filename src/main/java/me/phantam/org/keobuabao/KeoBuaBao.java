package me.phantam.org.keobuabao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class KeoBuaBao extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/me/phantam/org/keobuabao/keo-bua-bao.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 342, 333);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/me/phantam/org/keobuabao/img/keobuabao.png")));
        stage.setTitle("Kéo Búa Bao | phantam");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
