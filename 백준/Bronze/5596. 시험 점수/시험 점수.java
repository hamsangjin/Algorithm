import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[2];
        for (int i = 0; i < 2; i++) {
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int c = Integer.parseInt(nums[2]);
            int d = Integer.parseInt(nums[3]);
            score[i] = a+b+c+d;
        }
        
        if(score[0] > score[1])    System.out.println(score[0]);
        else                       System.out.println(score[1]);
    }
}