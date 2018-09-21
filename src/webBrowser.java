
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class webBrowser extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("webBrows.fxml"));
        
        Scene scene = new Scene( root);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.setTitle("SD Browser");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
