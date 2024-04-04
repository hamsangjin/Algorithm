class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
 
        int carpet = brown + yellow;
 
        // yellow가 존재하기 위해서는 가로와 세로의 길이가 3이상
        for (int i = 3; i <= carpet; i++) {
            int col = i;                // 세로
            int row = carpet / col;     // 가로
 
            // 가로의 길이가 3이상이 안 되는 경우
            if (row < 3) {
                continue;
            }
 
            // 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
            if (row >= col) {
                // yellow의 길이
                // - 가로: 카펫의 가로 길이 - 2
                // - 세로: 카펫의 세로 길이 - 2
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }
}