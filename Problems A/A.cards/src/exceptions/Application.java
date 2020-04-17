package exceptions;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		   
		int m ; 		
		Scanner scan = new Scanner(System.in) ;
		int n  = 0 ; 
		int z  = 0 ;  
		m = scan.nextInt() ; 
        String  arr  ; 
 
	    arr = scan.next() ;   
		for (int i =0 ; i< arr.length() ; i++ ) {
			if (arr == "z")
			{
				z++ ;
			}
			else if (arr == "n")
			{
				n++ ; 
			}
		}
		for (int i =0 ; i < n ; i++ )
		{
			System.out.print(n + " ") ; 
		}
		for (int i = 0; i < z ; i++ ) 
		{
			System.out.print(z + " "); 
		}

	}
	/*

	  static class InputReader {
	        private InputStream stream;
	        private byte[] buf = new byte[1024];
	        private int curChar;
	        private int numChars;
	        private InputReader.SpaceCharFilter filter;
	 
	        public InputReader(InputStream stream) {
	            this.stream = stream;
	        }
	 public int read() {
         if (numChars == -1) {
             throw new InputMismatchException();
         }
         if (curChar >= numChars) {
             curChar = 0;
             try {
                 numChars = stream.read(buf);
             } catch (IOException e) {
                 throw new InputMismatchException();
             }
             if (numChars <= 0) {
                 return -1;
             }
         }
         return buf[curChar++];
     }
public String nextString() {
    int c = read();
    while (isSpaceChar(c)) {
        c = read(); 
    } 
}
    public boolean isSpaceChar(int c) {
        if (filter != null) {
            return filter.isSpaceChar(c);
        }
        return isWhitespace(c);
    }


    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);

    }
} 
	  */
	  }
