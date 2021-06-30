package codeWithAljune;
import java.util.Scanner;
public class leafYear {

	public static void main(String[] args) {
		
	    int year;
	    boolean leap = false;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Input Year to calculate: ");
	    year = sc.nextInt();

	    if (year % 4 == 0) {

	      if (year % 100 == 0) {

	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      else
	        leap = true;
	    }
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");

	}

}
