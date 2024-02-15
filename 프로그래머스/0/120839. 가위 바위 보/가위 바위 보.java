class Solution {
    public String solution(String rsp) {
        
        return rsp.replace("2", "x").replace("0", "y").replace("5", "z").replace("x", "0").replace("y", "5").replace("z", "2");
    }
}