// switch分を利用する 来週月曜まで
import java.io.*;

class Practice4
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("月を入力して下さい");

		String str = br.readLine();
		int mon = Integer.parseInt(str);

		switch(mon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println(mon + "月は31日までです");
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println(mon + "月は30日までです");
			break;
			case 2:
			System.out.println(mon + "月は28日までです");
			break;
			default:
			System.out.println("月は1~12までです");
			break;
		}
	}
}
