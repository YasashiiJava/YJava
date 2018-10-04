// 車クラス
class Car
{
	int num;
	double gas;

	void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリンの料は" + gas + "です");
	}
}

class Sample1
{
	public static void main(String[] args)
	{
		Car car1 = new Car(); //変数car1がCarクラスのオブジェクトとして生成され、newの結果がcar1に代入される

		car1.num = 1234;
		car1.gas = 20.5;

		car1.show(); // メソッドを呼び出す
	}
}
