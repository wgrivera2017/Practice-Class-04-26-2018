import java.util.Scanner;
public class Three_EvenArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int [] num = new int[5];

		System.out.println("Please enter 5 numbers");


		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();

		}

		for(int z = 0; z<num.length; z++)
			if(num[z]%2==0) {
				System.out.println(num[z]);
			}

		scanner.close();
	}

}
