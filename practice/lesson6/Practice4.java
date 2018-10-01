//入力された数字の分繰り返す→行をnumとnum-2で出力 + Xはi行目のi番目にあるそして斜めも同様にななめに出す。
class Practice4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("好きな数を入力してください");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i < num; i++) {
			System.out.println("");
			for(int j = 1; j <= num +1; j++) {
				if(j == i) {
					System.out.print("X");
				}
				else {
					System.out.print(" ");
				}
			}
		}
	}
}
