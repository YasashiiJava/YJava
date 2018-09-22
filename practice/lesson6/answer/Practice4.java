import java.io.*;

class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Input size
		System.out.print("Size: ");
		int size = Integer.parseInt(br.readLine());
		
		// Show X-mark
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == i || j == size - i + 1)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
