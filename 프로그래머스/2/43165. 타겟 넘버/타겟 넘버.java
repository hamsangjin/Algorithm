class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    public void dfs(int[] numbers, int L, int target, int sum){
        if(L == numbers.length){ 
            if(target == sum) answer++;
        } else {
            dfs(numbers, L + 1, target, sum + numbers[L]); 
            dfs(numbers, L + 1, target, sum - numbers[L]); 
        }
    }
}