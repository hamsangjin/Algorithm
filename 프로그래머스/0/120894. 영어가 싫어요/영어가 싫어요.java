class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] number_list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        
        for(int i = 0; i < 10; i++){
            numbers = numbers.replace(number_list[i], Integer.toString(i));    
        }
        
        return Long.parseLong(numbers);
    }
}