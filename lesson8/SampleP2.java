//SampleP1 ①○ ②○ ③×

//車クラス
class Car
{
	int num;
	double gas;

	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました");
	}
	void show()
	{
		System.out.println("車のナンバーは" + num + "にしました");
		System.out.println("にガソリン量は" + gas + "にしました");
	}
}

class SampleP2
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.setNumGas(1234, 20.5);
		car1.show();
	}
}

//SampleP3 イ
//SampleP4 ①○ ②× ③○