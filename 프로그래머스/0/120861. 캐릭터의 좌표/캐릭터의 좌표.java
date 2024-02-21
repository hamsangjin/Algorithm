class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] now = {0, 0}; 
        int maxWidth=board[0]/2;                       
        int maxLength=board[1]/2;    
        for (int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {            //left를 눌렀을때
                now[0]-= (now[0]>-(maxWidth)?1:0);      //x축 (-)최대좌표보다 크면 1, 아니면 0을 뺌    
            } else if(keyinput[i].equals("right")) {    //이하 동일
                now[0]+= (now[0]<(maxWidth)?1:0);
            } else if(keyinput[i].equals("down")) {
                now[1]-= (now[1]>-(maxLength)?1:0);
            } else if(keyinput[i].equals("up")) {
                now[1]+= (now[1]<(maxLength)?1:0);
            }
         }
        return now;
    }
}