import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1978
// 300 - 수학 1 -> 소수 찾기
// 시간 복잡도: O(n * √m)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // nums 입력
        String[] nums = br.readLine().split(" ");

        int res = 0;
        // O(n)
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(nums[i]);
            if(isPrime(num))     res ++;
        }

        System.out.println(res);
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