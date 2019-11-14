package AnonymousInnerClass;
/**
 * Example Of An Anonymous Class Which Is Extending Thread Class
 */
public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread t = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Thread Running ::: "+Thread.currentThread().getName());
				}
			}
		};
		
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Thread Running ::: "+Thread.currentThread().getName());
		}
	}
}
