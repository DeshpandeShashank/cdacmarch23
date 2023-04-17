

class ElectricityBill {
	private String consumerName;
	private double unitsConsumed;
	private double billAmount;

	ElectricityBill() {
		consumerName = "Shashank Deshpande";
		unitsConsumed = 50;
	}

	// Function to Calculate bill amount
	public void customerBillAmount() {
		double tempUnit = unitsConsumed;
		if (tempUnit < 101) {
			billAmount += tempUnit * 5;
		} else if (tempUnit < 301) {
			tempUnit -= 100;
			billAmount += 500 + tempUnit * 7;
		} else {
			tempUnit -= 300;
			billAmount += 1900 + tempUnit * 10;
		}
	}

	@Override
	public String toString() {
		return "ElectricityBill [consumerName=" + consumerName + ", unitsConsumed=" + unitsConsumed + ", billAmount="
				+ billAmount + "]";
	}

}

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill ebill = new ElectricityBill();
		ebill.customerBillAmount();
		System.out.println(ebill.toString());

	}

}
