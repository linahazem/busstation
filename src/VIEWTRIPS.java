import java.util.ArrayList;
import java.util.Observable;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VIEWTRIPS {

	Stage stage;
	Scene scene;
    loginpage loginpage;
  
    manager manager;
    ManagerAcc account;
    ListView<String>listView;
	
   
 public VIEWTRIPS(Stage stage) {
	this.stage=stage;
}
    void preparescene() 
    {
    
    	manager = new manager("menna","5399","manager");
    	listView = new ListView<>();	
    	//read from file and get to gui
    	manager.viewTrips();
	    listView.getItems().addAll(manager.getView());
    	
    	
    	GridPane grid = new GridPane();

        grid.setPadding(new Insets(10,10,10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: LIGHTGREY;");     
        grid.getChildren().addAll(listView);
        
        scene = new Scene(grid,400,300);
      }
	
 
    public Scene getScene() {
		return scene;
	}
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	public ManagerAcc getAccount() {
		return account;
	}
	public void setAccount(ManagerAcc account) {
		this.account = account;
	}

}
