package dynamic.polymarphism1;

public class TrainTicketBooking extends FlightTicketBooking {
	public void booking() {
		System.out.println("train ticket booking");
	}
	
	public static void main(String[] args) {
		TrainTicketBooking tb = new TrainTicketBooking();
		tb.booking();
	}
}
