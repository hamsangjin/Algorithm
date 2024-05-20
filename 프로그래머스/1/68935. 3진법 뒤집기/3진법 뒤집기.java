class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n/3 != 0){
            str += n%3;
            n /= 3;
        }
        str+= n%3;
        
        for(int i= str.length()-1, j=0; i >= 0; i--, j++)   answer += (str.charAt(i) - '0') * Math.pow(3, j);

        return answer;
    }
}