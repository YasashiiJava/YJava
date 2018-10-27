 //  文字をついかする
import java.io.*;
class SampleP3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("文字を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();  // 入力された文字を保存

		System.out.println("追加する文字を選んでください");
		String str2 = br.readLine();

		System.out.println("何番目に" + str2 + "を代入しますか？");
		String str3 = br.readLine();
		int num = Integer.parseInt(str3);

		StringBuffer inse = new StringBuffer(str1);
		inse.insert(num, str2);
		System.out.println(str1 + "の" + num + "番目に" + str2 +"をたしたのは" + inse + "です");
	}
}
