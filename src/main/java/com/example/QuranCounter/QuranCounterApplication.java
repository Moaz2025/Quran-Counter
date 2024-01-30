package com.example.QuranCounter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class QuranCounterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(QuranCounterApplication.class.getResource("QuranCounter-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("file:icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("حاسبة الحفظ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}