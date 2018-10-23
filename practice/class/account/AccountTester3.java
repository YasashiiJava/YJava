// 銀行口座クラス【第3版】とそれをテストするクラス

// 銀行口座クラス【第3版】
/******************* ここにクラス設計を記述 *******************/
class Account
{
	private String name;
	private String no;
	private int balance;

	public Account(String n, String	num, int z)  // 静的
	{
	 	name = "口座名義";
		no = "口座番号";
		balance = 0;

		name = n;
		no = num;
		balance = z;

	}
	public String getName()  // 動的
	{
		return name;
	}
	public String getNo()  // 動的
	{
		return no;
	}
	public int getBalance()  // 動的
	{
		return balance;
	}
	public void withdraw(int k)  // 動的
	{
		balance -= k;
	}
	public void deposit(int k)  // 動的
	{
		balance += k;
	}
}

/******************* ここより下はいじらない *******************/

// 銀行口座クラスをテストするクラス
class AccountTester3 {
	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);  // 足立君の口座
		Account nakata = new Account("仲田真二", "654321", 200);  // 仲田君の口座
		
		adachi.withdraw(200);  // 足立君が200円おろす
		nakata.deposit(100);   // 仲田君が100円預ける
		
		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());
		
		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());
	}
}
