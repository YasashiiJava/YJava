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

import java.lang.Math;

class Practice4
{
	public static void main(String[] args)
	{
		int numOfPoints =100000;  // 点を10000個用意する
		double[][] points; // 配列の箱を用意
		points = new.double[numOfPoints][2];  // 箱の数を指定

		for(i = 0; i < 10000; i++) {
			double px = Math.random(); //乱数を発生させて代入
			double py = Math,random();
			points[i][0] = px  // 配列の表にx座標を入れていく
			points[i][1] = py
		}
		int sum = 0; // 数を数える変数を用意
		for(int i = 0; i < numOfPoints; i++) {  //それぞれの数が原点からの範囲内かどうかを確認
			double x = points[i][0];
			double y = points[i][1];
			if(x * x + y * y < 1 * 1) {//三平方の定理、ｘの二乗とｙの2条を足さした数字が、半径1の二乗より小さければ範囲内
			sum++
			}
		}
		double app = (double)sum / numOfPoints;  // sumは範囲内の個数だから全ての点に対する割合を出す
		double pi = app * 4; // 半径１＊１＊πがappだからπがでる
	}
}
