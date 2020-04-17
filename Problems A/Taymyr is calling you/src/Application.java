import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;  
		int n = scan.nextInt(); 
		int m = scan.nextInt();
		int z = scan.nextInt(); 
		int min = 0  ; 
		while (true) 
		{
			for (int i = m  ;i <= z ; i+=m ) 
				for (int j = n ; j <= i ; j+=n ) 
				
					if (i==j) 
						min+=1  ; 
					
				
	       System.out.println(min) ; 
	       break; 
		}
		
 
	}

}
