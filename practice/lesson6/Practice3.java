// while文を使って1000以下で、直前足す今の数のループ分を作ればいい

class Practice3
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 1;
		int num = i + sum;
		System.out.print('1'+ ", ");
		do{
			System.out.print(num + ", ");
			i = sum;
			sum = num;
			num = (i + sum);
		}while(num < 1000);
	}
}
