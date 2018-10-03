import java.io.*;

class Practice2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("人数を決めて下さい");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);

		int[] test;
		test = new int[num];  // 人数の確定

		System.out.println("点数を入力してください");  // 配列要素に格納
		for(int i = 0; i <= num - 1; i++) {
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}

		System.out.println("順番を逆にして出力します");
		for(int i = (num - 1); i >= 0; i--) {
			System.out.println((i + 1) + "番目の数は" + test[i] + "です");
		}
	}
}
