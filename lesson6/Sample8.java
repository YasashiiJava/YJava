class Sample8
{
	public static void main(String[] args)
	{
		boolean bl = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(bl)
					System.out.print("-");
				else
					System.out.print("*");
				bl = !bl;
			}
			System.out.println();
		}
	}
}
