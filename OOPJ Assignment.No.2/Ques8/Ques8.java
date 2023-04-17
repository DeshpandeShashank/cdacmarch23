package assignment2;

import java.util.Scanner;

class Realtional
{
	private int num1;
	private int den1;
	private int num2;
	private int den2;
	private String operator;	
	int numResult = 0, denResult = 0;
	
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numerator of 1st No.: ");
		num1 = sc.nextInt();
		System.out.println("Enter the Denominator of 1st No.: ");
		den1 = sc.nextInt();
		System.out.println("Enter the Numerator of 2nd No.: ");
		num2 = sc.nextInt();
		System.out.println("Enter the Denominator of 2nd No.: ");
		den2 = sc.nextInt();
		
		System.out.println("Enter the arithmetic operation (+, -, *, /): ");
		operator = sc.next();
		
		switch (operator) {
		case "+": 
		{
			numResult = num1 * den2 + num2 * den1;
            denResult = den1 * den2;
            find(findGCD(numResult, denResult));
            break;
		}
		case "-": 
		{
			numResult = num1 * den2 - num2 * den1;
            denResult = den1 * den2;
            find(findGCD(numResult, denResult));
            break;
		}
		case "/": 
		{
			 numResult = num1 * den2;
             denResult = den1 * num2;
             find(findGCD(numResult, denResult));
             break;
		}
		case "*": 
		{
			numResult = num1 * num2;
            denResult = den1 * den2;
            find(findGCD(numResult, denResult));
            break;
		}
		
		default:System.out.println("Enter the correct Choice: ");
			
		}
	}
	
	private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return findGCD(b, a % b);
        }
    }
	
	private void find(int gcd)
	{
    numResult /= gcd;
    denResult /= gcd;
    
    // Output the result
    System.out.println("Result: " + numResult + "/" + denResult);
	
	}
}

public class Ques8 {

	public static void main(String[] args) {
		Realtional rel = new Realtional();
		rel.mainMenu();

	}

}
