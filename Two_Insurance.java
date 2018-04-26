import java.util.Scanner;
public class Two_Insurance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input your age");
		int age = scanner.nextInt();

		if(age < 18) {
			System.out.println("Category: Minor");
		}

		else if(age >= 18 && age <= 38) {

			System.out.println("Please enter you weight");
			int weight = scanner.nextInt();

			if(weight <= 200) {
				System.out.println("Category: Healthy");
			}
		}

		else if (age >= 39 && age <= 58 ) {

			System.out.println("Please enter your yearly income");
			int income = scanner.nextInt();

			if(income > 50000) {
				System.out.println("Catergory: Low-Risk");
			}
		}
		else if (age >= 59) {
			System.out.println("Catergory: High-Risk");

		}

		scanner.close();

	}

}
