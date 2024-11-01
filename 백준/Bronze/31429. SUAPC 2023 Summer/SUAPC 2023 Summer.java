import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        switch (n) {
            case 1:
                System.out.printf("%d %d\n", 12, 1600);
                break;
            case 2:
                System.out.printf("%d %d\n", 11, 894);
                break;
            case 3:
                System.out.printf("%d %d\n", 11, 1327);
                break;
            case 4:
                System.out.printf("%d %d\n", 10, 1311);
                break;
            case 5:
                System.out.printf("%d %d\n", 9, 1004);
                break;
            case 6:
                System.out.printf("%d %d\n", 9, 1178);
                break;
            case 7:
                System.out.printf("%d %d\n", 9, 1357);
                break;
            case 8:
                System.out.printf("%d %d\n", 8, 837);
                break;
            case 9:
                System.out.printf("%d %d\n", 7, 1055);
                break;
            case 10:
                System.out.printf("%d %d\n", 6, 556);
                break;
            case 11:
                System.out.printf("%d %d\n", 6, 773);
                break;
        }
    }
}