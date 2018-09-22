//入力された数字の分繰り返す→行をnumとnum-2で出力
import java.io.*;
class Practice4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("好きな数を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for( int i = 1; i < num; i++){
			if(i == 1 || i == num){
				for(int j = 1; j <= num; j++){
					if(j == 1 || j == num){
						System.out.print("X");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			else{
				
			}
			System.out.println("");
		}
	}
}
