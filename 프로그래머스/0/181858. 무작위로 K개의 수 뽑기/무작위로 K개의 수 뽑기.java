class Solution {
    public int[] solution(int[] arr, int k) {
        int[] ch = new int[100001];
        int[] answer = new int[k];
        
        // -1로 초기화
        for(int i = 0; i < k; i++){
            answer[i] = -1;
        }
        
        for(int i = 0, j = 0; i < arr.length; i++){
            if(j < k && ch[arr[i]] == 0){       // answer 배열의 길이에서 벗어나지 않으면서, answer 배열에 추가되지 않은 값이냐 ?
                answer[j] = arr[i];             // 아니라면 해당 값 추가해라
                ch[arr[i]] ++;                  // 추가하고 다음 루프부터 존재한다고 체크
                j++;                            // answer 인덱스 증가
            }
        }
        
        return answer;
    }
}