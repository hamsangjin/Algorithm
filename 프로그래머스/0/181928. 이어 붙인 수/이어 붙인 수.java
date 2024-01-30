import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        String even_num = "";
        String odd_num = "";
        
        for (int num : num_list){
            if (num % 2 == 0)
                even_num += Integer.toString(num);
            else
                odd_num += Integer.toString(num);
        }
        
        
        return Integer.parseInt(even_num)+Integer.parseInt(odd_num);
    }
}