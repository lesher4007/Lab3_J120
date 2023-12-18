package exercise1_calculation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class CalcApplication extends Application {

    private TextField output;
    private double num1 = 0;
    private boolean start = true;
    private String operator = "";
    private final Model model = new Model();

    public void processNum(ActionEvent event){
        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
            boolean isHaveDot = false;
            if(value.equals(".")){
                if(operator.equals("")&&output.getText().isEmpty())output.setText("0.0");
                char[] temp = output.getText().toCharArray();
                for (char x:temp) {
                    if (x == '.') {
                        isHaveDot = true;
                        break;
                    }
                }
            }
            if(isHaveDot){
                output.setText(output.getText());
            }else {
                if(output.getText().equals("0.0")){
                    output.setText("0." + value);
                }else {
                    output.setText(output.getText() + value);
                }
            }

    }

    public void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if ("C".equals(value)){
            output.setText("0.0");
            operator = "";
            start = true;
        }else {
            if (!"=".equals(value)) {
                if (!operator.isEmpty()) return;
                operator = value;
                num1 = Double.parseDouble(output.getText());
                output.setText("");
            } else {
                if (operator.isEmpty()) return;
                output.setText(String.valueOf(model.calculation(num1, Double.parseDouble(output.getText()), operator)));
                operator = "";
                start = true;
            }
        }
    }

    @Override
    public void start(Stage stage){

        output = new TextField();
        output.setAlignment(Pos.CENTER_RIGHT);
        output.setFont(new Font(24));
        output.setMinSize(300,60);
        output.setMaxSize(300,60);

        Button button7 = new Button("7");
        button7.setMaxSize(75,50);
        button7.setMinSize(75,50);
        button7.setOnAction(this::processNum);
        Button button8 = new Button("8");
        button8.setMaxSize(75,50);
        button8.setMinSize(75,50);
        button8.setOnAction(this::processNum);
        Button button9 = new Button("9");
        button9.setMaxSize(75,50);
        button9.setMinSize(75,50);
        button9.setOnAction(this::processNum);
        Button buttonPlus = new Button("+");
        buttonPlus.setMaxSize(75,50);
        buttonPlus.setMinSize(75,50);
        buttonPlus.setOnAction(this::processOperator);

        Button button4 = new Button("4");
        button4.setMaxSize(75,50);
        button4.setMinSize(75,50);
        button4.setOnAction(this::processNum);
        Button button5 = new Button("5");
        button5.setMaxSize(75,50);
        button5.setMinSize(75,50);
        button5.setOnAction(this::processNum);
        Button button6 = new Button("6");
        button6.setMaxSize(75,50);
        button6.setMinSize(75,50);
        button6.setOnAction(this::processNum);
        Button buttonMinus = new Button("-");
        buttonMinus.setMaxSize(75,50);
        buttonMinus.setMinSize(75,50);
        buttonMinus.setOnAction(this::processOperator);

        Button button1 = new Button("1");
        button1.setMaxSize(75,50);
        button1.setMinSize(75,50);
        button1.setOnAction(this::processNum);
        Button button2 = new Button("2");
        button2.setMaxSize(75,50);
        button2.setMinSize(75,50);
        button2.setOnAction(this::processNum);
        Button button3 = new Button("3");
        button3.setMaxSize(75,50);
        button3.setMinSize(75,50);
        button3.setOnAction(this::processNum);
        Button buttonMultiply = new Button("*");
        buttonMultiply.setMaxSize(75,50);
        buttonMultiply.setMinSize(75,50);
        buttonMultiply.setOnAction(this::processOperator);

        Button button0 = new Button("0");
        button0.setMaxSize(75,50);
        button0.setMinSize(75,50);
        button0.setOnAction(this::processNum);
        Button buttonDot = new Button(".");
        buttonDot.setMaxSize(75,50);
        buttonDot.setMinSize(75,50);
        buttonDot.setOnAction(this::processNum);
        Button buttonC = new Button("C");
        buttonC.setMaxSize(75,50);
        buttonC.setMinSize(75,50);
        buttonC.setOnAction(this::processOperator);
        Button buttonDivision = new Button("/");
        buttonDivision.setMaxSize(75,50);
        buttonDivision.setMinSize(75,50);
        buttonDivision.setOnAction(this::processOperator);

        Button buttonEquals = new Button("=");
        buttonEquals.setMaxSize(300,50);
        buttonEquals.setMinSize(300,50);
        buttonEquals.setOnAction(this::processOperator);

        HBox root = new HBox();
        root.getChildren().add(output);
        HBox root1 = new HBox();
        root1.getChildren().addAll(button7,button8,button9,buttonPlus);
        HBox root2 = new HBox();
        root2.getChildren().addAll(button4,button5,button6,buttonMinus);
        HBox root3 = new HBox();
        root3.getChildren().addAll(button1,button2,button3,buttonMultiply);
        HBox root4 = new HBox();
        root4.getChildren().addAll(button0,buttonDot,buttonC,buttonDivision);

        VBox rootMain = new VBox();
        rootMain.getChildren().addAll(root,root1,root2,root3, root4,buttonEquals);
        Scene scene = new Scene(rootMain,300,310);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
