package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public ListView<Friend> fList;
    public TextField f_Name;
    public TextField f_ph;
    public TextField f_mm;
    public TextField f_dd;
    public TextField f_yy;
    public Label l_name;
    public Label l_ph;
    public Label l_birthday;

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(f_Name.getText(), f_ph.getText(), Integer.valueOf(f_mm.getText()), Integer.valueOf(f_dd.getText()), Integer.valueOf(f_yy.getText()));
        fList.getItems().add(temp);
        f_Name.clear();
        f_ph.clear();
        f_mm.clear();
        f_dd.clear();
        f_yy.clear();
    }

    public void deleteFriend(ActionEvent actionEvent) {
        fList.getItems().remove(fList.getSelectionModel().getSelectedItem());
        l_birthday.setText("Birthday (M/D/Y):");
        l_ph.setText("Ph #:");
        l_name.setText("Name:");
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = fList.getSelectionModel().getSelectedItem();
        l_name.setText("Name: " + temp.getName());
        l_ph.setText("Ph #: " + temp.getPh());
        l_birthday.setText("Birthday (M/D/Y): " + temp.getB_Month() + "/" + temp.getB_Day() + "/" + temp.getB_Year());
    }
}
