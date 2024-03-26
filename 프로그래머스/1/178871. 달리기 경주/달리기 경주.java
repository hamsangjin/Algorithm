import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        
        HashMap<String, Integer> rank = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            rank.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            int n = rank.get(callings[i]);
            swap1(rank, players, n, n-1);
            swap2(players, n, n-1);
        }
        return players;
    }
    
    public static void swap1(HashMap<String, Integer> map, String[] players,  int i, int j){
        Integer temp = map.get(players[i]);
        map.put(players[i], map.get(players[j]));
        map.put(players[j], temp);
    }
    
    public static void swap2(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}