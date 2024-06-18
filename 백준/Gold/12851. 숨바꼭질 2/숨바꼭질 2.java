import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        if(n >= m){
            System.out.println(n-m);
            System.out.println(1);
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        int[] ch = new int[100001];
        Arrays.fill(ch, Integer.MAX_VALUE);
        q.offer(n);
        ch[n] = 0;

        int sec = 0, answer = 0;
        while(!q.isEmpty()){
            int len = q.size();
            sec++;
            for(int i = 0; i < len; i++){
                int x = q.poll();
                for(int nx : new int[]{x-1, x+1, x*2}){
                    if(nx >= 0 && nx <= 100000 && ch[nx] >= sec){
                        if(nx == m) answer ++;
                        else{
                            ch[nx] = sec;
                            q.offer(nx);
                        }
                    }
                }
            }
            if(answer != 0) break;
        }
        System.out.println(sec);
        System.out.println(answer);
    }
}