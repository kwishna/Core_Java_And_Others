package junit.parameter;

public class CheckPrime {

	public boolean isItPrime(int num){

		if(num<=0){ return false; }
		else if(num==1){ return true;  }
		
		else{
			for(int i = 2; i<=num/2; i++){
				
				int remainder = num%i;
				if(remainder==0){ 
					System.out.println(num+" : Falsee");
					return false; }
		}
			System.out.println(num+" : Truee");
			 
			return true;
		
	}
		
  }
}
