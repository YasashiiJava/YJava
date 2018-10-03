import java.io.*;

class Practice3 {
	public static void main(String[] args) throws IOException {
		/* 九九の表を保存する二次元配列を用意 */
		int[][] kuku = new int[9][9];

		/* 表の中身を作る */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				// hogehoge
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		/* 2つの数字（1 ~ 9）を入力して，掛け算した値を表示する */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// piyopiyo
		System.out.println("かける数とかけられる数を入力してください");

		String str1 = br.readLine();
		String str2 = br.readLine();
		i = Integer.parseint(str1);
		j = Integer.parseint(str2);

		System.out.println(i + "かける" + j + "は" + kuku[i][j] + "です");

	}
}
