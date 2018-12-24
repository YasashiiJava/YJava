class Car implements Runnable
{
	private String name;

	public Car(String nm)
	{
		name = nm;
	}
	public void run()
	{
		for(int i = 0; i < 5; i++) {
			System.out.println(name + "の処理をしています");
		}
	}
}

class SampleP2
{
	public static void main(String[] args)
	{
		Car car1 = new Car("１号車");
		Thread th1 = new Thread(car1);
		th1.start();

		Car car2 = new Car("２号車");
		Thread th2 = new Thread(car2);
		th2.start();

		for(int i = 0; i < 5; i++) {
			System.out.println("main()の処理をしています");
		}
	}
}
