package AnonymousInnerClass;
/**
 * Example For An Anonymous Class Which Is Implementing Runnable Interface.
 *
 */
public class MyThread {

	public static void main(String[] args) {
		
		 new Thread(
				 new Runnable() {
					@Override
					public void run() {
						for(int i=0; i<10; i++) {
							System.out.println("Running A Thread Using Anonymous Class ::: "+Thread.currentThread().getName());
						}
					}
				}).start();
		 
		 for(int j=0; j<10; j++) {
			 System.out.println("Running Main Thread ::: "+Thread.currentThread().getName());
		 }
	}
}
