import	java.io.*;

class SampleP5
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("2以上の整数を入力してください？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		boolean isPrime = true;
		for(int i=2; i<num; i++){
			if(num % i == 0){
				isPrime = false;
				break;
			}
		}

		if(!isPrime)
			System.out.println(num + "は素数じゃないです");
		else
			System.out.println(num + "は素数です");
	}
}
