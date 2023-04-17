
import java.util.Scanner;

class Ques2 {
	private double height;
	private double weight;

	public Ques2(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double calculateBMI() {
		return weight / (height * height);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your height in meters: ");
		double height = input.nextDouble();
		System.out.print("Enter your weight in kilograms: ");
		double weight = input.nextDouble();
		Ques2 calculator = new Ques2(height, weight);
		double bmi = calculator.calculateBMI();
		System.out.println("Your BMI is " + bmi );
	}
}
