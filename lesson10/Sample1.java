//  char メソッドと lengthメソッド
class Sample1
{
	public static void main(String[] args)
	{
		String str = "Hello";

		char ch1 = str.charAt(0);  // strという変数から１番目の文字を取り出すメソッド
		char ch2 = str.charAt(1);  // 2番目の文字を取り出すメソッド

		int len = str.length();  // 文字列の長さを返すメソッド

		System.out.println(str + "の1番目の文字は" + ch1 + "です");
		System.out.println(str + "の2番目の文字は" + ch2 + "です");

		System.out.println(str + "の長さは" + len + "です");
	}
}
