//車のクラス
class Car
{
	int num;
	double gas;

	void show()//表示させるメソッド
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリンの量は" + gas + "です");
	}
}


//実際に実行されるクラス
class Sample2
{
	public static void main(String[] args)
	{
		Car car1;//Carクラスに使うcar1という名前の変数の箱を用意する。
		car1 = new Car();//クラスCarに対応した数を代入する。

		car1.num = 1234;
		car1.gas = 20.5;

		car1.show();
		car1.show();
	}
}
