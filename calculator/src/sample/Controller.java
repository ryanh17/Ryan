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
    }

    public void buttonMinus(ActionEvent actionEvent) {
        display.setText(display.getText() + "-");
    }

    public void buttonPlus(ActionEvent actionEvent) {
        display.setText(display.getText() + "+");
    }

    public void buttonDivide(ActionEvent actionEvent) {
        display.setText(display.getText() + "/");
    }

    public void buttonEquals(ActionEvent actionEvent) {
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
