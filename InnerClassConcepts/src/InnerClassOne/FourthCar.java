package InnerClassOne;

public class FourthCar {
	
	private int gears = 5; // Private Method Can Be Accessed In Inner Class Directly
	private static String gearType = "Automatic"; // Static Method Can Be Accessed In Inner Class Directly.
	int seats = 4;
	
	class DrivingSeat{
		
		void handle() {
			System.out.println("Total Gears ::: "+gears);
			System.out.println("Gear Type ::: "+gearType);
			System.out.println("No Of Seats ::: "+seats);
		}	
	}

	public static void main(String[] args) {
		
		DrivingSeat s4 = new FourthCar().new DrivingSeat();
		s4.handle();
	}
}
