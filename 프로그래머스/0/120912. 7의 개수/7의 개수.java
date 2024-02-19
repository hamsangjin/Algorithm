class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            for(String str : Integer.toString(array[i]).split("")){
                if(str.equals("7")) answer ++;
            }
        }
        
        return answer;
    }
}