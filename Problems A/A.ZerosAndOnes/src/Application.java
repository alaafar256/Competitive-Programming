import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x , y , M , K  ; 
		int d = 0  ; 
		int t; 
		Scanner scan = new Scanner(System.in) ;  
		t= scan.nextInt()  ;
		while(t-- > 0 ) 
		{
			x = scan.nextInt() ; 
			y = scan.nextInt() ; 
			M = scan.nextInt() ; 
			K = scan.nextInt() ; 
			if (M >= K ) { d++ ;} 
			if (x+y > 1 ) { d++ ;} 
			System.out.println(d);
		}
		

	}

}
