import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        Arrays.sort(nums);

        int count = 0;
        int max = -1;
        int mod = nums[0];
        boolean flag = false;
        for(int i = 0; i < N - 1; i++) {
            if(nums[i] == nums[i + 1])      count++;
            else                            count = 0;

            if(max < count) {
                max = count;
                mod = nums[i];
                flag = true;
            }else if(max == count && flag) {
                mod = nums[i];
                flag = false;
            }
        }

        System.out.println(Math.round((double) sum / N));
        System.out.println(nums[N / 2]);
        System.out.println(mod);
        System.out.println(nums[N - 1] - nums[0]);
    }
}