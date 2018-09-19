class Practice3 {
	public static void main(String[] args) {
		int a = 1; // 2つ前の項の値を格納する変数
		int b = 1; // 1つ前の項の値を格納する変数
		int c;     // 各ループで新しく求めた項の値を格納する変数
		
		do {
			/* フィボナッチ数列の新しい項を求める */
			c = a + b;
			
			/* 次のループに備えてa, bの値を更新する */
			a = b;
			b = c;
			
			/* 求めた項の値を出力する */
			System.out.print(c + ", ");
		} while (c < 1000);
	}
}
