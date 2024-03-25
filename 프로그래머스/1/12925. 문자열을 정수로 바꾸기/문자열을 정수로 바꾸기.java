class Solution {
    public int solution(String s) {
        return (s.charAt(0) == '-') ? Integer.parseInt(s.substring(1, s.length())) * -1 : Integer.parseInt(s.substring(0, s.length())); 
    }
}