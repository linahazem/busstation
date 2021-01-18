import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class empAll {
Scene scene;
Stage stage;
ListView<String>listView;
String user;
authentication check;
private Scanner s;
ArrayList<String>info=new ArrayList<>();
ArrayList<String>foundline=new ArrayList<>();
ArrayList<String>view=new ArrayList<>();
ManagerAcc ManagerAcc;
mainMenu mainMenu;
String line;
int i;

public empAll(Stage stage) 
{

this.stage=stage;
	
}
public void preparescene() {
	
	check = new authentication();
	ToggleGroup group = new ToggleGroup();
    listView = new ListView<>();	
	
	Label usernamelabel = new Label("username:");
	Label passwordlabel = new Label("password:");
	Label validationlabel = new Label();
    
	PasswordField passwordfield = new PasswordField();
	TextField usernamefield = new TextField();
   
    Button go = new Button("GO");
    go.setStyle("-fx-background-color: darkblue; -fx-text-fill: white;");
	

	RadioButton driver1 = new RadioButton();
	driver1.setText("driver");
	
	
	RadioButton manager = new RadioButton();
    manager.setText("manager");	

	RadioButton profile = new RadioButton();
	profile.setText("show profile");
	
	
	RadioButton assigned = new RadioButton();
	assigned.setText("show Assigned trips");
	
	
	go.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
          	if(driver1.isSelected()&&profile.isSelected())
   	{				
	           String names = usernamefield.getText();     
	           String pass = passwordfield.getText();
			   boolean valid = check.validate(names,pass,"drivers");
				if(valid) 
				{
					try { 
						
						s = new Scanner(new File("persons.txt"));
				        s.useDelimiter(" ");
				        // read line by line
				     while (s.hasNext()) {
				        	String word,word1,word2;
				        	 word = s.next();
				        	 info.add(word);
				          	 word1=s.next();
				        	 info.add(word1);
				        	 word2=s.next();
				        	 info.add(word2);
				          	 s.nextLine();
				          	 //System.out.println(names);
				     if(names.equals(word)&& word2.equals("drivers")) {
				    	
				    	 String foundinfo = word;
				    	 foundline.add(foundinfo);
				    	 String foundid = word1;
				    	 foundline.add(foundid);
				    	 String foundjob = word2;
				    	 foundline.add(foundjob);
				    	setFoundline(foundline);
				    	
				       		}	
				     }

				     
				        }
				     catch (IOException e) {
				         System.err.format("IOException: %s%n", e);
				     

				}
					 listView.getItems().addAll(foundline);
				}
					
				else {
					System.out.println("shit");
				validationlabel.setText("wrong ");	

				}
				
			}
       if(manager.isSelected())   {	
          	
    	   String user = usernamefield.getText();
   		   String pass = passwordfield.getText();
			boolean valid = check.validate(user,pass,"manager");
			
			if(valid) 
			{
				stage.setScene(ManagerAcc.getScene());
				
			}
				
			else {
				System.out.println("shit");
			validationlabel.setText("wrong ");	

			}		
		}
       if(driver1.isSelected()&&assigned.isSelected()) {
    	   try { 
    		     listView.getItems().clear();
    			s = new Scanner(new File("drivers.txt"));
    	        s.useDelimiter("\n");
      	        // read line by line
    	       
    	        while (s.hasNext()) {   
    	        String line = s.nextLine().toString();
    	    	
    	    	view.add(i,line);
    	    	  i++;    
    	    	  }
    	        listView.getItems().addAll(view);

    	       }
    	catch(Exception e) {
    		System.out.println("error");
    	}

       }
       else {
    	   validationlabel.setText("must choose");
       }
		}
		});

	
	
	GridPane grid = new GridPane();
	grid.setPadding(new Insets(10,10,10, 10));
	grid.setVgap(15);
	grid.setHgap(15);
	//grid.setAlignment(Pos.CENTER);
	grid.setStyle("-fx-background-color: LIGHTGREY;");
	driver1.setStyle("-fx-font:  bold 15px 'serif' "); 
	manager.setStyle("-fx-font:  bold 15px 'serif' "); 
	validationlabel.setStyle("-fx-font:  bold 15px 'serif' "); 
	GridPane.setConstraints(usernamelabel,0,0);
	GridPane.setConstraints(usernamefield,1,0);	
	GridPane.setConstraints(manager ,5,0);
	GridPane.setConstraints(driver1 ,4,0);
	GridPane.setConstraints(profile ,4 ,1);
	GridPane.setConstraints(assigned ,5 ,1);
	GridPane.setConstraints(passwordlabel ,0,1);
	GridPane.setConstraints(passwordfield ,1 ,1);
	GridPane.setConstraints(validationlabel ,0 ,2);
	
	GridPane.setConstraints(go,5,3);
	GridPane.setConstraints(listView,0,6);
	//grid.setHalignment(listView, HPos.CENTER);
	//grid.setValignment(listView, VPos.CENTER);

	listView.setPrefSize(150,150);
	grid.getChildren().addAll(listView,driver1,manager,profile,assigned,passwordlabel,passwordfield,usernamelabel,usernamefield,go,validationlabel);

	scene = new Scene(grid,600,300);
}
public Scene getScene() {
	return scene;
}
public void setScene(Scene scene) {
	this.scene = scene;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public ArrayList<String> getFoundline() {
	return foundline;
}
public void setFoundline(ArrayList<String> foundline) {
	this.foundline = foundline;
}
public ManagerAcc getManagerAcc() {
	return ManagerAcc;
}
public void setManagerAcc(ManagerAcc managerAcc) {
	ManagerAcc = managerAcc;
}
	
}
