import java.io.*;

class SampleP5
{
	public static void main(String[] args) throws IOException
   {
   		System.out.println("身長と体重を入力してください");

   		BufferedReader br =
   		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		System.out.println("身長は" + num1 + "です");
		System.out.println("体重は" + num2 + "です");

	}	


}


