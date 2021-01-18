import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class newreserve {
	
	Stage stage;
	Scene scene;
    loginpage loginpage;
    passengerAcc passengerAcc;
    PASSENGER passenger; 
    
    String carType,ticketType,destination,Depcity,Arrcity,Stops;
    int i;
    loginpage user;

    public newreserve(Stage stage,loginpage user) {
		this.user=user;
		this.stage=stage;
		
	
    }
public void preparescene() {
	
	passenger = new PASSENGER();
	Label price= new Label();
	Label carlabel = new Label("Car Type:");
	Label available=new Label();
	ChoiceBox<String> choicebox1=new ChoiceBox<>();
	choicebox1.getItems().add("minibus");
	choicebox1.getItems().add("Limo");
	choicebox1.getItems().add("Bus");
	
	Label Tickettype = new Label("Ticket Type:");
	
	ChoiceBox<String> choicebox2=new ChoiceBox<>();

	choicebox2.getItems().add("round");
	choicebox2.getItems().add("one-way");
	
	Label Destination = new Label("Destination:");
	
	ChoiceBox<String> choicebox3=new ChoiceBox<>();
	choicebox3.getItems().add("External");
	choicebox3.getItems().add("internal");
	Label depcitylabel = new Label("Departual City:");

	ChoiceBox<String> choicebox5=new ChoiceBox<>();
	choicebox5.getItems().add("Aswan");
	choicebox5.getItems().add("Alex");
	choicebox5.getItems().add("Cairo");

	
	Label arrcitylabel = new Label("Arrival City:");
	ChoiceBox<String> choicebox6=new ChoiceBox<>();
	choicebox6.getItems().add("Aswan");
	choicebox6.getItems().add("Alex");
	choicebox6.getItems().add("Cairo");	
	Label stops = new Label("Stops:");
	
	
	ChoiceBox<String> choicebox4=new ChoiceBox<>();
	choicebox4.getItems().add("no stops");
	choicebox4.getItems().add("one-stop");
	choicebox4.getItems().add("two-stops");

	Button apply = new Button("Apply");
	Button save = new Button("Save");
	Label Alert= new Label();
	

	apply.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			String carType=choicebox1.getValue();
			String ticketType=choicebox2.getValue();			
			String destination=choicebox3.getValue();			
			String Stops= choicebox4.getValue();			
			String Depcity=choicebox5.getValue();
			String Arrcity=choicebox6.getValue();
			 
  			
         	    passenger.prices(carType, ticketType, Stops);
         	    price.setText("Price:"+passenger.getPrice());
         	//	passenger.display();
    			passenger.TRIP(user.getUser1(),carType, ticketType, destination, Stops, Depcity, Arrcity);
         	
		}
	});
	save.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			
			passenger.saveToFiles(passenger.getTRIP());
		}
	});
	
	
	 GridPane grid = new GridPane();

	    grid.setPadding(new Insets(10,10,10, 10));
	    grid.setVgap(8);
        grid.setHgap(10);
	    grid.setAlignment(Pos.CENTER);
	    grid.setStyle("-fx-background-color: LIGHTGREY;");
	    
	    GridPane.setConstraints(price,1,8);
	    GridPane.setConstraints(carlabel,0,1);
	    GridPane.setConstraints(choicebox1,1,1);
	    
	    GridPane.setConstraints(Tickettype,0,2);
	    GridPane.setConstraints(choicebox2,1,2);
	    
	    GridPane.setConstraints(Destination,0,3);
	    GridPane.setConstraints(choicebox3,1,3);
	    
	    GridPane.setConstraints(depcitylabel,0,4);
	    GridPane.setConstraints(choicebox5,0,5);
	    
	    GridPane.setConstraints(arrcitylabel,1,4);
	    GridPane.setConstraints(choicebox6,1,5);
	    
	    GridPane.setConstraints(stops,0,6);
	    GridPane.setConstraints(choicebox4,1,6);
	    
	    GridPane.setConstraints(save,0,7);
	    GridPane.setConstraints(apply,1,7);
	    GridPane.setConstraints(available,1,8);

	    grid.getChildren().addAll(available,price,carlabel,choicebox1,choicebox2,choicebox3,choicebox4,Tickettype,Destination,choicebox5,depcitylabel,choicebox6,arrcitylabel,stops,save,apply,Alert);
	    

	    scene = new Scene(grid,400,300);

}

public loginpage getUser() {
	return user;
}
public void setUser(loginpage user) {
	this.user = user;
}
public String getCarType() {
	return carType;
}
public String getTicketType() {
	return ticketType;
}
public String getDestination() {
	return destination;
}
public String getDepcity() {
	return Depcity;
}
public String getArrcity() {
	return Arrcity;
}
public String getStops() {
	return Stops;
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

}