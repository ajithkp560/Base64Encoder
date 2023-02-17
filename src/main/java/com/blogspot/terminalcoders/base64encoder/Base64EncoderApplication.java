package com.blogspot.terminalcoders.base64encoder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Base64EncoderApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Base64EncoderApplication.class.getResource("UI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 425);
        stage.setTitle("Base64Encoder");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}