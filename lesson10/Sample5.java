//コンストラクタをオーバーロードする
class Car
{
	private int num;
	private double gas;

	public Car() //  引数を持たないコンストラクタ
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public Car(int n, double g) //  引数を一つ持つコンストラクタ
	{
		num = n;
		gas = g;
		System.out.println("車のナンバーが" + num + "ガソリンの量は" + gas + "の車を作りました");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + ",ガソリンの量は" + gas + "です");
	}
}


class Sample5
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.show();

		Car car2 = new Car(1234, 20.5);
		car2.show();
	}
}
