import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alp = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        // n, m 입력
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // a, b 입력
        String[] ab = br.readLine().split(" ");
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++)      a[i] = alp[ab[0].charAt(i) - 'A'];
        for(int i = 0; i < m; i++)      b[i] = alp[ab[1].charAt(i) - 'A'];

        // a, b 합치기
        // 먼저 짧은 길이 먼저
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < Math.min(n, m); i++){
            list.add(a[i]);
            list.add(b[i]);
        }

        // 긴 길이의 문자열 뒤에 붙이기
        if(n > m){
            for(int i = m; i < n; i++)    list.add(a[i]);
        } else if(n < m){
            for(int i = n; i < m; i++)    list.add(b[i]);
        }

        // 궁합 구하는 로직
        while(list.size() > 2){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < list.size()-1; i++){
                temp.add((list.get(i) + list.get(i+1)) % 10);
            }
            list = temp;
        }

        if(list.get(0) == 0)    System.out.println(list.get(1) + "%");
        else    System.out.println(list.get(0) + "" + list.get(1) + "%");
    }
}