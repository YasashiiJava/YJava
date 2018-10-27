class Practice3 {
	static int total(int n) {
		if (n == 1)
			return 1;
		else
			return n + total(n - 1);
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
	}
}
