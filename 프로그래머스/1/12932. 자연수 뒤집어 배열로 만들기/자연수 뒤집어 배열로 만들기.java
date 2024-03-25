class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        
        int[] answer = new int[str.length()];
        
        int i = str.length() - 1;
        for(String x : str.split("")){
            answer[i--] = Integer.parseInt(x);
        }
        return answer;
    }
}