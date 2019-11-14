package InnerClassOne;

public class FirstCar {
	
	class Steering{
			
		void handleSteering() {
			
				System.out.println("Hi, I Am Handling Steering Of My Car");
			}
		}
	
	public static void main(String[] args) {
		/**
		 * In Order To Call m1() Method Of Inner Class. Compulsory, We Need Outer Class Reference As Well.
		 */
		
		FirstCar getIntoCar = new FirstCar(); 
		Steering getTheSteering = getIntoCar.new Steering(); // Creating Object Of Inner Class Inside Static Method.
		getTheSteering.handleSteering();
		
		//Or, Another Way
		FirstCar.Steering steering = new FirstCar().new Steering();
		steering.handleSteering();
		
		//Or, Directly
		new FirstCar().new Steering().handleSteering();
	}
}
