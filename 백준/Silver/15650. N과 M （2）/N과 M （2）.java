import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/15650
// 400 - 다이나믹 프로그래밍1 -> N과 M(2)
// 시간 복잡도: O(nP(m))
public class Main {
    static boolean[] ch;
    static int n, m;
    static List<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ch = new boolean[n+1];

        list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
            ch[i] = true;
            dfs(i);
            ch[i] = false;
            list.remove(list.size()-1);
        }
    }

    public static void dfs(int x){
        if(list.size() == m){
            for(int num : list)     System.out.print(num + " ");
            System.out.println();
        } else{
            for(int i = x+1; i <= n; i++) {
                if(!ch[i]){
                    ch[i] = true;
                    list.add(i);
                    dfs(i);
                    ch[i] = false;
                    list.remove(list.size()-1);
                }
            }
        }
    }
}