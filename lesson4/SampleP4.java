import java.io.*;

class SampleP4
{
	public static void main(String[] args) throws IOException
   {
   		System.out.println("三角形の底辺と高さを2つ入力してください");

   		BufferedReader br =
   		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);

		System.out.println("結果は" + (num1*num2)/2 + "となりました");

	}


}


