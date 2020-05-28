import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, i;
		for (i = 1; i <= 10; i++) {
			System.out.print("Enter number " + i + " : ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("Sum = " + sum);
	}
}
