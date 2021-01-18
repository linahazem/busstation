import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writeArr {

ArrayList<String>take = new ArrayList<>();	
ArrayList<String>take1 = new ArrayList<>();

public void read(ArrayList<String>list) throws IOException 
{
	FileWriter fw= new FileWriter("drivers.txt",false);
	BufferedWriter writer = new BufferedWriter(fw);
	for(int i=0;i<list.size();i++) {
		writer.write(list.get(i));
		writer.write("\n");
	}
	writer.close();
}

public void read2(ArrayList<String>list2) throws IOException {
	FileWriter fw= new FileWriter("drivers.txt",false);
	BufferedWriter writer = new BufferedWriter(fw);
	for(int i=0;i<list2.size();i++) {
		writer.write(list2.get(i));
		writer.write("\n");
	}
	writer.close();	
}
}
