
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class JFXMainClass extends Application {

	@Override
	public void start(Stage primaryStage) {
		System.out.print("abc");
		
		Platform.exit();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
