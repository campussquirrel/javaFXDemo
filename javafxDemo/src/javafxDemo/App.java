package javafxDemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application  {
	
	public static void main(String[] args){
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//Group root=new Group();
		Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene=new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
	}

}
