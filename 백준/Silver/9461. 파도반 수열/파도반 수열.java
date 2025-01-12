import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] nums = new long[101];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;

        for(int i = 3; i <= 100; i++)       nums[i] = nums[i-2] + nums[i-3];

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t = 0; t < T; t++)      sb.append(nums[Integer.parseInt(br.readLine()) - 1]).append("\n");

        System.out.println(sb);
    }
}