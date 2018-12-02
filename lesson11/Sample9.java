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
 }


 class  Sample9
 {
 	public static void main(String[] args)
 	{
 		Car[] cars;
 		cars = new Car[2];

 		cars[0] = new Car();
 		cars[1] = new RacingCar();

 		for(int i = 0; i < cars.length; i++) {
 			class c1 = cars[i].getClass();
 			System.out.println(( i + 1 ) + "番目のオブジェクトのクラスは" + cl + "です");
 		}
 	}
 }
