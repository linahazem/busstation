import java.io.File;
import java.io.IOException;
import java.lang.*;
import java.util.*;

public class file {

private Formatter x,y;
public void openFile1() {
	try 
	{
	x=new Formatter("persons.txt");
	
	}
	catch( Exception e) {
		System.out.println("you have an error");
	}
}
public void openFile2() {
	try 
	{
	y=new Formatter("trips.txt");
	
	}
	catch( Exception e) {
		System.out.println("you have an error");
	}
}


public void closefile1() {
	x.close();
}


public void closefile2() {
	y.close();
}
public void openFile3() {
	try 
	{
	y=new Formatter("drivers.txt");
	
	}
	catch( Exception e) {
		System.out.println("you have an error");
	}
}


public void closefile3() {
	x.close();
}

}

