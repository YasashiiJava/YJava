// 銀行口座クラス【第2版】とそれをテストするクラス

// 銀行口座クラス【第2版】
/******************* ここにクラス設計を記述 *******************/
class Account
{
	String name;
	String no;
	int balance;

	public Account(String n, String	num, int z)
	{
	 	name = "口座名義";
		no = "口座番号";
		balance = 0;

		name = n;
		no = num;
		balance = z;
	}
}
/******************* ここより下はいじらない *******************/

// 銀行口座クラスをテストするクラス
class AccountTester2 {
	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);  // 足立君の口座
		Account nakata = new Account("仲田真二", "654321", 200);  // 仲田君の口座
		
		adachi.balance -= 200;  // 足立君が200円おろす
		nakata.balance += 100;  // 仲田君が100円預ける
		
		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.name);
		System.out.println("　口座番号：" + adachi.no);
		System.out.println("　預金残高：" + adachi.balance);
		
		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.name);
		System.out.println("　口座番号：" + nakata.no);
		System.out.println("　預金残高：" + nakata.balance);
	}
}
