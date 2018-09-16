import java.io.*;

class SampleP5
{
	public static void main(String[] args) throws IOException{
		System.out.println("貴様の成績を入力してみろ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
				System.out.println("明日があるよ");
				break;
		    case 2:
				System.out.println("やる気スイッチ押そうか");
				break;
			case 3:
				System.out.println("本気出せよ");
				break;
			case 4:
				System.out.println("流石だぜ");
				break;
			case 5:
				System.out.println("お前はやれる奴だと思っていたよ");
				break;
		}
	}
}
