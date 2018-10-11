// 各オブジェクトに値を格納できる
class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました"); //  引数のないコンストラクタ
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "ガソリンの量をガソリンの量を" + gas + "にしました");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + ",ガソリンの量を" + gas + "となりました");
	}
}

class Sample7
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.setCar(1234, 20.5);
		car1.show();

		Car car2 = new Car();
		car2.setCar(4567, 30.5);
		car2.show();
	}
}
