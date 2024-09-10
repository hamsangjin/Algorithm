import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            sb.append(br.readLine().toLowerCase(Locale.ROOT)).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}