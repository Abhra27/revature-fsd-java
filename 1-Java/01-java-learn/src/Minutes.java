import java.util.Scanner;

public class Minutes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time in hh:mm:ss format:\n");
		String S = sc.nextLine();
		System.out.println("Minute is: "+S.substring(3, 5));

	}

}
