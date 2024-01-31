import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        int answer = 0;
        
        // 네 주사위 모두 같은 숫자  
        if (dice[0] == dice[3]){           
            answer = 1111 * dice[0];
        // 세 주사위 같은 숫자, 하나 다름
        } else if ((dice[0] == dice[2]) || (dice[1] == dice[3])){                   
            answer = (int) Math.pow((10 * dice[1] + (dice[0] + dice[3] - dice[1])), 2);
        // 두 주사위끼리 서로 다른 쌍
        } else if (dice[0] == dice[1] && dice[2] == dice[3]){                       
                answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        // 두 주사위는 같으면서, 나머지 두 주사위끼리는 같지 않을 때
        } else if (dice[0] == dice[1]){
                answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]){
                answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]){
                answer = dice[0] * dice[1];
        // 네 주사위가 다른 경우
        } else if (dice[0] != dice[1] && dice[1] != dice[2] && dice[2] != dice[3]){ 
                answer = dice[0];
        }
        
        return answer;
    }
}