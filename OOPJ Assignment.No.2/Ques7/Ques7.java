package assignment2;

import java.util.Scanner;

class TollFee
{
	private String vehicleType;
	private int axle;
	private double distanceTravel;
	private double totalFee;
	private double finalAmountDue;
	private final double CAR_VAN_BUS_rate = 0.25;
	private final double TRUCK_rate = 0.5;
	
	Scanner sc= new Scanner(System.in);
	
	public void showMenu()
	{
		int choice=0;
		
		System.out.println("Enter the type of vehicle(Car/Van/Bus/Truck): ");
		vehicleType= sc.next();
		System.out.println("Enter the number of Axles: ");
		axle = sc.nextInt();
		System.out.println("Enter the Distance Travelled: ");
		distanceTravel = sc.nextDouble();
		System.out.println();
		
		while(choice != 3)
		{
		System.out.println("How can i help you...?");
		System.out.println("1. Calculate toll fee.");
		System.out.println("2. Generate Bill.");
		System.out.println("3. Exit.");
		choice= sc.nextInt();
		
		if(choice == 1)
		{
			calculateTollFee();
			System.out.println("Toll Fee: $" + totalFee);
		}
		
		else if(choice == 2)
		{
			generateBill();
			System.out.println("Final Bill: $" + finalAmountDue);
			break;
		}
		else if(choice == 3)
		{
			choice=3;
		}
		else {
			System.out.println("Plese Chose correct Choice!!!");
		}
		
		System.out.println();
		
		}		
	}

	private void calculateTollFee() {
		if(vehicleType.equalsIgnoreCase("Truck"))
		{
			totalFee = axle * TRUCK_rate * distanceTravel; 
		}
		else {
			totalFee = axle * CAR_VAN_BUS_rate * distanceTravel;
		}
	}
	
	private void generateBill() {
		finalAmountDue = totalFee + 2;
	}
}


public class Ques7 {

	public static void main(String[] args) {
		TollFee tollFee = new TollFee();
		tollFee.showMenu();
		System.out.println("Thank you for visiting...");
	}

}
