class Car
{
	protected int num;
	protected double gas;

	public Car()  // 引数のない場合のコンストラクタ
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public Car(int n, double g)  // 引数のあるコンストラクタ
	{
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "に、" + gas + "の車を作成しました");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "に、ガソリン量を" + gas + "に設定しました");
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリン量は" + gas + "です");
	}
	public String toString()
	{
		return "ナンバー:" + num + "ガソリン:" + gas + "の車";
	}
}


class  SampleP4
 {
 	public static void main(String[] args)
 	{
 		Car car1 = new Car(1234, 20.5);
 		System.out.println(car1);
 	}
 }