import java.io.*;

class Sample10
{
	public static void main(String[] args) throws IOException{
		System.out.println("成績を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
		    case 2:
			System.out.println("ファイト");
			break;
			case 3:
		    case 4:
			System.out.println("やるやん");
			break;
			 case 5:
			System.out.println("天才か");
			break;
			default:
			System.out.println("１～５までで入力してください");
			break;
		}
	}
}
