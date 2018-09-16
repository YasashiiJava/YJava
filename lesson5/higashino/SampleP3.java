import java.io.*;

class SampleP3 {
	public static void main(String[] args) throws IOException {
		System.out.println("Input 2 numbers.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		if (a == b)
			System.out.println("The two inputs are equal.");
		else if (a < b)
			System.out.println(b + " is greater than " + a + ".");
		else
			System.out.println(a + " is greater than " + b + ".");
	}
}
