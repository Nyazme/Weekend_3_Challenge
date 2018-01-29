package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //user entered their name, age, and current year,
    // then produced how old they would be next year, in five years, and in ten years.
   //application should load and greet the user with a "Hello"
    // and a prompt with an entry field asking them their name.
    //there should be a 'Confirm' button. Once the 'Confirm' button is clicked, the prompt should ask their age.
    //Clicking the 'Confirm' button again should move to the next question, which asks the current year.
    // Once they click the 'Confirm' button a final time, they should be able to see the information
    // like in the first application and as mentioned above.
    //There should be a button at the bottom of the application in the final view that resets the application.


@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
