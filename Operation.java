package codeWithAljune;
import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
		
        Scanner Input = new Scanner(System.in);
		
		int input1, input2, input3, operator;
		int A , B, C, D;
		
		System.out.print("First Number: ");
		input1 = Input.nextInt();
				
		System.out.print("Second Number: ");
		input2 = Input.nextInt();
		
		System.out.println(" ");
		System.out.println("Operation: ");
		
		System.out.println("A : Addition");
		System.out.println("B : Subtraction");
		System.out.println("C : Multiplication");
		System.out.println("D : Division");
		
		System.out.println(" ");
		System.out.print("Choose Operation: ");
		
		operator = 0;
		switch (operator)
		{
		case 1: A = input1 + input2;
		break;
		case 2: B = input1 - input2;
		break;
		case 3: C = input1 * input2; 
		break;
		case 4: D = input1 / input2;
		break;
		}
		System.out.println(operator); 
		input3 = Input.nextInt();
	}

}
	

