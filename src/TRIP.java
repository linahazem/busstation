public class TRIP {

	String carType,ticketType,destination, Stops,Depcity,Arrcity,name;
	int seat;
	
	public TRIP (String name,String carType,String ticketType,String destination,String Stops,String Depcity,String Arrcity) {
		this.name=name;
		this.carType=carType;
		this.ticketType=ticketType;
		this.destination=destination;
		this.Stops=Stops;
		this.Depcity=Depcity;
		this.Arrcity=Arrcity;
		//this.seat=seat;
	}
	
	public void display() {
		System.out.println(seat+ticketType+destination+Stops+Depcity+Arrcity);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStops() {
		return Stops;
	}
	public void setStops(String stops) {
		Stops = stops;
	}
	public String getDepcity() {
		return Depcity;
	}
	public void setDepcity(String depcity) {
		Depcity = depcity;
	}
	public String getArrcity() {
		return Arrcity;
	}
	public void setArrcity(String arrcity) {
		Arrcity = arrcity;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
}