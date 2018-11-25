  // スーパークラスのコンストラクタを指定する
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
}


 // レーシングカークラス
 class RacingCar extends Car
 {
 	private int course;  // フィールド

 	public RacingCar()
 	{
 		course = 0;
 		System.out.println("レーシングカーを作成しました");
 	}
 	public void setCourse(int c)
 	{
 		course = c;
 		System.out.println("コース番号を" + course + "にしました");
 	}
 	public void show()
 	{
 		System.out.println("レーシングカーのナンバーは" + num + "です");
 		System.out.println("レーシングカーのガソリン量は" + gas + "です");
 		System.out.println("コース番号は" + course	+ "です");
 	}
 }


class  Sample4
 {
 	public static void main(String[] args)
 	{
 		RacingCar rccar1;
 		rccar1 = new RacingCar();

 		rccar1.setCar(1234, 20.5);
 		rccar1.setCourse(5);

 		rccar1.show();
 	}
 }