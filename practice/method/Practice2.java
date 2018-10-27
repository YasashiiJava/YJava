class Practice2 {
	/* ここにメソッドを実装してね */
	static int total(int n)
	{
		int sum = 0;

		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		/* 以下でメソッドのテストをする */

		// total(5) = 15
		System.out.println("total(5) = " + total(5));

		// total(1) = 1
		System.out.println("total(1) = " + total(1));

		// total(10) = 10
		System.out.println("total(10) = " + total(10));

		// total(100) = ???
		System.out.println("total(100) = " + total(100));
		System.out.println("total(976865) = " + total(976865));
	}
}
