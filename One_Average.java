import java.util.Scanner;

public class One_Average {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int [] num = new int[8];

		System.out.println("Input 8 numbers");
		double t =0;
		
		for(int i=0; i<num.length; i++) {

			num[i] = scanner.nextInt();
			t=num[i]+t;

		}
		double ave = t/num.length;

		System.out.println(ave);

		scanner.close();
	}

}
