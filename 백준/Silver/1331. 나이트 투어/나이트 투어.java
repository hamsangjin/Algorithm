import java.io.*;

// https://www.acmicpc.net/problem/1331
// 시간 복잡도: O(36) == O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] ch = new boolean[6][6];
        String ans = "Valid";

        // 처음 위치 저장
        String first = br.readLine();
        int fx = 6 - (first.charAt(1) - '0');
        int fy = first.charAt(0) - 'A';

        // 현재 위치 반영할 값
        int x = fx;
        int y = fy;
        ch[x][y] = true;

        for(int i = 0; i < 35; i++){
            String check = br.readLine();
            int a = 6 - (check.charAt(1) - '0');
            int b = check.charAt(0) - 'A';

            // 방문하지 않았으며, 나이트의 이동경로로 이동 가능한 곳이냐 ?
            if((Math.abs(x - a) == 2 && Math.abs(y - b) == 1) ||
               (Math.abs(x - a) == 1 && Math.abs(y - b) == 2)) {
                if(ch[a][b])    ans = "Invalid";

                ch[a][b] = true;
                x = a;
                y = b;
            } else      ans = "Invalid";
        }

        if(!((Math.abs(x - fx) == 2 && Math.abs(y - fy) == 1) ||
           (Math.abs(x - fx) == 1 && Math.abs(y - fy) == 2))){
            ans = "Invalid";
        }

        System.out.println(ans);
    }
}