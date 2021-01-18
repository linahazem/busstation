import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class loginpage {
	
	Stage stage;
	Scene scene;
	mainMenu mainMenu;
    passengerAcc passengerAcc;
    authentication check;
    String user1;
    String pass;
	
public loginpage(Stage stage) {
	
	this.stage=stage;

}
public void preparescene(){

	check = new authentication();

	Label usernamelabel = new Label("username:");
	Label passwordlabel = new Label("password:");
	Label validationlabel = new Label();
    
	PasswordField passwordfield = new PasswordField();
	TextField usernamefield = new TextField();
   
    Button login = new Button("login");

login.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent event) {
		 user1 = usernamefield.getText();
		//this.user1=user1;
		String pass2 = passwordfield.getText();
		pass=pass2;
		boolean valid1 = check.validate(user1,pass2,"passenger");
		//System.out.println(valid1);
		if(valid1) 
		{
			stage.setScene(passengerAcc.getScene());
			
		}
			
		else {
			System.out.println("shit");
		validationlabel.setText("wrong ");	

		}
		
	
	}
});



GridPane grid = new GridPane();

grid.setPadding(new Insets(10,10,10, 10));

grid.setVgap(8);

grid.setHgap(10);

grid.setAlignment(Pos.CENTER);

grid.setStyle("-fx-background-color: LIGHTGREY;");

passwordlabel.setStyle("-fx-font: normal bold 15px 'serif' "); 

usernamelabel.setStyle("-fx-font: normal bold 15px 'serif' "); 

GridPane.setConstraints(passwordlabel ,0 ,1);

GridPane.setConstraints(passwordfield ,1 ,1);

GridPane.setConstraints(usernamelabel,0,0);

GridPane.setConstraints(usernamefield,1,0);

GridPane.setConstraints(login,1,2);

GridPane.setConstraints(validationlabel,2,0);


grid.getChildren().addAll(passwordlabel,passwordfield,usernamelabel,usernamefield,login,validationlabel);

scene = new Scene(grid,400,300);

}
   

public String getUser1() {
	//System.out.println(user1);
	return user1;
}
public Scene getScene()
{
 return this.scene;

}
public void setMainMenu(mainMenu mainMenu) {
	this.mainMenu = mainMenu;
}
public passengerAcc getPassengerAcc() {
	return passengerAcc;
}
public void setPassengerAcc(passengerAcc passengerAcc) {
	this.passengerAcc = passengerAcc;
}

}