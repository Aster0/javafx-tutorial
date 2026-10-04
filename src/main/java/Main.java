import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    private final Duke duke = new Duke();
    @Override public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane root = loader.load();
            stage.setScene(new Scene(root));
            loader.<MainWindow>getController().setDuke(duke);
            stage.show();
        } catch (IOException e) { throw new RuntimeException(e); }
    }
}
