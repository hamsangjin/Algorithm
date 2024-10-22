import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1748
// 500 - 브루트포스 -> 수 이어 쓰기1
// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int length = Integer.toString(N).length();

        if(length == 1)   System.out.println(N);
        else{
            long[] nums = new long[10];
            // N의 자리별 자릿수 구하기
            for(int i = 1; i < 10; i++){
                nums[i] = Long.parseLong("9" + "0".repeat(i-1)) * i;
            }

            // n-1자리의 경우의수 다 더해주기
            long answer = 0;
            for(int i = 1; i < length; i++){
                answer += nums[i];
            }

            answer += (N - Long.parseLong("9".repeat(length-1))) * length;

            System.out.println(answer);
        }

        // 일의 자리: 9*1 = 9
        // 십의 자리: 90*2 = 180
        // 백의 자리: 900*3 = 2,700
        // 천의 자리: 9,000*4 = 36,000
        // ...
        // 억의 자리: 900,000,000 * 9 = 8,100,000,000
        // N의 자리인 경우: n-1자리의 경우의수 다 더해주기 + ((9를 n-1의 자리수만큼 반복한 수) * 자리수)
    }
}