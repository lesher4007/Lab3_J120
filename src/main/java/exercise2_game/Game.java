package exercise2_game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.*;

public class Game extends Application {
    Button[] arrButton;

    public  List<Integer> generator(){
        int generator_done = 0;
        Integer[] arr = {0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15};
        List<Integer> res = Arrays.asList(Arrays.stream(arr).toArray(Integer[]::new));

        while (generator_done==0){

            int zr=0;
            int zero_row=0;

            Collections.shuffle(res);

            zr = res.indexOf(0);

            if (zr<= 3) {zero_row = 1;}
            if (zr > 3 && zr <=7) {zero_row = 2;}
            if (zr > 7 && zr <=11) {zero_row = 3;}
            if (zr > 11 && zr <=15) {zero_row = 4;}

            int sum = 0;

            for (int i = 0; i < 15; i++) {
                int val1;
                val1 = res.get(i);
                if(val1!=0){
                    for (int j = i+1; j < 15; j++) {
                        int val2;
                        val2 = res.get(j);
                        if(val1>val2 && val2 != 0){sum++;}
                    }
                }
            }
            sum=sum+zero_row;
            if((sum%2)==0) generator_done = 1;
        }
        return res;
    }


    public void moveNumber(Button mainButton, Button neighbourButton){
        if (neighbourButton.getText().equals("0")){
            neighbourButton.setText(mainButton.getText());
            neighbourButton.setStyle(null);
            mainButton.setText("0");
            mainButton.setStyle("-fx-background-color: white");
        }

    }

    @Override
    public void start(Stage stage) throws Exception {

        List<Integer> gen=generator();
        System.out.println(gen);

        Button button1 = new Button();
        button1.setMinSize(100,100);
        button1.setText(gen.get(0).toString());
        Button button2 = new Button();
        button2.setMinSize(100,100);
        button2.setText(gen.get(1).toString());
        Button button3 = new Button();
        button3.setMinSize(100,100);
        button3.setText(gen.get(2).toString());
        Button button4 = new Button();
        button4.setMinSize(100,100);
        button4.setText(gen.get(3).toString());

        Button button5 = new Button();
        button5.setMinSize(100,100);
        button5.setText(gen.get(4).toString());
        Button button6 = new Button();
        button6.setMinSize(100,100);
        button6.setText(gen.get(5).toString());
        Button button7 = new Button();
        button7.setMinSize(100,100);
        button7.setText(gen.get(6).toString());
        Button button8 = new Button();
        button8.setMinSize(100,100);
        button8.setText(gen.get(7).toString());

        Button button9 = new Button();
        button9.setMinSize(100,100);
        button9.setText(gen.get(8).toString());
        Button button10 = new Button();
        button10.setMinSize(100,100);
        button10.setText(gen.get(9).toString());
        Button button11 = new Button();
        button11.setMinSize(100,100);
        button11.setText(gen.get(10).toString());
        Button button12 = new Button();
        button12.setMinSize(100,100);
        button12.setText(gen.get(11).toString());

        Button button13 = new Button();
        button13.setMinSize(100,100);
        button13.setText(gen.get(12).toString());
        Button button14 = new Button();
        button14.setMinSize(100,100);
        button14.setText(gen.get(13).toString());
        Button button15 = new Button();
        button15.setMinSize(100,100);
        button15.setText(gen.get(14).toString());
        Button button16 = new Button();
        button16.setMinSize(100,100);
        button16.setText(gen.get(15).toString());

        HBox root1 = new HBox();
        root1.getChildren().addAll(button1,button2,button3,button4);
        HBox root2 = new HBox();
        root2.getChildren().addAll(button5,button6,button7,button8);
        HBox root3 = new HBox();
        root3.getChildren().addAll(button9,button10,button11,button12);
        HBox root4 = new HBox();
        root4.getChildren().addAll(button13,button14,button15,button16);
        VBox rootMain = new VBox();
        rootMain.getChildren().addAll(root1,root2,root3,root4);

        button1.setOnAction(event -> { moveNumber(button1,button2);
            moveNumber(button1,button5);
        });
        button2.setOnAction(event -> { moveNumber(button2,button1);
            moveNumber(button2,button3);
            moveNumber(button2,button6);
        });
        button3.setOnAction(event -> { moveNumber(button3,button2);
            moveNumber(button3,button4);
            moveNumber(button3,button7);
        });
        button4.setOnAction(event -> { moveNumber(button4,button3);
            moveNumber(button4,button8);
        });

        button5.setOnAction(event -> { moveNumber(button5,button1);
            moveNumber(button5,button6);
            moveNumber(button5,button9);
        });
        button6.setOnAction(event -> { moveNumber(button6,button2);
            moveNumber(button6,button5);
            moveNumber(button6,button7);
            moveNumber(button6,button10);
        });
        button7.setOnAction(event -> { moveNumber(button7,button3);
            moveNumber(button7,button6);
            moveNumber(button7,button8);
            moveNumber(button7,button11);
        });
        button8.setOnAction(event -> { moveNumber(button8,button4);
            moveNumber(button8,button7);
            moveNumber(button8,button12);
        });

        button9.setOnAction(event -> { moveNumber(button9,button5);
            moveNumber(button9,button10);
            moveNumber(button9,button13);
        });
        button10.setOnAction(event -> { moveNumber(button10,button6);
            moveNumber(button10,button9);
            moveNumber(button10,button11);
            moveNumber(button10,button14);
        });
        button11.setOnAction(event -> { moveNumber(button11,button7);
            moveNumber(button11,button10);
            moveNumber(button11,button12);
            moveNumber(button11,button15);
        });
        button12.setOnAction(event -> { moveNumber(button12,button8);
            moveNumber(button12,button11);
            moveNumber(button12,button16);
        });

        button13.setOnAction(event -> { moveNumber(button13,button9);
            moveNumber(button13,button14);
        });
        button14.setOnAction(event -> { moveNumber(button14,button10);
            moveNumber(button14,button13);
            moveNumber(button14,button15);
        });
        button15.setOnAction(event -> { moveNumber(button15,button11);
            moveNumber(button15,button14);
            moveNumber(button15,button16);
        });
        button16.setOnAction(event -> { moveNumber(button16,button12);
            moveNumber(button16,button15);
        });


        arrButton = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16};

        int var = gen.indexOf(0);

        arrButton[var].setStyle("-fx-background-color: white");


        Scene scene = new Scene(rootMain,400,400);
        stage.setTitle("Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
