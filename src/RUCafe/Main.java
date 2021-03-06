package RUCafe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.lang.reflect.AnnotatedArrayType;

/**
 * Main class for our project, creates the stage and loads the primary GUI of the project (MainMenuView.fxml). The class
 * also contains the main method, runs the corresponding fxml files along with setting title for our stage and initializes
 * the scene.
 * @author Manveer Singh, Prasidh Sriram
 */
public class Main extends Application {

    public static Stage parentStage; //allows to access the object within the controller for other classes

    /**
     * Sets our parentStage as the main stage, creates a new stage and runs our entire project.
     * @param primaryStage reference
     * @throws Exception any errors to catch
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
            Main.parentStage = primaryStage;
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("MainMenuView.fxml")) ;
            Scene s = new Scene(root, 750,500);
            primaryStage.setResizable(false);
            primaryStage.initStyle(StageStyle.UTILITY); //disables maximize and minimize so user can not close of the GUI
            primaryStage.setScene(s);
            primaryStage.setTitle("Welcome to RU Cafe!!");
            primaryStage.show();
        } catch( Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Launches the project and passes in arguments
     * @param args string array of arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
