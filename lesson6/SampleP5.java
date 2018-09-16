import	java.io.*;

class SampleP5
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("2以上の整数を入力してください？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		while(num>2){
			num = num/2;
			if((num % 2 ) == 1);
			System.out.println(num + "は素数です");
		}
	}
}
