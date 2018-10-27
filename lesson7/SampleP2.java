//①×②×③○

class SampleP2
{
	public static void main(String[] args)
	{
		int[] test;
		test = new int[6];

		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		test[5] = 100;

		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です");
		}
	}
}
