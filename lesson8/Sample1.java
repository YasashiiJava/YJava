//車のクラス
class Car //Carの仕様を下記に宣言していく
{
	int num;
	double gas;
}//Carはnumとgusの変数から成り立つ

class Sample1
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car(); //Carクラスのオブジェクトを作成

		car1.num = 1234;
		car1.gas = 20.5; //car1の値を代入

		System.out.println("車のナンバーは" + car1.num + "です");
		System.out.println("ガソリン量は" + car1.gas + "です");
	}
}
