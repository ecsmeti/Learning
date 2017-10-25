import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hej {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Enter name:");
		String name = null;

		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			name = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // if user not entered assumes default value.
		System.out.println("Name= " + name);
	}

}
