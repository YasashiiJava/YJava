import java.io.*;

class SampleP3
{
	public static void main(String[] args)
	{
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[0])));

			pw.println("A long time ago,\nthere was a little girl");
			System.out.println("ファイルに書き込みました");

			pw.close();
		} catch(IOException e) {
			System.out.println("入出力エラーです");
		}
	}
}
