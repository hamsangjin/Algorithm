import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10808
// 200 - 자료구조 1(참고) -> 알파벳 개수
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // w 입력
        char[] w = br.readLine().toCharArray();

        // idxArr 생성
        int[] idxArr = new int[26];
        for(int i = 0; i < idxArr.length; i++)      idxArr[i] = -1;
        boolean[] ch = new boolean[26];

        // 단어를 돌면서 각 알파벳의 개수 세기
        for(int i = 0; i < w.length; i++){
            char c = w[i];
            int idx = c - 'a';
            if(!ch[idx]){
                idxArr[c - 'a'] = i;
                ch[idx] = true;
            }
        }

        // 각 알파벳의 개수 출력
        for(int n : idxArr)     System.out.print(n + " ");
    }
}