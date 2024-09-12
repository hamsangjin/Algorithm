import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            // 문장 입력
            String[] s = br.readLine().split(" ");
            StringBuilder result = new StringBuilder();

            for(int j = 0; j < s.length; j++){
                result.append(new StringBuilder(s[j]).reverse()).append(" ");
            }
            System.out.println(result);
        }
    }
}