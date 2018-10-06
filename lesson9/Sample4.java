// コンストラクタはオブジェクトを作成したときに自動的に処理が行われる
class Car
{
	private int num;
	private double gas;

	public Car() //  コンストラクタ部分
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリンの量は" + gas + "です");
	}
}


class Sample4
{
	public static void main(String[] args)
	{
		Car car1 = new Car(); //  ここでコンストラクタが作動

		car1.show();
	}
}
