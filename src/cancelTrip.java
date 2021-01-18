import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class cancelTrip {
	
	Stage stage;
	Scene scene; 
	String message; 
	ListView<String>listView;
	ArrayList<String>cancel= new ArrayList<>();
	passengers passengers;
	loginpage loginpage;
	passengerAcc passengerAcc;
	ManagerAcc ManagerAcc; 
	public cancelTrip(Stage stage) {
    	this.stage=stage;
    }
 
void preparescene() throws FileNotFoundException {
	 Button choose = new Button("CHOOSE");
	 Button ok = new Button("ok");

     listView = new ListView<>();
     passengers=new passengers("samy","1111","passenger",loginpage);
	GridPane grid = new GridPane();
 	passengers.showHistory();
	listView.getItems().addAll(passengers.getHistory());

	choose.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			 message= "";
    		ObservableList<String>assigned;
    		assigned = listView.getSelectionModel().getSelectedItems();
    	for(String m : assigned) {
    		message += m;	
       	}
    	cancel.add(message);
		}		
		
	});
	ok.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {

			
          try {
			passengers.cancel1(cancel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		}
	});

		grid.setPadding(new Insets(10,10,10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		grid.setStyle("-fx-background-color: LIGHTGREY;");
        GridPane.setConstraints(choose,1,1);
        GridPane.setConstraints(ok,1,2);

        grid.getChildren().addAll(listView,choose,ok);

		scene = new Scene(grid,500,400);
}

public Stage getStage() {
	return stage;
}

public void setStage(Stage stage) {
	this.stage = stage;
}

public Scene getScene() {
	return scene;
}

public void setScene(Scene scene) {
	this.scene = scene;
}

public passengerAcc getPassengerAcc() {
	return passengerAcc;
}

public void setPassengerAcc(passengerAcc passengerAcc) {
	this.passengerAcc = passengerAcc;
}

public ListView<String> getListView() {
	return listView;
}

public ArrayList<String> getCancel() {
	for(int i=0;i<cancel.size();i++)
		System.out.println(cancel.get(i));
	return cancel;
}

public void setCancel(ArrayList<String> cancel) {
	this.cancel = cancel;
}

public String getMessage() {
	//System.out.println(message);
	return message;
}

public ManagerAcc getManagerAcc() {
	return ManagerAcc;
}

public void setManagerAcc(ManagerAcc managerAcc) {
	ManagerAcc = managerAcc;
}


     
}