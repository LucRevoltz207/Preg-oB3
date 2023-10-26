package com.example.bbb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage StagePrincipal;
    private static Scene RegistroScene;
    private static Scene LoginScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene sceneLogin = new Scene(fxmlLoader.load());
        stage.setTitle("Login");
        stage.setScene(sceneLogin);
        stage.show();
        StagePrincipal = stage;
        LoginScene = new Scene(fxmlLoader.load());
    }

    public static void mudartela(String tela) {
        if (tela.equals("Login")) {
            StagePrincipal.setScene(LoginScene);
        } else if (tela.equals("Registro")) {
            StagePrincipal.setScene(RegistroScene);
        }
    }


    @Override
    public void init() throws Exception {

    }

    public static void main(String[] args) {
        launch();
    }
}