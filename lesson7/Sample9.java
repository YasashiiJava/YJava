import	java.io.*;

class Sample2
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int[] test = new int [5];
		System.out.println(test.length + "人の得点を入力してください");

			for(int i = 0; i < test.length; s++){
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}

			for(int s = 0; s <test.length - 1; s++){
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です");
		}
	}
}

