class Solution {
    public int solution(int[] num_list) {
        int even_sum = 0, odd_sum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                odd_sum += num_list[i];
            } else{
                even_sum += num_list[i];
            }
        }
        
        return Math.max(even_sum, odd_sum);
    }
}