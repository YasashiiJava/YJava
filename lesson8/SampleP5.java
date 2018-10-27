//座標のクラス
class MyPoint
{
	int x;
	int y;
	//MyPointは上記の2つのフィールドから成り立つ

	int getX()
	{
		System.out.println("X座標を得ます");
		return x;
	}
	int getY()
	{
		System.out.println("Y座標を得ます");
		return y;
	}
	void setXY(int px, int py)  // メソッドを2つに分けるように修正
	{
		x = px;
		y = py;
		System.out.println("X座標とY座標の出力準備をします");
	}
}

class SampleP5
{
	public	static void main(String[] args)
	{
		MyPoint point1 = new MyPoint();
		point1.setXY(5, 10);

		int xx = point1.getX();
		int yy = point1.getY();

		System.out.println("X座標は" + xx + ":Y座標は" + yy + "です");
	}
}
