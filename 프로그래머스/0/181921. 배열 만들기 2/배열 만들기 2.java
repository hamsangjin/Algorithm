class Solution {
    public int[] solution(int l, int r) {
        int[] temp = new int[1000000];
        
        int cnt = 0;
        for(int i = l; i <= r; i++){
            String str = String.valueOf(i);
            
            
            boolean flag = true;
            for(char ch: str.toCharArray()){
                if(ch != '5' && ch != '0'){
                    flag = false;
                }
            }
            
            if (flag){
                temp[cnt] = Integer.parseInt(str);
                cnt += 1;
            }
            
        }
        
        if(cnt == 0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[cnt];
        
        for(int i = 0; i < cnt; i++){
            answer[i] = temp[i];
        }
        
        return answer;
    }
}