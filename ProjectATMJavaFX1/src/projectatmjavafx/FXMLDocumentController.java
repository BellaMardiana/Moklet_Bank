/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {

    String pin ="";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnc;
    @FXML
    private Button btn0;
    @FXML
    private Button btnok;
    @FXML
    private PasswordField editpin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
        pin +=  "2";
        editpin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
        pin +=  "3";
        editpin.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        pin +=  "4";
        editpin.setText(pin);
    }

    @FXML
    private void tekan5(ActionEvent event) {
        pin +=  "5";
        editpin.setText(pin);
    }

    @FXML
    private void tekan6(ActionEvent event) {
        pin +=  "6";
        editpin.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
        pin +=  "7";
        editpin.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
        pin +=  "8";
        editpin.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
        pin +=  "9";
        editpin.setText(pin);
    }

    @FXML
    private void tekanc(ActionEvent event) {
        pin +=  "";
        editpin.setText(pin);
    }

    @FXML
    private void tekan0(ActionEvent event) {
        pin +=  "0";
        editpin.setText(pin);
    }

    @FXML
    private void tekanok(ActionEvent event) throws IOException {
        if (pin.equals(PIN)){
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MenuAwal");
            stage.show();
        }else {
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan + "kesempatan lagi!");
            editpin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }

    @FXML
    private void pin(ActionEvent event) {
    }
    
}
