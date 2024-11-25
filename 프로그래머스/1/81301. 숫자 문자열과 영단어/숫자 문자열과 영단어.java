import java.util.*;

class Solution {
    public int solution(String s) {
        
        Map<String, String> number = new HashMap<String, String>() {{
            put("zero", "0");
            put("one", "1");
            put("two", "2");
            put("three", "3");
            put("four", "4");
            put("five", "5");
            put("six", "6");
            put("seven", "7");
            put("eight", "8");
            put("nine", "9");
        }};

//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < s.length(); i++){
//             char c = s.charAt(i);
            
//             if(Character.isDigit(c)){
//                 if(sb.length() == 0)    continue;
                
//                 answer += number.get(sb.toString());
//                 sb.setLength(0);
//                 answer += c;
//             }
//         }

        for(String num : number.keySet())       s = s.replace(num, number.get(num));
        
        
        return Integer.parseInt(s);
    }
}