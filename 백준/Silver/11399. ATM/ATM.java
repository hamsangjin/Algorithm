import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)     nums[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);

        int time = 0, sum = 0;

        for(int num : nums){
            time += num;
            sum += time;
        }
        System.out.println(sum);
    }
}