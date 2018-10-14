// クラス型の変数を使える
class Car
{
	private int num;
	private double gas;
	private String name; // string型の引数

	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "名無し";
		System.out.println("車を作成しました");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "に設定しました");
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("車の名前はは" + name + "です");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリンの量は" + gas + "です");
		System.out.println("名前は" + name + "です");
	}
}

class Sample8
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();

		car1.show();

		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";

		car1.setCar(number, gasoline);
		car1.setName(str);

		car1.show();
	}
}
