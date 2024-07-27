import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String[] nums = br.readLine().split(" ");
        for(int i = 0; i < 5; i++){
            System.out.print((Integer.parseInt(nums[i]) - (a*b)) + " ");
        }
    }
}