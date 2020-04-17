import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in)  ;  
		int d1 = scan.nextInt() ; 
		int d2 = scan.nextInt() ;
		int d3 = scan.nextInt() ; 
		int a = d1 + d2 +d3 ; 
		int b = 2*(d1+d2) ; 
		int c = 2*(d1+d3) ; 
		int d = 2*(d2+d3) ; 
		int res = Math.min(Math.min(a, b), Math.min(c, d)) ; 
		System.out.println(res); 
		
     
		
	}

}
