import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++)		arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            
            int b = 0;
            String ans = "Possible";
			for(int i = 0; i < N; i++){
                // arr[i]초가 지나면 만들 수 있는 붕어빵 개수
                b = (arr[i] / M) * K;
                
                // arr[i]초가 됐을 때 지금까지 왔던 인원 수(i) + 현재 손님(1)만큼 붕어빵 개수를 뺐을 때,
                // 붕어빵 개수가 음수가 된다면 붕어빵을 제공할 수 없다는 뜻
                // ans에 Impossible을 저장하고 for문 탈출
                if(b-i-1 < 0){
                    ans = "Impossible";
                    break;
                }
            }
            System.out.printf("#%d %s\n", t, ans);
        }
    }
}