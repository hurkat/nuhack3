import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter Name " + i + " : ");
			String name = sc.next();
			System.out.println("Hello "+name);
		}
	}
}
