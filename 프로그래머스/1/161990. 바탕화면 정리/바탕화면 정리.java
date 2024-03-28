class Solution {
    public int[] solution(String[] wallpaper) {
        int n = wallpaper.length;
        int m = wallpaper[0].length();
        
        int[] answer = new int[]{51, 51, 0, 0};
        
        for(int i = 0; i < n; i++){
            String[] paper = wallpaper[i].split("");
            for(int j = 0; j < m; j++){
                if(paper[j].equals("#")){
                    answer[0] = Math.min(answer[0], i);     // 가장 위쪽
                    answer[1] = Math.min(answer[1], j);     // 가장 왼쪽
                    answer[2] = Math.max(answer[2], i+1);   // 가장 아래쪽
                    answer[3] = Math.max(answer[3], j+1);   // 가장 오른쪽
                }
            }
        }
        return answer;
    }
}