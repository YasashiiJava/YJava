// 車クラス
class Car
{
	private int num;
	private double gas;

	//  各々の方に対応捨て代入されていく

	public void setCar(int n) //  int型の引数を持つ
	{
		num = n;
		System.out.println("ナンバーを" + num + "にしました");
	}
	public void setCar(double g) //  double型の引数を持つ
	{
		gas = g;
		System.out.println("ガソリン量を" + gas + "に設定しました");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "に、ガソリンを" + gas + "にしました");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリンのナンバーは" + gas + "です");
	}
}

class Sample3
{
	public static void main(String[] args)
	{
		Car car1 = new Car();

		car1.setCar(1234, 20.5);
		car1.show();

		System.out.println("車のナンバーだけを表示しします");
		car1.setCar(2345);
		car1.show();

		System.out.println("ガソリン量だけを表示しします");
		car1.setCar(30.5);
		car1.show();
	}
}
