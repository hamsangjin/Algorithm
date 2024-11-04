import java.io.*;
import java.util.*;

public class Main {
    static int L, C;
    static char[] cArr, pw;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        cArr = new char[C];
        for(int i = 0; i < C; i++)    cArr[i] = st.nextToken().charAt(0);
        Arrays.sort(cArr);

        pw = new char[L];
        dfs(0, 0, 0, 0);
        System.out.println(sb);
    }
    
    public static void dfs(int depth, int index, int vCnt, int cCnt){
        if(depth == L){
            if(vCnt < 1 || cCnt < 2)    return;
            for(char c : pw)    sb.append(c);
            sb.append("\n");
        } else{
            for(int i = index; i < C; i++){
                int idx = cArr[i] - 'a';
                
                // 모음이면 true, 자음이면 false
                boolean flag = cArr[i] == 'a' || cArr[i] == 'e' || cArr[i] == 'i' || cArr[i] == 'o' || cArr[i] == 'u' ? true : false;

                pw[depth] = cArr[i];
                dfs(depth + 1, i+1, flag ? vCnt+1 : vCnt, !flag ? cCnt+1 : cCnt);
            }
        }
    }
}