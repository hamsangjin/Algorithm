import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2309
// 500 - 브루트포스 -> 일곱 난쟁이
// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> h = new ArrayList<>();
        // O(9) = O(1)
        for(int i = 0; i < 9; i++)  h.add(Integer.parseInt(br.readLine()));
        int sum = h.stream().reduce(0, (a, b) -> a + b);


        // O(8) = O(1)
        for(int i = 0; i < 8; i++){
            // O(36) = O(1)
            for(int j = i+1; j < 9; j++){
                if(sum - h.get(i) - h.get(j) == 100){
                    h.remove(j);
                    h.remove(i);
                    // O(7) = O(1)
                    h.sort(Integer::compareTo);
                    h.forEach(System.out::println);
                    return;
                }
            }
        }
        // 01 02 ... 08
        // 12 13 ... 18
        // 23 24 ... 28
        // 34 35 ... 38
        // 45 46 47 48
        // 56 57 58
        // 67 68
        // 78
    }
}