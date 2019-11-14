package InnerClassOne;

public class SecondCar {
	
	class Steering{
		 
		void doSteer() {
			
			System.out.println("I Am Steering After Getting Inside My Car");
		}	
	}
	
	void carHandler() {
		
		Steering s2 = new Steering(); // Creating Instance Of Inner Class Inside Instance Method.
		s2.doSteer();
	}
	
	public static void main(String... s) {
		
		SecondCar car = new SecondCar();
		car.carHandler();
	}
}
