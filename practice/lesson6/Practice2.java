// 入力を読み取る機能を付けてiの右側を定数から変数に帰る。
import java.io.*;
class Practice2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("好きな数を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for( int i = num; i < num*10; i=(i+num)){
			System.out.print(i + "\t");
		}
	}
}
