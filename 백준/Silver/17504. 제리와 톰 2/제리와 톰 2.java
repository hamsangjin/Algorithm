import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long[] answer = {1L, 1L};
        String[] a;

        try {
            String n = br.readLine();
            a = br.readLine().split(" ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        answer[1] = Long.parseLong(a[a.length-1]);

        for (int i = a.length-2; i >= 0; i--) {
            answer[0] += answer[1]*Long.parseLong(a[i]);

            Long temp = answer[0];
            answer[0] = answer[1];
            answer[1] = temp;
        }

        answer[0] = answer[1] - answer[0];
        
        System.out.println(answer[0] + " " + answer[1]);
    }
}