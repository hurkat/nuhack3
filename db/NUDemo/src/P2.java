import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		System.out.println("Hello " + str);

	}
}
