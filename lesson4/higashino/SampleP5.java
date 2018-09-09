import java.io.*;

class SampleP5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Input the score of subjects 1 to 5");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Input the score of subjects 1 to 5
        System.out.print("Subject 1:");
        String sub1 = br.readLine();
        System.out.print("Subject 2:");
        String sub2 = br.readLine();
        System.out.print("Subject 3:");
        String sub3 = br.readLine();
        System.out.print("Subject 4:");
        String sub4 = br.readLine();
        System.out.print("Subject 5:");
        String sub5 = br.readLine();
        
        // Compute and print sum
        int sum = 0;
        sum += Integer.parseInt(sub1);
        sum += Integer.parseInt(sub2);
        sum += Integer.parseInt(sub3);
        sum += Integer.parseInt(sub4);
        sum += Integer.parseInt(sub5);
        System.out.print("Total score of 5 subjects:" + sum);
        
        // Compute and print ave
        double ave = sum / 5.0;
        System.out.print("Average score of 5 subjects:" + ave);
    }
}
