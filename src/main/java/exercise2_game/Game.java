package exercise2_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game extends Application {


    public static void generator(){
        Integer[] arr = {0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15};
        List<Integer> res = Arrays.asList(Arrays.stream(arr).toArray(Integer[]::new));
        Collections.shuffle(res);
    }







    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button();
        button1.setMaxSize(100,100);
        button1.setMinSize(100,100);

        Button button2 = new Button();
        button2.setMaxSize(100,100);
        button2.setMinSize(100,100);

        Button button3 = new Button();
        button3.setMaxSize(100,100);
        button3.setMinSize(100,100);

        Button button4 = new Button();
        button4.setMaxSize(100,100);
        button4.setMinSize(100,100);

        HBox root1 = new HBox();
        root1.getChildren().addAll(button1,button2,button3,button4);

        Button button5 = new Button();
        button5.setMaxSize(100,100);
        button5.setMinSize(100,100);

        Button button6 = new Button();
        button6.setMaxSize(100,100);
        button6.setMinSize(100,100);

        Button button7 = new Button();
        button7.setMaxSize(100,100);
        button7.setMinSize(100,100);

        Button button8 = new Button();
        button8.setMaxSize(100,100);
        button8.setMinSize(100,100);

        HBox root2 = new HBox();
        root2.getChildren().addAll(button5,button6,button7,button8);

        Button button9 = new Button();
        button9.setMaxSize(100,100);
        button9.setMinSize(100,100);

        Button button10 = new Button();
        button10.setMaxSize(100,100);
        button10.setMinSize(100,100);

        Button button11 = new Button();
        button11.setMaxSize(100,100);
        button11.setMinSize(100,100);

        Button button12 = new Button();
        button12.setMaxSize(100,100);
        button12.setMinSize(100,100);

        HBox root3 = new HBox();
        root3.getChildren().addAll(button9,button10,button11,button12);

        Button button13 = new Button();
        button13.setMaxSize(100,100);
        button13.setMinSize(100,100);

        Button button14 = new Button();
        button14.setMaxSize(100,100);
        button14.setMinSize(100,100);

        Button button15 = new Button();
        button15.setMaxSize(100,100);
        button15.setMinSize(100,100);

        Button button16 = new Button();
        button16.setMaxSize(100,100);
        button16.setMinSize(100,100);

        HBox root4 = new HBox();
        root4.getChildren().addAll(button13,button14,button15,button16);

        VBox rootMain = new VBox();
        rootMain.getChildren().addAll(root1,root2,root3,root4);
        Scene scene = new Scene(rootMain,400,400);
        stage.setTitle("Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Game.generator();
        launch();
    }
}
