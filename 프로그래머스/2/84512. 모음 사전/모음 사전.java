import java.util.*;

class Solution {
	// 모음을 따로 저장
    char[] alphabet = {'A', 'E', 'I', 'O', 'U'};
	// 사전에 들어갈 모든 경우의 수를 저장할 배열
    ArrayList<String> list;
    
	// 깊이 우선 탐색
    public void dfs(String result) {
		// 값을 저장
        list.add(result);
        
		// 문자열의 길이가 5라면 반환해줌
        if(result.length() == 5) {
            return;
        }
        
		// 모음을 저장한 배열을 돌면서 값을 넣어줌
        for(int i = 0; i < alphabet.length; i++) {
            dfs(result + alphabet[i]);
        }
    }
    
    public int solution(String word) {
        list = new ArrayList<>();
        dfs("");
        
        return list.indexOf(word);
    }
}