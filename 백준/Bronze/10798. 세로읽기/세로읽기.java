import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        String[] strs = new String[5];

        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            strs[i] = sc.next();
            if (max < strs[i].length())  max = strs[i].length();
        }

        String answer = "";
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    answer += strs[j].charAt(i);
                } catch (Exception e){
                    continue;
                }
            }
        }

        System.out.println(answer);
    }
}