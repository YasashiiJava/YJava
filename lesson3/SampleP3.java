import java.io.*;

class SampleP3
{
	public static void main(String[] args) throws IOException
   {
   		System.out.println("私がこの世に生を受けて");

   		BufferedReader br =
   		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int num = Integer.parseInt(str);

		System.out.println(num + "年の月日がたった");


}


}

