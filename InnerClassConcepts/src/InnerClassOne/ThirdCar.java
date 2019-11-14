package InnerClassOne;

class Seat{
	
	 class SeatBelt{
		
		public void tieBelt() {
			
			System.out.println("Tying My Seat Belt");
		}	
	}
}

public class ThirdCar {
	
	public static void main(String[] args) {

	Seat seat = new Seat();
	Seat.SeatBelt belt = seat.new SeatBelt();
	belt.tieBelt();
	
	}
}
