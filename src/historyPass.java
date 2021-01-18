import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class historyPass {
    Scene scene;
    Stage stage;
    passengerAcc passengerAcc;
    ListView<String>listView;
    loginpage loginpage;
    passengers passengers; 
    cancelTrip cancelTrip; 
public historyPass(Stage stage) {
		
		this.stage=stage;

	}
	void preparescene() throws FileNotFoundException {

		passengers=new passengers("samy","1111","passenger",loginpage);
		GridPane grid = new GridPane();
    	listView = new ListView<>();	
    	passengers.showHistory();
	    listView.getItems().addAll(passengers.getHistory());

		grid.setPadding(new Insets(10,10,10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		grid.setStyle("-fx-background-color: LIGHTGREY;");
        grid.getChildren().addAll(listView);


		scene = new Scene(grid,500,400);

	}
	public Scene getScene() {
		return scene;
	}
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public passengerAcc getPassengerAcc() {
		return passengerAcc;
	}
	public void setPassengerAcc(passengerAcc passengerAcc) {
		this.passengerAcc = passengerAcc;
	}
	
	
	
}