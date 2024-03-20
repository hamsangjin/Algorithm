import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        // 핵심 : 모든 사람이 심사를 받는데 걸리는 최소 시간

        long answer = 0;

        // 심사관들의 심사시간이 담긴 times 배열 오름차순 정렬
        Arrays.sort(times);

        // 이분 탐색 범위 : 1 ~ 가장 오래 걸린 심사 시간
        // ex) 1 ~ 60
        // - 가장 오래 걸린 심사 시간 : 모든 사람이 가장 오래 걸리는 심사대에서 심사를 받은 시간
        long left = 1;
        long right = times[times.length - 1] * (long) n;

        while(left <= right){
            // mid 시간 구하기
            // ex) left =   1 ->  1 -> 16 -> 23 -> 27 -> 27 -> 28
            // ex) right = 60 -> 29 -> 29 -> 29 -> 29 -> 27 -> 29
            // ex) mid =   30 -> 15 -> 22 -> 26 -> 28 -> 27 -> 종료
            long mid = (left + right) / 2;

            // 각 심사대 별로 mid 시간동안 몇 명을 심사할 수 있는지 계산
            long cnt = 0;
            for(int i = 0; i < times.length; i++){
                // [7, 10]
                cnt += mid / times[i];
            }

            // ex) cnt = 7 -> 3 -> 5 -> 5 -> 6 -> 5

            // 계산된 time으로 심사한 인원이 n보다 작냐 ?
            // 그렇다면 mid보다 큰 시간들을 보자.
            if(cnt < n){
                left = mid + 1;
            }

            // 계산된 time으로 심사한 인원이 n보다 크거나 같냐 ?
            if(cnt >= n){
                right = mid - 1;
                answer = mid;
            }

            // answer = 30 -> 28
        }

        return answer;
    }
}