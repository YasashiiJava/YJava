import java.io.*;

class SampleP4
{
	public static void main(String[] args) throws IOException
   {
   		System.out.println("三角形の底辺と高さを2つ入力してください");

   		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		System.out.println("結果は" + (num1*num2)/2.0 + "となりました");
	}
}
