import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N; i++)     q.add(i);

        while(q.size() > 1){
            // 제일 위에 있는 카드 바닥에 버리기
            q.poll();

            // 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮기기
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}