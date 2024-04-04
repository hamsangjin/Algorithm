import java.util.*;

public class Main {
    static int answer = 0;
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int k = sc.nextInt();
        int[] ch = new int[k+1];

        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        ch[a] = 1;

        int L = 0;
        loop:
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                int x = q.poll();
                for(int nx : new int[]{x+1, x*2}){
                    if(nx <= k && ch[nx] == 0){
                        if(nx == k){
                            System.out.println(L+1);
                            break loop;
                        } else{
                            ch[nx] = 1;
                            q.add(nx);
                        }
                    }
                }
            }
            L++;
        }
    }
}