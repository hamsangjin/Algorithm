import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int countX = 0;
        int num = 0;
        
        // 항과 연산기호 분리
        String[] str = polynomial.split(" ");
        
        // 분리한 리스트 하나씩 확인
        for (int i = 0; i < str.length; i++) {
            // 항인 경우
            if (!str[i].equals("+")) {
                // 상수항인 경우
                if (!str[i].contains("x")) {
                    // num에 더해주기
                    num += Integer.parseInt(str[i]);
                // 일차항인 경우
                } else {
                    // 계수 있는 경우
                    if (str[i].length() > 1) {
                        // x를 없애면 계수가 남으니 해당 계수 더하기
                        str[i] = str[i].replaceAll("x", "");
                        countX += Integer.parseInt(str[i]);
                    // 계수 없는 경우
                    } else {
                        countX++;
                    }
                }
            }
        }
        
        // x의 계수가 2이상이고, 상수항이 없는 경우
        if (countX > 1 && num < 1) {
            answer =countX+"x";
        }
        
        // x가 없고, 상수항이 1 이상인 경우
        if(countX < 1 && num > 0) {
            answer = String.valueOf(num);
        }
        
        // x의 계수가 2이상이고, 상수항이 1이상인경우
        if (countX > 1 && num > 0) {
            answer =countX+"x + " + num;
        }
        
        // x의 계수가 1이고 상수항이 없는 경우
        if (countX == 1 && num < 1) {
            answer = "x";
        }
        
        // x의 계수가 1이고 상수항이 있는 경우
        if (countX == 1 && num > 0) {
            answer = "x + " + num;
        }
        

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("x"));
    }
}