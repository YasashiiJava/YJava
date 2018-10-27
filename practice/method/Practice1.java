class Practice1 {
	/* ここにメソッドを実装してね */
	static int mul(int n, int m)  // nとｍを受け取ってかけた値を返すメソッド
	{
		int mul = n * m;
		return mul;  // mulの値を返す
	}

	static void printDouble(int n)
	{
		System.out.println(n + "の2倍は" + n * 2 + "です");
		return;
	}

	public static void main(String[] args) {
		/* 以下でメソッドのテストをする */

		// 15の2倍は30です的な文が出力されればOK
		int result1 = mul(3, 5);
		printDouble(result1);

		// 18782の2倍は37564
		int result2 = mul(1, 18782);
		printDouble(result2);

		// -9の2倍は-18
		int result3 = mul(-3, 3);
		printDouble(result3);

		// 0の2倍は0
		int result4 = mul(0, 0);
		printDouble(result4);
	}
}
