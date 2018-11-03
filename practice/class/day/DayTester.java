import java.util.Scanner;

/* ここに実装 */
class Day
{
	private int year;
	private int month;
	private int day;

	public Day()
	{
		year = 2000;
		month = 1;
		day = 1;
	}

	public Day(int y, int m, int d)
	{
		year = y;
		month = m;
		day = d;
	}

	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDay() { return day; }

	public static boolean isLeap(int y)
	{
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	public boolean isLeap()
	{
		return this.isLeap(year);
	}
	public int dayOfWeek()
	{
		int y = this.year;
		int m = this.month;
		int d = this.day;

		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		int a = y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + d;
		int b = a % 7;
		return b;
	}
}

/* ここ以下はいじらない */

class DayTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

		System.out.println("年月日を入力せよ");
		System.out.print("年 ： ");  int y = stdIn.nextInt();
		System.out.print("月 ： ");  int m = stdIn.nextInt();
		System.out.print("日 ： ");  int d = stdIn.nextInt();

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
