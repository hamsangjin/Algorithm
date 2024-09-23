import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/17299
// 200 - 자료구조 1(연습) -> 오등큰수
// 시간 복잡도: n의 범위가 1,000,000이므로 O(n)으로 풀어야하며, O(n)임
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());

        // 수열 입력
        String[] nums = br.readLine().split(" ");

        // 횟수 세기
        int[] ch = new int[1000001];
        for(String num : nums)      ch[Integer.parseInt(num)]++;
        String[] cntArr = new String[n];
        for(int i = 0; i < n; i++)  cntArr[i] = Integer.toString(ch[Integer.parseInt(nums[i])]);

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않으면서, 스택 최상단의 값의 횟수가 현재 값의 횟수보다 작은 경우에는
            // 스택이 비거나, 현재 값의 횟수보다 스택 최상단의 값의 횟수가 커질 때까지 빼면서 그 값을 수열에 저장해준다.
            // 모든 원소가 최대 한 번 스택에 들어가고 한 번 나오는 구조(시간 복잡도에 영향 x)
            while(!s.isEmpty() && Integer.parseInt(cntArr[s.peek()]) < Integer.parseInt(cntArr[i]))       nums[s.pop()] = nums[i];

            s.push(i);
        }

        for(int idx: s)     nums[idx] = "-1";

        System.out.println(String.join(" ", nums));
    }
}