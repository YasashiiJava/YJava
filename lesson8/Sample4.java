//車クラス
class Car
{
	int num;
	double gas;

	void setNum(int n)//intの値をメソッド内に入れる
	{
		num = n;
		System.out.println("ナンバーを" + num + "にしました");
	}
	void setGas(double g)//doubleの値をメソッド内に入れる
	{
		gas = g;
		System.out.println("ガソリンの量は" + gas + "にしました");
	}
	void show()
	{
		System.out.println("車のナンバーは" + num + "です");
	}
}

class Sample4
{
	public static void main(String[] args)  // 引数をを持つメソッドと同じ
	{
		Car car1 = new Car();

		car1.setNum(1234);//setNumのメソッドが動く
		car1.setGas(20.5);//setGasのメソッドが動く
	}
}
