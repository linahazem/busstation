import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ADMIN implements adminActions{
	
	file file;
    ArrayList<persons>persons = new ArrayList<>();
	
	

	@Override
	public ArrayList<persons> listPersons() {
		
		persons.add(0,new persons("lina","5613","drivers"));
		persons.add(1,new persons("mariam","5614","drivers"));
		persons.add(2,new persons("menna","5399","manager"));
		persons.add(3,new persons("ahmed","1111","passenger"));
		persons.add(4,new persons("samy","2222","passenger"));	
		return (persons);
	}


	@Override
	public void savePersons(ArrayList<persons> list) {
		
		this.persons=list;
		try {
			 
			   BufferedWriter writer = new BufferedWriter(new FileWriter("persons.txt"));
			   int size = persons.size();
		       for (int i=0;i<size;i++) {
		        
		         writer.write(persons.get(i).getName().toString());
		         writer.write(" ");
		         writer.write(persons.get(i).getId().toString());
		         writer.write(" ");
		         writer.write(persons.get(i).getType().toString());
		         writer.write(" ");
		         writer.newLine();

		          
		          
		        }
		        writer.close();
			    }
			catch(IOException e){
			        System.out.println(e);   
			      }
		
	}

public ArrayList<persons> getpersons() {
		return persons;
	}
	

}
