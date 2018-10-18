// 銀行口座クラス【第1版】とそれをテストするクラス

// 銀行口座クラス【第1版】
/******************* ここにクラス設計を記述 *******************/


/******************* ここより下はいじらない *******************/

// 銀行口座クラスをテストするクラス
class AccountTester1 {
	public static void main(String[] args) {
		Account adachi = new Account();  // 足立君の口座
		Account nakata = new Account();  // 仲田君の口座
		
		// 足立君の口座名義，口座番号，預金残高の設定
		adachi.name    = "足立幸一";
		adachi.no      = "123456";
		adachi.balance = 1000;
		
		// 仲田君の口座名義，口座番号，預金残高の設定
		nakata.name    = "仲田真二";
		nakata.no      = "654321";
		nakata.balance = 200;
		
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
