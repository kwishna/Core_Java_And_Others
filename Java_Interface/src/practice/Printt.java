package practice;
import java.util.regex.*;

public class Printt {
	
	public static void main(String[] args){
		
		Pattern p = Pattern.compile("...s");
		Matcher m = p.matcher("a a1");
		System.out.println(m.matches());
	}
}
