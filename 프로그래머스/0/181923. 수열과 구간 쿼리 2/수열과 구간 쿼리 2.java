class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int cnt = 0, min_num = 1000001;
            
            // s부터 e까지의 범위에서 찾기
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                // k보다 크냐 ?
                if (arr[j] > queries[i][2]){
                    // 조건에 맞는 값이 있나 확인
                    cnt += 1;
                    // 조건에 만족하면서 가장 낮은 값 찾기
                    min_num = Integer.min(min_num, arr[j]);
                }
            }
            // 조건에 맞는 값이 있는지 여부에 따른 값 추가
            answer[i] = (cnt != 0) ? min_num : -1;
        }
        return answer;
    }
}