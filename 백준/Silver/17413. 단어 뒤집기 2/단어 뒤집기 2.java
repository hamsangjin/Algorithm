import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1874
// 200 - 자료구조 1 -> 에디터
// 시간 복잡도: O(n * L)
// - L: 입력된 단어의 길이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 s 입력
        String[] s = br.readLine().split("");

        List<String> result = new ArrayList<>();
        boolean flag = false;
        StringBuilder w = new StringBuilder();
        
        for(String c : s){
            if(flag){
                result.add(c);
                if(c.equals(">"))       flag = false;
            }else if(c.equals("<")){
                result.add(w.reverse().toString());
                w = new StringBuilder();
                result.add(c);
                flag = true;
            }else if (c.equals(" ")){
                result.add(w.reverse().toString());
                w = new StringBuilder();
                result.add(c);
            }
            else w.append(c);
        }

        if(w.length()>0) result.add(w.reverse().toString());
        System.out.println(String.join("", result));

    }
}