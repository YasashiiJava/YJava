class Practice4 {
	/* ここにメソッドを実装してね */
	static int fibonacci(int n)  // n番目の項の数値を出すメソッド
	// フィボナッチ数列は前々項と前項を足したもの
	// n項はn-1 + n-2
	{
		if (n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		/* 以下でメソッドのテストを行う */

		// fibonacci(1) = 1
		System.out.println("fibonacci( 1) = " + fibonacci(1));

		// fibonacci(2) = 1
		System.out.println("fibonacci( 2) = " + fibonacci(2));

		// fibonacci(3) = 2
		System.out.println("fibonacci( 3) = " + fibonacci(3));

		// fibonacci(4) = 3
		System.out.println("fibonacci( 4) = " + fibonacci(4));

		// fibonacci(7) = 13
		System.out.println("fibonacci( 7) = " + fibonacci(7));

		// fibonacci(10) = 54
		System.out.println("fibonacci(10) = " + fibonacci(100));
	}
}
