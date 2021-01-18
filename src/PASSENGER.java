import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PASSENGER implements passengerActions{
   
	ArrayList<TRIP>TRIP= new ArrayList<TRIP>();
	
    newreserve newreserve;
    
    file file;
    loginpage user;
    int price,busSeat,miniSeat,limoSeat;
	
	private Scanner s;


	public ArrayList<TRIP>TRIP (String name,String carType,String ticketType,String destination,String Stops,String Depcity,String Arrcity) {		
		    TRIP.add(new TRIP(name,carType,ticketType,destination,Stops,Depcity,Arrcity));		    

		    return (TRIP);	
}
public boolean checkTickets(String carType) {
	
		
		if (carType=="minibus") {
		    seats(carType);			
			System.out.println(miniSeat);
			if(miniSeat>10) {
				return false;
				}
			else		
				return true;			
		}
		else if (carType=="Bus") {
		    seats(carType);
			System.out.println(busSeat);
			if(busSeat>20)
				return false;	
			return true;
		}
		else 
		  return true;	
	}
	public void seats(String carType) {
		if(carType=="Bus")
			busSeat=busSeat+1;
		else if(carType=="minibus")
		    miniSeat=miniSeat+1;
		else
			limoSeat=limoSeat+1;
	}
	public int prices(String carType,String ticketType, String Stops) {
		price=0;
		if(carType=="Bus") 
			price=price+20;
		else if(carType=="minibus")
		    price=price+30;
		else if (carType=="Limo")
			price=price+40;
		if(ticketType=="one-way")
			price=price+40;
		else if(ticketType=="round")
			price=price+20;
		if(Stops=="two-stops")
			price=price+10;
		else if(Stops=="one-stops")
			price=price+20;
		else if(Stops=="no stops")
			price=price+30;
		return price;	
	}
public void saveToFiles(ArrayList<TRIP>list) {		
	   
		this.TRIP=list;
		try {
	    	
	    	FileWriter fw = new FileWriter("trips.txt",true);
	       BufferedWriter writer = new BufferedWriter(fw);    
	       for (int i=0;i<TRIP.size();i++) {
	    	   writer.write(TRIP.get(i).getName().toString());
	           writer.write(" ");    
           writer.write(TRIP.get(i).getCarType().toString());
           writer.write(" "); 
           writer.write(TRIP.get(i).getTicketType().toString());
           writer.write(" ");
           writer.write(TRIP.get(i).getDestination().toString());
           writer.write(" ");
           writer.write(TRIP.get(i).getDepcity().toString());
           writer.write(" ");
           writer.write(TRIP.get(i).getArrcity().toString());
           writer.write(" ");
           writer.write(TRIP.get(i).getStops().toString());
           writer.newLine();
	       }
           //System.out.println(i);          
	     writer.close(); 
	    }catch(IOException e){
	        System.out.println(e);   
	      }
	   
		
	}
    

	

	public int getPrice() {
	return price;
}
	public ArrayList<TRIP> getTRIP() {
		return TRIP;
	}

}