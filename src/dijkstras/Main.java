package dijkstras;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("dijkstras.fxml"));
        primaryStage.setTitle("Super SSSP");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 250, 90));
        primaryStage.show();
        //Node[] test = FileReader.LoadGraphFile("C:\\Users\\Anchu\\Documents\\Java_workspace\\test1.txt");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
