class Sample5
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;

		b = ++a;

		System.out.println("代入前にインクリメントしたのでbの値は" + b + "です");
		System.out.println("aの値は" + a + "です");
	}
}
