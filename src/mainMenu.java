import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.*;
public class mainMenu {

	Stage stage;
	Scene scene;
	loginpage loginpage;
	empAll empAll;
	
public mainMenu(Stage stage) {
	
	this.stage=stage;

}
void preparescene() {
	
	
	
	Button employee=new Button("EMPLOYEE");
	Button passenger=new Button("PASSENGER");
    
	employee.setStyle("-fx-background-color: darkblue; -fx-text-fill: white;"); 
    passenger.setStyle("-fx-background-color: darkblue; -fx-text-fill: white;"); 

    employee.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {

			stage.setScene(empAll.getScene());

		}
	});
    
    passenger.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			stage.setScene(loginpage.getScene());
		}
	});
    
    
    GridPane grid = new GridPane();
    Image image= new Image("File:C:\\Users\\fruty\\Pictures\\Screenshots\\Screenshot (8).png");
	ImageView mv= new ImageView(image);
    
	grid.setPadding(new Insets(10,10,10, 10));

    grid.setVgap(8);

    grid.setHgap(10);

    grid.setAlignment(Pos.CENTER);
    
    grid.setStyle("-fx-background-color: LIGHTGREY;");
    mv.setFitWidth(180);
    mv.setFitHeight(200);
    passenger.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    employee.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    GridPane.setConstraints(employee,0,1);
    GridPane.setConstraints(passenger,0,2);
    grid.add(mv,0,0);

    grid.getChildren().addAll(employee,passenger);
    scene = new Scene(grid,400,300);

    
}  
public Scene getScene()
    {
     return this.scene;

    }
public void setLoginpage(loginpage loginpage) {
	this.loginpage = loginpage;
}

public empAll getEmpAll() {
	return empAll;
}
public void setEmpAll(empAll empAll) {
	this.empAll = empAll;
}
	
}
