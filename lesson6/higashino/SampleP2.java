import java.io.*;

class SampleP2 {
    public static void main(String[] args) throws IOException {
        System.out.println("テストの点数を入力してください．（０で終了）");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int score = 1;

        do {
            String str = br.readLine();
            score = Integer.parseInt(str);
            sum += score;
        } while (score != 0);

        System.out.println("テストの合計点は" + sum + "点です．");
    }
}
