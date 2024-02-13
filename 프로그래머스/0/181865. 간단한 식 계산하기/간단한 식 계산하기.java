class Solution {
    public int solution(String binomial) {
        String[] list = binomial.split(" ");
        int answer = 0;
        
        switch(list[1]){
            case "+": answer = Integer.parseInt(list[0]) + Integer.parseInt(list[2]); break;
            case "-": answer = Integer.parseInt(list[0]) - Integer.parseInt(list[2]); break;
            case "*": answer = Integer.parseInt(list[0]) * Integer.parseInt(list[2]); break;
        }
        
        return answer;
    }
}