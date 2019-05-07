package sample;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField display;
    public Boolean clicked = false;

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
        display.setText(display.getText() + "x");
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
        String temp = "";
        double ans = 0;
        double one = 0;
        double two = 0;
        for(int i = 0; i < display.getLength(); i++){
            if(Character.isDigit(display.getText().charAt(i)) == true){
                temp += display.getText().charAt(i);
            }else{
                one = Double.parseDouble(temp);
                temp = "";
                for (int x = 0 + i; x < display.getLength(); x++ ){
                    if(Character.isDigit(display.getText().charAt(i)) == true) {
                        temp += display.getText().charAt(i);
                    }
                }
                two = Double.parseDouble(temp);
                temp = "";
                if (display.getText().charAt(i) == 'x'){
                    ans = one * two;
                    display.setText(Double.toString(ans));
                }
            }
        }
        //display.getText().charAt()
    }

    public void buttonDecimal(ActionEvent actionEvent) {
        if (clicked == false){
            display.setText(display.getText() + ".");
        }
        clicked = true;
    }

    public void buttonClear(ActionEvent actionEvent) {
        display.clear();
    }
}
