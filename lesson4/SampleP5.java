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

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);
		double num4 = Double.parseDouble(str4);
		double num5 = Double.parseDouble(str5);

		System.out.println("合計点は" + (num1+num2+num3+num4+num5) + "となりました");
		System.out.println("平均点は" + (num1+num2+num3+num4+num5)/5 + "となりました");

	}	


}


