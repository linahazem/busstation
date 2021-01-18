import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class manager extends persons{

private Scanner s;
String line;
ManagerAcc account;
ArrayList<String>view=new ArrayList<>();
int i;
public manager(String name, String id,String job) {
		super(name, id,job);
	}
/*public void assignTrips() {
    	  
}*/	
//public void cancelTrips() {
  //  	  }

public void viewTrips() {
	
	try { 
		s = new Scanner(new File("trips.txt"));
        s.useDelimiter(" ");
       
        // read line by line
       
        while (s.hasNext()) {   
        String line = s.nextLine().toString();
    	this.line=line;
    	view.add(i,line);
    	  i++;    
    	  }

       }
catch(Exception e) {
	System.out.println("error");
}

}

public String getLine() {
 
	//System.out.println(line);
	return line;
}
public ArrayList<String> getView() {

	return view;

}




}