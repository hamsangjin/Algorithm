import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1018
// 시간 복잡도: O(N * M)
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] board = new String[n];
        for(int i = 0; i < n; i++)        board[i] = br.readLine();


        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n-7; i++){
            for(int j = 0; j < m-7; j++){
                int sum1 = 0, sum2 = 0;

                for(int x = i; x < i+8; x++){
                    for(int y = j; y < j+8; y++){
                        if((x + y) % 2 == 0){
                            if(board[x].charAt(y) == 'W')      sum1++;
                            else                               sum2++;
                        } else{
                            if(board[x].charAt(y) == 'B')      sum1++;
                            else                               sum2++;
                        }
                    }
                }

                ans = Math.min(ans, Math.min(sum1, sum2));
            }
        }

        System.out.println(ans);
    }
}
