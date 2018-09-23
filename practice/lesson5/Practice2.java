import java.io.*;

class Practice2 {
	public static void main(String[] args) throws IOException {
		System.out.println("XとYを入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		int res1 = Integer.parseInt(str1);
		int res2 = Integer.parseInt(str2);

		if ((res1 % res2) == 0 ){
			System.out.println("XはYの倍数です");
		}
		else
			System.out.println("XはYの倍数ではありません");
		}
}
