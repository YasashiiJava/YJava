import java.io.*;
import java.util.Random;

class Practice5 {
	public static void main(String[] args) throws IOException {
		/* 答えとなる数字を乱数で決める */
		Random rnd = new Random();
		int ans = rnd.nextInt(10);  // ans: answerの略

		/***** 以下，自分で実装せよ *****/

		System.out.println("game start!");

		// 入力の指示を出す
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// for iで5回の入力
		for(int i = 1; i <= 5; i++) {
			System.out.print("input;0~9  ");
			String str = br.readLine();
			int inp = Integer.parseInt(str);

			if(ans == inp) {
				System.out.println("you win!!");
				break;
			}
			else if(i == 5) {
				System.out.println("you lose...");
			}
			else {
				System.out.println("Your Input is Different!");
			}
		}
		System.out.println("Thank you for playing!");
	}
}
