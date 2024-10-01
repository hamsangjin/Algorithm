import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // A, B, C, D 입력 받기
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());
        c += d;  
        b += (c/60);
        c = c % 60;
        a += (b/60);
        b = b % 60;
        a = a % 24;  //24시가 넘어가면 0시가 되야하므로 24로 나눈 나머지 구하기
        System.out.print(a + " " + b + " " + c);  //종료되는 시간 출력
    }
}