 class Sample3
   // finally
{
	public static void main(String[] args)
	{
		try {
			int[] test;
			test = new int[5];
			System.out.println("test[10]に値を代入します");

			test[10] = 80;  //例外が出るthrow
			System.out.println("test[10]の80を代入しました");
			System.out.println("無事終了しました");
		}
		catch(ArrayIndexOutOfBException e) {
			System.out.println("配列の要素をこえています");
		}
		finally {
			System.out.println("最後に必ずこの処理をします");
		}
		System.out.println("無事終了しました");
	}
}
