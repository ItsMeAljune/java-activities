package codeWithAljune;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		int fTerm = 0, sTerm = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the fibonacci series limit: ");
		int limit = scanner.nextInt();
		
		while(fTerm <= limit) {
			System.out.print(fTerm + ", ");
			
			int nTerm = fTerm + sTerm;
			fTerm = sTerm; sTerm = nTerm;
		}
		
	}

}
