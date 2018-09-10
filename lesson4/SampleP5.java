import java.io.*;

class SampleP5
{
	public static void main(String[] args) throws IOException
   {
   		System.out.println("科目1~5の点数を入力してください");

   		BufferedReader br =
   		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		int num4 = Integer.parseInt(str4);
		int num5 = Integer.parseInt(str5);

		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;

		System.out.println("合計点は" + sum + "となりました");
		System.out.println("平均点は" + sum/5.0 + "となりました");
	}
}
