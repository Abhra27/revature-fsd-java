import java.util.Scanner;

public class BillDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bill amount, discount percentage");
		float billAmount = sc.nextFloat();
		float discountPercentage = sc.nextFloat();
		float discount = (billAmount*discountPercentage) / 100f;
		System.out.printf("%f", discount);
	}

}
