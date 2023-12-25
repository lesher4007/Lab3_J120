package exercise2_game;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WinStage {

    public Stage init(){
        Button button = new Button("!! WIN !!");
        button.setOnAction(event -> {});
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,400,100);
        root.getChildren().add(button);
        stage.setTitle("Congratulations!!!");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        return stage;

    }
}
