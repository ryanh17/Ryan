package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ListView<Friend> fList;
    public TextField f_Name;
    public TextField f_ph;
    public TextField f_mm;
    public TextField f_dd;
    public TextField f_yy;
    public Label l_name;
    public Label l_ph;
    public Label l_birthday;
    String line;
    int line_num;

    FileReader fr = new FileReader("save.txt");
    BufferedReader br = new BufferedReader(fr);
    String load_Name;
    String load_Ph;
    Integer load_mm;
    Integer load_dd;
    Integer load_yy;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            while ((line = br.readLine()) != null) {
                line_num++;
                System.out.println(br.readLine());
                System.out.println(line_num);
                if (line_num % 5 == 1){
                    load_Name = br.readLine();
                }else if (line_num % 5 == 2){
                    load_Ph = br.readLine();
                }else if (line_num % 5 == 3){
                    load_mm = Integer.valueOf(br.readLine());
                }
                else if (line_num % 5 == 4){
                    load_dd = Integer.valueOf(br.readLine());
                }
                else if (line_num % 5 == 0){
                    load_yy = Integer.valueOf(br.readLine());
                    Friend ror = new Friend(load_Name, load_Ph, load_mm, load_dd, load_yy);
                    fList.getItems().add(ror);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public Controller() throws FileNotFoundException {
    }

    public void addFriend(ActionEvent actionEvent) throws IOException {
        Friend temp = new Friend(f_Name.getText(), f_ph.getText(), Integer.valueOf(f_mm.getText()), Integer.valueOf(f_dd.getText()), Integer.valueOf(f_yy.getText()));
        FileWriter fw = new FileWriter("save.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(f_Name.getText() + "\n" + f_ph.getText() + "\n" + f_mm.getText() + "\n" + f_dd.getText() + "\n" + f_yy.getText() + "\n");
        bw.close();
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
