import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());
        int[] bridge = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            bridge[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // ch와 큐 생성, a 삽입후 체크
        int[] ch = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        ch[a] = 1;

        // 0번에서 시작
        int L = 0;
        while(!q.isEmpty()){
            int length = q.size();
            for(int i = 0; i < length; i++){
                int x = q.poll();

                int j = 1;
                while(true){
                    int nx = x + (j++ * bridge[x]);
                    if(nx > n)  break;

                    if(ch[nx] == 0){
                        if(nx == b){
                            System.out.println(L+1); 
                            return;
                        }
                        q.add(nx);
                        ch[nx] = 1;
                    }
                }

                j = 1;
                while(true){
                    int nx = x - (j++ * bridge[x]);
                    if(nx < 1)  break;

                    if(ch[nx] == 0){
                        if(nx == b){
                            System.out.println(L+1); 
                            return;
                        }
                        q.add(nx);
                        ch[nx] = 1;
                    }
                }
            }
            L ++;
        }
        System.out.println(-1);
    }
}