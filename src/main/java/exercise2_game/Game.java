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



    public  List<Integer> generator(){
        int generator_done = 0;
        Integer[] arr = {0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15};
        List<Integer> res = Arrays.asList(Arrays.stream(arr).toArray(Integer[]::new));
//        Collections.shuffle(res);
//        System.out.println(res);
//        System.out.println(res.indexOf(0));


        while (generator_done==0){

            int zr=0;
            int zero_row=0;

//          List<Integer> res = Arrays.asList(Arrays.stream(arr).toArray(Integer[]::new));
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
//            System.out.println(generator_done);
//            System.out.println(res);

        }
        return res;

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

        HBox root1 = new HBox();
        root1.getChildren().addAll(button1,button2,button3,button4);

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

        HBox root2 = new HBox();
        root2.getChildren().addAll(button5,button6,button7,button8);

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

        HBox root3 = new HBox();
        root3.getChildren().addAll(button9,button10,button11,button12);

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

        HBox root4 = new HBox();
        root4.getChildren().addAll(button13,button14,button15,button16);

        VBox rootMain = new VBox();

        Button[] arrButton = {button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16};
        int var = gen.indexOf(0);
        arrButton[var].setText("");
        arrButton[var].setStyle("-fx-background-color: white");



        rootMain.getChildren().addAll(root1,root2,root3,root4);
        Scene scene = new Scene(rootMain,400,400);
        stage.setTitle("Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {


        launch();
    }
}
