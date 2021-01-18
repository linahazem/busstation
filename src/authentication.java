import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class authentication {
	
	String line;

	ADMIN admin;
	private Scanner s;
	
	
public void setAdmin(ADMIN admin) {

	this.admin = admin;
	
	}

public boolean validate (String name ,String id,String job) {
	
	try { 
                 s = new Scanner(new File("persons.txt"));
                 s.useDelimiter(" ");
	            // read line by line
	            while (s.hasNext()) {
	            	String word,word1,word2;
	            	 word = s.next();
	            	 word1=s.next();
	            	 word2=s.next();
	            	 s.nextLine();
	            	
	           if(name.equals(word)&&id.equals(word1)&&job.equals(word2)) {
	           	        
	        	   return true;   	

	           		}

	           			
	         }
	            }
	            

	        
catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        
return false;
}
	return false;
	    }
	


}