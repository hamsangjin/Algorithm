class Solution {
  public String solution(String s) {
        String answer = "";
        boolean flag = true;
        
        for(String ss : s.toLowerCase().split("")) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
  }
}
