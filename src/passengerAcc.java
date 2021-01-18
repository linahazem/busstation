import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class passengerAcc {
	Stage stage;
	Scene scene;
    loginpage loginpage;
    newreserve newreserve;
    historyPass historyPass;
    cancelTrip cancelTrip;

public passengerAcc(Stage stage) {
		
		this.stage=stage;

	}
	void preparescene() {
		Button history = new Button("History");
		Button reservation = new Button("new reservation");
		Button cancel = new Button("cancel reservation");
		reservation.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(newreserve.getScene());
				
			}
		});
		history.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
                 stage.setScene(historyPass.getScene());
				
			}
		});
		cancel.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
                stage.setScene(cancelTrip.getScene());
				
			}
		});
		

		
		GridPane grid = new GridPane();

		grid.setPadding(new Insets(10,10,10, 10));

		grid.setVgap(8);

		grid.setHgap(10);

		grid.setAlignment(Pos.CENTER);

		grid.setStyle("-fx-background-color: LIGHTGREY;");

		GridPane.setConstraints(history ,0 ,1);

		GridPane.setConstraints(reservation ,1 ,1);

		GridPane.setConstraints(cancel,0,0);
		
		
		grid.getChildren().addAll(history,reservation,cancel);

		scene = new Scene(grid,400,300);

	}
	
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public historyPass getHistoryPass() {
		return historyPass;
	}
	public void setHistoryPass(historyPass historyPass) {
		this.historyPass = historyPass;
	}
	public Scene getScene() {
		return scene;
	}
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	public loginpage getLoginpage() {
		return loginpage;
	}
	public void setLoginpage(loginpage loginpage) {
		this.loginpage = loginpage;
	}
	public newreserve getNewreserve() {
		return newreserve;
	}
	public void setNewreserve(newreserve newreserve) {
		this.newreserve = newreserve;
	}
	public cancelTrip getCancelTrip() {
		return cancelTrip;
	}
	public void setCancelTrip(cancelTrip cancelTrip) {
		this.cancelTrip = cancelTrip;
	}

}