 //  文字を逆にする
import java.io.*;
class SampleP2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("文字を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringBuffer rev = new StringBuffer.reverse(str); //  strを逆順させる
		System.out.println(str + "を逆に変換すると" + rev + "です");
	}
}
