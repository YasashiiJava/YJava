// 中途半端な数字は使わない。
import java.io.*;

class Practice1 {
	public static void main(String[] args) throws IOException {
		System.out.println("成績を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if (res < 60 ){
			System.out.println("不可");
		}
		else if (60 <= res < 70 ){
			System.out.println("可");
		}
		else if (70 <= res < 80 ){
			System.out.println("良");
		}
		else if (80 <= res){
			System.out.println("優");
		}
		else{
			System.out.println("1~100で入力してください");
		}
	}
}
