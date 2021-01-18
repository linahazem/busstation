import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class assigntrip {
	Stage stage;
	Scene scene;
    loginpage loginpage;
    manager manager;
    ManagerAcc account;
    ListView<String>listView;
    ArrayList<String>d1= new ArrayList<>();
    ArrayList<String>d2= new ArrayList<>();
    writeArr writeArr;
    
public assigntrip(Stage stage) {
    	this.stage=stage;
    }
 
void preparescene() {
	     
	     manager = new manager("menna","5399","manager");
         writeArr = new writeArr();
	     ToggleGroup group = new ToggleGroup();
         Button choose = new Button("CHOOSE");
      
         RadioButton driver1 = new RadioButton();
     	 driver1.setText("driver 1");
     	 driver1.setToggleGroup(group);
     	 driver1.setSelected(true);
     	
     	
     	
     	RadioButton driver2  = new RadioButton();
        driver2.setToggleGroup(group);
     	driver2.setText("driver 2");
     	
         listView = new ListView<>();	
        //read from file	
      	manager.viewTrips();

    	listView.getItems().addAll(manager.getView());
    	listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    	
    
    choose.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
		
if(driver1.isSelected()) 
{
				
			String message= "";
    		ObservableList<String>assigned;
    		assigned = listView.getSelectionModel().getSelectedItems();
    	for(String m : assigned) {
    		message += m ;
    		}
    		d1.add(message);

    	try {
			writeArr.read(d1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	}			
 if(driver2.isSelected()) {
				 String message= "";
		    		ObservableList<String>assigned;
		    		assigned = listView.getSelectionModel().getSelectedItems();
		    	for(String z : assigned) {
		    		message += z+"\n";
		    		d2.add(message);
		    		try {
						writeArr.read2(d2);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }
		setD2(d2);
		}
			 System.out.println(d2.size());
		}
  });

    	
    	GridPane grid = new GridPane();

        grid.setPadding(new Insets(10,10,10, 10));

        grid.setVgap(8);

        grid.setHgap(10);

        grid.setAlignment(Pos.CENTER);
        
        grid.setStyle("-fx-background-color: LIGHTBLUE;");
        
        GridPane.setConstraints(choose,1,3);
        GridPane.setConstraints(driver1 ,1 ,1);

    	GridPane.setConstraints(driver2 ,1 ,2);

        
        grid.getChildren().addAll(listView,choose,driver1,driver2);
        
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

public ListView<String> getListView() {
	return listView;
}

public void setListView(ListView<String> listView) {
	this.listView = listView;
}

public ArrayList<String> getD1() {
	return d1;
}

public void setD1(ArrayList<String> d1) {
	this.d1 = d1;
}

public ArrayList<String> getD2() {
	return d2;
}

public void setD2(ArrayList<String> d2) {
	this.d2 = d2;
}

}