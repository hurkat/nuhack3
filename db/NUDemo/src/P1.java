import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class P1 {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter data ");
		String str = br.readLine();
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println(str);
		pw.close();
		System.out.println("Data Written");
	}
}
