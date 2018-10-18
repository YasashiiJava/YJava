 //  文字を逆にする
import java.io.*;
class SampleP5
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("文字を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine(); // 入力された文字を保存
		System.out.println("追加する文字を入力してください");
		String str2 = br.readLine();

		StringBuffer app = new StringBuffer(str1);
		app.append(str2);

		System.out.println(str1 + "に" + str2 +"を追加すると" + app + "です" );
	}
}
