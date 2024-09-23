import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11655
// 203 - 자료구조 1(참고) -> ROT13
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // w 입력
        char[] w = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for(char c : w){
            if(Character.isLowerCase(c))        sb.append((char) (((((int) c) - ((int) 'a') + 13) % 26) + ((int) 'a')));
            else if(Character.isUpperCase(c))        sb.append((char) (((((int) c) - ((int) 'A') + 13) % 26) + ((int) 'A')));
            else sb.append(c);
        }

        System.out.println(sb);
    }
}