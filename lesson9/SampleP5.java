//座標のクラス
class MyPoint
{
	private int x;
	private int y;
	//MyPointは上記の2つのフィールドから成り立つ

	public void Mypoint()
	{
		x = 0;
		y = 0;
		System.out.println("初期座標を" + x + "." + y + "にします");
	}

	public int getX()
	{
		System.out.println("X座標を得ます");
		return x;
	}
	public int getY()
	{
		System.out.println("Y座標を得ます");
		return y;
	}
	public void setX(int px)  // メソッドを2つに分けるように修正
	{
		if(0 <= px && px <= 100) {
			x = px;
			System.out.println("X座標の出力準備をします");
		}
		else {
			System.out.println("０～１００で入力してね");
		}
	}
	public void setY(int py)  // メソッドを2つに分けるように修正
	{
		if(0 <= py && py <= 100) {
			y = py;
			System.out.println("Y座標の出力準備をします");
		}
		else {
			System.out.println("０～１００で入力してね");
		}
	}
}

class SampleP5
{
	public	static void main(String[] args)
	{
		MyPoint point1 = new MyPoint();
		point1.setX(5);
		point1.setY(10);

		int v = point1.getX();
		int w = point1.getY();

		System.out.println("X座標は" + v + ":Y座標は" + w + "です");
	}
}

