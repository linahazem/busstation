import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class passengers extends persons {
	
	
	ArrayList<String>history= new ArrayList<String>();
	ArrayList<String>newlist= new ArrayList<String>();
	
    String ahmed;
    private Scanner s;
    loginpage loginpage;
    cancelTrip cancelTrip;
    loginpage user;
    
   public passengers(String name, String id, String type, loginpage user) {
		super(name, id, type);
		this.user=user;
	}
   
	public void name(String name) {
		System.out.println(name);
	}
	public  void cancel1(ArrayList<String> list ) throws IOException {
		this.newlist=list;
		 for(int i=0;i<history.size();i++)
		 {   for(int j=0;j<list.size();j++) {
			 String o = history.get(i);
			if(list.get(j).equals(o)) {
				 history.remove(i);
			 }
		 }
		 }
		 save(history);
	    }
	public void save(ArrayList<String> list2) throws IOException {
		FileWriter fw = new FileWriter("trips.txt");
	     BufferedWriter writer = new BufferedWriter(fw);
		 for(int i=0;i<history.size();i++)
		 {
			 writer.write(history.get(i));
	         writer.write("\n");    
		 }
		 writer.close();
	}
	
    public void showHistory() throws FileNotFoundException {
    	s = new Scanner(new File("trips.txt"));
        s.useDelimiter(" ");
        String name="ahmed";
        //System.out.println(user.getOption());
       /* while(s.hasNext()){
        	String word;
        	word = s.next();
           	if(name.equals(word))
        	{
        		//System.out.println(word);
        	String line =s.nextLine().toString();        	
        	history.add(line);
        	
        	}*/
           	while (s.hasNext()) {   
                String line = s.nextLine().toString();
            	history.add(line);
            	  }   
    	
    }
    
    public void setAhmed(String ahmed) {
		this.ahmed = ahmed;
	}

	public String getAhmed() {
		return ahmed;
	}

	public loginpage getUser() {
		return user;
	}
	public Collection<String> getHistory() {
		return history;
	}
	
}