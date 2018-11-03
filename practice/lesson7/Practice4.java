// ①小乱数を[１００００][１００００]で配列 ②四分円の範囲を求める ③その範囲に点が何個あるのかを数えさせる ③出た面積を半径を比べて円周率を出す

import java.lang.Math;

class Practice4
{
	public static void main(String[] args)
	{
		int numOfPoints = 10000000;
		double[][] points;
		points = new double[numOfPoints][2];

		for(int i = 0; i < numOfPoints; i++) {
			double px = Math.random();
			double py = Math.random();
			points[i][0] = px;
			points[i][1] = py;
		}

		int sum = 0;
		for(int i = 0; i < numOfPoints; i++) {
			double x = points[i][0];
			double y = points[i][1];
			if(x * x + y * y < 1) {
				sum++;
			}
		}

		double app = (double)sum / numOfPoints;
		double pi = app * 4;

		System.out.println("円周率は" + pi + "です");
	}
}

