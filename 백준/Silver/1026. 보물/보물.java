import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1026
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrA = new int[N];
        for (int i = 0; i < N; i++)     arrA[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Integer[] arrB = new Integer[N];
        for (int i = 0; i < N; i++)     arrB[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());
        
        int S = 0;
        for (int i = 0; i < N; i++)     S += arrA[i] * arrB[i];
        
        System.out.println(S);
    }
}