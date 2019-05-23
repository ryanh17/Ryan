package sample;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField display;
    public Boolean clicked = false;
    ArrayList<Double> numbers = new ArrayList<>();
    ArrayList<String> operators = new ArrayList<>();

    public void buttonOne(ActionEvent actionEvent) {
        display.setText(display.getText() + "1");
    }

    public void buttonTwo(ActionEvent actionEvent) {
        display.setText(display.getText() + "2");
    }

    public void buttonThree(ActionEvent actionEvent) {
        display.setText(display.getText() + "3");
    }

    public void buttonFour(ActionEvent actionEvent) {
        display.setText(display.getText() + "4");
    }

    public void buttonFive(ActionEvent actionEvent) {
        display.setText(display.getText() + "5");
    }

    public void buttonSix(ActionEvent actionEvent) {
        display.setText(display.getText() + "6");
    }

    public void buttonSeven(ActionEvent actionEvent) {
        display.setText(display.getText() + "7");
    }

    public void buttonEight(ActionEvent actionEvent) {
        display.setText(display.getText() + "8");
    }

    public void buttonNine(ActionEvent actionEvent) {
        display.setText(display.getText() + "9");
    }

    public void buttonZero(ActionEvent actionEvent) {
        display.setText(display.getText() + "0");
    }

    public void buttonMultiply(ActionEvent actionEvent) {
        display.setText(display.getText() + "*");
        clicked = false;
    }

    public void buttonMinus(ActionEvent actionEvent) {
        display.setText(display.getText() + "-");
        clicked = false;
    }

    public void buttonPlus(ActionEvent actionEvent) {
        display.setText(display.getText() + "+");
        clicked = false;
    }

    public void buttonDivide(ActionEvent actionEvent) {
        display.setText(display.getText() + "/");
        clicked = false;
    }

    public void buttonEquals(ActionEvent actionEvent) {
        double ans = 0;
        String temp = "";
        for (int i = 0; i < display.getLength(); i++){
            if(Character.isDigit(display.getText().charAt(i))){
                temp += display.getText().charAt(i);
            }else if(display.getText().charAt(i) == '.'){
                temp += display.getText().charAt(i);
            }else{
                numbers.add(Double.parseDouble(temp));
                temp = "";
                operators.add(String.valueOf(display.getText().charAt(i)));
            }
        }
        numbers.add(Double.parseDouble(temp));
        temp = "";
        ans = numbers.get(0);
        for (int i = 0; i < numbers.size() - 1;i++){
            if (operators.get(i).equals("+")){
                ans += numbers.get(i + 1);
                display.setText(Double.toString(ans));
            }else if (operators.get(i).equals("*")){
                ans *= numbers.get(i + 1);
                display.setText(Double.toString(ans));
            }else if (operators.get(i).equals("/")){
                ans /= numbers.get(i + 1);
                display.setText(Double.toString(ans));
            }else if (operators.get(i).equals("-")){
                ans -= numbers.get(i + 1);
                display.setText(Double.toString(ans));
            }
        }
    }

    public void buttonDecimal(ActionEvent actionEvent) {
        if (!clicked){
            display.setText(display.getText() + ".");
        }
        clicked = true;
    }

    public void buttonClear(ActionEvent actionEvent) {
        display.clear();
        numbers.clear();
        operators.clear();
    }
}
