package codeWithAljune;
import java.util.Scanner;
public class SumOfAllPositiveNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a positive number: ");
		int positiveNumber = sc.nextInt();
		
		for (int looplimit = 1;looplimit <= positiveNumber ;looplimit++) {
		System.out.print(looplimit + "+ ");
	
		}

	}

}
