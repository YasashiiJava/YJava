import java.io.*;

class SampleP4
{
	public static void main(String[] args) throws IOException{
		System.out.println("整数を1から10で入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res > 0 && res < 11){
			System.out.println( res + "が入力されました");
		}
		else
			System.out.println("1から10で入力な");
		}
	}
