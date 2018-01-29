package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Scanner;

public class Controller {

    @FXML
    private Text Hello;

    @FXML

    private Text answerText;

    @FXML
    private TextField userName;

    @FXML
    private TextField userAge;

    @FXML
    private TextField userYear;

    @FXML
    private Button submitButton;

    @FXML
    private Text OutPutName;

    @FXML
    private Text OutPutAgeOneYear;

    @FXML
    private Text OutPutAgeFiveYear;

    @FXML
    private Text OutPutAgeTenYear;

    @FXML
    private Button resetButton;

    //Scanner sc = new Scanner(System.in);
    //int MIN = 1;
    //int MAX = 10;
    //int answer;

  public void clickSubmit (ActionEvent actionEvent) {
      String checkName = userName.getText();
      String checkAge = userAge.getText();
      String checkYear = userYear.getText();

      int iAge = Integer.parseInt(checkAge);
      int iYear = Integer.parseInt(checkYear);

      int agePlusOne = iAge + 1;
      int agePlusFive = iAge + 5;
      int agePlusTen = iYear + 10;

      int yearPlusOne = iYear + 1;
      int yearPlusFive = iYear + 5;
      int yearPlusTen = iYear + 10;

      OutPutName.setText(checkName);
      OutPutAgeOneYear.setText("In " + yearPlusOne + ", you will be " + agePlusOne + " years old.");
      OutPutAgeFiveYear.setText("In " + yearPlusFive + ", you will be " + agePlusFive + " years old.");
      OutPutAgeTenYear.setText("In " + yearPlusTen + ", you will be " + agePlusTen + " years old.");



           }

     public void clickedReset(ActionEvent actionEvent){
      userName.setText("Name");
      userAge.setText("Age");
      userYear.setText("Year");

         OutPutName.setText("");
         OutPutAgeOneYear.setText("");
         OutPutAgeFiveYear.setText("");
         OutPutAgeTenYear.setText("");


     }
  }

