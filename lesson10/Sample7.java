// car1への代入はcar2と根が同じ
class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にします");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリンの量は" + gas + "です");
	}
}


class Sample7
{
	public static void main(String[] args)
	{
		Car car1;
		System.out.println("car1を宣言しました");
		car1 = new Car();
		car1.setCar(1234, 20.5);

		Car car2;
		System.out.println("car2を宣言しました");

		car2 = car1; //  同じクラスの型なら代入できる
		System.out.println("car2にcar1を代入しました");

		System.out.print("car1がさす");
		car1.show();
		System.out.println("car2がさす");
		car2.show();

		System.out.println("car1がさす車に変更を加えます");
		car1.setCar(2345, 30.5);

		System.out.print("car1がさす");
		car1.show();
		System.out.println("car2がさす");
		car2.show();
	}
}
