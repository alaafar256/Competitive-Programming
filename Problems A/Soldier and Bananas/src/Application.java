import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
      
		Scanner scan = new Scanner (System.in) ; 
		int n1 = scan.nextInt() ; 
		int n2 = scan.nextInt() ;  
		int n3 = scan.nextInt() ; 
		  int costofbananas ;
		  int cost  = 0 ;
		  int amount ;
	       for (int i = 1 ; i<= n3 ; i++  ) 
	       {
	    	   costofbananas = i*n1 ; 
	    	   cost += costofbananas ; 
	       }
	       amount = cost - n2 ;
	       if (amount < 0 )
	           amount =0 ;
	       System.out.println(amount) ; 

	}

}
