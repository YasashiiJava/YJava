class SampleP1 {
	public static void main(String[] args) {
		int n = 10;

		System.out.println("1～" + n + "までの偶数を出力します．");

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
}
