package practice;

import java.io.Serializable;

class Testx implements Serializable{
	int t;
	Testx(int i){ System.out.println("Constructor2"); }
}


public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**	int[] a = new int['a'];
		System.out.println(a.length);
		
		byte b='x';
		int i = b;
		System.out.println(i);
		int[] in = new int[]{1,2};*/
		Testx t1 = new Testx(10);
		System.out.println(t1);
		
	}

}
