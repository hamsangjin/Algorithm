class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a != b){        
            a = (int) Math.ceil((double)a/2);
            b = (int) Math.ceil((double)b/2);
            // a = a / 2 + a % 2;
            // b = b / 2 + b % 2;
            answer++;
        }

        return answer;
    }
}