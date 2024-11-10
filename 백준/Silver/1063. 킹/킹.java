import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1063
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String kingInput = st.nextToken();
        int kx = 8 - (kingInput.charAt(1) - '0');
        int ky = kingInput.charAt(0) - 'A';

        String stoneInput = st.nextToken();
        int sx = 8 - (stoneInput.charAt(1) - '0');
        int sy = stoneInput.charAt(0) - 'A';

        int N = Integer.parseInt(st.nextToken());

        Map<String, Integer[]> cmd = new HashMap<>() {{
            put("R", new Integer[]{0, 1});
            put("L", new Integer[]{0, -1});
            put("B", new Integer[]{1, 0});
            put("T", new Integer[]{-1, 0});
            put("RT", new Integer[]{-1, 1});
            put("LT", new Integer[]{-1, -1});
            put("RB", new Integer[]{1, 1});
            put("LB", new Integer[]{1, -1});
        }};

        for(int i = 0; i < N; i++) {
            String key = br.readLine();
            int nkx = kx + cmd.get(key)[0];
            int nky = ky + cmd.get(key)[1];

            // 킹이 체스판에서 벗어난 경우
            if(nkx < 0 || nky < 0 || nkx >= 8 || nky >= 8)      continue;

            // 킹이 돌을 만난 경우
            if(nkx == sx && nky == sy){
                int nsx = sx + cmd.get(key)[0];
                int nsy = sy + cmd.get(key)[1];

                if(nsx < 0 || nsy < 0 || nsx >= 8 || nsy >= 8)      continue;

                sx = nsx;
                sy = nsy;
            }

            // 킹과 돌이 체스판을 벗어나지 않고 돌을 움직인 다음, 킹을 움직여주기
            kx = nkx;
            ky = nky;
        }

        String king = (char) (ky + 'A') + Integer.toString(8 - kx);
        String stone = (char) (sy + 'A') + Integer.toString(8 - sx);
        System.out.println(king);
        System.out.println(stone);
    }
}