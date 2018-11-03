 //  文字を逆にする
import java.io.*;
class SampleP2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("文字を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine(); // 入力された文字を保存

		StringBuffer rev = new StringBuffer(str1);
		rev.reverse(); //  strを逆順させる
		System.out.println(str1 + "を逆に変換すると" + rev + "です");
	}
}
