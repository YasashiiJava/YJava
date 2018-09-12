import java.io.*;

class Sample7
{
	public static void main(String[] args) throws IOException{
		System.out.println("あなたは男ですか？");
		System.out.println("YかNで答えてください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		if(res == 'Y' || res == 'y'){
			System.out.println("あなたは男性ですね");
		}
		else if (res == 'N' || res == 'n'){
			System.out.println("おまいはおなご");
		}
		else{
			System.out.println("YかNを入力してください");
		}
	}
}
