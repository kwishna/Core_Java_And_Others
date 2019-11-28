package junit.practice;

public class DoAWork {
	private String message;


	public void setMessage(String m){
		this.message = m;
		System.out.println("Message Set : "+m);
	}

	
	public String getMessage(){
		return message;
	}
	
	public int printAmessage(){
		System.out.println("Printing A Message");
		return 100;
	}
}
