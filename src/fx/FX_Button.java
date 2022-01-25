package fx;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

import javax.swing.*;
import java.awt.*;

public class FX_Button extends Application {
    Label response;
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate JavaFX Buttons and Events.");
        FlowPane rootNode = new FlowPane (10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 300);
        myStage.setScene(myScene);
        response = new Label("Push a Button");
        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");

        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("Alpha was pressed.");
            }
        });
        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("Beta was pressed.");
            }
        });
        rootNode.getChildren().addAll(btnAlpha,btnBeta, response);
        myStage.show();
    }
}
