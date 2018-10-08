class Car
{
	public static int sum = 0;

	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("車を作成しました");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "に、ガソリン量は" + gas + "にしました");
	}
	public static void showSum()
	{
		System.out.println("車は全部で" + sum + "台あります");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "で、ガソリン量は" + gas + "です");
	}
}

class SampleP2
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.setCar(1234, 20.5);

		Car.showSum();
		car1.show();
	}
}
