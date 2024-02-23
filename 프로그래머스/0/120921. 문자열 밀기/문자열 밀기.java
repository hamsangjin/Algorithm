class Solution {
    public int solution(String A, String B) {
        
        if(A.equals(B)) return 0;
        
        for(int i = 1; i < A.length(); i++){
            
            A = A.substring(A.length()-1) + A.substring(0, A.length() - 1);
            
            if(A.equals(B)) return i; 
            
        }
        
        return -1;
    }
}