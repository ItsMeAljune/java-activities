package codeWithAljune;
import java.util.Scanner;
public class simpleCalculatorUsingSwitch {

	public static void main(String[] args) {
		
		int total = 0, fInput,sInput;
		char operator = 0;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("First number: ");
			fInput = sc.nextInt();
			System.out.print("Second number: ");
			sInput = sc.nextInt();
			System.out.print("Choose Operator: ");
			operator = sc.next().charAt(operator);
			
			switch (operator){
			case '+' : total = fInput + sInput;
			System.out.print(total);
			break;
			case '-' : total = fInput - sInput;
			System.out.print(total);
			break;
			case '*' : total = fInput * sInput;
			System.out.print(total);
			break;
			case '/' : total = fInput / sInput;
			System.out.print(total);
			break;
			}
		

	}

}
