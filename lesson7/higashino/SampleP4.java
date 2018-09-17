import java.io.*;

class SampleP4 {
	public static void main(String[] args) throws IOException {
		System.out.println("5人のテストの点数を入力してください．");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 5人の点数を格納しておく配列を用意する */
		int[] scores = new int[5];
		
		/* 5人の点数を順番に配列に格納していく */
		for (int i = 0; i < scores.length; i++) { // "i < 5" でも良いが，人数が変わったときに対応しやすいようにscores.lengthを使った
			scores[i] = Integer.parseInt(br.readLine());
		}
		
		/* 5人の点数を順番に出力していく */
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + "番目の人の点数： " + scores[i]);
		}
		
		/* 最高点を求める */
		int highscore = 0; // まずは最高点を保存する変数を用意
		for (int i = 0; i < scores.length; i++) {
			if (highscore < scores[i])
				highscore = scores[i];
		}
		
		/* 最高点を出力する */
		System.out.println("最高点は" + highscore + "点です．");
	}
}
