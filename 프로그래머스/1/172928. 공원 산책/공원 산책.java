import java.util.*;
class Solution {
    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};
    
    Map<String, Integer> map = new HashMap<>() {{
        put("N", 0);
        put("E", 1);
        put("S", 2);
        put("W", 3);
    }};
    
    public int[] solution(String[] park, String[] routes) {
        
        int[] answer = new int[2];
        int r = 0, c = 0;
        int n = park.length;
        int m = park[0].length();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(park[i].charAt(j) == 'S'){
                    r = i;
                    c = j;
                    for(String route : routes){
                        String[] temp = route.split(" ");
                        
                        int nr = 0, nc = 0;
                        boolean flag = true;
                        
                        for(int k = 1; k <= Integer.parseInt(temp[1]); k++){
                            nr = r + dr[map.get(temp[0])] * k;
                            nc = c + dc[map.get(temp[0])] * k;  
                            
                            if(nr < 0 || nr >= n || nc < 0 || nc >= m || park[nr].charAt(nc) == 'X'){
                                flag = false;
                            }
                        }
                        
                        r = flag ? nr : r;
                        c = flag ? nc : c;
                    }
                }
            }
        }
        return new int[]{r, c};
    }
}