import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        
        // s를 int형으로 바꿔주는 거
        char[] temp1 = s.toCharArray();
        int[] arr = new int[temp1.length];
        for(int i = 0; i < temp1.length; i++)    arr[i] = ((int)temp1[i])-97;
        
        // skip 각각의 문자열을 int형으로 변경하고 ch에 체크
        char[] temp2 = skip.toCharArray();
        boolean[] ch = new boolean[26];
        for(int i = 0; i < temp2.length; i++)    ch[((int)temp2[i])-97] = true;
        
        int idx=0;
        char[] result = new char[s.length()];
        for(int x : arr){
            // index만큼 더해주는데
            // ch에 체크되어있는 값이면 i-1해줘서 다음으로 넘어가게
            // z를 넘어가면 %26으로 a로 돌아오게
            for(int i = 0; i < index; i++){
                if(ch[(x+1)%26])    i -= 1;
                x = (x+1)%26;
            }
            result[idx++] = (char)(x + 97);
        }
        
        return new String(result);
    }
}