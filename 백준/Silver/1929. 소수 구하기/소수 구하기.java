import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1929
// 300 - 수학 1 -> 소수 구하기
// 시간 복잡도: O(n * √m)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // nums 입력
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // O(n)
        for (int i = n; i <= m; i++) {
            if(isPrime(i))  System.out.println(i);
        }
    }

    // O(√m)
    private static boolean isPrime(int num) {
        if(num == 0 || num == 1)    return false;

        for(int i = 2; i <= (int) Math.sqrt(num); i++){
            if(num % i == 0)        return false;
        }
        return true;
    }
}