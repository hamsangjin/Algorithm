class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb1 = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++)    sb1.append(i);
        }
        
        return sb1.toString() + "0" + sb1.reverse().toString();
    }
}