import	java.io.*;

class SampleP2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("点数を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int sum = 0;
		while(num >= 1){
			sum += num;
			str = br.readLine();
			num = Integer.parseInt(str);
		}
		System.out.println("合計は" + sum + "です");
	}
}
