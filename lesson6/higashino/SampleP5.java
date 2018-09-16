
import java.io.*;

class SampleP5 {
	public static void main(String[] args) throws IOException {
		System.out.println("2以上の整数を入力してください．");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int target = Integer.parseInt(br.readLine());

		boolean isPrime = true;
		for (int i = 2; i <= target / 2; i++) {
			if (target % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime)
			System.out.println(target + "は素数です．");
		else
			System.out.println(target + "は素数ではありません．");
	}
}
