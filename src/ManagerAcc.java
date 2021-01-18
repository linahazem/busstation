import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ManagerAcc {
	
	Stage stage;
	Scene scene;
    loginpage loginpage;
    manager manager;
    VIEWTRIPS view;
    assigntrip assign;
    cancelTrip cancelTrip;

public ManagerAcc(Stage stage) {
		
		this.stage=stage;

	}

public void preparescene() {
	
	manager = new manager("menna","5399","manager");

	Button asstrips= new Button(" ASSIGN TRIPS");
	Button canceltrips= new Button("CANCEL TRIPS");
	Button viewtrips= new Button("VIEW TRIPS");
    Label viewlabel = new Label();
	
    asstrips.setStyle("-fx-background-color: darkblue; -fx-text-fill: white;");
    canceltrips.setStyle("-fx-background-color: darkblue; -fx-text-fill: white;");
    viewtrips.setStyle("-fx-background-color: darkblue; -fx-text-fill: white;");
    
    asstrips.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
		
			stage.setScene(assign.getScene());

		}
	});
	canceltrips.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
	
			stage.setScene(cancelTrip.getScene());
		}
	});

viewtrips.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
		
			stage.setScene(view.getScene());
		}
	});
	
	GridPane grid = new GridPane();

    grid.setPadding(new Insets(10,10,10, 10));

    grid.setVgap(10);

    grid.setHgap(10);

    grid.setAlignment(Pos.CENTER);
    
    grid.setStyle("-fx-background-color: LIGHTGREY;");
    

    asstrips.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    canceltrips.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    viewtrips.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    GridPane.setConstraints(asstrips,1,1);
    GridPane.setConstraints(canceltrips,1,3);
    GridPane.setConstraints(viewtrips,1,4);

    grid.getChildren().addAll(asstrips,canceltrips,viewtrips);
    
    scene = new Scene(grid,400,300);

    
}
public Scene getScene() {
	return scene;
}
public void setScene(Scene scene) {
	this.scene = scene;
}

public VIEWTRIPS getView() {
	return view;
}

public void setView(VIEWTRIPS view) {
	this.view = view;
}

public assigntrip getAssign() {
	return assign;
}

public void setAssign(assigntrip assign) {
	this.assign = assign;
}

public cancelTrip getCancelTrip() {
	return cancelTrip;
}

public void setCancelTrip(cancelTrip cancelTrip) {
	this.cancelTrip = cancelTrip;
}

}
