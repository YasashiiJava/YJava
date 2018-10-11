// クラス変数、メソッドの作成
class Car
{
	public static int sum = 0;  // クラス変数

	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("車を作成しました");
	}
	public void setCar(int num, double g)
	{
		this.num = num;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました");
	}
	public static void showSum()  // クラスメソッド
	{
		System.out.println("車は全部で" + sum + "台あります");
	}
	public void show()
	{
	System.out.println("ナンバーは" + num + ",ガソリン量は" + gas + "です");
	}
}


class Sample8
{
	public static void main(String[] args)
	{
		Car.showSum();

		Car car1 = new Car();
		car1.setCar(1234, 20.5);

		Car.showSum();

		Car car2 = new Car();
		car2.setCar(4567, 30.5);
		Car.showSum();
	}
}
