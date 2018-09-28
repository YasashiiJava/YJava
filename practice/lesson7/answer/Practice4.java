import java.lang.Math;

class Practice4 {
	public static void main(String[] args) {
		/* 必要なものを用意 */
		int numOfPoints	= 10000;
		int[][] points = new int[numOfPoints][2];
		
		/* 点を配置していく */
		for (int i = 0; i < numOfPoints; i++) {
			/* 点の生成 */
			double x = Math.random();  // x座標
			double y = Math.random();  // y座標
			
			/* pointsに保存 */
			points[i][0] = x;
			points[i][1] = y;
		}
		
		/* 四分円の内側の点をカウントしていく */
		int count = 0;
		for (int i = 0; i < numOfPoints; i++) {
			/* 点を取り出す */
			double x = points[i][0];
			double y = points[i][1];
			
			/* 四分円の内側にあるかどうかを判定する */
			if (x^2 + y^2 < 1)
				count++;
		}
		
		/* カウントした結果から，円周率の近似値を求める */
		double pi = 4 * count / numOfPoints;
		
		/* 結果を出力する */
		System.out.println("円周率： " + pi);
	}
}
