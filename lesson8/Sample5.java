//車クラス
class Car
{
	int num;
	double gas;

	void setNumGas(int n, double g)//2つの因数をもつメソッド
	{
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "に、ガソリンの量は" + gas + "です");
	}
	void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリン量は" + gas + "です");
	}
}

class Sample5
{
	public static void main(String[] args)
	{
		Car car1 = new Car();

		int number = 1234;
		double gasoline = 20.5;

		car1.setNumGas(number, gasoline);//setNumGasメソッドのn,gに代入されて実行されている。
	}
}
