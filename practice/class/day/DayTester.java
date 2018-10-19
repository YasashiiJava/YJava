import java.util.Scanner;

/* ここに実装 */

/* ここ以下はいじらない */

class DayTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		
		System.out.println("年月日を入力せよ");
		System.out.println("年 ： ");  int y = stdIn.nextInt();
		System.out.println("月 ： ");  int m = stdIn.nextInt();
		System.out.println("日 ： ");  int d = stdIn.nextInt();
		
		Day xday = new Day(y, m, d);
		
		System.out.println(
			"入力された日付は"
			+ xday.getYear() + "年"
			+ xday.getMonth() + "月"
			+ xday.getDay() + "日"
			+ wd[xday.dayOfWeek()] + "曜日です"
		);
		
		if (xday.isLeap())
			System.out.println("また，" + xday.getYear() + "年は閏年です");
		else
			System.out.println("また，" + xday.getYear() + "年は閏年ではありません");
	}
}
