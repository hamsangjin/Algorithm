import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] map = new String[n][n];
        
        // arr1, 2의 i번째 요소 꺼내서 2진수로 변환
        for(int i = 0; i < n; i++){
            String s1 = toBinary(arr1[i]);
            String s2 = toBinary(arr2[i]);
            
            for(int j = n - s1.length(), k = 0; j < n; j++, k++){
                if(s1.charAt(k) == '1'){
                    map[i][j] = "#";
                }
            }
            
            for(int j = n - s2.length(), k = 0; j < n; j++, k++){
                if(s2.charAt(k) == '1'){
                    map[i][j] = "#";
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            String temp = "";
            for(int j = 0; j < n; j++){
                if(map[i][j] != null){
                    temp += map[i][j];
                } else{
                    temp += " ";
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
    
    public static String toBinary(int num){
        StringBuilder sb = new StringBuilder();
        
        while(num != 0){
            sb.append(num % 2);
            num /= 2;
        }
        
        return sb.reverse().toString();
    }
}