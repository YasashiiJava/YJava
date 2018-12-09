import java.io.*;

class SampleP3

{
	public static void main(String[] args)
	{
		if(args.length ! = 1) {
			System.out.println("ファイル名を正しく指定してください")
			System.exit(1);
		}
		try {
			 BufferedReader br = new BufferedReader(new FileReader(args[0]));
			 
			}
			catch(IOException e) {
				System.out.println("入出力エラーです");
		}
	}
}
