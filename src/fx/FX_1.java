package fx;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.awt.*;

public class FX_1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage myStage){
        myStage.setTitle("Demonstrate a JavaFX label.");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        Label myLabel = new Label("This is a JavaFX label");
        rootNode.getChildren().add(myLabel);
        myStage.show();
    }
}
