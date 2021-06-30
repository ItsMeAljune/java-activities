package codeWithAljune;
import java.util.Scanner;
public class quotientAndRemaider {

	public static void main(String[] args) {
		
		int dividend, divisor, quotient, remainder;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the dividend: ");
		dividend = sc.nextInt();
		
		System.out.print("Input the divisor: ");
		divisor = sc.nextInt();
		
		quotient = dividend / divisor;
		remainder = dividend % divisor;
		
		System.out.println("Quotient: "+quotient);
		System.out.println("Remainder: "+remainder);
		
		
	}

}
