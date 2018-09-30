//車クラス
class Car
{
	int num;
	double gas;

	int getNum()//intの数字を返すメソッド
	{
		System.out.println("ナンバーを調べました");
		return num;
	}
	double getGas()//doubleを返すメソッド
	{
		System.out.println("ガソリンの量を調べました");
		return gas;
	}
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車のナンバーは" + num + "ガソリンの量は" + gas + "になりました");
	}
	void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリンの量は" + gas + "です");
	}
}

class Sample6
{
	public static void main(String[] args)
	{
		Car car1 = new Car();

		car1.setNumGas(1234, 20.5);

		int number = car1.getNum();//numが返り値
		double gasoline = car1.getGas();//gasが返り値

		System.out.println("サンプルから車を調べたところ");
		System.out.println("ナンバーは" + number + "ガソリンの量は" + gasoline + "です");
	}
}
