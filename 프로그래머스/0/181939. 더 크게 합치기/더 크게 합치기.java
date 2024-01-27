class Solution {
    public int solution(int a, int b) {
        String str1 = a + "" + b;
        String str2 = b + "" + a;
        
        if(Integer.parseInt(str1) >= Integer.parseInt(str2)){
            return Integer.parseInt(str1);
        } else{
            return Integer.parseInt(str2);
        }
    }
}