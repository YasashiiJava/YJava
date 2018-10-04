//章クラス
class Car
{
	private int num;
	private double gas;

	public void setNumGas(int n, double g) // publicはクラスの外から干渉できる
	{
		if(g > 0 && g < 1000) {
			num = n;
			gas = g;
			System.out.println("ナンバーを" + num + "に、ガソリン量を" + gas + "にしました");
			}
		else {
			System.out.println(g + "は正しい量ではありません");
			System.out.println("変更できませんでした");
			}
	}
	public void show()
	{
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリン量は" + gas + "です");
	}
}



class Sample2
{
	public static void main(String[] args)
	{
		Car car1 = new Car();

		//  このようなアクセスは出来なくなります
		//  car1.num = 1234;
		//  car1.gas = -10.0;

		car1.setNumGas(1234, 20.5);
		car1.show();

		System.out.println("正しくないガソリン量を入れてみます");

		car1.setNumGas(1234, -10.0);
		car1.show();
	}
}
