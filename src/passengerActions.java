import java.util.ArrayList;

public interface passengerActions 
{
	public ArrayList<TRIP>TRIP (String name,String carType,String ticketType,String destination,String Stops,String Depcity,String Arrcity) ;
	//public boolean checkTickets(String carType);
	public void saveToFiles(ArrayList<TRIP>list);
	public ArrayList<TRIP> getTRIP();
	
}
