package AnonymousInnerClass;

class Eatables{
	public void taste() {
		System.out.println("Salty");
	}	
}
public class PopCorn {
	public static void main(String[] args) {		
		
		Eatables e = new Eatables(); // Creates Eatables Object And Refers It With Eatable Class Reference.
		e.taste(); // Prints : Salty
		
		Eatables e1 = new Eatables() { //Creates Object Of Child Class Extending Eatables Class And Refers It With Eatable Class Reference.
			@Override
			public void taste() {
				System.out.println("Spicy");
			}
		};		
		e1.taste();	// Prints : Spicy
		
		System.out.println("e's Class Is ::: "+e.getClass().getName());
		System.out.println("e1's Class Is ::: "+e1.getClass().getName());
	}
}
