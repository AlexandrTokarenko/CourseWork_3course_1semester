package com.example.coursework.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML private Label label;

    public void next() {

        Stage primaryStage = (Stage) label.getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/coursework/main1.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Гнучка виробнича система");
            stage.show();
            primaryStage.hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
