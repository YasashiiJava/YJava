import java.io.*;

class Practice2 {
	public static void main(String[] args) throws IOException {
		System.out.println("XとYを入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("x: ");
		String str1 = br.readLine();
		System.out.print("y: ");
		String str2 = br.readLine();
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);

		if ((x % y) == 0 ){
			System.out.println("XはYの倍数です");
		}
		else{
			System.out.println("XはYの倍数ではありません");
		}
	}
}
