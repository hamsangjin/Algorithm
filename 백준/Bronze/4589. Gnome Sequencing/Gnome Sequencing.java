import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println("Gnomes: ");
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");

            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            int c = Integer.parseInt(temp[2]);

            if(a >= b && b >= c || a <= b && b <= c)    System.out.println("Ordered");
            else                                        System.out.println("Unordered");
        }
    }
}