import java.util.Scanner;

public class IsWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter short name");
		String S=sc.nextLine();
		if(S.length()>=6 | S.length()<=2)
		{
			System.out.println("Invalid short name");
		}
		else if(S.length()<6 && S.length()>2)
		{
			System.out.println("Valid short name");
		}

	}

}
