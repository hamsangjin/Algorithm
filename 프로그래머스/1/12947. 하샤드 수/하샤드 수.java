class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(String str : Integer.toString(x).split("")){
            sum += Integer.parseInt(str);
        }
        
        return (x % sum == 0) ? true : false;
    }
}