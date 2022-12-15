
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nayia
 */
public class Controller implements Initializable {
    @FXML
    private ColorPicker backgroundColor;
    @FXML
    private ColorPicker fontColor;
    @FXML
    private TextField fontSize;
    @FXML
    private TextArea textarea;
    @FXML
    private GridPane areas;
//    @FXML
//    public void changeBackground(ActionEvent e){
//        Color c = backgroundColor.getValue(); 
//    }
//    @FXML
//    public void changeFontColor(ActionEvent e){
//        System.out.println("holis");
//    }
//    @FXML
//    public void changeFontSize(ActionEvent e){
//        System.out.println("holis");
//    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    @FXML
    private void changeBackground(ActionEvent e) {
        Color color = backgroundColor.getValue();
        for (Node node : areas.getChildren()) {
            ((TextArea) node).lookup( ".content" ).setStyle("-fx-background-color:"+color.toString().replace("0x", "#"));
        }
//        textarea.lookup( ".content" ).setStyle("-fx-background-color:"+color.toString().replace("0x", "#"));
    }
    @FXML
    public void changeFontColorSize(ActionEvent e){
        Color color = fontColor.getValue();
        var size = fontSize.getText();
        for (Node node : areas.getChildren()) {
            ((TextArea) node).setStyle("-fx-text-fill: "+color.toString().replace("0x", "#")+";\n-fx-font-size:"+size+";");
        }
//        areas.getChildren().get(0).setStyle("-fx-text-fill: "+color.toString().replace("0x", "#")+";\n-fx-font-size:"+size+";");
    }
//    @FXML
//    public void changeFontSize(ActionEvent e){
//        var size = fontSize.getText();
//        textarea.setStyle("-fx-font-size: "+size+";");
//    }
}
