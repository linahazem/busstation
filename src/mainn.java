import javafx.application.Application;
import javafx.stage.Stage;


public class mainn extends Application{
 

	public static void main(String[]args) 
	{
         launch(args);
	   } 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		mainMenu mainMenu = new mainMenu(primaryStage);	
		loginpage loginpage = new loginpage(primaryStage);	
		passengerAcc passengerAcc=new passengerAcc(primaryStage);
		empAll empAll = new empAll(primaryStage);
		ManagerAcc managerAcc = new ManagerAcc(primaryStage);
		historyPass historyPass = new historyPass(primaryStage);
		VIEWTRIPS view = new VIEWTRIPS(primaryStage);
		assigntrip assign = new assigntrip(primaryStage);
		cancelTrip cancelTrip = new cancelTrip(primaryStage);
		
			
		
		file file = new file();
		ADMIN admin =new ADMIN();
		PASSENGER passenger = new PASSENGER();
	    newreserve newreserve = new newreserve(primaryStage,loginpage);
	    file.openFile1();
		file.closefile1();
		
	
				
		
		admin.listPersons();
		admin.savePersons(admin.getpersons());
		
		loginpage.preparescene();
		mainMenu.preparescene();
		empAll.preparescene();
		passengerAcc.preparescene();
		newreserve.preparescene();
		managerAcc.preparescene();
		view.preparescene();
		assign.preparescene();
		cancelTrip.preparescene();
		historyPass.preparescene();

		cancelTrip.setPassengerAcc(passengerAcc);
		passengerAcc.setCancelTrip(cancelTrip);
		
		cancelTrip.setManagerAcc(managerAcc);
		managerAcc.setCancelTrip(cancelTrip);
		historyPass.setPassengerAcc(passengerAcc);
		passengerAcc.setHistoryPass(historyPass);
			
		mainMenu.setLoginpage(loginpage);
		mainMenu.setEmpAll(empAll);
		loginpage.setPassengerAcc(passengerAcc);
		passengerAcc.setNewreserve(newreserve);
		newreserve.setPassengerAcc(passengerAcc);
		empAll.setManagerAcc(managerAcc);
		managerAcc.setView(view);
		managerAcc.setAssign(assign);
		
		
		
		
		primaryStage.setScene(mainMenu.getScene());
		setUserAgentStylesheet(STYLESHEET_CASPIAN);
	    primaryStage.show();
		
	}

}